// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.StopwordsList;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;
import java.util.List;

/** Removes stop words from a token stream. This token filter is implemented using Apache Lucene. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.StopwordsTokenFilter")
@JsonFlatten
@Fluent
public class StopwordsTokenFilter extends TokenFilter {
    /*
     * The list of stopwords. This property and the stopwords list property
     * cannot both be set.
     */
    @SerdeProperty(value = "stopwords")
    private List<String> stopwords;

    /*
     * A predefined list of stopwords to use. This property and the stopwords
     * property cannot both be set. Default is English.
     */
    @SerdeProperty(value = "stopwordsList")
    private StopwordsList stopwordsList;

    /*
     * A value indicating whether to ignore case. If true, all words are
     * converted to lower case first. Default is false.
     */
    @SerdeProperty(value = "ignoreCase")
    private Boolean ignoreCase;

    /*
     * A value indicating whether to ignore the last search term if it's a stop
     * word. Default is true.
     */
    @SerdeProperty(value = "removeTrailing")
    private Boolean removeTrailingStopWords;

    /**
     * Creates an instance of StopwordsTokenFilter class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public StopwordsTokenFilter(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the stopwords property: The list of stopwords. This property and the stopwords list property cannot both be
     * set.
     *
     * @return the stopwords value.
     */
    public List<String> getStopwords() {
        return this.stopwords;
    }

    /**
     * Set the stopwords property: The list of stopwords. This property and the stopwords list property cannot both be
     * set.
     *
     * @param stopwords the stopwords value to set.
     * @return the StopwordsTokenFilter object itself.
     */
    public StopwordsTokenFilter setStopwords(List<String> stopwords) {
        this.stopwords = stopwords;
        return this;
    }

    /**
     * Get the stopwordsList property: A predefined list of stopwords to use. This property and the stopwords property
     * cannot both be set. Default is English.
     *
     * @return the stopwordsList value.
     */
    public StopwordsList getStopwordsList() {
        return this.stopwordsList;
    }

    /**
     * Set the stopwordsList property: A predefined list of stopwords to use. This property and the stopwords property
     * cannot both be set. Default is English.
     *
     * @param stopwordsList the stopwordsList value to set.
     * @return the StopwordsTokenFilter object itself.
     */
    public StopwordsTokenFilter setStopwordsList(StopwordsList stopwordsList) {
        this.stopwordsList = stopwordsList;
        return this;
    }

    /**
     * Get the ignoreCase property: A value indicating whether to ignore case. If true, all words are converted to lower
     * case first. Default is false.
     *
     * @return the ignoreCase value.
     */
    public Boolean isIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set the ignoreCase property: A value indicating whether to ignore case. If true, all words are converted to lower
     * case first. Default is false.
     *
     * @param ignoreCase the ignoreCase value to set.
     * @return the StopwordsTokenFilter object itself.
     */
    public StopwordsTokenFilter setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * Get the removeTrailingStopWords property: A value indicating whether to ignore the last search term if it's a
     * stop word. Default is true.
     *
     * @return the removeTrailingStopWords value.
     */
    public Boolean isRemoveTrailingStopWords() {
        return this.removeTrailingStopWords;
    }

    /**
     * Set the removeTrailingStopWords property: A value indicating whether to ignore the last search term if it's a
     * stop word. Default is true.
     *
     * @param removeTrailingStopWords the removeTrailingStopWords value to set.
     * @return the StopwordsTokenFilter object itself.
     */
    public StopwordsTokenFilter setRemoveTrailingStopWords(Boolean removeTrailingStopWords) {
        this.removeTrailingStopWords = removeTrailingStopWords;
        return this;
    }
}
