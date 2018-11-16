/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.media;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;

import io.spotnext.itemtype.core.media.AbstractMedia;
import io.spotnext.itemtype.core.media.MediaContainer;

import java.lang.Byte;
import java.lang.String;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "media")
public class Media extends AbstractMedia {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "media";
    public static final String PROPERTY_DATA = "data";
    public static final String PROPERTY_CONTAINER = "container";

    /**
     * The content of the data object.
     */
    @Property(readable = true, columnType = io.spotnext.infrastructure.maven.xml.DatabaseColumnType.BLOB, indexed = false, writable = true)
    protected Byte[] data;
    @Property(readable = true, writable = true)
    @Relation(relationName = "MediaContainer2Media", mappedTo = "medias", type = io.spotnext.infrastructure.type.RelationType.ManyToOne, nodeType = io.spotnext.infrastructure.type.RelationNodeType.TARGET)
    public MediaContainer container;

    /**
     * The content of the data object.
     */
    @Accessor(propertyName = "data", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Byte[] getData() {
        return this.data;
    }

    @Accessor(propertyName = "container", type = io.spotnext.infrastructure.type.AccessorType.get)
    public MediaContainer getContainer() {
        return this.container;
    }

    /**
     * The content of the data object.
     */
    @Accessor(propertyName = "data", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setData(Byte[] data) {
        this.data = data;
    }

    @Accessor(propertyName = "container", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setContainer(MediaContainer container) {
        this.container = container;
    }
}
