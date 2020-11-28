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
import java.util.List;

/** Matches single or multi-word synonyms in a token stream. This token filter is implemented using Apache Lucene. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.SynonymTokenFilter")
@JsonFlatten
@Fluent
public class SynonymTokenFilter extends TokenFilter {
    /*
     * A list of synonyms in following one of two formats: 1. incredible,
     * unbelievable, fabulous => amazing - all terms on the left side of =>
     * symbol will be replaced with all terms on its right side; 2. incredible,
     * unbelievable, fabulous, amazing - comma separated list of equivalent
     * words. Set the expand option to change how this list is interpreted.
     */
    @SerdeProperty(value = "synonyms")
    private List<String> synonyms;

    /*
     * A value indicating whether to case-fold input for matching. Default is
     * false.
     */
    @SerdeProperty(value = "ignoreCase")
    private Boolean ignoreCase;

    /*
     * A value indicating whether all words in the list of synonyms (if =>
     * notation is not used) will map to one another. If true, all words in the
     * list of synonyms (if => notation is not used) will map to one another.
     * The following list: incredible, unbelievable, fabulous, amazing is
     * equivalent to: incredible, unbelievable, fabulous, amazing =>
     * incredible, unbelievable, fabulous, amazing. If false, the following
     * list: incredible, unbelievable, fabulous, amazing will be equivalent to:
     * incredible, unbelievable, fabulous, amazing => incredible. Default is
     * true.
     */
    @SerdeProperty(value = "expand")
    private Boolean expand;

    /**
     * Creates an instance of SynonymTokenFilter class.
     *
     * @param name the name value to set.
     * @param synonyms the synonyms value to set.
     */
    @SerdeToPojo
    public SynonymTokenFilter(
            @SerdeProperty(value = "name") String name,
            @SerdeProperty(value = "synonyms") List<String> synonyms) {
        super(name);
        this.synonyms = synonyms;
    }

    /**
     * Get the synonyms property: A list of synonyms in following one of two formats: 1. incredible, unbelievable,
     * fabulous =&gt; amazing - all terms on the left side of =&gt; symbol will be replaced with all terms on its right
     * side; 2. incredible, unbelievable, fabulous, amazing - comma separated list of equivalent words. Set the expand
     * option to change how this list is interpreted.
     *
     * @return the synonyms value.
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    /**
     * Get the ignoreCase property: A value indicating whether to case-fold input for matching. Default is false.
     *
     * @return the ignoreCase value.
     */
    public Boolean isIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set the ignoreCase property: A value indicating whether to case-fold input for matching. Default is false.
     *
     * @param ignoreCase the ignoreCase value to set.
     * @return the SynonymTokenFilter object itself.
     */
    public SynonymTokenFilter setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * Get the expand property: A value indicating whether all words in the list of synonyms (if =&gt; notation is not
     * used) will map to one another. If true, all words in the list of synonyms (if =&gt; notation is not used) will
     * map to one another. The following list: incredible, unbelievable, fabulous, amazing is equivalent to: incredible,
     * unbelievable, fabulous, amazing =&gt; incredible, unbelievable, fabulous, amazing. If false, the following list:
     * incredible, unbelievable, fabulous, amazing will be equivalent to: incredible, unbelievable, fabulous, amazing
     * =&gt; incredible. Default is true.
     *
     * @return the expand value.
     */
    public Boolean isExpand() {
        return this.expand;
    }

    /**
     * Set the expand property: A value indicating whether all words in the list of synonyms (if =&gt; notation is not
     * used) will map to one another. If true, all words in the list of synonyms (if =&gt; notation is not used) will
     * map to one another. The following list: incredible, unbelievable, fabulous, amazing is equivalent to: incredible,
     * unbelievable, fabulous, amazing =&gt; incredible, unbelievable, fabulous, amazing. If false, the following list:
     * incredible, unbelievable, fabulous, amazing will be equivalent to: incredible, unbelievable, fabulous, amazing
     * =&gt; incredible. Default is true.
     *
     * @param expand the expand value to set.
     * @return the SynonymTokenFilter object itself.
     */
    public SynonymTokenFilter setExpand(Boolean expand) {
        this.expand = expand;
        return this;
    }
}
