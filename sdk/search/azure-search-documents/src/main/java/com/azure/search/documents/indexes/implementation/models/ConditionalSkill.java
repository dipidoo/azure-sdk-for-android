// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/** A skill that enables scenarios that require a Boolean operation to determine the data to assign to an output. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Skills.Util.ConditionalSkill")
@JsonFlatten
@Immutable
public class ConditionalSkill extends SearchIndexerSkill {
    /**
     * Creates an instance of ConditionalSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @SerdeToPojo
    public ConditionalSkill(
            @SerdeProperty(value = "inputs") List<InputFieldMappingEntry> inputs,
            @SerdeProperty(value = "outputs") List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }
}
