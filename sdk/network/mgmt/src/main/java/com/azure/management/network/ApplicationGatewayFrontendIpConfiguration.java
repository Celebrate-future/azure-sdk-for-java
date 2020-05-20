// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayFrontendIpConfiguration model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayFrontendIpConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayFrontendIpConfiguration.class);

    /*
     * Name of the frontend IP configuration that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * PrivateIPAddress of the network interface IP Configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIpAddress;

    /*
     * The private IP address allocation method.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * Reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /*
     * Reference of the PublicIP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the frontend IP configuration that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the frontend IP configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Reference of the subnet resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference of the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference of the PublicIP resource.
     *
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Reference of the PublicIP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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