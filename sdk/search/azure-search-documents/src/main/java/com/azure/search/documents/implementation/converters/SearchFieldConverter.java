// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.core.logging.ClientLogger;
import com.azure.search.documents.indexes.models.SearchField;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.SearchField} and {@link SearchField}.
 */
public final class SearchFieldConverter {
    private static final ClientLogger LOGGER =
        new ClientLogger(com.azure.search.documents.implementation.converters.SearchFieldConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.SearchField} to {@link SearchField}.
     */
    public static SearchField map(com.azure.search.documents.indexes.implementation.models.SearchField obj) {
        if (obj == null) {
            return null;
        }

        SearchField searchField = new SearchField(obj.getName(), obj.getType());

        Boolean filterable = obj.isFilterable();
        searchField.setFilterable(filterable);

        Boolean hidden = obj.isRetrievable() == null ? null : !obj.isRetrievable();
        searchField.setHidden(hidden);

        Boolean sortable = obj.isSortable();
        searchField.setSortable(sortable);

        Boolean searchable = obj.isSearchable();
        searchField.setSearchable(searchable);

        if (obj.getAnalyzer() != null) {
            searchField.setAnalyzerName(obj.getAnalyzer());
        }

        if (obj.getSearchAnalyzer() != null) {
            searchField.setSearchAnalyzerName(obj.getSearchAnalyzer());
        }


        if (obj.getIndexAnalyzer() != null) {
            searchField.setIndexAnalyzerName(obj.getIndexAnalyzer());
        }

        Boolean facetable = obj.isFacetable();
        searchField.setFacetable(facetable);

        if (obj.getSynonymMaps() != null) {
            List<String> synonymMaps = new ArrayList<>(obj.getSynonymMaps());
            searchField.setSynonymMapNames(synonymMaps);
        }

        if (obj.getFields() != null) {
            List<SearchField> fields =
                obj.getFields().stream().map(com.azure.search.documents.implementation.converters.SearchFieldConverter::map).collect(Collectors.toList());
            searchField.setFields(fields);
        }

        Boolean key = obj.isKey();
        searchField.setKey(key);
        return searchField;
    }

    /**
     * Maps from {@link SearchField} to {@link com.azure.search.documents.indexes.implementation.models.SearchField}.
     */
    public static com.azure.search.documents.indexes.implementation.models.SearchField map(SearchField obj) {
        if (obj == null) {
            return null;
        }

        com.azure.search.documents.indexes.implementation.models.SearchField searchField =
            new com.azure.search.documents.indexes.implementation.models.SearchField(obj.getName(), obj.getType());

        Boolean filterable = obj.isFilterable();
        searchField.setFilterable(filterable);

        Boolean hidden = obj.isHidden() == null ? null : !obj.isHidden();
        searchField.setRetrievable(hidden);

        Boolean sortable = obj.isSortable();
        searchField.setSortable(sortable);

        Boolean searchable = obj.isSearchable();
        searchField.setSearchable(searchable);

        if (obj.getAnalyzerName() != null) {
            searchField.setAnalyzer(obj.getAnalyzerName());
        }

        if (obj.getSearchAnalyzerName() != null) {
            searchField.setSearchAnalyzer(obj.getSearchAnalyzerName());
        }

        if (obj.getIndexAnalyzerName() != null) {
            searchField.setIndexAnalyzer(obj.getIndexAnalyzerName());
        }

        Boolean facetable = obj.isFacetable();
        searchField.setFacetable(facetable);

        if (obj.getSynonymMapNames() != null) {
            List<String> synonymMaps = new ArrayList<>(obj.getSynonymMapNames());
            searchField.setSynonymMaps(synonymMaps);
        }

        if (obj.getFields() != null) {
            List<com.azure.search.documents.indexes.implementation.models.SearchField> fields =
                obj.getFields().stream().map(com.azure.search.documents.implementation.converters.SearchFieldConverter::map).collect(Collectors.toList());
            searchField.setFields(fields);
        }

        Boolean key = obj.isKey();
        searchField.setKey(key);

        return searchField;
    }

    private SearchFieldConverter() {
    }
}
