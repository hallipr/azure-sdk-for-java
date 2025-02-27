// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AccountEncryption model. */
@Fluent
public final class AccountEncryption {
    /*
     * The type of key used to encrypt the Account Key.
     */
    @JsonProperty(value = "type", required = true)
    private AccountEncryptionKeyType type;

    /*
     * The properties of the key used to encrypt the account.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * The Key Vault identity.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The current status of the Key Vault mapping.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the type property: The type of key used to encrypt the Account Key.
     *
     * @return the type value.
     */
    public AccountEncryptionKeyType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of key used to encrypt the Account Key.
     *
     * @param type the type value to set.
     * @return the AccountEncryption object itself.
     */
    public AccountEncryption withType(AccountEncryptionKeyType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the keyVaultProperties property: The properties of the key used to encrypt the account.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The properties of the key used to encrypt the account.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the AccountEncryption object itself.
     */
    public AccountEncryption withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the identity property: The Key Vault identity.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Key Vault identity.
     *
     * @param identity the identity value to set.
     * @return the AccountEncryption object itself.
     */
    public AccountEncryption withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the status property: The current status of the Key Vault mapping.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model AccountEncryption"));
        }
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccountEncryption.class);
}
