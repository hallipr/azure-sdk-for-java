// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ServiceInner;
import com.azure.resourcemanager.mobilenetwork.models.PccRuleConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.QosPolicy;
import com.azure.resourcemanager.mobilenetwork.models.Service;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ServiceImpl implements Service, Service.Definition, Service.Update {
    private ServiceInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public int servicePrecedence() {
        return this.innerModel().servicePrecedence();
    }

    public QosPolicy serviceQosPolicy() {
        return this.innerModel().serviceQosPolicy();
    }

    public List<PccRuleConfiguration> pccRules() {
        List<PccRuleConfiguration> inner = this.innerModel().pccRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String mobileNetworkName;

    private String serviceName;

    private TagsObject updateParameters;

    public ServiceImpl withExistingMobileNetwork(String resourceGroupName, String mobileNetworkName) {
        this.resourceGroupName = resourceGroupName;
        this.mobileNetworkName = mobileNetworkName;
        return this;
    }

    public Service create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdate(resourceGroupName, mobileNetworkName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Service create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdate(resourceGroupName, mobileNetworkName, serviceName, this.innerModel(), context);
        return this;
    }

    ServiceImpl(String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new ServiceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public ServiceImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public Service apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .updateTagsWithResponse(
                    resourceGroupName, mobileNetworkName, serviceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Service apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .updateTagsWithResponse(resourceGroupName, mobileNetworkName, serviceName, updateParameters, context)
                .getValue();
        return this;
    }

    ServiceImpl(ServiceInner innerObject, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.mobileNetworkName = Utils.getValueFromIdByName(innerObject.id(), "mobileNetworks");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
    }

    public Service refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getWithResponse(resourceGroupName, mobileNetworkName, serviceName, Context.NONE)
                .getValue();
        return this;
    }

    public Service refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getWithResponse(resourceGroupName, mobileNetworkName, serviceName, context)
                .getValue();
        return this;
    }

    public ServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceImpl withServicePrecedence(int servicePrecedence) {
        this.innerModel().withServicePrecedence(servicePrecedence);
        return this;
    }

    public ServiceImpl withPccRules(List<PccRuleConfiguration> pccRules) {
        this.innerModel().withPccRules(pccRules);
        return this;
    }

    public ServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ServiceImpl withServiceQosPolicy(QosPolicy serviceQosPolicy) {
        this.innerModel().withServiceQosPolicy(serviceQosPolicy);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
