// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.storage.blob.models;

import com.azure.android.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Defines values for BlobErrorCode.
 */
public final class BlobErrorCode extends ExpandableStringEnum<BlobErrorCode> {
    /**
     * Static value AccountAlreadyExists for BlobErrorCode.
     */
    public static final BlobErrorCode ACCOUNT_ALREADY_EXISTS = fromString("AccountAlreadyExists");

    /**
     * Static value AccountBeingCreated for BlobErrorCode.
     */
    public static final BlobErrorCode ACCOUNT_BEING_CREATED = fromString("AccountBeingCreated");

    /**
     * Static value AccountIsDisabled for BlobErrorCode.
     */
    public static final BlobErrorCode ACCOUNT_IS_DISABLED = fromString("AccountIsDisabled");

    /**
     * Static value AuthenticationFailed for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHENTICATION_FAILED = fromString("AuthenticationFailed");

    /**
     * Static value AuthorizationFailure for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_FAILURE = fromString("AuthorizationFailure");

    /**
     * Static value ConditionHeadersNotSupported for BlobErrorCode.
     */
    public static final BlobErrorCode CONDITION_HEADERS_NOT_SUPPORTED = fromString("ConditionHeadersNotSupported");

    /**
     * Static value ConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode CONDITION_NOT_MET = fromString("ConditionNotMet");

    /**
     * Static value EmptyMetadataKey for BlobErrorCode.
     */
    public static final BlobErrorCode EMPTY_METADATA_KEY = fromString("EmptyMetadataKey");

    /**
     * Static value InsufficientAccountPermissions for BlobErrorCode.
     */
    public static final BlobErrorCode INSUFFICIENT_ACCOUNT_PERMISSIONS = fromString("InsufficientAccountPermissions");

    /**
     * Static value InternalError for BlobErrorCode.
     */
    public static final BlobErrorCode INTERNAL_ERROR = fromString("InternalError");

    /**
     * Static value InvalidAuthenticationInfo for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_AUTHENTICATION_INFO = fromString("InvalidAuthenticationInfo");

    /**
     * Static value InvalidHeaderValue for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_HEADER_VALUE = fromString("InvalidHeaderValue");

    /**
     * Static value InvalidHttpVerb for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_HTTP_VERB = fromString("InvalidHttpVerb");

    /**
     * Static value InvalidInput for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_INPUT = fromString("InvalidInput");

    /**
     * Static value InvalidMd5 for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_MD5 = fromString("InvalidMd5");

    /**
     * Static value InvalidMetadata for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_METADATA = fromString("InvalidMetadata");

    /**
     * Static value InvalidQueryParameterValue for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_QUERY_PARAMETER_VALUE = fromString("InvalidQueryParameterValue");

    /**
     * Static value InvalidRange for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_RANGE = fromString("InvalidRange");

    /**
     * Static value InvalidResourceName for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_RESOURCE_NAME = fromString("InvalidResourceName");

    /**
     * Static value InvalidUri for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_URI = fromString("InvalidUri");

    /**
     * Static value InvalidXmlDocument for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_XML_DOCUMENT = fromString("InvalidXmlDocument");

    /**
     * Static value InvalidXmlNodeValue for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_XML_NODE_VALUE = fromString("InvalidXmlNodeValue");

    /**
     * Static value Md5Mismatch for BlobErrorCode.
     */
    public static final BlobErrorCode MD5MISMATCH = fromString("Md5Mismatch");

    /**
     * Static value MetadataTooLarge for BlobErrorCode.
     */
    public static final BlobErrorCode METADATA_TOO_LARGE = fromString("MetadataTooLarge");

    /**
     * Static value MissingContentLengthHeader for BlobErrorCode.
     */
    public static final BlobErrorCode MISSING_CONTENT_LENGTH_HEADER = fromString("MissingContentLengthHeader");

    /**
     * Static value MissingRequiredQueryParameter for BlobErrorCode.
     */
    public static final BlobErrorCode MISSING_REQUIRED_QUERY_PARAMETER = fromString("MissingRequiredQueryParameter");

