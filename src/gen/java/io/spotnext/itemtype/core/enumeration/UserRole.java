/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.enumeration;


/**
 * The user role used to determine access rights and authorizations.
 */
public enum UserRole {ADMIN("ADMIN"),
    USER("USER"),
    ANONYMOUS("ANONYMOUS");

    private String internalValue;

    private UserRole(String internalValue) {
        this.internalValue = internalValue;
    }

    /**
     * Returns the internal value of the current enum.
     */
    public String getInternalName() {
        return this.internalValue;
    }
}
