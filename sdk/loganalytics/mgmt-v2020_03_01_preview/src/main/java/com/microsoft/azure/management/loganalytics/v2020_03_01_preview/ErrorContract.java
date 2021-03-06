/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details.
 * Contains details when the response code indicates an error.
 */
public class ErrorContract {
    /**
     * The details of the error.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the details of the error.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the details of the error.
     *
     * @param error the error value to set
     * @return the ErrorContract object itself.
     */
    public ErrorContract withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

}
