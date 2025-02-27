// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PCC rule QoS policy. */
@Fluent
public final class PccRuleQosPolicy extends QosPolicy {
    /*
     * The Guaranteed Bit Rate (GBR) for all service data flows that use this
     * PCC Rule. This is an optional setting. If you do not provide a value,
     * there will be no GBR set for the PCC Rule that uses this QoS definition.
     */
    @JsonProperty(value = "guaranteedBitRate")
    private Ambr guaranteedBitRate;

    /**
     * Get the guaranteedBitRate property: The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC
     * Rule. This is an optional setting. If you do not provide a value, there will be no GBR set for the PCC Rule that
     * uses this QoS definition.
     *
     * @return the guaranteedBitRate value.
     */
    public Ambr guaranteedBitRate() {
        return this.guaranteedBitRate;
    }

    /**
     * Set the guaranteedBitRate property: The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC
     * Rule. This is an optional setting. If you do not provide a value, there will be no GBR set for the PCC Rule that
     * uses this QoS definition.
     *
     * @param guaranteedBitRate the guaranteedBitRate value to set.
     * @return the PccRuleQosPolicy object itself.
     */
    public PccRuleQosPolicy withGuaranteedBitRate(Ambr guaranteedBitRate) {
        this.guaranteedBitRate = guaranteedBitRate;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PccRuleQosPolicy withFiveQi(Integer fiveQi) {
        super.withFiveQi(fiveQi);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PccRuleQosPolicy withAllocationAndRetentionPriorityLevel(Integer allocationAndRetentionPriorityLevel) {
        super.withAllocationAndRetentionPriorityLevel(allocationAndRetentionPriorityLevel);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PccRuleQosPolicy withPreemptionCapability(PreemptionCapability preemptionCapability) {
        super.withPreemptionCapability(preemptionCapability);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PccRuleQosPolicy withPreemptionVulnerability(PreemptionVulnerability preemptionVulnerability) {
        super.withPreemptionVulnerability(preemptionVulnerability);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PccRuleQosPolicy withMaximumBitRate(Ambr maximumBitRate) {
        super.withMaximumBitRate(maximumBitRate);
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
        if (guaranteedBitRate() != null) {
            guaranteedBitRate().validate();
        }
    }
}
