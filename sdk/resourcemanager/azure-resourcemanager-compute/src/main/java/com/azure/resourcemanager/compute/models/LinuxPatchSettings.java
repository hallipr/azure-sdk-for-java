// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies settings related to VM Guest Patching on Linux. */
@Fluent
public final class LinuxPatchSettings {
    /*
     * Specifies the mode of VM Guest Patching to IaaS virtual machine or
     * virtual machines associated to virtual machine scale set with
     * OrchestrationMode as Flexible.<br /><br /> Possible values are:<br /><br
     * /> **ImageDefault** - The virtual machine's default patching
     * configuration is used. <br /><br /> **AutomaticByPlatform** - The
     * virtual machine will be automatically updated by the platform. The
     * property provisionVMAgent must be true
     */
    @JsonProperty(value = "patchMode")
    private LinuxVMGuestPatchMode patchMode;

    /*
     * Specifies the mode of VM Guest Patch Assessment for the IaaS virtual
     * machine.<br /><br /> Possible values are:<br /><br /> **ImageDefault** -
     * You control the timing of patch assessments on a virtual machine. <br
     * /><br /> **AutomaticByPlatform** - The platform will trigger periodic
     * patch assessments. The property provisionVMAgent must be true.
     */
    @JsonProperty(value = "assessmentMode")
    private LinuxPatchAssessmentMode assessmentMode;

    /**
     * Get the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - The virtual machine's default patching configuration is
     * used. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The virtual machine will be automatically updated by the
     * platform. The property provisionVMAgent must be true.
     *
     * @return the patchMode value.
     */
    public LinuxVMGuestPatchMode patchMode() {
        return this.patchMode;
    }

    /**
     * Set the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - The virtual machine's default patching configuration is
     * used. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The virtual machine will be automatically updated by the
     * platform. The property provisionVMAgent must be true.
     *
     * @param patchMode the patchMode value to set.
     * @return the LinuxPatchSettings object itself.
     */
    public LinuxPatchSettings withPatchMode(LinuxVMGuestPatchMode patchMode) {
        this.patchMode = patchMode;
        return this;
    }

    /**
     * Get the assessmentMode property: Specifies the mode of VM Guest Patch Assessment for the IaaS virtual
     * machine.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - You control the
     * timing of patch assessments on a virtual machine. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The platform
     * will trigger periodic patch assessments. The property provisionVMAgent must be true.
     *
     * @return the assessmentMode value.
     */
    public LinuxPatchAssessmentMode assessmentMode() {
        return this.assessmentMode;
    }

    /**
     * Set the assessmentMode property: Specifies the mode of VM Guest Patch Assessment for the IaaS virtual
     * machine.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - You control the
     * timing of patch assessments on a virtual machine. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The platform
     * will trigger periodic patch assessments. The property provisionVMAgent must be true.
     *
     * @param assessmentMode the assessmentMode value to set.
     * @return the LinuxPatchSettings object itself.
     */
    public LinuxPatchSettings withAssessmentMode(LinuxPatchAssessmentMode assessmentMode) {
        this.assessmentMode = assessmentMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
