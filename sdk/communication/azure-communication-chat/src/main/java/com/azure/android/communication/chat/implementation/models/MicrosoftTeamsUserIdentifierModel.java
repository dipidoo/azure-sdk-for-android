// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.implementation.models;

import com.azure.android.core.rest.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Microsoft Teams user. */
@Fluent
public final class MicrosoftTeamsUserIdentifierModel {
    /*
     * The Id of the Microsoft Teams user. If not anonymous, this is the AAD
     * object Id of the user.
     */
    @JsonProperty(value = "userId", required = true)
    private String userId;

    /*
     * True if the Microsoft Teams user is anonymous. By default false if
     * missing.
     */
    @JsonProperty(value = "isAnonymous")
    private Boolean isAnonymous;

    /*
     * The cloud that the Microsoft Teams user belongs to. By default 'public'
     * if missing.
     */
    @JsonProperty(value = "cloud")
    private CommunicationCloudEnvironmentModel cloud;

    /**
     * Get the userId property: The Id of the Microsoft Teams user. If not anonymous, this is the AAD object Id of the
     * user.
     *
     * @return the userId value.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The Id of the Microsoft Teams user. If not anonymous, this is the AAD object Id of the
     * user.
     *
     * @param userId the userId value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the isAnonymous property: True if the Microsoft Teams user is anonymous. By default false if missing.
     *
     * @return the isAnonymous value.
     */
    public Boolean isAnonymous() {
        return this.isAnonymous;
    }

    /**
     * Set the isAnonymous property: True if the Microsoft Teams user is anonymous. By default false if missing.
     *
     * @param isAnonymous the isAnonymous value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }

    /**
     * Get the cloud property: The cloud that the Microsoft Teams user belongs to. By default 'public' if missing.
     *
     * @return the cloud value.
     */
    public CommunicationCloudEnvironmentModel getCloud() {
        return this.cloud;
    }

    /**
     * Set the cloud property: The cloud that the Microsoft Teams user belongs to. By default 'public' if missing.
     *
     * @param cloud the cloud value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setCloud(CommunicationCloudEnvironmentModel cloud) {
        this.cloud = cloud;
        return this;
    }
}