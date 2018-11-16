/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.user;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;
import io.spotnext.infrastructure.type.ItemCollectionFactory;

import io.spotnext.itemtype.core.user.Principal;
import io.spotnext.itemtype.core.user.UserAddress;

import java.lang.String;

import java.util.Set;


/**
 * Represents a user.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "user")
public class User extends Principal {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "user";
    public static final String PROPERTY_EMAIL_ADDRESS = "emailAddress";
    public static final String PROPERTY_PASSWORD = "password";
    public static final String PROPERTY_ADDRESSES = "addresses";

    /**
     * The main email address of the user.
     */
    @Property(readable = true, writable = true)
    protected String emailAddress;

    /**
     * The login password, can be encrypted.
     */
    @Property(readable = true, writable = true)
    protected String password;

    /**
     * Defines a address ownership relation.
     */
    @Relation(collectionType = io.spotnext.infrastructure.type.RelationCollectionType.Set, relationName = "User2Address", mappedTo = "owner", type = io.spotnext.infrastructure.type.RelationType.OneToMany, nodeType = io.spotnext.infrastructure.type.RelationNodeType.SOURCE)
    @Property(readable = true, writable = true)
    public Set<UserAddress> addresses;

    /**
     * The login password, can be encrypted.
     */
    @Accessor(propertyName = "password", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getPassword() {
        return this.password;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "addresses", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Set<UserAddress> getAddresses() {
        return ItemCollectionFactory.wrap(this, "addresses", this.addresses);
    }

    /**
     * The login password, can be encrypted.
     */
    @Accessor(propertyName = "password", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The main email address of the user.
     */
    @Accessor(propertyName = "emailAddress", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Defines a address ownership relation.
     */
    @Accessor(propertyName = "addresses", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setAddresses(Set<UserAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * The main email address of the user.
     */
    @Accessor(propertyName = "emailAddress", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getEmailAddress() {
        return this.emailAddress;
    }
}
