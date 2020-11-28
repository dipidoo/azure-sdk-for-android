// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeToPojo;

/** The result of Autocomplete requests. */
@Immutable
public final class AutocompleteItem {
    /*
     * The completed term.
     */
    @SerdeProperty(value = "text")
    private String text;

    /*
     * The query along with the completed term.
     */
    @SerdeProperty(value = "queryPlusText")
    private String queryPlusText;

    /**
     * Creates an instance of AutocompleteItem class.
     *
     * @param text the text value to set.
     * @param queryPlusText the queryPlusText value to set.
     */
    @SerdeToPojo
    public AutocompleteItem(
            @SerdeProperty(value = "text") String text,
            @SerdeProperty(value = "queryPlusText")
                    String queryPlusText) {
        this.text = text;
        this.queryPlusText = queryPlusText;
    }

    /**
     * Get the text property: The completed term.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the queryPlusText property: The query along with the completed term.
     *
     * @return the queryPlusText value.
     */
    public String getQueryPlusText() {
        return this.queryPlusText;
    }
}
