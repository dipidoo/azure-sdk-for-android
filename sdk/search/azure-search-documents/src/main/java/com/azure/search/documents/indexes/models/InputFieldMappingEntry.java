// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSetter;

import java.util.Arrays;
import java.util.List;

/**
 * Input field mapping for a skill.
 */
@Fluent
public final class InputFieldMappingEntry {
    /*
     * The name of the input.
     */
    @SerdeProperty(value = "name")
    private String name;

    /*
     * The source of the input.
     */
    @SerdeProperty(value = "source")
    private String source;

    /*
     * The source context used for selecting recursive inputs.
     */
    @SerdeProperty(value = "sourceContext")
    private String sourceContext;

    /*
     * The recursive inputs used when creating a complex type.
     */
    @SerdeProperty(value = "inputs")
    private List<InputFieldMappingEntry> inputs;

    /**
     * Constructor of {@link InputFieldMappingEntry}.
     *
     * @param name The name of the input.
     */
    @SerdeToPojo
    public InputFieldMappingEntry(@SerdeProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the input.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the source property: The source of the input.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source of the input.
     *
     * @param source the source value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceContext property: The source context used for selecting
     * recursive inputs.
     *
     * @return the sourceContext value.
     */
    public String getSourceContext() {
        return this.sourceContext;
    }

    /**
     * Set the sourceContext property: The source context used for selecting
     * recursive inputs.
     *
     * @param sourceContext the sourceContext value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setSourceContext(String sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }

    /**
     * Get the inputs property: The recursive inputs used when creating a
     * complex type.
     *
     * @return the inputs value.
     */
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a
     * complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    public InputFieldMappingEntry setInputs(InputFieldMappingEntry... inputs) {
        this.inputs = (inputs == null) ? null : Arrays.asList(inputs);
        return this;
    }

    /**
     * Set the inputs property: The recursive inputs used when creating a
     * complex type.
     *
     * @param inputs the inputs value to set.
     * @return the InputFieldMappingEntry object itself.
     */
    @SerdeSetter
    public InputFieldMappingEntry setInputs(List<InputFieldMappingEntry> inputs) {
        this.inputs = inputs;
        return this;
    }
}
