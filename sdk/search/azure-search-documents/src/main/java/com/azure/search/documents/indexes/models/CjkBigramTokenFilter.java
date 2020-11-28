// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSetter;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

import java.util.Arrays;
import java.util.List;

/**
 * Forms bigrams of CJK terms that are generated from the standard tokenizer.
 * This token filter is implemented using Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type")
@SerdeTypeName("#Microsoft.Azure.Search.CjkBigramTokenFilter")
@Fluent
public final class CjkBigramTokenFilter extends TokenFilter {
    /*
     * The scripts to ignore.
     */
    @SerdeProperty(value = "ignoreScripts")
    private List<CjkBigramTokenFilterScripts> ignoreScripts;

    /*
     * A value indicating whether to output both unigrams and bigrams (if
     * true), or just bigrams (if false). Default is false.
     */
    @SerdeProperty(value = "outputUnigrams")
    private Boolean outputUnigrams;

    /**
     * Constructor of {@link CjkBigramTokenFilter}.
     *
     * @param name The name of the token filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeToPojo
    public CjkBigramTokenFilter(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the ignoreScripts property: The scripts to ignore.
     *
     * @return the ignoreScripts value.
     */
    public List<CjkBigramTokenFilterScripts> getIgnoreScripts() {
        return this.ignoreScripts;
    }

    /**
     * Set the ignoreScripts property: The scripts to ignore.
     *
     * @param ignoreScripts the ignoreScripts value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setIgnoreScripts(CjkBigramTokenFilterScripts... ignoreScripts) {
        this.ignoreScripts = (ignoreScripts == null) ? null : Arrays.asList(ignoreScripts);
        return this;
    }

    /**
     * Set the ignoreScripts property: The scripts to ignore.
     *
     * @param ignoreScripts the ignoreScripts value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    @SerdeSetter
    public CjkBigramTokenFilter setIgnoreScripts(List<CjkBigramTokenFilterScripts> ignoreScripts) {
        this.ignoreScripts = ignoreScripts;
        return this;
    }

    /**
     * Get the outputUnigrams property: A value indicating whether to output
     * both unigrams and bigrams (if true), or just bigrams (if false). Default
     * is false.
     *
     * @return the outputUnigrams value.
     */
    public Boolean areOutputUnigrams() {
        return this.outputUnigrams;
    }

    /**
     * Set the outputUnigrams property: A value indicating whether to output
     * both unigrams and bigrams (if true), or just bigrams (if false). Default
     * is false.
     *
     * @param outputUnigrams the outputUnigrams value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setOutputUnigrams(Boolean outputUnigrams) {
        this.outputUnigrams = outputUnigrams;
        return this;
    }
}
