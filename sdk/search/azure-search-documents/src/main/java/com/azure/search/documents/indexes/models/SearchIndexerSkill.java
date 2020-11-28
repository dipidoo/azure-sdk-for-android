// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/**
 * Base type for skills.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type",
    defaultImpl = SearchIndexerSkill.class)
@SerdeTypeName("SearchIndexerSkill")
@SerdeSubTypes({
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Util.ConditionalSkill", value = ConditionalSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.KeyPhraseExtractionSkill",
        value = KeyPhraseExtractionSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Vision.OcrSkill", value = OcrSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Vision.ImageAnalysisSkill", value = ImageAnalysisSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.LanguageDetectionSkill", value = LanguageDetectionSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Util.ShaperSkill", value = ShaperSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.MergeSkill", value = MergeSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.EntityRecognitionSkill", value = EntityRecognitionSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.SentimentSkill", value = SentimentSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.SplitSkill", value = SplitSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Text.TranslationSkill", value = TextTranslationSkill.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Skills.Custom.WebApiSkill", value = WebApiSkill.class)
})
@Fluent
public abstract class SearchIndexerSkill {
    /*
     * The name of the skill which uniquely identifies it within the skillset.
     * A skill with no name defined will be given a default name of its 1-based
     * index in the skills array, prefixed with the character '#'.
     */
    @SerdeProperty(value = "name")
    private String name;

    /*
     * The description of the skill which describes the inputs, outputs, and
     * usage of the skill.
     */
    @SerdeProperty(value = "description")
    private String description;

    /*
     * Represents the level at which operations take place, such as the
     * document root or document content (for example, /document or
     * /document/content). The default is /document.
     */
    @SerdeProperty(value = "context")
    private String context;

    /*
     * Inputs of the skills could be a column in the source data set, or the
     * output of an upstream skill.
     */
    @SerdeProperty(value = "inputs")
    private List<InputFieldMappingEntry> inputs;

    /*
     * The output of a skill is either a field in a search index, or a value
     * that can be consumed as an input by another skill.
     */
    @SerdeProperty(value = "outputs")
    private List<OutputFieldMappingEntry> outputs;

    /**
     * Constructor of {@link SearchIndexerSkill}.
     *
     * @param inputs Inputs of the skills could be a column in the source data set, or the
     * output of an upstream skill.
     * @param outputs The output of a skill is either a field in a search index, or a value
     * that can be consumed as an input by another skill.
     */
    @SerdeToPojo
    public SearchIndexerSkill(
        @SerdeProperty(value = "inputs") List<InputFieldMappingEntry> inputs,
        @SerdeProperty(value = "outputs") List<OutputFieldMappingEntry> outputs) {
        this.inputs = inputs;
        this.outputs = outputs;
    }

    /**
     * Get the name property: The name of the skill which uniquely identifies
     * it within the skillset. A skill with no name defined will be given a
     * default name of its 1-based index in the skills array, prefixed with the
     * character '#'.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the skill which uniquely identifies
     * it within the skillset. A skill with no name defined will be given a
     * default name of its 1-based index in the skills array, prefixed with the
     * character '#'.
     *
     * @param name the name value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The description of the skill which
     * describes the inputs, outputs, and usage of the skill.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the skill which
     * describes the inputs, outputs, and usage of the skill.
     *
     * @param description the description value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the context property: Represents the level at which operations take
     * place, such as the document root or document content (for example,
     * /document or /document/content). The default is /document.
     *
     * @return the context value.
     */
    public String getContext() {
        return this.context;
    }

    /**
     * Set the context property: Represents the level at which operations take
     * place, such as the document root or document content (for example,
     * /document or /document/content). The default is /document.
     *
     * @param context the context value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the inputs property: Inputs of the skills could be a column in the
     * source data set, or the output of an upstream skill.
     *
     * @return the inputs value.
     */
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Get the outputs property: The output of a skill is either a field in a
     * search index, or a value that can be consumed as an input by another
     * skill.
     *
     * @return the outputs value.
     */
    public List<OutputFieldMappingEntry> getOutputs() {
        return this.outputs;
    }
}
