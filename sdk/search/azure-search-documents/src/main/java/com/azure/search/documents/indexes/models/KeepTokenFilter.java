// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/**
 * A token filter that only keeps tokens with text contained in a specified
 * list of words. This token filter is implemented using Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type")
@SerdeTypeName("#Microsoft.Azure.Search.KeepTokenFilter")
@Fluent
public final class KeepTokenFilter extends TokenFilter {
    /*
     * The list of words to keep.
     */
    @SerdeProperty(value = "keepWords")
    private List<String> keepWords;

    /*
     * A value indicating whether to lower case all words first. Default is
     * false.
     */
    @SerdeProperty(value = "keepWordsCase")
    private Boolean lowerCaseKeepWords;

    /**
     * Constructor of {@link TokenFilter}.
     *
     * @param name The name of the token filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     * @param keepWords The list of words to keep.
     */
    public KeepTokenFilter(String name, List<String> keepWords) {
        super(name);
        this.keepWords = keepWords;
    }

    /**
     * Get the keepWords property: The list of words to keep.
     *
     * @return the keepWords value.
     */
    public List<String> getKeepWords() {
        return this.keepWords;
    }

    /**
     * Get the lowerCaseKeepWords property: A value indicating whether to lower
     * case all words first. Default is false.
     *
     * @return the lowerCaseKeepWords value.
     */
    public Boolean areLowerCaseKeepWords() {
        return this.lowerCaseKeepWords;
    }

    /**
     * Set the lowerCaseKeepWords property: A value indicating whether to lower
     * case all words first. Default is false.
     *
     * @param lowerCaseKeepWords the lowerCaseKeepWords value to set.
     * @return the KeepTokenFilter object itself.
     */
    public KeepTokenFilter setLowerCaseKeepWords(Boolean lowerCaseKeepWords) {
        this.lowerCaseKeepWords = lowerCaseKeepWords;
        return this;
    }
}
