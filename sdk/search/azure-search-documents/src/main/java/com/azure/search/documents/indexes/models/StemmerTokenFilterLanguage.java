// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeFromPojo;

/** Defines values for StemmerTokenFilterLanguage. */
public enum StemmerTokenFilterLanguage {
    /** Enum value arabic. */
    ARABIC("arabic"),

    /** Enum value armenian. */
    ARMENIAN("armenian"),

    /** Enum value basque. */
    BASQUE("basque"),

    /** Enum value brazilian. */
    BRAZILIAN("brazilian"),

    /** Enum value bulgarian. */
    BULGARIAN("bulgarian"),

    /** Enum value catalan. */
    CATALAN("catalan"),

    /** Enum value czech. */
    CZECH("czech"),

    /** Enum value danish. */
    DANISH("danish"),

    /** Enum value dutch. */
    DUTCH("dutch"),

    /** Enum value dutchKp. */
    DUTCH_KP("dutchKp"),

    /** Enum value english. */
    ENGLISH("english"),

    /** Enum value lightEnglish. */
    LIGHT_ENGLISH("lightEnglish"),

    /** Enum value minimalEnglish. */
    MINIMAL_ENGLISH("minimalEnglish"),

    /** Enum value possessiveEnglish. */
    POSSESSIVE_ENGLISH("possessiveEnglish"),

    /** Enum value porter2. */
    PORTER2("porter2"),

    /** Enum value lovins. */
    LOVINS("lovins"),

    /** Enum value finnish. */
    FINNISH("finnish"),

    /** Enum value lightFinnish. */
    LIGHT_FINNISH("lightFinnish"),

    /** Enum value french. */
    FRENCH("french"),

    /** Enum value lightFrench. */
    LIGHT_FRENCH("lightFrench"),

    /** Enum value minimalFrench. */
    MINIMAL_FRENCH("minimalFrench"),

    /** Enum value galician. */
    GALICIAN("galician"),

    /** Enum value minimalGalician. */
    MINIMAL_GALICIAN("minimalGalician"),

    /** Enum value german. */
    GERMAN("german"),

    /** Enum value german2. */
    GERMAN2("german2"),

    /** Enum value lightGerman. */
    LIGHT_GERMAN("lightGerman"),

    /** Enum value minimalGerman. */
    MINIMAL_GERMAN("minimalGerman"),

    /** Enum value greek. */
    GREEK("greek"),

    /** Enum value hindi. */
    HINDI("hindi"),

    /** Enum value hungarian. */
    HUNGARIAN("hungarian"),

    /** Enum value lightHungarian. */
    LIGHT_HUNGARIAN("lightHungarian"),

    /** Enum value indonesian. */
    INDONESIAN("indonesian"),

    /** Enum value irish. */
    IRISH("irish"),

    /** Enum value italian. */
    ITALIAN("italian"),

    /** Enum value lightItalian. */
    LIGHT_ITALIAN("lightItalian"),

    /** Enum value sorani. */
    SORANI("sorani"),

    /** Enum value latvian. */
    LATVIAN("latvian"),

    /** Enum value norwegian. */
    NORWEGIAN("norwegian"),

    /** Enum value lightNorwegian. */
    LIGHT_NORWEGIAN("lightNorwegian"),

    /** Enum value minimalNorwegian. */
    MINIMAL_NORWEGIAN("minimalNorwegian"),

    /** Enum value lightNynorsk. */
    LIGHT_NYNORSK("lightNynorsk"),

    /** Enum value minimalNynorsk. */
    MINIMAL_NYNORSK("minimalNynorsk"),

    /** Enum value portuguese. */
    PORTUGUESE("portuguese"),

    /** Enum value lightPortuguese. */
    LIGHT_PORTUGUESE("lightPortuguese"),

    /** Enum value minimalPortuguese. */
    MINIMAL_PORTUGUESE("minimalPortuguese"),

    /** Enum value portugueseRslp. */
    PORTUGUESE_RSLP("portugueseRslp"),

    /** Enum value romanian. */
    ROMANIAN("romanian"),

    /** Enum value russian. */
    RUSSIAN("russian"),

    /** Enum value lightRussian. */
    LIGHT_RUSSIAN("lightRussian"),

    /** Enum value spanish. */
    SPANISH("spanish"),

    /** Enum value lightSpanish. */
    LIGHT_SPANISH("lightSpanish"),

    /** Enum value swedish. */
    SWEDISH("swedish"),

    /** Enum value lightSwedish. */
    LIGHT_SWEDISH("lightSwedish"),

    /** Enum value turkish. */
    TURKISH("turkish");

    /** The actual serialized value for a StemmerTokenFilterLanguage instance. */
    private final String value;

    StemmerTokenFilterLanguage(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StemmerTokenFilterLanguage instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StemmerTokenFilterLanguage object, or null if unable to parse.
     */
    @SerdeToPojo
    public static StemmerTokenFilterLanguage fromString(String value) {
        StemmerTokenFilterLanguage[] items = StemmerTokenFilterLanguage.values();
        for (StemmerTokenFilterLanguage item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @SerdeFromPojo
    @Override
    public String toString() {
        return this.value;
    }
}
