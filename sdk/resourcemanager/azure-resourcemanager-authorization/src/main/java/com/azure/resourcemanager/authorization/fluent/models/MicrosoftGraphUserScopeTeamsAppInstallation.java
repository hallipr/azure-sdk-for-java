// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** userScopeTeamsAppInstallation. */
@Fluent
public final class MicrosoftGraphUserScopeTeamsAppInstallation extends MicrosoftGraphTeamsAppInstallation {
    /*
     * chat
     */
    @JsonProperty(value = "chat")
    private MicrosoftGraphChat chat;

    /*
     * userScopeTeamsAppInstallation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the chat property: chat.
     *
     * @return the chat value.
     */
    public MicrosoftGraphChat chat() {
        return this.chat;
    }

    /**
     * Set the chat property: chat.
     *
     * @param chat the chat value to set.
     * @return the MicrosoftGraphUserScopeTeamsAppInstallation object itself.
     */
    public MicrosoftGraphUserScopeTeamsAppInstallation withChat(MicrosoftGraphChat chat) {
        this.chat = chat;
        return this;
    }

    /**
     * Get the additionalProperties property: userScopeTeamsAppInstallation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: userScopeTeamsAppInstallation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUserScopeTeamsAppInstallation object itself.
     */
    public MicrosoftGraphUserScopeTeamsAppInstallation withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphUserScopeTeamsAppInstallation withTeamsApp(MicrosoftGraphTeamsApp teamsApp) {
        super.withTeamsApp(teamsApp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphUserScopeTeamsAppInstallation withTeamsAppDefinition(
        MicrosoftGraphTeamsAppDefinition teamsAppDefinition) {
        super.withTeamsAppDefinition(teamsAppDefinition);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphUserScopeTeamsAppInstallation withId(String id) {
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
        if (chat() != null) {
            chat().validate();
        }
    }
}
