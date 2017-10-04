
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessages" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfResponseMessagesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessages"
})
@XmlSeeAlso({
    UploadItemsResponseType.class,
    ExportItemsResponseType.class,
    FindFolderResponseType.class,
    DeleteFolderResponseType.class,
    EmptyFolderResponseType.class,
    CreateFolderResponseType.class,
    GetFolderResponseType.class,
    UpdateFolderResponseType.class,
    MoveFolderResponseType.class,
    CopyFolderResponseType.class,
    CreateFolderPathResponseType.class,
    SendItemResponseType.class,
    ApplyConversationActionResponseType.class,
    CreateAttachmentResponseType.class,
    DeleteAttachmentResponseType.class,
    GetAttachmentResponseType.class,
    CreateItemResponseType.class,
    UpdateItemResponseType.class,
    UpdateItemInRecoverableItemsResponseType.class,
    GetItemResponseType.class,
    MoveItemResponseType.class,
    CopyItemResponseType.class,
    DeleteItemResponseType.class,
    FindItemResponseType.class,
    ArchiveItemResponseType.class,
    GetClientAccessTokenResponseType.class,
    GetFocusedOtherOverridesResponseType.class,
    CreateOrUpdateFocusedOtherOverrideResponseType.class,
    DeleteFocusedOtherOverrideResponseType.class,
    ResolveNamesResponseType.class,
    ExpandDLResponseType.class,
    GetServerTimeZonesResponseType.class,
    CreateManagedFolderResponseType.class,
    SubscribeResponseType.class,
    UnsubscribeResponseType.class,
    GetEventsResponseType.class,
    GetStreamingEventsResponseType.class,
    SendNotificationResponseType.class,
    SyncFolderHierarchyResponseType.class,
    SyncFolderItemsResponseType.class,
    ConvertIdResponseType.class,
    CreateUserConfigurationResponseType.class,
    DeleteUserConfigurationResponseType.class,
    GetUserConfigurationResponseType.class,
    UpdateUserConfigurationResponseType.class,
    FindMailboxStatisticsByKeywordsResponseType.class,
    SearchMailboxesResponseType.class,
    MarkAllItemsAsReadResponseType.class,
    GetConversationItemsResponseType.class,
    MarkAsJunkResponseType.class,
    SetUserPhotoResponseMessageType.class,
    GetUserPhotoResponseType.class
})
public class BaseResponseMessageType {

    @XmlElement(name = "ResponseMessages", required = true)
    protected ArrayOfResponseMessagesType responseMessages;

    /**
     * Ruft den Wert der responseMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseMessagesType }
     *     
     */
    public ArrayOfResponseMessagesType getResponseMessages() {
        return responseMessages;
    }

    /**
     * Legt den Wert der responseMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseMessagesType }
     *     
     */
    public void setResponseMessages(ArrayOfResponseMessagesType value) {
        this.responseMessages = value;
    }

}
