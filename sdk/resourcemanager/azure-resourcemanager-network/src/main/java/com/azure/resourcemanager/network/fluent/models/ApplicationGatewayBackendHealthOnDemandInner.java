// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendHealthHttpSettings;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result of on demand test probe. */
@Fluent
public final class ApplicationGatewayBackendHealthOnDemandInner {
    /*
     * Reference to an ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private ApplicationGatewayBackendAddressPool backendAddressPool;

    /*
     * Application gateway BackendHealthHttp settings.
     */
    @JsonProperty(value = "backendHealthHttpSettings")
    private ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings;

    /**
     * Get the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @return the backendAddressPool value.
     */
    public ApplicationGatewayBackendAddressPool backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayBackendHealthOnDemandInner object itself.
     */
    public ApplicationGatewayBackendHealthOnDemandInner withBackendAddressPool(
        ApplicationGatewayBackendAddressPool backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHealthHttpSettings property: Application gateway BackendHealthHttp settings.
     *
     * @return the backendHealthHttpSettings value.
     */
    public ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings() {
        return this.backendHealthHttpSettings;
    }

    /**
     * Set the backendHealthHttpSettings property: Application gateway BackendHealthHttp settings.
     *
     * @param backendHealthHttpSettings the backendHealthHttpSettings value to set.
     * @return the ApplicationGatewayBackendHealthOnDemandInner object itself.
     */
    public ApplicationGatewayBackendHealthOnDemandInner withBackendHealthHttpSettings(
        ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings) {
        this.backendHealthHttpSettings = backendHealthHttpSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendAddressPool() != null) {
            backendAddressPool().validate();
        }
        if (backendHealthHttpSettings() != null) {
            backendHealthHttpSettings().validate();
        }
    }
}
