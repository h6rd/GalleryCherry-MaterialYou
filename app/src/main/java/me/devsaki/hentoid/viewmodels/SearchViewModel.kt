package me.devsaki.hentoid.viewmodels

import android.app.Application
import android.util.SparseIntArray
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.devsaki.hentoid.database.CollectionDAO
import me.devsaki.hentoid.database.domains.Attribute
import me.devsaki.hentoid.enums.AttributeType
import me.devsaki.hentoid.util.ContentHelper
import me.devsaki.hentoid.util.SearchHelper.AttributeQueryResult
import java.util.Objects

class SearchViewModel(
    application: Application,
    private val dao: CollectionDAO,
    private val attributeSortOrder: Int
) : AndroidViewModel(application) {

    // LIVEDATAS
    // Results of queries
    val availableAttributes = MutableLiveData<AttributeQueryResult>()
    val nbAttributesPerType = MutableLiveData<SparseIntArray>()
    val selectedContentCount = MediatorLiveData<Int>()

    // Selected attributes (passed between SearchBottomSheetFragment and SearchActivity as LiveData via the ViewModel)
    val selectedAttributes = MutableLiveData<List<Attribute>>()

    // Currently active attribute types
    private var attributeTypes: List<AttributeType>? = null

    private var currentSelectedContentCountInternal: LiveData<Int>? = null

    // Sort order for attributes
    // (used as a variable rather than a direct call to Preferences to facilitate unit testing)
    private var selectedGroup: Long = -1

    // Location and type (bottom spinners)
    @ContentHelper.Location
    private var location = ContentHelper.Location.ANY

    @ContentHelper.Type
    private var contentType = ContentHelper.Type.ANY


    init {
        selectedAttributes.value = ArrayList()
    }


    override fun onCleared() {
        dao.cleanup()
        super.onCleared()
    }

    /**
     * Set the attributes type to search in the Atttribute search
     *
     * @param attributeTypes Attribute types the searches will be performed for
     */
    fun setAttributeTypes(attributeTypes: List<AttributeType>) {
        this.attributeTypes = attributeTypes
    }

    fun setGroup(groupId: Long) {
        selectedGroup = groupId
    }

    /**
     * Set and run the query to perform the Attribute search
     *
     * @param query        Content of the attribute name to search (%s%)
     * @param pageNum      Number of the "paged" result to fetch
     * @param itemsPerPage Number of items per result "page"
     */
    fun setAttributeQuery(query: String, pageNum: Int, itemsPerPage: Int) {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                dao.selectAttributeMasterDataPaged(
                    attributeTypes!!,
                    query,
                    selectedGroup,
                    selectedAttributes.value,
                    location,
                    contentType,
                    false,
                    pageNum,
                    itemsPerPage,
                    attributeSortOrder
                )
            }
            availableAttributes.postValue(result)
        }
    }

    /**
     * Add the given attribute to the attribute selection for the Content and Attribute searches
     * - Only books tagged with all selected attributes will be among Content search results
     * - Only attributes contained in these books will be among Attribute search results
     *
     * @param attr Attribute to add to current selection
     */
    fun addSelectedAttribute(attr: Attribute) {
        val selectedAttributesList: MutableList<Attribute> =
            java.util.ArrayList(Objects.requireNonNull(selectedAttributes.value)) // Create new instance to make ListAdapter.submitList happy

        // Direct impact on selectedAttributes
        selectedAttributesList.add(attr)
        setSelectedAttributes(selectedAttributesList)
    }

    /**
     * Set the selected attributes for the Content and Attribute searches
     * - Only books tagged with all selected attributes will be among Content search results
     * - Only attributes contained in these books will be among Attribute search results
     *
     * @param attrs Selected attributes
     */
    fun setSelectedAttributes(attrs: List<Attribute>) {
        selectedAttributes.value = attrs
        update()
    }

    /**
     * Remove the given attribute from the current selection for the Content and Attribute searches
     * - Only books tagged with all selected attributes will be among Content search results
     * - Only attributes contained in these books will be among Attribute search results
     *
     * @param attr Attribute to remove from current selection
     */
    fun removeSelectedAttribute(attr: Attribute) {
        val selectedAttributesList: MutableList<Attribute> =
            java.util.ArrayList(Objects.requireNonNull(selectedAttributes.value)) // Create new instance to make ListAdapter.submitList happy

        // Direct impact on selectedAttributes
        selectedAttributesList.remove(attr)
        setSelectedAttributes(selectedAttributesList)
    }

    fun setLocation(@ContentHelper.Location location: Int) {
        this.location = location
        update()
    }

    fun setContentType(@ContentHelper.Type contentType: Int) {
        this.contentType = contentType
        update()
    }

    /**
     * Update the viewmodel according to current query properties
     */
    fun update() {
        countAttributesPerType()
        updateSelectionResult()
    }

    /**
     * Run the query to get the number of attributes per type
     */
    private fun countAttributesPerType() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                dao.countAttributesPerType(
                    selectedGroup,
                    selectedAttributes.value,
                    location,
                    contentType
                )
            }
            // Result has to take into account the number of attributes already selected (hence unavailable)
            val selectedAttrs =
                selectedAttributes.value
            if (selectedAttrs != null) {
                for (a in selectedAttrs) {
                    // if attribute is excluded already, there's no need to reduce attrPerType value,
                    // since attr is no longer amongst results
                    if (!a.isExcluded) {
                        var countForType = result[a.type.code]
                        if (countForType > 0) result.put(a.type.code, --countForType)
                    }
                }
            }
            nbAttributesPerType.postValue(result)
        }
    }

    /**
     * Run the query to get the available Attributes and Content
     */
    private fun updateSelectionResult() {
        currentSelectedContentCountInternal?.let {
            selectedContentCount.removeSource(it)
        }
        currentSelectedContentCountInternal =
            dao.countBooks(selectedGroup, selectedAttributes.value, location, contentType)
        selectedContentCount.addSource(currentSelectedContentCountInternal!!)
        { value -> selectedContentCount.setValue(value) }
    }
}