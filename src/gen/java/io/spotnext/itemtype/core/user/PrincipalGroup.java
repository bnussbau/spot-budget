/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.user;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.annotation.Relation;

import io.spotnext.itemtype.core.user.Principal;

import java.lang.String;

import java.util.Set;


/**
 * The base type all principal group-like structures.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "principalgroup")
public abstract class PrincipalGroup extends Principal {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "principalgroup";
    public static final String PROPERTY_MEMBERS = "members";

    /**
     * The relation between principal groups and principals
     */
    @Property(readable = true, writable = true)
    @Relation(collectionType = io.spotnext.infrastructure.type.RelationCollectionType.List, relationName = "PrincipalGroup2Principal", mappedTo = "groups", type = io.spotnext.infrastructure.type.RelationType.ManyToMany, nodeType = io.spotnext.infrastructure.type.RelationNodeType.SOURCE)
    public Set<Principal> members;

    /**
     * The relation between principal groups and principals
     */
    @Accessor(propertyName = "members", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setMembers(Set<Principal> members) {
        this.members = members;
    }

    /**
     * The relation between principal groups and principals
     */
    @Accessor(propertyName = "members", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Set<Principal> getMembers() {
        return this.members;
    }
}
