// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.Context;

/** Samples for IotHubResource GetEndpointHealth. */
public final class IotHubResourceGetEndpointHealthSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/stable/2021-07-02/examples/iothub_routingendpointhealth.json
     */
    /**
     * Sample code: IotHubResource_GetEndpointHealth.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceGetEndpointHealth(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager.iotHubResources().getEndpointHealth("myResourceGroup", "testHub", Context.NONE);
    }
}
