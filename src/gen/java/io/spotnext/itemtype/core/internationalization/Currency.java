/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.internationalization;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.type.Item;

import io.spotnext.itemtype.core.internationalization.LocalizedString;

import java.lang.String;

import java.util.Locale;

import javax.validation.constraints.NotNull;


/**
 * Represents a currency.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "currency")
public class Currency extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "currency";
    public static final String PROPERTY_ISO_CODE = "isoCode";
    public static final String PROPERTY_NAME = "name";

    /**
     * The iso code of the currency.
     */
    @NotNull
    @Property(readable = true, unique = true, writable = true)
    protected String isoCode;

    /**
     * The localized name of the currency.
     */
    @Property(readable = true, writable = true)
    protected LocalizedString name;

    /**
     * The localized name of the currency.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        this.name.set(name);
    }

    /**
     * The localized name of the currency.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name, Locale locale) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        this.name.set(locale, name);
    }

    /**
     * The iso code of the currency.
     */
    @Accessor(propertyName = "isoCode", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    /**
     * The localized name of the currency.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName(Locale locale) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        return this.name.get(locale);
    }

    /**
     * The iso code of the currency.
     */
    @Accessor(propertyName = "isoCode", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getIsoCode() {
        return this.isoCode;
    }

    /**
     * The localized name of the currency.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        return this.name.get();
    }
}
