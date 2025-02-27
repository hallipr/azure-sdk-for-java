// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterManagerType;
import com.azure.resourcemanager.sqlvirtualmachine.models.ScaleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVmGroupImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a SQL virtual machine group. */
@Fluent
public final class SqlVirtualMachineGroupProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlVirtualMachineGroupProperties.class);

    /*
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     */
    @JsonProperty(value = "sqlImageOffer")
    private String sqlImageOffer;

    /*
     * SQL image sku.
     */
    @JsonProperty(value = "sqlImageSku")
    private SqlVmGroupImageSku sqlImageSku;

    /*
     * Scale type.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ScaleType scaleType;

    /*
     * Type of cluster manager: Windows Server Failover Cluster (WSFC), implied
     * by the scale type of the group and the OS type.
     */
    @JsonProperty(value = "clusterManagerType", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterManagerType clusterManagerType;

    /*
     * Cluster type.
     */
    @JsonProperty(value = "clusterConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterConfiguration clusterConfiguration;

    /*
     * Cluster Active Directory domain profile.
     */
    @JsonProperty(value = "wsfcDomainProfile")
    private WsfcDomainProfile wsfcDomainProfile;

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sqlImageOffer property: SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @return the sqlImageOffer value.
     */
    public String sqlImageOffer() {
        return this.sqlImageOffer;
    }

    /**
     * Set the sqlImageOffer property: SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @param sqlImageOffer the sqlImageOffer value to set.
     * @return the SqlVirtualMachineGroupProperties object itself.
     */
    public SqlVirtualMachineGroupProperties withSqlImageOffer(String sqlImageOffer) {
        this.sqlImageOffer = sqlImageOffer;
        return this;
    }

    /**
     * Get the sqlImageSku property: SQL image sku.
     *
     * @return the sqlImageSku value.
     */
    public SqlVmGroupImageSku sqlImageSku() {
        return this.sqlImageSku;
    }

    /**
     * Set the sqlImageSku property: SQL image sku.
     *
     * @param sqlImageSku the sqlImageSku value to set.
     * @return the SqlVirtualMachineGroupProperties object itself.
     */
    public SqlVirtualMachineGroupProperties withSqlImageSku(SqlVmGroupImageSku sqlImageSku) {
        this.sqlImageSku = sqlImageSku;
        return this;
    }

    /**
     * Get the scaleType property: Scale type.
     *
     * @return the scaleType value.
     */
    public ScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Get the clusterManagerType property: Type of cluster manager: Windows Server Failover Cluster (WSFC), implied by
     * the scale type of the group and the OS type.
     *
     * @return the clusterManagerType value.
     */
    public ClusterManagerType clusterManagerType() {
        return this.clusterManagerType;
    }

    /**
     * Get the clusterConfiguration property: Cluster type.
     *
     * @return the clusterConfiguration value.
     */
    public ClusterConfiguration clusterConfiguration() {
        return this.clusterConfiguration;
    }

    /**
     * Get the wsfcDomainProfile property: Cluster Active Directory domain profile.
     *
     * @return the wsfcDomainProfile value.
     */
    public WsfcDomainProfile wsfcDomainProfile() {
        return this.wsfcDomainProfile;
    }

    /**
     * Set the wsfcDomainProfile property: Cluster Active Directory domain profile.
     *
     * @param wsfcDomainProfile the wsfcDomainProfile value to set.
     * @return the SqlVirtualMachineGroupProperties object itself.
     */
    public SqlVirtualMachineGroupProperties withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile) {
        this.wsfcDomainProfile = wsfcDomainProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (wsfcDomainProfile() != null) {
            wsfcDomainProfile().validate();
        }
    }
}
