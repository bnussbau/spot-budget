/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.configuration;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;
import io.spotnext.infrastructure.type.ItemCollectionFactory;

import io.spotnext.itemtype.core.UniqueIdItem;
import io.spotnext.itemtype.core.configuration.ConfigEntry;

import java.lang.String;

import java.util.Set;


/**
 * This type can be used to store a set of configuration entries.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "configuration")
public class Configuration extends UniqueIdItem {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "configuration";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_ENTRIES = "entries";

    /**
     * The short description of the configuration's purpose.
     */
    @Property(readable = true, writable = true)
    protected String description;

    /**
     * The config entries referenced by this configuration.
     */
    @Relation(collectionType = io.spotnext.infrastructure.type.RelationCollectionType.Set, relationName = "Configuration2ConfigEntry", mappedTo = "configuration", type = io.spotnext.infrastructure.type.RelationType.OneToMany, nodeType = io.spotnext.infrastructure.type.RelationNodeType.SOURCE)
    @Property(readable = true, writable = true)
    public Set<ConfigEntry> entries;

    /**
     * The short description of the configuration's purpose.
     */
    @Accessor(propertyName = "description", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getDescription() {
        return this.description;
    }

    /**
     * The short description of the configuration's purpose.
     */
    @Accessor(propertyName = "description", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The config entries referenced by this configuration.
     */
    @Accessor(propertyName = "entries", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setEntries(Set<ConfigEntry> entries) {
        this.entries = entries;
    }

    /**
     * The config entries referenced by this configuration.
     */
    @Accessor(propertyName = "entries", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Set<ConfigEntry> getEntries() {
        return ItemCollectionFactory.wrap(this, "entries", this.entries);
    }
}
