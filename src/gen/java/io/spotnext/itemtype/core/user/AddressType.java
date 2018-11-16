/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.user;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;

import io.spotnext.itemtype.core.UniqueIdItem;

import java.lang.String;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "addresstype")
public class AddressType extends UniqueIdItem {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "addresstype";
    public static final String PROPERTY_NAME = "name";

    /**
     * The name of the address type.
     */
    @Property(readable = true, writable = true)
    protected String name;

    /**
     * The name of the address type.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        return this.name;
    }

    /**
     * The name of the address type.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        this.name = name;
    }
}
