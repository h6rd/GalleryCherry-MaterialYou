package me.devsaki.hentoid.activities;

import java.lang.System;

/**
 * Activity for the advanced search screen
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0014J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0016H\u0014J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0016\u0010#\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\b\u0010\'\u001a\u00020\fH\u0002J1\u0010(\u001a\u00020\f2\u0006\u0010\"\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010+R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lme/devsaki/hentoid/activities/SearchActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivitySearchBinding;", "excludeClicked", "", "selectedAttributeAdapter", "Lme/devsaki/hentoid/adapters/SelectedAttributeAdapter;", "viewModel", "Lme/devsaki/hentoid/viewmodels/SearchViewModel;", "onAttrButtonClick", "", "attributeTypes", "", "Lme/devsaki/hentoid/enums/AttributeType;", "(Z[Lme/devsaki/hentoid/enums/AttributeType;)V", "onBooksCounted", "count", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onExcludeClick", "view", "Landroid/view/View;", "onQueryUpdated", "attrCount", "Landroid/util/SparseIntArray;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onSelectedAttributeClick", "button", "onSelectedAttributesChanged", "selectedAttributes", "", "Lme/devsaki/hentoid/database/domains/Attribute;", "searchBooks", "updateAttributeTypeButton", "Landroid/widget/TextView;", "types", "(Landroid/widget/TextView;Landroid/util/SparseIntArray;[Lme/devsaki/hentoid/enums/AttributeType;)V", "app_debug"})
public final class SearchActivity extends me.devsaki.hentoid.activities.BaseActivity {
    private me.devsaki.hentoid.databinding.ActivitySearchBinding binding;
    private me.devsaki.hentoid.adapters.SelectedAttributeAdapter selectedAttributeAdapter;
    private me.devsaki.hentoid.viewmodels.SearchViewModel viewModel;
    private boolean excludeClicked = false;
    
    public SearchActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Observer for changes in the entry count inside each attribute type
     *
     * @param attrCount Entry count in every attribute type (key = attribute type code; value = count)
     */
    private final void onQueryUpdated(android.util.SparseIntArray attrCount) {
    }
    
    private final void onExcludeClick(android.view.View view) {
    }
    
    /**
     * Update the text of a given attribute type button based on the given SparseIntArray and relevant type(s)
     *
     * @param button    Button whose text to update
     * @param attrCount Entry count in every attribute type (key = attribute type code; value = count)
     * @param types     Type(s) to fetch the count for
     */
    private final void updateAttributeTypeButton(android.widget.TextView button, android.util.SparseIntArray attrCount, me.devsaki.hentoid.enums.AttributeType... types) {
    }
    
    /**
     * Handler for the click on a attribute type button
     * Opens the bottom dialog for a given attribute type
     *
     * @param attributeTypes Attribute type(s) to select
     */
    private final void onAttrButtonClick(boolean excludeClicked, me.devsaki.hentoid.enums.AttributeType... attributeTypes) {
    }
    
    /**
     * Observer for changes in the selected attributes
     *
     * @param selectedAttributes list of currently selected attributes
     */
    private final void onSelectedAttributesChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.Attribute> selectedAttributes) {
    }
    
    /**
     * Handler for click on a selected attribute
     *
     * @param button Button that has been clicked on; contains the corresponding attribute as its tag
     */
    private final void onSelectedAttributeClick(android.view.View button) {
    }
    
    /**
     * Observer for changes in the entry count of selected content
     * i.e. count of all books of the library matching the currently selected attributes
     *
     * @param count Current book count matching the currently selected attributes
     */
    private final void onBooksCounted(int count) {
    }
    
    /**
     * Handler for the click on the "Search books" button
     * Transmit the search query to the library screen and close the advanced search screen
     */
    private final void searchBooks() {
    }
}