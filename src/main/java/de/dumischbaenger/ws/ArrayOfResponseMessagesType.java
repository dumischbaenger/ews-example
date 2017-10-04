
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfResponseMessagesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseMessagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="CreateItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="DeleteItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}DeleteItemResponseMessageType"/&gt;
 *         &lt;element name="GetItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="UpdateItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UpdateItemResponseMessageType"/&gt;
 *         &lt;element name="UpdateItemInRecoverableItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UpdateItemInRecoverableItemsResponseMessageType"/&gt;
 *         &lt;element name="SendItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="DeleteFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="EmptyFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="CreateFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="GetFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="FindFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindFolderResponseMessageType"/&gt;
 *         &lt;element name="UpdateFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="MoveFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="CopyFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="CreateFolderPathResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="CreateAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}AttachmentInfoResponseMessageType"/&gt;
 *         &lt;element name="DeleteAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}DeleteAttachmentResponseMessageType"/&gt;
 *         &lt;element name="GetAttachmentResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}AttachmentInfoResponseMessageType"/&gt;
 *         &lt;element name="UploadItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}UploadItemsResponseMessageType"/&gt;
 *         &lt;element name="ExportItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ExportItemsResponseMessageType"/&gt;
 *         &lt;element name="MarkAllItemsAsReadResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="GetClientAccessTokenResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetClientAccessTokenResponseMessageType"/&gt;
 *         &lt;element name="GetAppManifestsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="SetClientExtensionResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="GetOMEConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="SetOMEConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="FindItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindItemResponseMessageType"/&gt;
 *         &lt;element name="MoveItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="ArchiveItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="CopyItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="ResolveNamesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResolveNamesResponseMessageType"/&gt;
 *         &lt;element name="ExpandDLResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ExpandDLResponseMessageType"/&gt;
 *         &lt;element name="GetServerTimeZonesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetServerTimeZonesResponseMessageType"/&gt;
 *         &lt;element name="GetEventsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetEventsResponseMessageType"/&gt;
 *         &lt;element name="GetStreamingEventsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetStreamingEventsResponseMessageType"/&gt;
 *         &lt;element name="SubscribeResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SubscribeResponseMessageType"/&gt;
 *         &lt;element name="UnsubscribeResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="SendNotificationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SendNotificationResponseMessageType"/&gt;
 *         &lt;element name="SyncFolderHierarchyResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SyncFolderHierarchyResponseMessageType"/&gt;
 *         &lt;element name="SyncFolderItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SyncFolderItemsResponseMessageType"/&gt;
 *         &lt;element name="CreateManagedFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FolderInfoResponseMessageType"/&gt;
 *         &lt;element name="ConvertIdResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ConvertIdResponseMessageType"/&gt;
 *         &lt;element name="GetSharingMetadataResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSharingMetadataResponseMessageType"/&gt;
 *         &lt;element name="RefreshSharingFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}RefreshSharingFolderResponseMessageType"/&gt;
 *         &lt;element name="GetSharingFolderResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSharingFolderResponseMessageType"/&gt;
 *         &lt;element name="CreateUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="DeleteUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="GetUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserConfigurationResponseMessageType"/&gt;
 *         &lt;element name="UpdateUserConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="GetRoomListsResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRoomListsResponseMessageType"/&gt;
 *         &lt;element name="GetRoomsResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRoomsResponseMessageType"/&gt;
 *         &lt;element name="GetRemindersResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetRemindersResponseMessageType"/&gt;
 *         &lt;element name="PerformReminderActionResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}PerformReminderActionResponseMessageType"/&gt;
 *         &lt;element name="ApplyConversationActionResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ApplyConversationActionResponseMessageType"/&gt;
 *         &lt;element name="FindMailboxStatisticsByKeywordsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindMailboxStatisticsByKeywordsResponseMessageType"/&gt;
 *         &lt;element name="GetSearchableMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetSearchableMailboxesResponseMessageType"/&gt;
 *         &lt;element name="SearchMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SearchMailboxesResponseMessageType"/&gt;
 *         &lt;element name="GetDiscoverySearchConfigurationResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetDiscoverySearchConfigurationResponseMessageType"/&gt;
 *         &lt;element name="GetHoldOnMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetHoldOnMailboxesResponseMessageType"/&gt;
 *         &lt;element name="SetHoldOnMailboxesResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SetHoldOnMailboxesResponseMessageType"/&gt;
 *         &lt;element name="GetNonIndexableItemStatisticsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetNonIndexableItemStatisticsResponseMessageType"/&gt;
 *         &lt;element name="GetNonIndexableItemDetailsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetNonIndexableItemDetailsResponseMessageType"/&gt;
 *         &lt;element name="FindPeopleResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindPeopleResponseMessageType"/&gt;
 *         &lt;element name="FindTagsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}FindTagsResponseMessageType"/&gt;
 *         &lt;element name="AddTagResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}AddTagResponseMessageType"/&gt;
 *         &lt;element name="HideTagResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}HideTagResponseMessageType"/&gt;
 *         &lt;element name="GetPasswordExpirationDateResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetPasswordExpirationDateResponseMessageType"/&gt;
 *         &lt;element name="GetPersonaResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetPersonaResponseMessageType"/&gt;
 *         &lt;element name="GetConversationItemsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetConversationItemsResponseMessageType"/&gt;
 *         &lt;element name="GetUserRetentionPolicyTagsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserRetentionPolicyTagsResponseMessageType"/&gt;
 *         &lt;element name="GetUserPhotoResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}GetUserPhotoResponseMessageType"/&gt;
 *         &lt;element name="MarkAsJunkResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}MarkAsJunkResponseMessageType"/&gt;
 *         &lt;element name="PostModernGroupItemResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"/&gt;
 *         &lt;element name="GetLastPrivateCatalogUpdateResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element name="GetPrivateCatalogAddInsResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseMessagesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage"
})
public class ArrayOfResponseMessagesType {

