// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/**
 * Filters out tokens with same text as the previous token. This token filter
 * is implemented using Apache Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type")
@SerdeTypeName("#Microsoft.Azure.Search.UniqueTokenFilter")
@Fluent
public final class UniqueTokenFilter extends TokenFilter {
    /*
     * A value indicating whether to remove duplicates only at the same
     * position. Default is false.
     */
    @SerdeProperty(value = "onlyOnSamePosition")
    private Boolean onlyOnSamePosition;

    /**
     * Constructor of {@link UniqueTokenFilter}.
     *
     * @param name The name of the token filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    public UniqueTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the onlyOnSamePosition property: A value indicating whether to
     * remove duplicates only at the same position. Default is false.
     *
     * @return the onlyOnSamePosition value.
     */
    public Boolean isOnlyOnSamePosition() {
        return this.onlyOnSamePosition;
    }

    /**
     * Set the onlyOnSamePosition property: A value indicating whether to
     * remove duplicates only at the same position. Default is false.
     *
     * @param onlyOnSamePosition the onlyOnSamePosition value to set.
     * @return the UniqueTokenFilter object itself.
     */
    public UniqueTokenFilter setOnlyOnSamePosition(Boolean onlyOnSamePosition) {
        this.onlyOnSamePosition = onlyOnSamePosition;
        return this;
    }
}
