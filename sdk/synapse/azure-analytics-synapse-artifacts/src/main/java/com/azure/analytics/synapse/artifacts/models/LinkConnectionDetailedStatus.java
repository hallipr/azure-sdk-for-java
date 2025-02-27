// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkConnectionDetailedStatus model. */
@Fluent
public final class LinkConnectionDetailedStatus {
    /*
     * Link connection id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Link connection name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Is link connection applying changes
     */
    @JsonProperty(value = "isApplyingChanges")
    private Boolean isApplyingChanges;

    /*
     * Is link connection partially failed
     */
    @JsonProperty(value = "isPartiallyFailed")
    private Boolean isPartiallyFailed;

    /*
     * Link connection start time
     */
    @JsonProperty(value = "startTime")
    private Object startTime;

    /*
     * Link connection stop time
     */
    @JsonProperty(value = "stopTime")
    private Object stopTime;

    /*
     * Link connection status
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Link connection's corresponding continuous run id
     */
    @JsonProperty(value = "continuousRunId")
    private String continuousRunId;

    /*
     * Link connection error
     */
    @JsonProperty(value = "error")
    private Object error;

    /**
     * Get the id property: Link connection id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Link connection id.
     *
     * @param id the id value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Link connection name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Link connection name.
     *
     * @param name the name value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isApplyingChanges property: Is link connection applying changes.
     *
     * @return the isApplyingChanges value.
     */
    public Boolean isApplyingChanges() {
        return this.isApplyingChanges;
    }

    /**
     * Set the isApplyingChanges property: Is link connection applying changes.
     *
     * @param isApplyingChanges the isApplyingChanges value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setIsApplyingChanges(Boolean isApplyingChanges) {
        this.isApplyingChanges = isApplyingChanges;
        return this;
    }

    /**
     * Get the isPartiallyFailed property: Is link connection partially failed.
     *
     * @return the isPartiallyFailed value.
     */
    public Boolean isPartiallyFailed() {
        return this.isPartiallyFailed;
    }

    /**
     * Set the isPartiallyFailed property: Is link connection partially failed.
     *
     * @param isPartiallyFailed the isPartiallyFailed value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setIsPartiallyFailed(Boolean isPartiallyFailed) {
        this.isPartiallyFailed = isPartiallyFailed;
        return this;
    }

    /**
     * Get the startTime property: Link connection start time.
     *
     * @return the startTime value.
     */
    public Object getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Link connection start time.
     *
     * @param startTime the startTime value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the stopTime property: Link connection stop time.
     *
     * @return the stopTime value.
     */
    public Object getStopTime() {
        return this.stopTime;
    }

    /**
     * Set the stopTime property: Link connection stop time.
     *
     * @param stopTime the stopTime value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setStopTime(Object stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * Get the status property: Link connection status.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Link connection status.
     *
     * @param status the status value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the continuousRunId property: Link connection's corresponding continuous run id.
     *
     * @return the continuousRunId value.
     */
    public String getContinuousRunId() {
        return this.continuousRunId;
    }

    /**
     * Set the continuousRunId property: Link connection's corresponding continuous run id.
     *
     * @param continuousRunId the continuousRunId value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setContinuousRunId(String continuousRunId) {
        this.continuousRunId = continuousRunId;
        return this;
    }

    /**
     * Get the error property: Link connection error.
     *
     * @return the error value.
     */
    public Object getError() {
        return this.error;
    }

    /**
     * Set the error property: Link connection error.
     *
     * @param error the error value to set.
     * @return the LinkConnectionDetailedStatus object itself.
     */
    public LinkConnectionDetailedStatus setError(Object error) {
        this.error = error;
        return this;
    }
}
