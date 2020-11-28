// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.search.documents.indexes.models.PhoneticEncoder;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/** Create tokens for phonetic matches. This token filter is implemented using Apache Lucene. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.PhoneticTokenFilter")
@JsonFlatten
@Fluent
public class PhoneticTokenFilter extends TokenFilter {
    /*
     * The phonetic encoder to use. Default is "metaphone".
     */
    @SerdeProperty(value = "encoder")
    private PhoneticEncoder encoder;

    /*
     * A value indicating whether encoded tokens should replace original
     * tokens. If false, encoded tokens are added as synonyms. Default is true.
     */
    @SerdeProperty(value = "replace")
    private Boolean replaceOriginalTokens;

    /**
     * Creates an instance of PhoneticTokenFilter class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public PhoneticTokenFilter(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @return the encoder value.
     */
    public PhoneticEncoder getEncoder() {
        return this.encoder;
    }

    /**
     * Set the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @param encoder the encoder value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setEncoder(PhoneticEncoder encoder) {
        this.encoder = encoder;
        return this;
    }

    /**
     * Get the replaceOriginalTokens property: A value indicating whether encoded tokens should replace original tokens.
     * If false, encoded tokens are added as synonyms. Default is true.
     *
     * @return the replaceOriginalTokens value.
     */
    public Boolean isReplaceOriginalTokens() {
        return this.replaceOriginalTokens;
    }

    /**
     * Set the replaceOriginalTokens property: A value indicating whether encoded tokens should replace original tokens.
     * If false, encoded tokens are added as synonyms. Default is true.
     *
     * @param replaceOriginalTokens the replaceOriginalTokens value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setReplaceOriginalTokens(Boolean replaceOriginalTokens) {
        this.replaceOriginalTokens = replaceOriginalTokens;
        return this;
    }
}