    @XmlElementRefs({
        @XmlElementRef(name = "CreateManagedFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetSharingMetadataResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarkAllItemsAsReadResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetServerTimeZonesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetPersonaResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeleteAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetPrivateCatalogAddInsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FindItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResolveNamesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExportItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeleteFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UploadItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExpandDLResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SyncFolderHierarchyResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetOMEConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreateUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetDiscoverySearchConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreateAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreateFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetRoomListsResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetAttachmentResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetSharingFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetRemindersResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SearchMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddTagResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetPasswordExpirationDateResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefreshSharingFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SendItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreateFolderPathResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetStreamingEventsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetUserPhotoResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PerformReminderActionResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetUserRetentionPolicyTagsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubscribeResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MoveItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArchiveItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetLastPrivateCatalogUpdateResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FindFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PostModernGroupItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ConvertIdResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SetHoldOnMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetNonIndexableItemStatisticsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UnsubscribeResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetClientAccessTokenResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetEventsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CopyFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FindMailboxStatisticsByKeywordsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ApplyConversationActionResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetRoomsResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetConversationItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HideTagResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CopyItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetNonIndexableItemDetailsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UpdateUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FindTagsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetSearchableMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetAppManifestsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SyncFolderItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SendNotificationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreateItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SetClientExtensionResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetHoldOnMailboxesResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarkAsJunkResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MoveFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeleteUserConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GetItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UpdateFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UpdateItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FindPeopleResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EmptyFolderResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SetOMEConfigurationResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeleteItemResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UpdateItemInRecoverableItemsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends ResponseMessageType>> createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage;

    /**
     * Gets the value of the createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSharingMetadataResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetServerTimeZonesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetPersonaResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteAttachmentResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindItemResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResolveNamesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExportItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UploadItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExpandDLResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderHierarchyResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetDiscoverySearchConfigurationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRoomListsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSharingFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRemindersResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddTagResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetPasswordExpirationDateResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link RefreshSharingFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetStreamingEventsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserPhotoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link PerformReminderActionResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserRetentionPolicyTagsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribeResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindFolderResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConvertIdResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetHoldOnMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetNonIndexableItemStatisticsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetClientAccessTokenResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetEventsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetUserConfigurationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindMailboxStatisticsByKeywordsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplyConversationActionResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetRoomsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetConversationItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link HideTagResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetNonIndexableItemDetailsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindTagsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSearchableMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderItemsResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SendNotificationResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetHoldOnMailboxesResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkAsJunkResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateItemResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FindPeopleResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteItemResponseMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateItemInRecoverableItemsResponseMessageType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ResponseMessageType>> getCreateItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage() {
        if (createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage == null) {
            createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage = new ArrayList<JAXBElement<? extends ResponseMessageType>>();
        }
        return this.createItemResponseMessageOrDeleteItemResponseMessageOrGetItemResponseMessage;
    }

}
