/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.catalog;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;

import io.spotnext.itemtype.core.UniqueIdItem;
import io.spotnext.itemtype.core.catalog.Catalog;
import io.spotnext.itemtype.core.catalog.CatalogVersion;
import io.spotnext.itemtype.core.internationalization.Language;

import java.lang.String;

import java.util.Set;


/**
 * A catalog version holds catalogable types that can be synchronized into another catalog version.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "catalogversion")
public class CatalogVersion extends UniqueIdItem {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "catalogversion";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_SYNCHRONIZATION_TARGET = "synchronizationTarget";
    public static final String PROPERTY_CATALOG = "catalog";
    public static final String PROPERTY_SYNCHRONIZED_LANGUAGES = "synchronizedLanguages";

    /**
     * The name of the catalog version.
     */
    @Property(readable = true, writable = true)
    protected String name;

    /**
     * The target catalog version to which all containing items will be synchronized..
     */
    @Property(readable = true, writable = true)
    protected CatalogVersion synchronizationTarget;
    @Relation(relationName = "Catalog2CatalogVersion", mappedTo = "versions", type = io.spotnext.infrastructure.type.RelationType.ManyToOne, nodeType = io.spotnext.infrastructure.type.RelationNodeType.TARGET)
    @Property(readable = true, initial = false, unique = true, writable = true)
    public Catalog catalog;

    /**
     * The languages that are synchronized from source to target catalog version.
     */
    @Property(readable = true, writable = true)
    @Relation(collectionType = io.spotnext.infrastructure.type.RelationCollectionType.Set, relationName = "CatalogVersion2SynchronizedLanguage", type = io.spotnext.infrastructure.type.RelationType.ManyToMany, nodeType = io.spotnext.infrastructure.type.RelationNodeType.SOURCE)
    public Set<Language> synchronizedLanguages;

    /**
     * The target catalog version to which all containing items will be synchronized..
     */
    @Accessor(propertyName = "synchronizationTarget", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setSynchronizationTarget(CatalogVersion synchronizationTarget) {
        this.synchronizationTarget = synchronizationTarget;
    }

    /**
     * The languages that are synchronized from source to target catalog version.
     */
    @Accessor(propertyName = "synchronizedLanguages", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Set<Language> getSynchronizedLanguages() {
        return this.synchronizedLanguages;
    }

    /**
     * The name of the catalog version.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The target catalog version to which all containing items will be synchronized..
     */
    @Accessor(propertyName = "synchronizationTarget", type = io.spotnext.infrastructure.type.AccessorType.get)
    public CatalogVersion getSynchronizationTarget() {
        return this.synchronizationTarget;
    }

    @Accessor(propertyName = "catalog", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    /**
     * The name of the catalog version.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        return this.name;
    }

    @Accessor(propertyName = "catalog", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Catalog getCatalog() {
        return this.catalog;
    }

    /**
     * The languages that are synchronized from source to target catalog version.
     */
    @Accessor(propertyName = "synchronizedLanguages", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setSynchronizedLanguages(Set<Language> synchronizedLanguages) {
        this.synchronizedLanguages = synchronizedLanguages;
    }
}
