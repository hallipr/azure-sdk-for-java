// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service data flow (SDF) template. */
@Fluent
public final class ServiceDataFlowTemplate {
    /*
     * The name of the SDF template. This must be unique within the parent
     * PccRuleConfiguration. You must not use any of the following reserved
     * strings - `default`, `requested` or `service`.
     */
    @JsonProperty(value = "templateName", required = true)
    private String templateName;

    /*
     * The direction of this flow.
     */
    @JsonProperty(value = "direction", required = true)
    private SdfDirection direction;

    /*
     * A list of the allowed protocol(s) for this flow. If you want this flow
     * to be able to use any protocol within the internet protocol suite, use
     * the value `ip`. If you only want to allow a selection of protocols, you
     * must use the corresponding IANA Assigned Internet Protocol Number for
     * each protocol, as described in
     * https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml.
     * For example, for UDP, you must use 17. If you use the value `ip` then
     * you must leave the field `port` unspecified.
     */
    @JsonProperty(value = "protocol", required = true)
    private List<String> protocol;

    /*
     * The remote IP address(es) to which UEs will connect for this flow. If
     * you want to allow connections on any IP address, use the value `any`.
     * Otherwise, you must provide each of the remote IP addresses to which
     * Fusion Core will connect for this flow. You must provide each IP address
     * in CIDR notation, including the netmask (for example, 192.0.2.54/24).
     */
    @JsonProperty(value = "remoteIpList", required = true)
    private List<String> remoteIpList;

    /*
     * The port(s) to which UEs will connect for this flow. You can specify
     * zero or more ports or port ranges. If you specify one or more ports or
     * port ranges then you must specify a value other than `ip` in the
     * `protocol` field. This is an optional setting. If you do not specify it
     * then connections will be allowed on all ports. Port ranges must be
     * specified as <FirstPort>-<LastPort>. For example: [`8080`, `8082-8085`].
     */
    @JsonProperty(value = "ports")
    private List<String> ports;

    /**
     * Get the templateName property: The name of the SDF template. This must be unique within the parent
     * PccRuleConfiguration. You must not use any of the following reserved strings - `default`, `requested` or
     * `service`.
     *
     * @return the templateName value.
     */
    public String templateName() {
        return this.templateName;
    }

    /**
     * Set the templateName property: The name of the SDF template. This must be unique within the parent
     * PccRuleConfiguration. You must not use any of the following reserved strings - `default`, `requested` or
     * `service`.
     *
     * @param templateName the templateName value to set.
     * @return the ServiceDataFlowTemplate object itself.
     */
    public ServiceDataFlowTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Get the direction property: The direction of this flow.
     *
     * @return the direction value.
     */
    public SdfDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: The direction of this flow.
     *
     * @param direction the direction value to set.
     * @return the ServiceDataFlowTemplate object itself.
     */
    public ServiceDataFlowTemplate withDirection(SdfDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the protocol property: A list of the allowed protocol(s) for this flow. If you want this flow to be able to
     * use any protocol within the internet protocol suite, use the value `ip`. If you only want to allow a selection of
     * protocols, you must use the corresponding IANA Assigned Internet Protocol Number for each protocol, as described
     * in https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml. For example, for UDP, you must use
     * 17. If you use the value `ip` then you must leave the field `port` unspecified.
     *
     * @return the protocol value.
     */
    public List<String> protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: A list of the allowed protocol(s) for this flow. If you want this flow to be able to
     * use any protocol within the internet protocol suite, use the value `ip`. If you only want to allow a selection of
     * protocols, you must use the corresponding IANA Assigned Internet Protocol Number for each protocol, as described
     * in https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml. For example, for UDP, you must use
     * 17. If you use the value `ip` then you must leave the field `port` unspecified.
     *
     * @param protocol the protocol value to set.
     * @return the ServiceDataFlowTemplate object itself.
     */
    public ServiceDataFlowTemplate withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the remoteIpList property: The remote IP address(es) to which UEs will connect for this flow. If you want to
     * allow connections on any IP address, use the value `any`. Otherwise, you must provide each of the remote IP
     * addresses to which Fusion Core will connect for this flow. You must provide each IP address in CIDR notation,
     * including the netmask (for example, 192.0.2.54/24).
     *
     * @return the remoteIpList value.
     */
    public List<String> remoteIpList() {
        return this.remoteIpList;
    }

    /**
     * Set the remoteIpList property: The remote IP address(es) to which UEs will connect for this flow. If you want to
     * allow connections on any IP address, use the value `any`. Otherwise, you must provide each of the remote IP
     * addresses to which Fusion Core will connect for this flow. You must provide each IP address in CIDR notation,
     * including the netmask (for example, 192.0.2.54/24).
     *
     * @param remoteIpList the remoteIpList value to set.
     * @return the ServiceDataFlowTemplate object itself.
     */
    public ServiceDataFlowTemplate withRemoteIpList(List<String> remoteIpList) {
        this.remoteIpList = remoteIpList;
        return this;
    }

    /**
     * Get the ports property: The port(s) to which UEs will connect for this flow. You can specify zero or more ports
     * or port ranges. If you specify one or more ports or port ranges then you must specify a value other than `ip` in
     * the `protocol` field. This is an optional setting. If you do not specify it then connections will be allowed on
     * all ports. Port ranges must be specified as &lt;FirstPort&gt;-&lt;LastPort&gt;. For example: [`8080`,
     * `8082-8085`].
     *
     * @return the ports value.
     */
    public List<String> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: The port(s) to which UEs will connect for this flow. You can specify zero or more ports
     * or port ranges. If you specify one or more ports or port ranges then you must specify a value other than `ip` in
     * the `protocol` field. This is an optional setting. If you do not specify it then connections will be allowed on
     * all ports. Port ranges must be specified as &lt;FirstPort&gt;-&lt;LastPort&gt;. For example: [`8080`,
     * `8082-8085`].
     *
     * @param ports the ports value to set.
     * @return the ServiceDataFlowTemplate object itself.
     */
    public ServiceDataFlowTemplate withPorts(List<String> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property templateName in model ServiceDataFlowTemplate"));
        }
        if (direction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property direction in model ServiceDataFlowTemplate"));
        }
        if (protocol() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model ServiceDataFlowTemplate"));
        }
        if (remoteIpList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property remoteIpList in model ServiceDataFlowTemplate"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceDataFlowTemplate.class);
}
