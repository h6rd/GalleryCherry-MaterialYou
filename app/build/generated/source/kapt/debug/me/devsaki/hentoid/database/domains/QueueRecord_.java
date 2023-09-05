
package me.devsaki.hentoid.database.domains;

import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import me.devsaki.hentoid.database.domains.QueueRecordCursor.Factory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "QueueRecord". Can be used for QueryBuilder and for referencing DB names.
 */
public final class QueueRecord_ implements EntityInfo<QueueRecord> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "QueueRecord";

    public static final int __ENTITY_ID = 4;

    public static final Class<QueueRecord> __ENTITY_CLASS = QueueRecord.class;

    public static final String __DB_NAME = "QueueRecord";

    public static final CursorFactory<QueueRecord> __CURSOR_FACTORY = new Factory();

    @Internal
    static final QueueRecordIdGetter __ID_GETTER = new QueueRecordIdGetter();

    public final static QueueRecord_ __INSTANCE = new QueueRecord_();

    public final static io.objectbox.Property<QueueRecord> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<QueueRecord> rank =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, int.class, "rank");

    public final static io.objectbox.Property<QueueRecord> frozen =
        new io.objectbox.Property<>(__INSTANCE, 2, 4, boolean.class, "frozen");

    public final static io.objectbox.Property<QueueRecord> contentId =
        new io.objectbox.Property<>(__INSTANCE, 3, 3, long.class, "contentId", true);

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<QueueRecord>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        rank,
        frozen,
        contentId
    };

    public final static io.objectbox.Property<QueueRecord> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<QueueRecord> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<QueueRecord>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<QueueRecord> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<QueueRecord> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<QueueRecord> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class QueueRecordIdGetter implements IdGetter<QueueRecord> {
        @Override
        public long getId(QueueRecord object) {
            return object.id;
        }
    }

    /** To-one relation "content" to target entity "Content". */
    public static final RelationInfo<QueueRecord, Content> content =
            new RelationInfo<>(QueueRecord_.__INSTANCE, Content_.__INSTANCE, contentId, new ToOneGetter<QueueRecord, Content>() {
                @Override
                public ToOne<Content> getToOne(QueueRecord entity) {
                    return entity.getContent();
                }
            });

}
