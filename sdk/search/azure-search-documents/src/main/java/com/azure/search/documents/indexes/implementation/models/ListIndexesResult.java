// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import java.util.List;

/** Response from a List Indexes request. If successful, it includes the full definitions of all indexes. */
@Immutable
public final class ListIndexesResult {
    /*
     * The indexes in the Search service.
     */
    @SerdeProperty(value = "value")
    private List<SearchIndex> indexes;

    /**
     * Creates an instance of ListIndexesResult class.
     *
     * @param indexes the indexes value to set.
     */
    @SerdeToPojo
    public ListIndexesResult(
            @SerdeProperty(value = "value")
                    List<SearchIndex> indexes) {
        this.indexes = indexes;
    }

    /**
     * Get the indexes property: The indexes in the Search service.
     *
     * @return the indexes value.
     */
    public List<SearchIndex> getIndexes() {
        return this.indexes;
    }
}
