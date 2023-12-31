package me.devsaki.hentoid.database.domains;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "ShuffleRecord".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class ShuffleRecordCursor extends Cursor<ShuffleRecord> {
    @Internal
    static final class Factory implements CursorFactory<ShuffleRecord> {
        @Override
        public Cursor<ShuffleRecord> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new ShuffleRecordCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final ShuffleRecord_.ShuffleRecordIdGetter ID_GETTER = ShuffleRecord_.__ID_GETTER;


    private final static int __ID_contentId = ShuffleRecord_.contentId.id;

    public ShuffleRecordCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, ShuffleRecord_.__INSTANCE, boxStore);
    }

    @Override
    public long getId(ShuffleRecord entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @SuppressWarnings({"rawtypes", "unchecked"}) 
    @Override
    public long put(ShuffleRecord entity) {
        Long contentId = entity.getContentId();
        int __id1 = contentId != null ? __ID_contentId : 0;

        long __assignedId = collect004000(cursor, entity.id, PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                __id1, __id1 != 0 ? contentId : 0, 0, 0,
                0, 0, 0, 0);

        entity.id = __assignedId;

        return __assignedId;
    }

}
