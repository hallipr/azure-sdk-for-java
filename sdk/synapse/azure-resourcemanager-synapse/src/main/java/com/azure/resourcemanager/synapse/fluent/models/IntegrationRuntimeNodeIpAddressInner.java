// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IP address of self-hosted integration runtime node. */
@Immutable
public final class IntegrationRuntimeNodeIpAddressInner {
    /*
     * The IP address of self-hosted integration runtime node.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * Get the ipAddress property: The IP address of self-hosted integration runtime node.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
