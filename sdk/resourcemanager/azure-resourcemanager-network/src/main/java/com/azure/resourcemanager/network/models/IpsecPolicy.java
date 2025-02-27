// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An IPSec Policy configuration for a virtual network gateway connection. */
@Fluent
public final class IpsecPolicy {
    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     */
    @JsonProperty(value = "saLifeTimeSeconds", required = true)
    private int saLifeTimeSeconds;

    /*
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     */
    @JsonProperty(value = "saDataSizeKilobytes", required = true)
    private int saDataSizeKilobytes;

    /*
     * The IPSec encryption algorithm (IKE phase 1).
     */
    @JsonProperty(value = "ipsecEncryption", required = true)
    private IpsecEncryption ipsecEncryption;

    /*
     * The IPSec integrity algorithm (IKE phase 1).
     */
    @JsonProperty(value = "ipsecIntegrity", required = true)
    private IpsecIntegrity ipsecIntegrity;

    /*
     * The IKE encryption algorithm (IKE phase 2).
     */
    @JsonProperty(value = "ikeEncryption", required = true)
    private IkeEncryption ikeEncryption;

    /*
     * The IKE integrity algorithm (IKE phase 2).
     */
    @JsonProperty(value = "ikeIntegrity", required = true)
    private IkeIntegrity ikeIntegrity;

    /*
     * The DH Group used in IKE Phase 1 for initial SA.
     */
    @JsonProperty(value = "dhGroup", required = true)
    private DhGroup dhGroup;

    /*
     * The Pfs Group used in IKE Phase 2 for new child SA.
     */
    @JsonProperty(value = "pfsGroup", required = true)
    private PfsGroup pfsGroup;

    /**
     * Get the saLifeTimeSeconds property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     *
     * @return the saLifeTimeSeconds value.
     */
    public int saLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    /**
     * Set the saLifeTimeSeconds property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     *
     * @param saLifeTimeSeconds the saLifeTimeSeconds value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaLifeTimeSeconds(int saLifeTimeSeconds) {
        this.saLifeTimeSeconds = saLifeTimeSeconds;
        return this;
    }

    /**
     * Get the saDataSizeKilobytes property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     *
     * @return the saDataSizeKilobytes value.
     */
    public int saDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * Set the saDataSizeKilobytes property: The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     *
     * @param saDataSizeKilobytes the saDataSizeKilobytes value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaDataSizeKilobytes(int saDataSizeKilobytes) {
        this.saDataSizeKilobytes = saDataSizeKilobytes;
        return this;
    }

    /**
     * Get the ipsecEncryption property: The IPSec encryption algorithm (IKE phase 1).
     *
     * @return the ipsecEncryption value.
     */
    public IpsecEncryption ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * Set the ipsecEncryption property: The IPSec encryption algorithm (IKE phase 1).
     *
     * @param ipsecEncryption the ipsecEncryption value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecEncryption(IpsecEncryption ipsecEncryption) {
        this.ipsecEncryption = ipsecEncryption;
        return this;
    }

    /**
     * Get the ipsecIntegrity property: The IPSec integrity algorithm (IKE phase 1).
     *
     * @return the ipsecIntegrity value.
     */
    public IpsecIntegrity ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * Set the ipsecIntegrity property: The IPSec integrity algorithm (IKE phase 1).
     *
     * @param ipsecIntegrity the ipsecIntegrity value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecIntegrity(IpsecIntegrity ipsecIntegrity) {
        this.ipsecIntegrity = ipsecIntegrity;
        return this;
    }

    /**
     * Get the ikeEncryption property: The IKE encryption algorithm (IKE phase 2).
     *
     * @return the ikeEncryption value.
     */
    public IkeEncryption ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * Set the ikeEncryption property: The IKE encryption algorithm (IKE phase 2).
     *
     * @param ikeEncryption the ikeEncryption value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeEncryption(IkeEncryption ikeEncryption) {
        this.ikeEncryption = ikeEncryption;
        return this;
    }

    /**
     * Get the ikeIntegrity property: The IKE integrity algorithm (IKE phase 2).
     *
     * @return the ikeIntegrity value.
     */
    public IkeIntegrity ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * Set the ikeIntegrity property: The IKE integrity algorithm (IKE phase 2).
     *
     * @param ikeIntegrity the ikeIntegrity value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeIntegrity(IkeIntegrity ikeIntegrity) {
        this.ikeIntegrity = ikeIntegrity;
        return this;
    }

    /**
     * Get the dhGroup property: The DH Group used in IKE Phase 1 for initial SA.
     *
     * @return the dhGroup value.
     */
    public DhGroup dhGroup() {
        return this.dhGroup;
    }

    /**
     * Set the dhGroup property: The DH Group used in IKE Phase 1 for initial SA.
     *
     * @param dhGroup the dhGroup value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withDhGroup(DhGroup dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * Get the pfsGroup property: The Pfs Group used in IKE Phase 2 for new child SA.
     *
     * @return the pfsGroup value.
     */
    public PfsGroup pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * Set the pfsGroup property: The Pfs Group used in IKE Phase 2 for new child SA.
     *
     * @param pfsGroup the pfsGroup value to set.
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withPfsGroup(PfsGroup pfsGroup) {
        this.pfsGroup = pfsGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipsecEncryption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ipsecEncryption in model IpsecPolicy"));
        }
        if (ipsecIntegrity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ipsecIntegrity in model IpsecPolicy"));
        }
        if (ikeEncryption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ikeEncryption in model IpsecPolicy"));
        }
        if (ikeIntegrity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ikeIntegrity in model IpsecPolicy"));
        }
        if (dhGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dhGroup in model IpsecPolicy"));
        }
        if (pfsGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property pfsGroup in model IpsecPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpsecPolicy.class);
}
