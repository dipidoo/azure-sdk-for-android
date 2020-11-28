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

/** Limits the number of tokens while indexing. This token filter is implemented using Apache Lucene. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.LimitTokenFilter")
@JsonFlatten
@Fluent
public class LimitTokenFilter extends TokenFilter {
    /*
     * The maximum number of tokens to produce. Default is 1.
     */
    @SerdeProperty(value = "maxTokenCount")
    private Integer maxTokenCount;

    /*
     * A value indicating whether all tokens from the input must be consumed
     * even if maxTokenCount is reached. Default is false.
     */
    @SerdeProperty(value = "consumeAllTokens")
    private Boolean consumeAllTokens;

    /**
     * Creates an instance of LimitTokenFilter class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public LimitTokenFilter(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the maxTokenCount property: The maximum number of tokens to produce. Default is 1.
     *
     * @return the maxTokenCount value.
     */
    public Integer getMaxTokenCount() {
        return this.maxTokenCount;
    }

    /**
     * Set the maxTokenCount property: The maximum number of tokens to produce. Default is 1.
     *
     * @param maxTokenCount the maxTokenCount value to set.
     * @return the LimitTokenFilter object itself.
     */
    public LimitTokenFilter setMaxTokenCount(Integer maxTokenCount) {
        this.maxTokenCount = maxTokenCount;
        return this;
    }

    /**
     * Get the consumeAllTokens property: A value indicating whether all tokens from the input must be consumed even if
     * maxTokenCount is reached. Default is false.
     *
     * @return the consumeAllTokens value.
     */
    public Boolean isConsumeAllTokens() {
        return this.consumeAllTokens;
    }

    /**
     * Set the consumeAllTokens property: A value indicating whether all tokens from the input must be consumed even if
     * maxTokenCount is reached. Default is false.
     *
     * @param consumeAllTokens the consumeAllTokens value to set.
     * @return the LimitTokenFilter object itself.
     */
    public LimitTokenFilter setConsumeAllTokens(Boolean consumeAllTokens) {
        this.consumeAllTokens = consumeAllTokens;
        return this;
    }
}
