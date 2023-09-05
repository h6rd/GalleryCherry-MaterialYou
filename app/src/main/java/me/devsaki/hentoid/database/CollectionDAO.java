package me.devsaki.hentoid.database;

import android.util.SparseIntArray;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;

import com.annimon.stream.function.Consumer;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;

import me.devsaki.hentoid.database.domains.Attribute;
import me.devsaki.hentoid.database.domains.Chapter;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.database.domains.ErrorRecord;
import me.devsaki.hentoid.database.domains.Group;
import me.devsaki.hentoid.database.domains.GroupItem;
import me.devsaki.hentoid.database.domains.ImageFile;
import me.devsaki.hentoid.database.domains.QueueRecord;
import me.devsaki.hentoid.database.domains.RenamingRule;
import me.devsaki.hentoid.database.domains.SearchRecord;
import me.devsaki.hentoid.database.domains.SiteBookmark;
import me.devsaki.hentoid.database.domains.SiteHistory;
import me.devsaki.hentoid.enums.AttributeType;
import me.devsaki.hentoid.enums.Grouping;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.StatusContent;
import me.devsaki.hentoid.util.ContentHelper;
import me.devsaki.hentoid.util.SearchHelper;
import me.devsaki.hentoid.widget.ContentSearchManager;

public interface CollectionDAO {

    // CONTENT

    // Low-level operations

    LiveData<PagedList<Content>> selectNoContent();

    @Nullable
    Content selectContent(long id);

    List<Content> selectContent(long[] id);

    @Nullable
    Content selectContentByStorageUri(@NonNull final String folderUri, boolean onlyFlagged);

    @Nullable
    Content selectContentBySourceAndUrl(@NonNull Site site, @NonNull String contentUrl, @Nullable String coverUrl);

    Set<String> selectAllSourceUrls(@NonNull Site site);

    Set<String> selectAllMergedUrls(@NonNull Site site);

    List<Content> searchTitlesWith(@NonNull final String word, int[] contentStatusCodes);

    long insertContent(@NonNull final Content content);

    long insertContentCore(@NonNull final Content content);

    void updateContentStatus(@NonNull final StatusContent updateFrom, @NonNull final StatusContent updateTo);

    void updateContentDeleteFlag(long contentId, boolean flag);

    void deleteContent(@NonNull final Content content);

    List<ErrorRecord> selectErrorRecordByContentId(long contentId);

    void insertErrorRecord(@NonNull final ErrorRecord record);

    void deleteErrorRecords(long contentId);

    void clearDownloadParams(long contentId);

    void shuffleContent();


    // MASS OPERATIONS

    // Primary library ("internal books")

    long countAllInternalBooks(@NonNull String rootPath, boolean favsOnly);

    void streamAllInternalBooks(@NonNull String rootPath, boolean favsOnly, Consumer<Content> consumer);

    void flagAllInternalBooks(@NonNull String rootPath, boolean includePlaceholders);

    void deleteAllInternalBooks(@NonNull String rootPath, boolean resetRemainingImagesStatus);

    // Queued books

    void flagAllErrorBooksWithJson();

    long countAllQueueBooks();

    LiveData<Integer> countAllQueueBooksLive();

    void deleteAllQueuedBooks();


    // Flagging

    void deleteAllFlaggedBooks(boolean resetRemainingImagesStatus, @Nullable String pathRoot);


    // External library

    void deleteAllExternalBooks();

    void flagAllExternalBooks();


    // GROUPS

    List<Group> selectGroups(long[] groupIds);

    LiveData<List<Group>> selectGroupsLive(int grouping, @Nullable String query, int orderField, boolean orderDesc, int artistGroupVisibility, boolean groupFavouritesOnly, int filterRating);

    List<Group> selectGroups(int grouping);

    List<Group> selectGroups(int grouping, int subType);

    List<Group> selectEditedGroups(int grouping);

    @Nullable
    Group selectGroup(long groupId);

    @Nullable
    Group selectGroupByName(int grouping, @NonNull final String name);

    long countGroupsFor(Grouping grouping);

    long insertGroup(Group group);

    void deleteGroup(long groupId);

    void deleteAllGroups(Grouping grouping);

    void flagAllGroups(Grouping grouping);

    void deleteAllFlaggedGroups();

    long insertGroupItem(GroupItem item);

    List<GroupItem> selectGroupItems(long contentId, Grouping grouping);

    void deleteGroupItems(List<Long> groupItemIds);


    // High-level queries (internal and external locations)

    Set<Long> selectStoredFavContentIds(boolean bookFavs, boolean groupFavs);

    List<Content> selectContentWithUnhashedCovers();

    long countContentWithUnhashedCovers();


    void streamStoredContent(boolean includeQueued, int orderField, boolean orderDesc, Consumer<Content> consumer);


    List<Long> selectRecentBookIds(ContentSearchManager.ContentSearchBundle searchBundle);

    List<Long> searchBookIds(ContentSearchManager.ContentSearchBundle searchBundle, List<Attribute> metadata);

    List<Long> searchBookIdsUniversal(ContentSearchManager.ContentSearchBundle searchBundle);


    LiveData<PagedList<Content>> selectRecentBooks(ContentSearchManager.ContentSearchBundle searchBundle);

