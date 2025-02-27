// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters of a managed disk. */
@Fluent
public final class ManagedDiskParameters extends SubResource {
    /*
     * Specifies the storage account type for the managed disk. NOTE:
     * UltraSSD_LRS can only be used with data disks, it cannot be used with OS
     * Disk.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /*
     * Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     */
    @JsonProperty(value = "diskEncryptionSet")
    private DiskEncryptionSetParameters diskEncryptionSet;

    /*
     * Specifies the security profile for the managed disk.
     */
    @JsonProperty(value = "securityProfile")
    private VMDiskSecurityProfile securityProfile;

    /**
     * Get the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the ManagedDiskParameters object itself.
     */
    public ManagedDiskParameters withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     *
     * @return the diskEncryptionSet value.
     */
    public DiskEncryptionSetParameters diskEncryptionSet() {
        return this.diskEncryptionSet;
    }

    /**
     * Set the diskEncryptionSet property: Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     *
     * @param diskEncryptionSet the diskEncryptionSet value to set.
     * @return the ManagedDiskParameters object itself.
     */
    public ManagedDiskParameters withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        this.diskEncryptionSet = diskEncryptionSet;
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the security profile for the managed disk.
     *
     * @return the securityProfile value.
     */
    public VMDiskSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the security profile for the managed disk.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the ManagedDiskParameters object itself.
     */
    public ManagedDiskParameters withSecurityProfile(VMDiskSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedDiskParameters withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionSet() != null) {
            diskEncryptionSet().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }
}
