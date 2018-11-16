/**
 * This file is auto-generated. All changes will be overwritten.
 */
package io.spotnext.itemtype.core.beans;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.type.Bean;

import io.spotnext.itemtype.core.enumeration.DataFormat;

import java.lang.Boolean;
import java.lang.String;

import javax.validation.constraints.NotNull;


/**
 * Holds import configuration and parameters.
 */
@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
public class ImportConfiguration extends Bean {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    @NotNull
    public DataFormat format;
    @NotNull
    public String scriptIdentifier;
    public Boolean ignoreErrors = false;

    @Accessor(propertyName = "scriptIdentifier", type = io.spotnext.infrastructure.type.AccessorType.get)
    public String getScriptIdentifier() {
        return this.scriptIdentifier;
    }

    @Accessor(propertyName = "ignoreErrors", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
    }

    @Accessor(propertyName = "format", type = io.spotnext.infrastructure.type.AccessorType.get)
    public DataFormat getFormat() {
        return this.format;
    }

    @Accessor(propertyName = "format", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setFormat(DataFormat format) {
        this.format = format;
    }

    @Accessor(propertyName = "scriptIdentifier", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setScriptIdentifier(String scriptIdentifier) {
        this.scriptIdentifier = scriptIdentifier;
    }

    @Accessor(propertyName = "ignoreErrors", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Boolean getIgnoreErrors() {
        return this.ignoreErrors;
    }
}