    /**
     * Static value MissingRequiredHeader for BlobErrorCode.
     */
    public static final BlobErrorCode MISSING_REQUIRED_HEADER = fromString("MissingRequiredHeader");

    /**
     * Static value MissingRequiredXmlNode for BlobErrorCode.
     */
    public static final BlobErrorCode MISSING_REQUIRED_XML_NODE = fromString("MissingRequiredXmlNode");

    /**
     * Static value MultipleConditionHeadersNotSupported for BlobErrorCode.
     */
    public static final BlobErrorCode MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED = fromString("MultipleConditionHeadersNotSupported");

    /**
     * Static value OperationTimedOut for BlobErrorCode.
     */
    public static final BlobErrorCode OPERATION_TIMED_OUT = fromString("OperationTimedOut");

    /**
     * Static value OutOfRangeInput for BlobErrorCode.
     */
    public static final BlobErrorCode OUT_OF_RANGE_INPUT = fromString("OutOfRangeInput");

    /**
     * Static value OutOfRangeQueryParameterValue for BlobErrorCode.
     */
    public static final BlobErrorCode OUT_OF_RANGE_QUERY_PARAMETER_VALUE = fromString("OutOfRangeQueryParameterValue");

    /**
     * Static value RequestBodyTooLarge for BlobErrorCode.
     */
    public static final BlobErrorCode REQUEST_BODY_TOO_LARGE = fromString("RequestBodyTooLarge");

    /**
     * Static value ResourceTypeMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode RESOURCE_TYPE_MISMATCH = fromString("ResourceTypeMismatch");

    /**
     * Static value RequestUrlFailedToParse for BlobErrorCode.
     */
    public static final BlobErrorCode REQUEST_URL_FAILED_TO_PARSE = fromString("RequestUrlFailedToParse");

    /**
     * Static value ResourceAlreadyExists for BlobErrorCode.
     */
    public static final BlobErrorCode RESOURCE_ALREADY_EXISTS = fromString("ResourceAlreadyExists");

    /**
     * Static value ResourceNotFound for BlobErrorCode.
     */
    public static final BlobErrorCode RESOURCE_NOT_FOUND = fromString("ResourceNotFound");

    /**
     * Static value ServerBusy for BlobErrorCode.
     */
    public static final BlobErrorCode SERVER_BUSY = fromString("ServerBusy");

    /**
     * Static value UnsupportedHeader for BlobErrorCode.
     */
    public static final BlobErrorCode UNSUPPORTED_HEADER = fromString("UnsupportedHeader");

    /**
     * Static value UnsupportedXmlNode for BlobErrorCode.
     */
    public static final BlobErrorCode UNSUPPORTED_XML_NODE = fromString("UnsupportedXmlNode");

    /**
     * Static value UnsupportedQueryParameter for BlobErrorCode.
     */
    public static final BlobErrorCode UNSUPPORTED_QUERY_PARAMETER = fromString("UnsupportedQueryParameter");

    /**
     * Static value UnsupportedHttpVerb for BlobErrorCode.
     */
    public static final BlobErrorCode UNSUPPORTED_HTTP_VERB = fromString("UnsupportedHttpVerb");

    /**
     * Static value AppendPositionConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode APPEND_POSITION_CONDITION_NOT_MET = fromString("AppendPositionConditionNotMet");

    /**
     * Static value BlobAlreadyExists for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_ALREADY_EXISTS = fromString("BlobAlreadyExists");

    /**
     * Static value BlobNotFound for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_NOT_FOUND = fromString("BlobNotFound");

    /**
     * Static value BlobOverwritten for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_OVERWRITTEN = fromString("BlobOverwritten");

    /**
     * Static value BlobTierInadequateForContentLength for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_TIER_INADEQUATE_FOR_CONTENT_LENGTH = fromString("BlobTierInadequateForContentLength");

    /**
     * Static value BlockCountExceedsLimit for BlobErrorCode.
     */
    public static final BlobErrorCode BLOCK_COUNT_EXCEEDS_LIMIT = fromString("BlockCountExceedsLimit");

