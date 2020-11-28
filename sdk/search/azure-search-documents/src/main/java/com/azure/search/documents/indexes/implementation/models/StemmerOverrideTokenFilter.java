// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/**
 * Provides the ability to override other stemming filters with custom dictionary-based stemming. Any dictionary-stemmed
 * terms will be marked as keywords so that they will not be stemmed with stemmers down the chain. Must be placed before
 * any stemming filters. This token filter is implemented using Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.StemmerOverrideTokenFilter")
@JsonFlatten
@Fluent
public class StemmerOverrideTokenFilter extends TokenFilter {
    /*
     * A list of stemming rules in the following format: "word => stem", for
     * example: "ran => run".
     */
    @SerdeProperty(value = "rules")
    private List<String> rules;

    /**
     * Creates an instance of StemmerOverrideTokenFilter class.
     *
     * @param name the name value to set.
     * @param rules the rules value to set.
     */
    @SerdeToPojo
    public StemmerOverrideTokenFilter(
            @SerdeProperty(value = "name") String name,
            @SerdeProperty(value = "rules") List<String> rules) {
        super(name);
        this.rules = rules;
    }

    /**
     * Get the rules property: A list of stemming rules in the following format: "word =&gt; stem", for example: "ran
     * =&gt; run".
     *
     * @return the rules value.
     */
    public List<String> getRules() {
        return this.rules;
    }
}
