// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Common Data Service for Apps entity dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForAppsEntity")
@JsonFlatten
@Fluent
public class CommonDataServiceForAppsEntityDataset extends Dataset {
    /*
     * The logical name of the entity. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.entityName")
    private Object entityName;

    /**
     * Get the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @return the entityName value.
     */
    public Object getEntityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @param entityName the entityName value to set.
     * @return the CommonDataServiceForAppsEntityDataset object itself.
     */
    public CommonDataServiceForAppsEntityDataset setEntityName(Object entityName) {
        this.entityName = entityName;
        return this;
    }
}
