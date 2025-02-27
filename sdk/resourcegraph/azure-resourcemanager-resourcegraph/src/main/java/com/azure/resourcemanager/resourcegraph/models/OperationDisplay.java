// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Display metadata associated with the operation. */
@Fluent
public final class OperationDisplay {
    /*
     * Service provider: Microsoft Resource Graph.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Type of operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description for the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: Service provider: Microsoft Resource Graph.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider: Microsoft Resource Graph.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed etc.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed etc.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Type of operation: get, read, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Type of operation: get, read, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description for the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
