// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appconfiguration.fluent.models.DeletedConfigurationStoreInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of deleted configuration stores. */
@Fluent
public final class DeletedConfigurationStoreListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedConfigurationStoreListResult.class);

    /*
     * The list of deleted configuration store.
     */
    @JsonProperty(value = "value")
    private List<DeletedConfigurationStoreInner> value;

    /*
     * The URL to get the next set of deleted configuration stores.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of deleted configuration store.
     *
     * @return the value value.
     */
    public List<DeletedConfigurationStoreInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of deleted configuration store.
     *
     * @param value the value value to set.
     * @return the DeletedConfigurationStoreListResult object itself.
     */
    public DeletedConfigurationStoreListResult withValue(List<DeletedConfigurationStoreInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of deleted configuration stores.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of deleted configuration stores.
     *
     * @param nextLink the nextLink value to set.
     * @return the DeletedConfigurationStoreListResult object itself.
     */
    public DeletedConfigurationStoreListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
