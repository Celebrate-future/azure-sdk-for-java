/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_04_01.MongoDBDatabaseGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.MongoDBDatabaseGetPropertiesOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB MongoDB database.
 */
@JsonFlatten
public class MongoDBDatabaseGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private MongoDBDatabaseGetPropertiesResource resource;

    /**
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private MongoDBDatabaseGetPropertiesOptions options;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public MongoDBDatabaseGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the MongoDBDatabaseGetResultsInner object itself.
     */
    public MongoDBDatabaseGetResultsInner withResource(MongoDBDatabaseGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public MongoDBDatabaseGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the MongoDBDatabaseGetResultsInner object itself.
     */
    public MongoDBDatabaseGetResultsInner withOptions(MongoDBDatabaseGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

}