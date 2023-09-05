
package me.devsaki.hentoid.database.domains;

import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;
import me.devsaki.hentoid.database.domains.SiteHistoryCursor.Factory;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.Site.SiteConverter;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "SiteHistory". Can be used for QueryBuilder and for referencing DB names.
 */
public final class SiteHistory_ implements EntityInfo<SiteHistory> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "SiteHistory";

    public static final int __ENTITY_ID = 10;

    public static final Class<SiteHistory> __ENTITY_CLASS = SiteHistory.class;

    public static final String __DB_NAME = "SiteHistory";

    public static final CursorFactory<SiteHistory> __CURSOR_FACTORY = new Factory();

    @Internal
    static final SiteHistoryIdGetter __ID_GETTER = new SiteHistoryIdGetter();

    public final static SiteHistory_ __INSTANCE = new SiteHistory_();

    public final static io.objectbox.Property<SiteHistory> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<SiteHistory> site =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, long.class, "site", false, "site", SiteConverter.class, Site.class);

    public final static io.objectbox.Property<SiteHistory> url =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, String.class, "url");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<SiteHistory>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        site,
        url
    };

    public final static io.objectbox.Property<SiteHistory> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<SiteHistory> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<SiteHistory>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<SiteHistory> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<SiteHistory> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<SiteHistory> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class SiteHistoryIdGetter implements IdGetter<SiteHistory> {
        @Override
        public long getId(SiteHistory object) {
            return object.id;
        }
    }

}
