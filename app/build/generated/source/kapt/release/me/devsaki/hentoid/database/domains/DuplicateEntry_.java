
package me.devsaki.hentoid.database.domains;

import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;
import me.devsaki.hentoid.database.domains.DuplicateEntryCursor.Factory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "DuplicateEntry". Can be used for QueryBuilder and for referencing DB names.
 */
public final class DuplicateEntry_ implements EntityInfo<DuplicateEntry> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "DuplicateEntry";

    public static final int __ENTITY_ID = 14;

    public static final Class<DuplicateEntry> __ENTITY_CLASS = DuplicateEntry.class;

    public static final String __DB_NAME = "DuplicateEntry";

    public static final CursorFactory<DuplicateEntry> __CURSOR_FACTORY = new Factory();

    @Internal
    static final DuplicateEntryIdGetter __ID_GETTER = new DuplicateEntryIdGetter();

    public final static DuplicateEntry_ __INSTANCE = new DuplicateEntry_();

    public final static io.objectbox.Property<DuplicateEntry> referenceId =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "referenceId");

    public final static io.objectbox.Property<DuplicateEntry> referenceSize =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, long.class, "referenceSize");

    public final static io.objectbox.Property<DuplicateEntry> duplicateId =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, long.class, "duplicateId");

    public final static io.objectbox.Property<DuplicateEntry> duplicateSize =
        new io.objectbox.Property<>(__INSTANCE, 3, 4, long.class, "duplicateSize");

    public final static io.objectbox.Property<DuplicateEntry> titleScore =
        new io.objectbox.Property<>(__INSTANCE, 4, 5, float.class, "titleScore");

    public final static io.objectbox.Property<DuplicateEntry> coverScore =
        new io.objectbox.Property<>(__INSTANCE, 5, 6, float.class, "coverScore");

    public final static io.objectbox.Property<DuplicateEntry> artistScore =
        new io.objectbox.Property<>(__INSTANCE, 6, 7, float.class, "artistScore");

    public final static io.objectbox.Property<DuplicateEntry> id =
        new io.objectbox.Property<>(__INSTANCE, 7, 8, long.class, "id", true, "id");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<DuplicateEntry>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        referenceId,
        referenceSize,
        duplicateId,
        duplicateSize,
        titleScore,
        coverScore,
        artistScore,
        id
    };

    public final static io.objectbox.Property<DuplicateEntry> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<DuplicateEntry> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<DuplicateEntry>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<DuplicateEntry> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<DuplicateEntry> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<DuplicateEntry> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class DuplicateEntryIdGetter implements IdGetter<DuplicateEntry> {
        @Override
        public long getId(DuplicateEntry object) {
            return object.getId();
        }
    }

}