
package me.devsaki.hentoid.database.domains;

import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import me.devsaki.hentoid.database.domains.AttributeLocationCursor.Factory;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.Site.SiteConverter;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "AttributeLocation". Can be used for QueryBuilder and for referencing DB names.
 */
public final class AttributeLocation_ implements EntityInfo<AttributeLocation> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "AttributeLocation";

    public static final int __ENTITY_ID = 7;

    public static final Class<AttributeLocation> __ENTITY_CLASS = AttributeLocation.class;

    public static final String __DB_NAME = "AttributeLocation";

    public static final CursorFactory<AttributeLocation> __CURSOR_FACTORY = new Factory();

    @Internal
    static final AttributeLocationIdGetter __ID_GETTER = new AttributeLocationIdGetter();

    public final static AttributeLocation_ __INSTANCE = new AttributeLocation_();

    public final static io.objectbox.Property<AttributeLocation> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<AttributeLocation> site =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, long.class, "site", false, "site", SiteConverter.class, Site.class);

    public final static io.objectbox.Property<AttributeLocation> url =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, String.class, "url");

    public final static io.objectbox.Property<AttributeLocation> attributeId =
        new io.objectbox.Property<>(__INSTANCE, 3, 4, long.class, "attributeId", true);

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<AttributeLocation>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        site,
        url,
        attributeId
    };

    public final static io.objectbox.Property<AttributeLocation> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<AttributeLocation> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<AttributeLocation>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<AttributeLocation> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<AttributeLocation> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<AttributeLocation> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class AttributeLocationIdGetter implements IdGetter<AttributeLocation> {
        @Override
        public long getId(AttributeLocation object) {
            return object.id;
        }
    }

    /** To-one relation "attribute" to target entity "Attribute". */
    public static final RelationInfo<AttributeLocation, Attribute> attribute =
            new RelationInfo<>(AttributeLocation_.__INSTANCE, Attribute_.__INSTANCE, attributeId, new ToOneGetter<AttributeLocation, Attribute>() {
                @Override
                public ToOne<Attribute> getToOne(AttributeLocation entity) {
                    return entity.attribute;
                }
            });

}