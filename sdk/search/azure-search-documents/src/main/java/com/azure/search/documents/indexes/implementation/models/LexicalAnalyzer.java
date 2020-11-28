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
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/** Base type for analyzers. */
@SerdeTypeInfo(
        use = SerdeTypeInfo.Id.NAME,
        include = SerdeTypeInfo.As.PROPERTY,
        property = "@odata\\.type",
        defaultImpl = LexicalAnalyzer.class)
@SerdeTypeName("LexicalAnalyzer")
@SerdeSubTypes({
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.CustomAnalyzer", value = CustomAnalyzer.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.PatternAnalyzer", value = PatternAnalyzer.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.StandardAnalyzer", value = LuceneStandardAnalyzer.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.StopAnalyzer", value = StopAnalyzer.class)
})
@JsonFlatten
@Fluent
public class LexicalAnalyzer {
    /*
     * The name of the analyzer. It must only contain letters, digits, spaces,
     * dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeProperty(value = "name")
    private String name;

    /**
     * Creates an instance of LexicalAnalyzer class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public LexicalAnalyzer(@SerdeProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the analyzer. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
