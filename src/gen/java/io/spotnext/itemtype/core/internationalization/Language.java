/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.internationalization;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;
import io.spotnext.infrastructure.type.Item;

import io.spotnext.itemtype.core.internationalization.Country;
import io.spotnext.itemtype.core.internationalization.LocalizedString;

import org.hibernate.validator.constraints.Length;

import java.lang.String;

import java.util.Locale;
import java.util.Set;

import javax.validation.constraints.NotNull;


/**
 * This represents a language object and it's locale.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "language")
public class Language extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "language";
    public static final String PROPERTY_ISO3_CODE = "iso3Code";
    public static final String PROPERTY_ISO_CODE = "isoCode";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_COUNTRIES = "countries";

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-3.
     */
    @Property(readable = true, unique = true, writable = true)
    @NotNull
    @Length(min = 3, max = 3)
    protected String iso3Code;

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-1.
     */
    @Length(max = 2)
    @Property(readable = true, writable = true)
    protected String isoCode;

    /**
     * The international name of the language.
     */
    @Property(readable = true, writable = true)
    protected LocalizedString name;

    /**
     * The languages available for that country.
     */
    @Property(readable = true, writable = true)
    @Relation(collectionType = io.spotnext.infrastructure.type.RelationCollectionType.Set, relationName = "Country2Language", mappedTo = "languages", type = io.spotnext.infrastructure.type.RelationType.ManyToMany, nodeType = io.spotnext.infrastructure.type.RelationNodeType.TARGET)
    public Set<Country> countries;

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-1.
     */
    @Accessor(propertyName = "isoCode", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-3.
     */
    @Accessor(propertyName = "iso3Code", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getIso3Code() {
        return this.iso3Code;
    }

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-1.
     */
    @Accessor(propertyName = "isoCode", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getIsoCode() {
        return this.isoCode;
    }

    /**
     * The international name of the language.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        this.name.set(name);
    }

    /**
     * The languages available for that country.
     */
    @Accessor(propertyName = "countries", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Set<Country> getCountries() {
        return this.countries;
    }

    /**
     * The international name of the language.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName(Locale locale) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        return this.name.get(locale);
    }

    /**
     * The international name of the language.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getName() {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        return this.name.get();
    }

    /**
     * The ISO-3 code of the language.<br>                    @see https://en.wikipedia.org/wiki/ISO_639-3.
     */
    @Accessor(propertyName = "iso3Code", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setIso3Code(String iso3Code) {
        this.iso3Code = iso3Code;
    }

    /**
     * The international name of the language.
     */
    @Accessor(propertyName = "name", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setName(String name, Locale locale) {
        if (this.name == null) {
            this.name = new LocalizedString();
        }

        this.name.set(locale, name);
    }

    /**
     * The languages available for that country.
     */
    @Accessor(propertyName = "countries", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
}