    /**
     * Static value BlockListTooLong for BlobErrorCode.
     */
    public static final BlobErrorCode BLOCK_LIST_TOO_LONG = fromString("BlockListTooLong");

    /**
     * Static value CannotChangeToLowerTier for BlobErrorCode.
     */
    public static final BlobErrorCode CANNOT_CHANGE_TO_LOWER_TIER = fromString("CannotChangeToLowerTier");

    /**
     * Static value CannotVerifyCopySource for BlobErrorCode.
     */
    public static final BlobErrorCode CANNOT_VERIFY_COPY_SOURCE = fromString("CannotVerifyCopySource");

    /**
     * Static value ContainerAlreadyExists for BlobErrorCode.
     */
    public static final BlobErrorCode CONTAINER_ALREADY_EXISTS = fromString("ContainerAlreadyExists");

    /**
     * Static value ContainerBeingDeleted for BlobErrorCode.
     */
    public static final BlobErrorCode CONTAINER_BEING_DELETED = fromString("ContainerBeingDeleted");

    /**
     * Static value ContainerDisabled for BlobErrorCode.
     */
    public static final BlobErrorCode CONTAINER_DISABLED = fromString("ContainerDisabled");

    /**
     * Static value ContainerNotFound for BlobErrorCode.
     */
    public static final BlobErrorCode CONTAINER_NOT_FOUND = fromString("ContainerNotFound");

    /**
     * Static value ContentLengthLargerThanTierLimit for BlobErrorCode.
     */
    public static final BlobErrorCode CONTENT_LENGTH_LARGER_THAN_TIER_LIMIT = fromString("ContentLengthLargerThanTierLimit");

    /**
     * Static value CopyAcrossAccountsNotSupported for BlobErrorCode.
     */
    public static final BlobErrorCode COPY_ACROSS_ACCOUNTS_NOT_SUPPORTED = fromString("CopyAcrossAccountsNotSupported");

    /**
     * Static value CopyIdMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode COPY_ID_MISMATCH = fromString("CopyIdMismatch");

    /**
     * Static value FeatureVersionMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode FEATURE_VERSION_MISMATCH = fromString("FeatureVersionMismatch");

    /**
     * Static value IncrementalCopyBlobMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode INCREMENTAL_COPY_BLOB_MISMATCH = fromString("IncrementalCopyBlobMismatch");

    /**
     * Static value IncrementalCopyOfEralierVersionSnapshotNotAllowed for BlobErrorCode.
     */
    public static final BlobErrorCode INCREMENTAL_COPY_OF_ERALIER_VERSION_SNAPSHOT_NOT_ALLOWED = fromString("IncrementalCopyOfEralierVersionSnapshotNotAllowed");

    /**
     * Static value IncrementalCopySourceMustBeSnapshot for BlobErrorCode.
     */
    public static final BlobErrorCode INCREMENTAL_COPY_SOURCE_MUST_BE_SNAPSHOT = fromString("IncrementalCopySourceMustBeSnapshot");

    /**
     * Static value InfiniteLeaseDurationRequired for BlobErrorCode.
     */
    public static final BlobErrorCode INFINITE_LEASE_DURATION_REQUIRED = fromString("InfiniteLeaseDurationRequired");

    /**
     * Static value InvalidBlobOrBlock for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_BLOB_OR_BLOCK = fromString("InvalidBlobOrBlock");

    /**
     * Static value InvalidBlobTier for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_BLOB_TIER = fromString("InvalidBlobTier");

    /**
     * Static value InvalidBlobType for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_BLOB_TYPE = fromString("InvalidBlobType");

    /**
     * Static value InvalidBlockId for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_BLOCK_ID = fromString("InvalidBlockId");

    /**
     * Static value InvalidBlockList for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_BLOCK_LIST = fromString("InvalidBlockList");

    /**
     * Static value InvalidOperation for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_OPERATION = fromString("InvalidOperation");

    /**
     * Static value InvalidPageRange for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_PAGE_RANGE = fromString("InvalidPageRange");

    /**
     * Static value InvalidSourceBlobType for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_SOURCE_BLOB_TYPE = fromString("InvalidSourceBlobType");

    /**
     * Static value InvalidSourceBlobUrl for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_SOURCE_BLOB_URL = fromString("InvalidSourceBlobUrl");

    /**
     * Static value InvalidVersionForPageBlobOperation for BlobErrorCode.
     */
    public static final BlobErrorCode INVALID_VERSION_FOR_PAGE_BLOB_OPERATION = fromString("InvalidVersionForPageBlobOperation");

