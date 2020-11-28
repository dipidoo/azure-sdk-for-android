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
 * Represents an indexer.
 */
@Fluent
public final class SearchIndexer {
    /*
     * The name of the indexer.
     */
    @SerdeProperty(value = "name")
    private String name;

    /*
     * The description of the indexer.
     */
    @SerdeProperty(value = "description")
    private String description;

    /*
     * The name of the datasource from which this indexer reads data.
     */
    @SerdeProperty(value = "dataSourceName")
    private String dataSourceName;

    /*
     * The name of the skillset executing with this indexer.
     */
    @SerdeProperty(value = "skillsetName")
    private String skillsetName;

    /*
     * The name of the index to which this indexer writes data.
     */
    @SerdeProperty(value = "targetIndexName")
    private String targetIndexName;

    /*
     * The schedule for this indexer.
     */
    @SerdeProperty(value = "schedule")
    private IndexingSchedule schedule;

    /*
     * Parameters for indexer execution.
     */
    @SerdeProperty(value = "parameters")
    private IndexingParameters parameters;

    /*
     * Defines mappings between fields in the data source and corresponding
     * target fields in the index.
     */
    @SerdeProperty(value = "fieldMappings")
    private List<FieldMapping> fieldMappings;

    /*
     * Output field mappings are applied after enrichment and immediately
     * before indexing.
     */
    @SerdeProperty(value = "outputFieldMappings")
    private List<FieldMapping> outputFieldMappings;

    /*
     * A value indicating whether the indexer is disabled. Default is false.
     */
    @SerdeProperty(value = "disabled")
    private Boolean isDisabled;

    /*
     * The ETag of the indexer.
     */
    @SerdeProperty(value = "@odata.etag")
    private String eTag;

    /*
     * A description of an encryption key that you create in Azure Key Vault.
     * This key is used to provide an additional level of encryption-at-rest
     * for your indexer definition (as well as indexer execution status) when
     * you want full assurance that no one, not even Microsoft, can decrypt
     * them in Azure Cognitive Search. Once you have encrypted your indexer
     * definition, it will always remain encrypted. Azure Cognitive Search will
     * ignore attempts to set this property to null. You can change this
     * property as needed if you want to rotate your encryption key; Your
     * indexer definition (and indexer execution status) will be unaffected.
     * Encryption with customer-managed keys is not available for free search
     * services, and is only available for paid services created on or after
     * January 1, 2019.
     */
    @SerdeProperty(value = "encryptionKey")
    private SearchResourceEncryptionKey encryptionKey;

    /**
     * Constructor of {@link SearchIndexer}.
     *
     * @param name The name of the indexer.
     */
    public SearchIndexer(String name) {
        this.name = name;
    }

    /**
     * Constructor of {@link SearchIndexer}.
     *
     * @param name The name of the indexer.
     * @param dataSourceName The name of the datasource from which this indexer reads data.
     * @param targetIndexName The name of the index to which this indexer writes data.
     */
    @SerdeToPojo
    public SearchIndexer(
        @SerdeProperty(value = "name") String name,
        @SerdeProperty(value = "dataSourceName") String dataSourceName,
        @SerdeProperty(value = "targetIndexName") String targetIndexName) {
        this.name = name;
        this.dataSourceName = dataSourceName;
        this.targetIndexName = targetIndexName;
    }

    /**
     * Get the name property: The name of the indexer.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description property: The description of the indexer.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the indexer.
     *
     * @param description the description value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataSourceName property: The name of the datasource from which
     * this indexer reads data.
     *
     * @return the dataSourceName value.
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * Set the dataSourceName property: The name of the datasource from which
     * this indexer reads data.
     *
     * @param dataSourceName the dataSourceName value.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Get the skillsetName property: The name of the skillset executing with
     * this indexer.
     *
     * @return the skillsetName value.
     */
    public String getSkillsetName() {
        return this.skillsetName;
    }

