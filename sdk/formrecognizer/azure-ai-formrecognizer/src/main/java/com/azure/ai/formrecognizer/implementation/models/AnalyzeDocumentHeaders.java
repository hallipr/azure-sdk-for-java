// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnalyzeDocumentHeaders model. */
@Fluent
public final class AnalyzeDocumentHeaders {
    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of AnalyzeDocumentHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public AnalyzeDocumentHeaders(HttpHeaders rawHeaders) {
        this.operationLocation = rawHeaders.getValue("Operation-Location");
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the AnalyzeDocumentHeaders object itself.
     */
    public AnalyzeDocumentHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}