    /**
     * Static value LeaseAlreadyPresent for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ALREADY_PRESENT = fromString("LeaseAlreadyPresent");

    /**
     * Static value LeaseAlreadyBroken for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ALREADY_BROKEN = fromString("LeaseAlreadyBroken");

    /**
     * Static value LeaseIdMismatchWithBlobOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ID_MISMATCH_WITH_BLOB_OPERATION = fromString("LeaseIdMismatchWithBlobOperation");

    /**
     * Static value LeaseIdMismatchWithContainerOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ID_MISMATCH_WITH_CONTAINER_OPERATION = fromString("LeaseIdMismatchWithContainerOperation");

    /**
     * Static value LeaseIdMismatchWithLeaseOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ID_MISMATCH_WITH_LEASE_OPERATION = fromString("LeaseIdMismatchWithLeaseOperation");

    /**
     * Static value LeaseIdMissing for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_ID_MISSING = fromString("LeaseIdMissing");

    /**
     * Static value LeaseIsBreakingAndCannotBeAcquired for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_IS_BREAKING_AND_CANNOT_BE_ACQUIRED = fromString("LeaseIsBreakingAndCannotBeAcquired");

    /**
     * Static value LeaseIsBreakingAndCannotBeChanged for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_IS_BREAKING_AND_CANNOT_BE_CHANGED = fromString("LeaseIsBreakingAndCannotBeChanged");

    /**
     * Static value LeaseIsBrokenAndCannotBeRenewed for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_IS_BROKEN_AND_CANNOT_BE_RENEWED = fromString("LeaseIsBrokenAndCannotBeRenewed");

    /**
     * Static value LeaseLost for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_LOST = fromString("LeaseLost");

    /**
     * Static value LeaseNotPresentWithBlobOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_NOT_PRESENT_WITH_BLOB_OPERATION = fromString("LeaseNotPresentWithBlobOperation");

    /**
     * Static value LeaseNotPresentWithContainerOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_NOT_PRESENT_WITH_CONTAINER_OPERATION = fromString("LeaseNotPresentWithContainerOperation");

    /**
     * Static value LeaseNotPresentWithLeaseOperation for BlobErrorCode.
     */
    public static final BlobErrorCode LEASE_NOT_PRESENT_WITH_LEASE_OPERATION = fromString("LeaseNotPresentWithLeaseOperation");

    /**
     * Static value MaxBlobSizeConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode MAX_BLOB_SIZE_CONDITION_NOT_MET = fromString("MaxBlobSizeConditionNotMet");

    /**
     * Static value NoPendingCopyOperation for BlobErrorCode.
     */
    public static final BlobErrorCode NO_PENDING_COPY_OPERATION = fromString("NoPendingCopyOperation");

    /**
     * Static value OperationNotAllowedOnIncrementalCopyBlob for BlobErrorCode.
     */
    public static final BlobErrorCode OPERATION_NOT_ALLOWED_ON_INCREMENTAL_COPY_BLOB = fromString("OperationNotAllowedOnIncrementalCopyBlob");

    /**
     * Static value PendingCopyOperation for BlobErrorCode.
     */
    public static final BlobErrorCode PENDING_COPY_OPERATION = fromString("PendingCopyOperation");

    /**
     * Static value PreviousSnapshotCannotBeNewer for BlobErrorCode.
     */
    public static final BlobErrorCode PREVIOUS_SNAPSHOT_CANNOT_BE_NEWER = fromString("PreviousSnapshotCannotBeNewer");

