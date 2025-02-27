// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class for envelope encryption scheme. */
@Fluent
public final class CommonEncryptionCenc {
    /*
     * Representing supported protocols
     */
    @JsonProperty(value = "enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /*
     * Representing which tracks should not be encrypted
     */
    @JsonProperty(value = "clearTracks")
    private List<TrackSelection> clearTracks;

    /*
     * Representing default content key for each encryption scheme and separate
     * content keys for specific tracks
     */
    @JsonProperty(value = "contentKeys")
    private StreamingPolicyContentKeys contentKeys;

    /*
     * Configuration of DRMs for CommonEncryptionCenc encryption scheme
     */
    @JsonProperty(value = "drm")
    private CencDrmConfiguration drm;

    /**
     * Get the enabledProtocols property: Representing supported protocols.
     *
     * @return the enabledProtocols value.
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set the enabledProtocols property: Representing supported protocols.
     *
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the CommonEncryptionCenc object itself.
     */
    public CommonEncryptionCenc withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get the clearTracks property: Representing which tracks should not be encrypted.
     *
     * @return the clearTracks value.
     */
    public List<TrackSelection> clearTracks() {
        return this.clearTracks;
    }

    /**
     * Set the clearTracks property: Representing which tracks should not be encrypted.
     *
     * @param clearTracks the clearTracks value to set.
     * @return the CommonEncryptionCenc object itself.
     */
    public CommonEncryptionCenc withClearTracks(List<TrackSelection> clearTracks) {
        this.clearTracks = clearTracks;
        return this;
    }

    /**
     * Get the contentKeys property: Representing default content key for each encryption scheme and separate content
     * keys for specific tracks.
     *
     * @return the contentKeys value.
     */
    public StreamingPolicyContentKeys contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set the contentKeys property: Representing default content key for each encryption scheme and separate content
     * keys for specific tracks.
     *
     * @param contentKeys the contentKeys value to set.
     * @return the CommonEncryptionCenc object itself.
     */
    public CommonEncryptionCenc withContentKeys(StreamingPolicyContentKeys contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

    /**
     * Get the drm property: Configuration of DRMs for CommonEncryptionCenc encryption scheme.
     *
     * @return the drm value.
     */
    public CencDrmConfiguration drm() {
        return this.drm;
    }

    /**
     * Set the drm property: Configuration of DRMs for CommonEncryptionCenc encryption scheme.
     *
     * @param drm the drm value to set.
     * @return the CommonEncryptionCenc object itself.
     */
    public CommonEncryptionCenc withDrm(CencDrmConfiguration drm) {
        this.drm = drm;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (enabledProtocols() != null) {
            enabledProtocols().validate();
        }
        if (clearTracks() != null) {
            clearTracks().forEach(e -> e.validate());
        }
        if (contentKeys() != null) {
            contentKeys().validate();
        }
        if (drm() != null) {
            drm().validate();
        }
    }
}
