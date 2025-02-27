// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** scheduleChangeRequest. */
@Fluent
public class MicrosoftGraphScheduleChangeRequest extends MicrosoftGraphChangeTrackedEntity {
    /*
     * scheduleChangeRequestActor
     */
    @JsonProperty(value = "assignedTo")
    private MicrosoftGraphScheduleChangeRequestActor assignedTo;

    /*
     * The managerActionDateTime property.
     */
    @JsonProperty(value = "managerActionDateTime")
    private OffsetDateTime managerActionDateTime;

    /*
     * The managerActionMessage property.
     */
    @JsonProperty(value = "managerActionMessage")
    private String managerActionMessage;

    /*
     * The managerUserId property.
     */
    @JsonProperty(value = "managerUserId")
    private String managerUserId;

    /*
     * The senderDateTime property.
     */
    @JsonProperty(value = "senderDateTime")
    private OffsetDateTime senderDateTime;

    /*
     * The senderMessage property.
     */
    @JsonProperty(value = "senderMessage")
    private String senderMessage;

    /*
     * The senderUserId property.
     */
    @JsonProperty(value = "senderUserId")
    private String senderUserId;

    /*
     * scheduleChangeState
     */
    @JsonProperty(value = "state")
    private MicrosoftGraphScheduleChangeState state;

    /*
     * scheduleChangeRequest
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the assignedTo property: scheduleChangeRequestActor.
     *
     * @return the assignedTo value.
     */
    public MicrosoftGraphScheduleChangeRequestActor assignedTo() {
        return this.assignedTo;
    }

    /**
     * Set the assignedTo property: scheduleChangeRequestActor.
     *
     * @param assignedTo the assignedTo value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withAssignedTo(MicrosoftGraphScheduleChangeRequestActor assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    /**
     * Get the managerActionDateTime property: The managerActionDateTime property.
     *
     * @return the managerActionDateTime value.
     */
    public OffsetDateTime managerActionDateTime() {
        return this.managerActionDateTime;
    }

    /**
     * Set the managerActionDateTime property: The managerActionDateTime property.
     *
     * @param managerActionDateTime the managerActionDateTime value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerActionDateTime(OffsetDateTime managerActionDateTime) {
        this.managerActionDateTime = managerActionDateTime;
        return this;
    }

    /**
     * Get the managerActionMessage property: The managerActionMessage property.
     *
     * @return the managerActionMessage value.
     */
    public String managerActionMessage() {
        return this.managerActionMessage;
    }

    /**
     * Set the managerActionMessage property: The managerActionMessage property.
     *
     * @param managerActionMessage the managerActionMessage value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerActionMessage(String managerActionMessage) {
        this.managerActionMessage = managerActionMessage;
        return this;
    }

    /**
     * Get the managerUserId property: The managerUserId property.
     *
     * @return the managerUserId value.
     */
    public String managerUserId() {
        return this.managerUserId;
    }

    /**
     * Set the managerUserId property: The managerUserId property.
     *
     * @param managerUserId the managerUserId value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }

    /**
     * Get the senderDateTime property: The senderDateTime property.
     *
     * @return the senderDateTime value.
     */
    public OffsetDateTime senderDateTime() {
        return this.senderDateTime;
    }

    /**
     * Set the senderDateTime property: The senderDateTime property.
     *
     * @param senderDateTime the senderDateTime value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderDateTime(OffsetDateTime senderDateTime) {
        this.senderDateTime = senderDateTime;
        return this;
    }

    /**
     * Get the senderMessage property: The senderMessage property.
     *
     * @return the senderMessage value.
     */
    public String senderMessage() {
        return this.senderMessage;
    }

    /**
     * Set the senderMessage property: The senderMessage property.
     *
     * @param senderMessage the senderMessage value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
        return this;
    }

    /**
     * Get the senderUserId property: The senderUserId property.
     *
     * @return the senderUserId value.
     */
    public String senderUserId() {
        return this.senderUserId;
    }

    /**
     * Set the senderUserId property: The senderUserId property.
     *
     * @param senderUserId the senderUserId value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
        return this;
    }

    /**
     * Get the state property: scheduleChangeState.
     *
     * @return the state value.
     */
    public MicrosoftGraphScheduleChangeState state() {
        return this.state;
    }

    /**
     * Set the state property: scheduleChangeState.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withState(MicrosoftGraphScheduleChangeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the additionalProperties property: scheduleChangeRequest.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: scheduleChangeRequest.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphScheduleChangeRequest object itself.
     */
    public MicrosoftGraphScheduleChangeRequest withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphScheduleChangeRequest withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphScheduleChangeRequest withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphScheduleChangeRequest withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphScheduleChangeRequest withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
