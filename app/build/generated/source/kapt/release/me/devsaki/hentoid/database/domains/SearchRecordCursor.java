package me.devsaki.hentoid.database.domains;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "SearchRecord".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class SearchRecordCursor extends Cursor<SearchRecord> {
    @Internal
    static final class Factory implements CursorFactory<SearchRecord> {
        @Override
        public Cursor<SearchRecord> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new SearchRecordCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final SearchRecord_.SearchRecordIdGetter ID_GETTER = SearchRecord_.__ID_GETTER;


    private final static int __ID_searchString = SearchRecord_.searchString.id;
    private final static int __ID_label = SearchRecord_.label.id;

    public SearchRecordCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, SearchRecord_.__INSTANCE, boxStore);
    }

    @Override
    public long getId(SearchRecord entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @SuppressWarnings({"rawtypes", "unchecked"}) 
    @Override
    public long put(SearchRecord entity) {
        String searchString = entity.getSearchString();
        int __id1 = searchString != null ? __ID_searchString : 0;
        String label = entity.getLabel();
        int __id2 = label != null ? __ID_label : 0;

        long __assignedId = collect313311(cursor, entity.id, PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                __id1, searchString, __id2, label,
                0, null, 0, null,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);

        entity.id = __assignedId;

        return __assignedId;
    }

}
