/**
 * This file is auto-generated. All changes will be overwritten.
 */
package at.benjaminnussbaum.spotbudget.types.itemtypes;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.type.Item;

import java.lang.String;

import javax.validation.constraints.NotNull;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "payee")
public class Payee extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "payee";
    public static final String PROPERTY_NAME = "name";

    /**
     * Unique, notnull name of Payee
     */
    @Property(readable = true, unique = true, writable = true)
    @NotNull
    protected String name;

    /**
     * Unique, notnull name of Payee
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        return this.name;
    }

    /**
     * Unique, notnull name of Payee
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        this.name = name;
    }
}