    LiveData<PagedList<Content>> searchBooks(ContentSearchManager.ContentSearchBundle searchBundle, List<Attribute> metadata);

    LiveData<PagedList<Content>> searchBooksUniversal(ContentSearchManager.ContentSearchBundle searchBundle);

    LiveData<Map<String, StatusContent>> selectContentUniqueIdStates(@NonNull final Site site);


    LiveData<List<Content>> selectErrorContentLive();

    LiveData<List<Content>> selectErrorContentLive(String query);

    List<Content> selectErrorContent();


    LiveData<Integer> countBooks(
            long groupId,
            List<Attribute> metadata,
            @ContentHelper.Location int location,
            @ContentHelper.Type int contentType);

    LiveData<Integer> countAllBooksLive();


    // IMAGEFILES

    void insertImageFile(@NonNull ImageFile img);

    void insertImageFiles(@NonNull List<ImageFile> imgs);

    void replaceImageList(long contentId, @NonNull final List<ImageFile> newList);

    void updateImageContentStatus(long contentId, StatusContent updateFrom, @NonNull StatusContent updateTo);

    void updateImageFileStatusParamsMimeTypeUriSize(@NonNull ImageFile image);

    void deleteImageFiles(@NonNull List<ImageFile> imgs);

    ImageFile selectImageFile(long id);

    List<ImageFile> selectImageFiles(long[] ids);

    LiveData<List<ImageFile>> selectDownloadedImagesFromContentLive(long id);

    List<ImageFile> selectDownloadedImagesFromContent(long id);

    Map<StatusContent, ImmutablePair<Integer, Long>> countProcessedImagesById(long contentId);

    LiveData<List<ImageFile>> selectAllFavouritePagesLive();

    LiveData<Integer> countAllFavouritePagesLive();

    Map<Site, ImmutablePair<Integer, Long>> selectPrimaryMemoryUsagePerSource();

    Map<Site, ImmutablePair<Integer, Long>> selectPrimaryMemoryUsagePerSource(@NonNull String rootPath);

    Map<Site, ImmutablePair<Integer, Long>> selectExternalMemoryUsagePerSource();


    // QUEUE

    List<QueueRecord> selectQueue();

    LiveData<List<QueueRecord>> selectQueueLive();

    LiveData<List<QueueRecord>> selectQueueLive(String query);

    void addContentToQueue(@NonNull final Content content, StatusContent targetImageStatus, @ContentHelper.QueuePosition int position, long replacedContentId, @Nullable String replacementTitle, boolean isQueueActive);

    void insertQueue(long contentId, int order);

    void updateQueue(@NonNull List<QueueRecord> queue);

    void deleteQueueRecordsCore();

    void deleteQueue(@NonNull Content content);

    void deleteQueue(int index);


    // ATTRIBUTES

    long insertAttribute(@NonNull Attribute attr);

    @Nullable
    Attribute selectAttribute(long id);

    SearchHelper.AttributeQueryResult selectAttributeMasterDataPaged(
            @NonNull List<AttributeType> types,
            String filter,
            long groupId,
            List<Attribute> attrs,
            @ContentHelper.Location int location,
            @ContentHelper.Type int contentType,
            boolean includeFreeAttrs,
            int page,
            int booksPerPage,
            int orderStyle);

    SparseIntArray countAttributesPerType(
            long groupId,
            List<Attribute> filter,
            @ContentHelper.Location int location,
            @ContentHelper.Type int contentType);


    // CHAPTERS

    List<Chapter> selectChapters(long contentId);

    void insertChapters(@NonNull final List<Chapter> chapters);

    void deleteChapters(@NonNull final Content content);

    void deleteChapter(@NonNull final Chapter chapter);


    // SITE HISTORY

    SiteHistory selectHistory(@NonNull Site s);

    void insertSiteHistory(@NonNull Site site, @NonNull String url);


    // BOOKMARKS

    long countAllBookmarks();

    List<SiteBookmark> selectAllBookmarks();

    List<SiteBookmark> selectBookmarks(@NonNull Site s);

    @Nullable
    SiteBookmark selectHomepage(@NonNull Site s);

    long insertBookmark(@NonNull SiteBookmark bookmark);

    void insertBookmarks(@NonNull List<SiteBookmark> bookmarks);

    void deleteBookmark(long bookmarkId);

    void deleteAllBookmarks();


    // SEARCH HISTORY

    LiveData<List<SearchRecord>> selectSearchRecordsLive();

    void insertSearchRecord(@NonNull SearchRecord record, int limit);

    void deleteAllSearchRecords();


    // RENAMING RULES

    @Nullable
    RenamingRule selectRenamingRule(long id);

    LiveData<List<RenamingRule>> selectRenamingRulesLive(@NonNull AttributeType type, String nameFilter);

    List<RenamingRule> selectRenamingRules(@NonNull AttributeType type, String nameFilter);

    long insertRenamingRule(@NonNull RenamingRule rule);

    void insertRenamingRules(@NonNull List<RenamingRule> rules);

    void deleteRenamingRules(List<Long> ids);


    // RESOURCES

    void cleanup();

    void cleanupOrphanAttributes();

    long getDbSizeBytes();


    // ONE-TIME USE QUERIES (MIGRATION & CLEANUP)

    long[] selectContentIdsWithUpdatableJson();
}
