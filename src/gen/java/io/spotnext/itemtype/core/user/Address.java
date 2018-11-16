/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.user;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;
import io.spotnext.infrastructure.type.Item;

import io.spotnext.itemtype.core.internationalization.Country;
import io.spotnext.itemtype.core.user.AddressType;

import java.lang.String;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "address")
public abstract class Address extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "address";
    public static final String PROPERTY_STREET_NAME = "streetName";
    public static final String PROPERTY_STREET_NUMBER = "streetNumber";
    public static final String PROPERTY_CITY = "city";
    public static final String PROPERTY_POSTAL_CODE = "postalCode";
    public static final String PROPERTY_STATE = "state";
    public static final String PROPERTY_COUNTRY = "country";
    public static final String PROPERTY_TYPE = "type";
    @Property(readable = true, writable = true)
    protected String streetName;
    @Property(readable = true, writable = true)
    protected String streetNumber;
    @Property(readable = true, writable = true)
    protected String city;
    @Property(readable = true, writable = true)
    protected String postalCode;
    @Property(readable = true, writable = true)
    protected String state;
    @Property(readable = true, writable = true)
    protected Country country;

    /**
     * Defines a address ownership relation.
     */
    @Relation(relationName = "Address2AddressType", type = io.spotnext.infrastructure.type.RelationType.ManyToOne, nodeType = io.spotnext.infrastructure.type.RelationNodeType.SOURCE)
    @Property(readable = true, writable = true)
    public AddressType type;

    @Accessor(propertyName = "streetNumber", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Accessor(propertyName = "state", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setState(String state) {
        this.state = state;
    }

    @Accessor(propertyName = "streetName", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "type", type = io.spotnext.infrastructure.type.AccessorType.get)
    public AddressType getType() {
        return this.type;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "type", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setType(AddressType type) {
        this.type = type;
    }

    @Accessor(propertyName = "city", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getCity() {
        return this.city;
    }

    @Accessor(propertyName = "country", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setCountry(Country country) {
        this.country = country;
    }

    @Accessor(propertyName = "streetNumber", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getStreetNumber() {
        return this.streetNumber;
    }

    @Accessor(propertyName = "postalCode", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Accessor(propertyName = "state", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getState() {
        return this.state;
    }

    @Accessor(propertyName = "streetName", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Accessor(propertyName = "country", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Country getCountry() {
        return this.country;
    }

    @Accessor(propertyName = "city", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setCity(String city) {
        this.city = city;
    }

    @Accessor(propertyName = "postalCode", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getPostalCode() {
        return this.postalCode;
    }
}
