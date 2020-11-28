// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/**
 * Base type for character filters.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type",
    defaultImpl = CharFilter.class)
@SerdeTypeName("CharFilter")
@SerdeSubTypes({
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.MappingCharFilter", value = MappingCharFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.PatternReplaceCharFilter",
        value = PatternReplaceCharFilter.class)
})
@Fluent
public abstract class CharFilter {
    /*
     * The name of the char filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeProperty(value = "name")
    private String name;

    /**
     * Constructor of {@link CharFilter}.
     *
     * @param name The name of the char filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeToPojo
    public CharFilter(@SerdeProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the char filter. It must only contain
     * letters, digits, spaces, dashes or underscores, can only start and end
     * with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
