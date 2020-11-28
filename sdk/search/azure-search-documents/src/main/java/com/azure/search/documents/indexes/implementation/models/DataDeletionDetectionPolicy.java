// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.JsonFlatten;
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/** Base type for data deletion detection policies. */
@SerdeTypeInfo(
        use = SerdeTypeInfo.Id.NAME,
        include = SerdeTypeInfo.As.PROPERTY,
        property = "@odata\\.type",
        defaultImpl = DataDeletionDetectionPolicy.class)
@SerdeTypeName("DataDeletionDetectionPolicy")
@SerdeSubTypes({
    @SerdeSubTypes.Type(
            name = "#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy",
            value = SoftDeleteColumnDeletionDetectionPolicy.class)
})
@JsonFlatten
@Immutable
public class DataDeletionDetectionPolicy {}
