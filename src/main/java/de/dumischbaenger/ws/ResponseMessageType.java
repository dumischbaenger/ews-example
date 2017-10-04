
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für ResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCode" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DescriptiveLinkKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MessageXml" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseClass" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseClassType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "messageText",
    "responseCode",
    "descriptiveLinkKey",
    "messageXml"
})
@XmlSeeAlso({
    FindConversationResponseMessageType.class,
    PerformInstantSearchResponse.class,
    FindPeopleResponseMessageType.class,
    FindTagsResponseMessageType.class,
    AddTagResponseMessageType.class,
    HideTagResponseMessageType.class,
    GetPersonaResponseMessageType.class,
    GetPasswordExpirationDateResponseMessageType.class,
    GetMailTipsResponseMessageType.class,
    PlayOnPhoneResponseMessageType.class,
    GetPhoneCallInformationResponseMessageType.class,
    DisconnectPhoneCallResponseMessageType.class,
    GetSharingMetadataResponseMessageType.class,
    RefreshSharingFolderResponseMessageType.class,
    GetSharingFolderResponseMessageType.class,
    SetTeamMailboxResponseMessageType.class,
    UnpinTeamMailboxResponseMessageType.class,
    GetRoomListsResponseMessageType.class,
    GetRoomsResponseMessageType.class,
    GetRemindersResponseMessageType.class,
    PerformReminderActionResponseMessageType.class,
    GetServiceConfigurationResponseMessageType.class,
    FindMessageTrackingReportResponseMessageType.class,
    GetMessageTrackingReportResponseMessageType.class,
    GetInboxRulesResponseType.class,
    UpdateInboxRulesResponseType.class,
    GetSearchableMailboxesResponseMessageType.class,
    GetDiscoverySearchConfigurationResponseMessageType.class,
    GetHoldOnMailboxesResponseMessageType.class,
    SetHoldOnMailboxesResponseMessageType.class,
    GetNonIndexableItemStatisticsResponseMessageType.class,
    GetNonIndexableItemDetailsResponseMessageType.class,
    OMEConfigurationResponseType.class,
    SetOMEConfigurationResponseType.class,
    GetAppManifestsResponseType.class,
    GetAppMarketplaceUrlResponseMessageType.class,
    InstallAppResponseType.class,
    UninstallAppResponseType.class,
    DisableAppResponseType.class,
    AddNewImContactToGroupResponseMessageType.class,
    AddNewTelUriContactToGroupResponseMessageType.class,
    AddImContactToGroupResponseMessageType.class,
    RemoveImContactFromGroupResponseMessageType.class,
    AddImGroupResponseMessageType.class,
    AddDistributionGroupToImListResponseMessageType.class,
    GetImItemListResponseMessageType.class,
    GetImItemsResponseMessageType.class,
    RemoveContactFromImListResponseMessageType.class,
    RemoveDistributionGroupFromImListResponseMessageType.class,
    RemoveImGroupResponseMessageType.class,
    SetImGroupResponseMessageType.class,
    SetImListMigrationCompletedResponseMessageType.class,
    GetUserRetentionPolicyTagsResponseMessageType.class,
    GetUserPhotoResponseMessageType.class,
    GetMeetingSpaceResponseMessageType.class,
    CreateMeetingSpaceResponseMessageType.class,
    UpdateMeetingSpaceResponseMessageType.class,
    FindMeetingSpaceByJoinUrlResponseMessageType.class,
    DeleteMeetingSpaceResponseMessageType.class,
    GetMeetingInstanceResponseMessageType.class,
    CreateMeetingInstanceResponseMessageType.class,
    UpdateMeetingInstanceResponseMessageType.class,
    DeleteMeetingInstanceResponseMessageType.class,
    RegisterConsentResponseMessageType.class,
    FindAvailableMeetingTimesResponseMessageType.class,
    FindMeetingTimeCandidatesResponseMessageType.class,
    StartSearchSessionResponseMessage.class,
    GetSearchSuggestionsResponseMessage.class,
    DeleteSearchSuggestionResponseMessageType.class,
    ExecuteSearchResponseMessage.class,
    EndSearchSessionResponseMessage.class,
    GetLastPrivateCatalogUpdateResponseType.class,
    GetPrivateCatalogAddInsResponseType.class,
    UploadItemsResponseMessageType.class,
    ExportItemsResponseMessageType.class,
    FolderInfoResponseMessageType.class,
    FindFolderResponseMessageType.class,
    ItemInfoResponseMessageType.class,
    AttachmentInfoResponseMessageType.class,
    DeleteAttachmentResponseMessageType.class,
    ApplyConversationActionResponseMessageType.class,
    DeleteItemResponseMessageType.class,
    FindItemResponseMessageType.class,
    GetClientAccessTokenResponseMessageType.class,
    ResolveNamesResponseMessageType.class,
    MailTipsResponseMessageType.class,
    ExpandDLResponseMessageType.class,
    GetServerTimeZonesResponseMessageType.class,
    SubscribeResponseMessageType.class,
    GetEventsResponseMessageType.class,
    GetStreamingEventsResponseMessageType.class,
    SendNotificationResponseMessageType.class,
    SyncFolderHierarchyResponseMessageType.class,
    SyncFolderItemsResponseMessageType.class,
    ConvertIdResponseMessageType.class,
    DelegateUserResponseMessageType.class,
    BaseDelegateResponseMessageType.class,
    GetUserConfigurationResponseMessageType.class,
    ServiceConfigurationResponseMessageType.class,
    FindMailboxStatisticsByKeywordsResponseMessageType.class,
    SearchMailboxesResponseMessageType.class,
    GetConversationItemsResponseMessageType.class,
    MarkAsJunkResponseMessageType.class
})
public class ResponseMessageType {

    @XmlElement(name = "MessageText")
    protected String messageText;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "DescriptiveLinkKey")
    protected Integer descriptiveLinkKey;
    @XmlElement(name = "MessageXml")
    protected ResponseMessageType.MessageXml messageXml;
    @XmlAttribute(name = "ResponseClass", required = true)
    protected ResponseClassType responseClass;

    /**
     * Ruft den Wert der messageText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Legt den Wert der messageText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Ruft den Wert der responseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Legt den Wert der responseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Ruft den Wert der descriptiveLinkKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDescriptiveLinkKey() {
        return descriptiveLinkKey;
    }

    /**
     * Legt den Wert der descriptiveLinkKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDescriptiveLinkKey(Integer value) {
        this.descriptiveLinkKey = value;
    }

    /**
     * Ruft den Wert der messageXml-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType.MessageXml }
     *     
     */
    public ResponseMessageType.MessageXml getMessageXml() {
        return messageXml;
    }

    /**
     * Legt den Wert der messageXml-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType.MessageXml }
     *     
     */
    public void setMessageXml(ResponseMessageType.MessageXml value) {
        this.messageXml = value;
    }

    /**
     * Ruft den Wert der responseClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClassType }
     *     
     */
    public ResponseClassType getResponseClass() {
        return responseClass;
    }

    /**
     * Legt den Wert der responseClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClassType }
     *     
     */
    public void setResponseClass(ResponseClassType value) {
        this.responseClass = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class MessageXml {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
