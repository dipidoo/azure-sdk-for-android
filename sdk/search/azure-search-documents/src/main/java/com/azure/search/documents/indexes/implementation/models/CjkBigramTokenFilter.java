// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.CjkBigramTokenFilterScripts;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/**
 * Forms bigrams of CJK terms that are generated from the standard tokenizer. This token filter is implemented using
 * Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.CjkBigramTokenFilter")
@JsonFlatten
@Fluent
public class CjkBigramTokenFilter extends TokenFilter {
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
     * Creates an instance of CjkBigramTokenFilter class.
     *
     * @param name the name value to set.
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
    public CjkBigramTokenFilter setIgnoreScripts(List<CjkBigramTokenFilterScripts> ignoreScripts) {
        this.ignoreScripts = ignoreScripts;
        return this;
    }

    /**
     * Get the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @return the outputUnigrams value.
     */
    public Boolean isOutputUnigrams() {
        return this.outputUnigrams;
    }

    /**
     * Set the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @param outputUnigrams the outputUnigrams value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setOutputUnigrams(Boolean outputUnigrams) {
        this.outputUnigrams = outputUnigrams;
        return this;
    }
}
