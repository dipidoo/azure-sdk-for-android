// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.RegexFlags;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/**
 * Tokenizer that uses regex pattern matching to construct distinct tokens. This tokenizer is implemented using Apache
 * Lucene.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.PatternTokenizer")
@JsonFlatten
@Fluent
public class PatternTokenizer extends LexicalTokenizer {
    /*
     * A regular expression pattern to match token separators. Default is an
     * expression that matches one or more non-word characters.
     */
    @SerdeProperty(value = "pattern")
    private String pattern;

    /*
     * Regular expression flags.
     */
    @SerdeProperty(value = "flags")
    private RegexFlags flags;

    /*
     * The zero-based ordinal of the matching group in the regular expression
     * pattern to extract into tokens. Use -1 if you want to use the entire
     * pattern to split the input into tokens, irrespective of matching groups.
     * Default is -1.
     */
    @SerdeProperty(value = "group")
    private Integer group;

    /**
     * Creates an instance of PatternTokenizer class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public PatternTokenizer(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the pattern property: A regular expression pattern to match token separators. Default is an expression that
     * matches one or more non-word characters.
     *
     * @return the pattern value.
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: A regular expression pattern to match token separators. Default is an expression that
     * matches one or more non-word characters.
     *
     * @param pattern the pattern value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the flags property: Regular expression flags.
     *
     * @return the flags value.
     */
    public RegexFlags getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Regular expression flags.
     *
     * @param flags the flags value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setFlags(RegexFlags flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the group property: The zero-based ordinal of the matching group in the regular expression pattern to extract
     * into tokens. Use -1 if you want to use the entire pattern to split the input into tokens, irrespective of
     * matching groups. Default is -1.
     *
     * @return the group value.
     */
    public Integer getGroup() {
        return this.group;
    }

    /**
     * Set the group property: The zero-based ordinal of the matching group in the regular expression pattern to extract
     * into tokens. Use -1 if you want to use the entire pattern to split the input into tokens, irrespective of
     * matching groups. Default is -1.
     *
     * @param group the group value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setGroup(Integer group) {
        this.group = group;
        return this;
    }
}
