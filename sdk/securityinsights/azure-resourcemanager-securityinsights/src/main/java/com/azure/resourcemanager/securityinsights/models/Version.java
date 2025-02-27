// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Version. */
public final class Version extends ExpandableStringEnum<Version> {
    /** Static value V1 for Version. */
    public static final Version V1 = fromString("V1");

    /** Static value V2 for Version. */
    public static final Version V2 = fromString("V2");

    /**
     * Creates or finds a Version from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Version.
     */
    @JsonCreator
    public static Version fromString(String name) {
        return fromString(name, Version.class);
    }

    /** @return known Version values. */
    public static Collection<Version> values() {
        return values(Version.class);
    }
}
