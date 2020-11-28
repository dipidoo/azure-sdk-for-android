// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;

/**
 * Statistics for a given index. Statistics are collected periodically and are not guaranteed to always be up-to-date.
 */
@Immutable
public final class GetIndexStatisticsResult {
    /*
     * The number of documents in the index.
     */
    @SerdeProperty(value = "documentCount")
    private long documentCount;

    /*
     * The amount of storage in bytes consumed by the index.
     */
    @SerdeProperty(value = "storageSize")
    private long storageSize;

    /**
     * Creates an instance of GetIndexStatisticsResult class.
     *
     * @param documentCount the documentCount value to set.
     * @param storageSize the storageSize value to set.
     */
    @SerdeToPojo
    public GetIndexStatisticsResult(
            @SerdeProperty(value = "documentCount")
                    long documentCount,
            @SerdeProperty(value = "storageSize")
                    long storageSize) {
        this.documentCount = documentCount;
        this.storageSize = storageSize;
    }

    /**
     * Get the documentCount property: The number of documents in the index.
     *
     * @return the documentCount value.
     */
    public long getDocumentCount() {
        return this.documentCount;
    }

    /**
     * Get the storageSize property: The amount of storage in bytes consumed by the index.
     *
     * @return the storageSize value.
     */
    public long getStorageSize() {
        return this.storageSize;
    }
}
