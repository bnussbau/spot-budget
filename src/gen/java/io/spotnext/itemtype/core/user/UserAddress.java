/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.user;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;

import io.spotnext.itemtype.core.user.Address;
import io.spotnext.itemtype.core.user.User;

import java.lang.String;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "useraddress")
public class UserAddress extends Address {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "useraddress";
    public static final String PROPERTY_EMAIL_ADDRESS = "emailAddress";
    public static final String PROPERTY_PHONE = "phone";
    public static final String PROPERTY_OWNER = "owner";
    @Property(readable = true, writable = true)
    protected String emailAddress;
    @Property(readable = true, writable = true)
    protected String phone;

    /**
     * Defines a address ownership relation.
     */
    @Relation(relationName = "User2Address", mappedTo = "addresses", type = io.spotnext.infrastructure.type.RelationType.ManyToOne, nodeType = io.spotnext.infrastructure.type.RelationNodeType.TARGET)
    @Property(readable = true, writable = true)
    public User owner;

    @Accessor(propertyName = "phone", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getPhone() {
        return this.phone;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "owner", type = io.spotnext.infrastructure.type.AccessorType.get)
    public User getOwner() {
        return this.owner;
    }

    @Accessor(propertyName = "emailAddress", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getEmailAddress() {
        return this.emailAddress;
    }

    @Accessor(propertyName = "emailAddress", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "owner", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Accessor(propertyName = "phone", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