    /**
     * Static value PreviousSnapshotNotFound for BlobErrorCode.
     */
    public static final BlobErrorCode PREVIOUS_SNAPSHOT_NOT_FOUND = fromString("PreviousSnapshotNotFound");

    /**
     * Static value PreviousSnapshotOperationNotSupported for BlobErrorCode.
     */
    public static final BlobErrorCode PREVIOUS_SNAPSHOT_OPERATION_NOT_SUPPORTED = fromString("PreviousSnapshotOperationNotSupported");

    /**
     * Static value SequenceNumberConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode SEQUENCE_NUMBER_CONDITION_NOT_MET = fromString("SequenceNumberConditionNotMet");

    /**
     * Static value SequenceNumberIncrementTooLarge for BlobErrorCode.
     */
    public static final BlobErrorCode SEQUENCE_NUMBER_INCREMENT_TOO_LARGE = fromString("SequenceNumberIncrementTooLarge");

    /**
     * Static value SnapshotCountExceeded for BlobErrorCode.
     */
    public static final BlobErrorCode SNAPSHOT_COUNT_EXCEEDED = fromString("SnapshotCountExceeded");

    /**
     * Static value SnaphotOperationRateExceeded for BlobErrorCode.
     */
    public static final BlobErrorCode SNAPHOT_OPERATION_RATE_EXCEEDED = fromString("SnaphotOperationRateExceeded");

    /**
     * Static value SnapshotsPresent for BlobErrorCode.
     */
    public static final BlobErrorCode SNAPSHOTS_PRESENT = fromString("SnapshotsPresent");

    /**
     * Static value SourceConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode SOURCE_CONDITION_NOT_MET = fromString("SourceConditionNotMet");

    /**
     * Static value SystemInUse for BlobErrorCode.
     */
    public static final BlobErrorCode SYSTEM_IN_USE = fromString("SystemInUse");

    /**
     * Static value TargetConditionNotMet for BlobErrorCode.
     */
    public static final BlobErrorCode TARGET_CONDITION_NOT_MET = fromString("TargetConditionNotMet");

    /**
     * Static value UnauthorizedBlobOverwrite for BlobErrorCode.
     */
    public static final BlobErrorCode UNAUTHORIZED_BLOB_OVERWRITE = fromString("UnauthorizedBlobOverwrite");

    /**
     * Static value BlobBeingRehydrated for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_BEING_REHYDRATED = fromString("BlobBeingRehydrated");

    /**
     * Static value BlobArchived for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_ARCHIVED = fromString("BlobArchived");

    /**
     * Static value BlobNotArchived for BlobErrorCode.
     */
    public static final BlobErrorCode BLOB_NOT_ARCHIVED = fromString("BlobNotArchived");

    /**
     * Static value AuthorizationSourceIPMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_SOURCE_IPMISMATCH = fromString("AuthorizationSourceIPMismatch");

    /**
     * Static value AuthorizationProtocolMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_PROTOCOL_MISMATCH = fromString("AuthorizationProtocolMismatch");

    /**
     * Static value AuthorizationPermissionMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_PERMISSION_MISMATCH = fromString("AuthorizationPermissionMismatch");

    /**
     * Static value AuthorizationServiceMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_SERVICE_MISMATCH = fromString("AuthorizationServiceMismatch");

    /**
     * Static value AuthorizationResourceTypeMismatch for BlobErrorCode.
     */
    public static final BlobErrorCode AUTHORIZATION_RESOURCE_TYPE_MISMATCH = fromString("AuthorizationResourceTypeMismatch");

    /**
     * Creates or finds a BlobErrorCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobErrorCode.
     */
    @JsonCreator
    public static BlobErrorCode fromString(String name) {
        return fromString(name, BlobErrorCode.class);
    }

    /**
     * @return known BlobErrorCode values.
     */
    public static Collection<BlobErrorCode> values() {
        return values(BlobErrorCode.class);
    }
}
