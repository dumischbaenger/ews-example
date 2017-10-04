
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages")
@XmlSeeAlso({
    GetFolderType.class,
    UploadItemsType.class,
    ExportItemsType.class,
    CreateFolderType.class,
    FindFolderType.class,
    DeleteFolderType.class,
    EmptyFolderType.class,
    UpdateFolderType.class,
    CreateFolderPathType.class,
    GetItemType.class,
    CreateItemType.class,
    UpdateItemType.class,
    UpdateItemInRecoverableItemsType.class,
    DeleteItemType.class,
    ArchiveItemType.class,
    SendItemType.class,
    FindItemType.class,
    FindConversationType.class,
    PerformInstantSearchRequest.class,
    EndInstantSearchSessionRequest.class,
    ApplyConversationActionType.class,
    FindPeopleType.class,
    FindTagsType.class,
    AddTagType.class,
    HideTagType.class,
    GetPersonaType.class,
    CreateAttachmentType.class,
    DeleteAttachmentType.class,
    GetAttachmentType.class,
    GetClientAccessTokenType.class,
    GetFocusedOtherOverridesRequestType.class,
    CreateOrUpdateFocusedOtherOverrideRequestType.class,
    DeleteFocusedOtherOverrideRequestType.class,
    ResolveNamesType.class,
    GetPasswordExpirationDateType.class,
    GetMailTipsType.class,
    PlayOnPhoneType.class,
    GetPhoneCallInformationType.class,
    DisconnectPhoneCallType.class,
    ExpandDLType.class,
    GetServerTimeZonesType.class,
    CreateManagedFolderRequestType.class,
    SubscribeType.class,
    UnsubscribeType.class,
    GetEventsType.class,
    GetStreamingEventsType.class,
    SyncFolderHierarchyType.class,
    SyncFolderItemsType.class,
    GetUserAvailabilityRequestType.class,
    GetUserOofSettingsRequest.class,
    SetUserOofSettingsRequest.class,
    ConvertIdType.class,
    GetSharingMetadataType.class,
    RefreshSharingFolderType.class,
    GetSharingFolderType.class,
    CreateUserConfigurationType.class,
    DeleteUserConfigurationType.class,
    GetUserConfigurationType.class,
    UpdateUserConfigurationType.class,
    SetTeamMailboxRequestType.class,
    UnpinTeamMailboxRequestType.class,
    GetRoomListsType.class,
    GetRoomsType.class,
    GetRemindersType.class,
    PerformReminderActionType.class,
    GetServiceConfigurationType.class,
    FindMessageTrackingReportRequestType.class,
    GetMessageTrackingReportRequestType.class,
    GetInboxRulesRequestType.class,
    UpdateInboxRulesRequestType.class,
    FindMailboxStatisticsByKeywordsType.class,
    GetSearchableMailboxesType.class,
    SearchMailboxesType.class,
    GetDiscoverySearchConfigurationType.class,
    GetHoldOnMailboxesType.class,
    SetHoldOnMailboxesType.class,
    GetNonIndexableItemStatisticsType.class,
    GetNonIndexableItemDetailsType.class,
    MarkAllItemsAsReadType.class,
    GetConversationItemsType.class,
    GetOMEConfigurationType.class,
    SetOMEConfigurationType.class,
    GetAppManifestsType.class,
    GetAppMarketplaceUrlType.class,
    MarkAsJunkType.class,
    InstallAppType.class,
    UninstallAppType.class,
    DisableAppType.class,
    AddNewImContactToGroupType.class,
    AddNewTelUriContactToGroupType.class,
    AddImContactToGroupType.class,
    RemoveImContactFromGroupType.class,
    AddImGroupType.class,
    AddDistributionGroupToImListType.class,
    GetImItemListType.class,
    GetImItemsType.class,
    RemoveContactFromImListType.class,
    RemoveDistributionGroupFromImListType.class,
    RemoveImGroupType.class,
    SetImGroupType.class,
    SetImListMigrationCompletedType.class,
    GetUserRetentionPolicyTagsType.class,
    GetUserPhotoType.class,
    GetMeetingSpaceType.class,
    CreateMeetingSpaceType.class,
    UpdateMeetingSpaceType.class,
    FindMeetingSpaceByJoinUrlType.class,
    DeleteMeetingSpaceType.class,
    GetMeetingInstanceRequestType.class,
    CreateMeetingInstanceRequestType.class,
    UpdateMeetingInstanceRequestType.class,
    DeleteMeetingInstanceRequestType.class,
    SetUserPhotoType.class,
    RegisterConsentType.class,
    FindAvailableMeetingTimesType.class,
    FindMeetingTimeCandidatesType.class,
    StartSearchSession.class,
    GetSearchSuggestions.class,
    DeleteSearchSuggestion.class,
    ExecuteSearch.class,
    EndSearchSession.class,
    GetLastPrivateCatalogUpdateType.class,
    GetPrivateCatalogAddInsType.class,
    BaseMoveCopyFolderType.class,
    BaseMoveCopyItemType.class,
    BaseDelegateType.class
})
public abstract class BaseRequestType {


}
