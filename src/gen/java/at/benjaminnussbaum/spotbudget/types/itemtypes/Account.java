/**
 * This file is auto-generated. All changes will be overwritten.
 */
package at.benjaminnussbaum.spotbudget.types.itemtypes;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.type.Item;

import java.lang.Boolean;
import java.lang.String;

import javax.validation.constraints.NotNull;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "account")
public class Account extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "account";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_IBAN = "iban";
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Unique name of account
     */
    @NotNull
    @Property(readable = true, unique = true, writable = true)
    protected String name;

    /**
     * Description of account
     */
    @Property(readable = true, writable = true)
    protected String description;

    /**
     * IBAN
     */
    @Property(readable = true, writable = true)
    protected String iban;

    /**
     * Account is actively used
     */
    @Property(readable = true, writable = true)
    protected Boolean active;

    /**
     * Account is actively used
     */
    @Accessor(propertyName = "active", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Unique name of account
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * IBAN
     */
    @Accessor(propertyName = "iban", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * IBAN
     */
    @Accessor(propertyName = "iban", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getIban() {
        return this.iban;
    }

    /**
     * Description of account
     */
    @Accessor(propertyName = "description", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Unique name of account
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        return this.name;
    }

    /**
     * Account is actively used
     */
    @Accessor(propertyName = "active", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Description of account
     */
    @Accessor(propertyName = "description", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getDescription() {
        return this.description;
    }
}
