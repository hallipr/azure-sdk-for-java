// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for ManagementLocks DeleteByScope. */
public final class ManagementLocksDeleteByScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2017-04-01/examples/ManagementLocks_DeleteAtScope.json
     */
    /**
     * Sample code: Delete management lock at scope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteManagementLockAtScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .deleteByScopeWithResponse("subscriptions/subscriptionId", "testlock", Context.NONE);
    }
}