    /**
     * Set the skillsetName property: The name of the skillset executing with
     * this indexer.
     *
     * @param skillsetName the skillsetName value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setSkillsetName(String skillsetName) {
        this.skillsetName = skillsetName;
        return this;
    }

    /**
     * Get the targetIndexName property: The name of the index to which this
     * indexer writes data.
     *
     * @return the targetIndexName value.
     */
    public String getTargetIndexName() {
        return this.targetIndexName;
    }

    /**
     * Set the targetIndexName property: The name of the index to which this
     * indexer writes data.
     *
     * @param targetIndexName the targetIndexName value.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setTargetIndexName(String targetIndexName) {
        this.targetIndexName = targetIndexName;
        return this;
    }

    /**
     * Get the schedule property: The schedule for this indexer.
     *
     * @return the schedule value.
     */
    public IndexingSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The schedule for this indexer.
     *
     * @param schedule the schedule value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setSchedule(IndexingSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the parameters property: Parameters for indexer execution.
     *
     * @return the parameters value.
     */
    public IndexingParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for indexer execution.
     *
     * @param parameters the parameters value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setParameters(IndexingParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the fieldMappings property: Defines mappings between fields in the
     * data source and corresponding target fields in the index.
     *
     * @return the fieldMappings value.
     */
    public List<FieldMapping> getFieldMappings() {
        return this.fieldMappings;
    }

    /**
     * Set the fieldMappings property: Defines mappings between fields in the
     * data source and corresponding target fields in the index.
     *
     * @param fieldMappings the fieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setFieldMappings(FieldMapping... fieldMappings) {
        this.fieldMappings = (fieldMappings == null) ? null : Arrays.asList(fieldMappings);
        return this;
    }

    /**
     * Set the fieldMappings property: Defines mappings between fields in the
     * data source and corresponding target fields in the index.
     *
     * @param fieldMappings the fieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    @SerdeSetter
    public SearchIndexer setFieldMappings(List<FieldMapping> fieldMappings) {
        this.fieldMappings = fieldMappings;
        return this;
    }

    /**
     * Get the outputFieldMappings property: Output field mappings are applied
     * after enrichment and immediately before indexing.
     *
     * @return the outputFieldMappings value.
     */
    public List<FieldMapping> getOutputFieldMappings() {
        return this.outputFieldMappings;
    }

    /**
     * Set the outputFieldMappings property: Output field mappings are applied
     * after enrichment and immediately before indexing.
     *
     * @param outputFieldMappings the outputFieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setOutputFieldMappings(FieldMapping... outputFieldMappings) {
        this.outputFieldMappings = (outputFieldMappings == null) ? null : Arrays.asList(outputFieldMappings);
        return this;
    }

    /**
     * Set the outputFieldMappings property: Output field mappings are applied
     * after enrichment and immediately before indexing.
     *
     * @param outputFieldMappings the outputFieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    @SerdeSetter
    public SearchIndexer setOutputFieldMappings(List<FieldMapping> outputFieldMappings) {
        this.outputFieldMappings = outputFieldMappings;
        return this;
    }

    /**
     * Get the isDisabled property: A value indicating whether the indexer is
     * disabled. Default is false.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * Set the isDisabled property: A value indicating whether the indexer is
     * disabled. Default is false.
     *
     * @param isDisabled the isDisabled value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the indexer.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the indexer.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your indexer definition (as well as indexer
     * execution status) when you want full assurance that no one, not even Microsoft, can decrypt them in Azure
     * Cognitive Search. Once you have encrypted your indexer definition, it will always remain encrypted. Azure
     * Cognitive Search will ignore attempts to set this property to null. You can change this property as needed if you
     * want to rotate your encryption key; Your indexer definition (and indexer execution status) will be unaffected.
     * Encryption with customer-managed keys is not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your indexer definition (as well as indexer
     * execution status) when you want full assurance that no one, not even Microsoft, can decrypt them in Azure
     * Cognitive Search. Once you have encrypted your indexer definition, it will always remain encrypted. Azure
     * Cognitive Search will ignore attempts to set this property to null. You can change this property as needed if you
     * want to rotate your encryption key; Your indexer definition (and indexer execution status) will be unaffected.
     * Encryption with customer-managed keys is not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
}
