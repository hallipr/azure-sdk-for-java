// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.fluent.models.RedisCreateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Parameters supplied to the Create Redis operation. */
@Fluent
public final class RedisCreateParameters {
    /*
     * Redis cache properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RedisCreateProperties innerProperties = new RedisCreateProperties();

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the innerProperties property: Redis cache properties.
     *
     * @return the innerProperties value.
     */
    private RedisCreateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @param subnetId the subnetId value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.innerProperties() == null ? null : this.innerProperties().staticIp();
    }

    /**
     * Set the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     *
     * @param staticIp the staticIp value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withStaticIp(String staticIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withStaticIp(staticIp);
        return this;
    }

    /**
     * Get the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @return the redisConfiguration value.
     */
    public RedisConfiguration redisConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().redisConfiguration();
    }

    /**
     * Set the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @param redisConfiguration the redisConfiguration value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withRedisConfiguration(RedisConfiguration redisConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withRedisConfiguration(redisConfiguration);
        return this;
    }

    /**
     * Get the redisVersion property: Redis version. Only major version will be used in PUT/PATCH request with current
     * valid values: (4, 6).
     *
     * @return the redisVersion value.
     */
    public String redisVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().redisVersion();
    }

    /**
     * Set the redisVersion property: Redis version. Only major version will be used in PUT/PATCH request with current
     * valid values: (4, 6).
     *
     * @param redisVersion the redisVersion value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withRedisVersion(String redisVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withRedisVersion(redisVersion);
        return this;
    }

    /**
     * Get the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value.
     */
    public Boolean enableNonSslPort() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNonSslPort();
    }

    /**
     * Set the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withEnableNonSslPort(Boolean enableNonSslPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /**
     * Get the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @return the replicasPerMaster value.
     */
    public Integer replicasPerMaster() {
        return this.innerProperties() == null ? null : this.innerProperties().replicasPerMaster();
    }

    /**
     * Set the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @param replicasPerMaster the replicasPerMaster value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withReplicasPerMaster(Integer replicasPerMaster) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /**
     * Get the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @return the replicasPerPrimary value.
     */
    public Integer replicasPerPrimary() {
        return this.innerProperties() == null ? null : this.innerProperties().replicasPerPrimary();
    }

    /**
     * Set the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @param replicasPerPrimary the replicasPerPrimary value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withReplicasPerPrimary(Integer replicasPerPrimary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withReplicasPerPrimary(replicasPerPrimary);
        return this;
    }

    /**
     * Get the tenantSettings property: A dictionary of tenant settings.
     *
     * @return the tenantSettings value.
     */
    public Map<String, String> tenantSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantSettings();
    }

    /**
     * Set the tenantSettings property: A dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTenantSettings(Map<String, String> tenantSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withTenantSettings(tenantSettings);
        return this;
    }

    /**
     * Get the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value.
     */
    public Integer shardCount() {
        return this.innerProperties() == null ? null : this.innerProperties().shardCount();
    }

    /**
     * Set the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withShardCount(Integer shardCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withShardCount(shardCount);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RedisCreateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model RedisCreateParameters"));
        } else {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model RedisCreateParameters"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisCreateParameters.class);
}
