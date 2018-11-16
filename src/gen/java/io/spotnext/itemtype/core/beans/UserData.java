/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.beans;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.type.Bean;

import java.lang.String;


/**
 * Holds user information.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
public class UserData extends Bean {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public String id;

    @Accessor(propertyName = "id", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getId() {
        return this.id;
    }

    @Accessor(propertyName = "id", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setId(String id) {
        this.id = id;
    }
}
