
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MimeContent" type="{http://schemas.microsoft.com/exchange/services/2006/types}MimeContentType" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="ItemClass" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemClassType" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sensitivity" type="{http://schemas.microsoft.com/exchange/services/2006/types}SensitivityChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttachmentsType" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="InReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSubmitted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFromMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsResend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUnmodified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternetMessageHeaders" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfInternetHeadersType" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ResponseObjects" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfResponseObjectsType" minOccurs="0"/&gt;
 *         &lt;element name="ReminderDueBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReminderIsSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReminderNextTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReminderMinutesBeforeStart" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReminderMinutesBeforeStartType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayCc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayBcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProperty" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Culture" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveRights" type="{http://schemas.microsoft.com/exchange/services/2006/types}EffectiveRightsType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebClientReadFormQueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebClientEditFormQueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConversationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueBody" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://schemas.microsoft.com/exchange/services/2006/types}FlagType" minOccurs="0"/&gt;
 *         &lt;element name="StoreEntryId" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="InstanceKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedBody" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/&gt;
 *         &lt;element name="EntityExtractionResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}EntityExtractionResultType" minOccurs="0"/&gt;
 *         &lt;element name="PolicyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionTagType" minOccurs="0"/&gt;
 *         &lt;element name="ArchiveTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionTagType" minOccurs="0"/&gt;
 *         &lt;element name="RetentionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RightsManagementLicenseData" type="{http://schemas.microsoft.com/exchange/services/2006/types}RightsManagementLicenseDataType" minOccurs="0"/&gt;
 *         &lt;element name="PredictedActionReasons" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPredictedActionReasonType" minOccurs="0"/&gt;
 *         &lt;element name="IsClutter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BlockStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBlockedImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TextBody" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/&gt;
 *         &lt;element name="IconIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}IconIndexType" minOccurs="0"/&gt;
 *         &lt;element name="SearchKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="SortKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Hashtags" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Mentions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="MentionedMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MentionsPreview" type="{http://schemas.microsoft.com/exchange/services/2006/types}MentionsPreviewType" minOccurs="0"/&gt;
 *         &lt;element name="MentionsEx" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMentionActionsType" minOccurs="0"/&gt;
 *         &lt;element name="AppliedHashtags" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAppliedHashtagType" minOccurs="0"/&gt;
 *         &lt;element name="AppliedHashtagsPreview" type="{http://schemas.microsoft.com/exchange/services/2006/types}AppliedHashtagsPreviewType" minOccurs="0"/&gt;
 *         &lt;element name="Likes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfLikeType" minOccurs="0"/&gt;
 *         &lt;element name="LikesPreview" type="{http://schemas.microsoft.com/exchange/services/2006/types}LikesPreviewType" minOccurs="0"/&gt;
 *         &lt;element name="PendingSocialActivityTagIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="AtAllMention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InferenceClassification" type="{http://schemas.microsoft.com/exchange/services/2006/types}InferenceClassificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "mimeContent",
    "itemId",
    "parentFolderId",
    "itemClass",
    "subject",
    "sensitivity",
    "body",
    "attachments",
    "dateTimeReceived",
    "size",
    "categories",
    "importance",
    "inReplyTo",
    "isSubmitted",
    "isDraft",
    "isFromMe",
    "isResend",
    "isUnmodified",
    "internetMessageHeaders",
    "dateTimeSent",
    "dateTimeCreated",
    "responseObjects",
    "reminderDueBy",
    "reminderIsSet",
    "reminderNextTime",
    "reminderMinutesBeforeStart",
    "displayCc",
    "displayTo",
    "displayBcc",
    "hasAttachments",
    "extendedProperty",
    "culture",
    "effectiveRights",
    "lastModifiedName",
    "lastModifiedTime",
    "isAssociated",
    "webClientReadFormQueryString",
    "webClientEditFormQueryString",
    "conversationId",
    "uniqueBody",
    "flag",
    "storeEntryId",
    "instanceKey",
    "normalizedBody",
    "entityExtractionResult",
    "policyTag",
    "archiveTag",
    "retentionDate",
    "preview",
    "rightsManagementLicenseData",
    "predictedActionReasons",
    "isClutter",
    "blockStatus",
    "hasBlockedImages",
    "textBody",
    "iconIndex",
    "searchKey",
    "sortKey",
    "hashtags",
    "mentions",
    "mentionedMe",
    "mentionsPreview",
    "mentionsEx",
    "appliedHashtags",
    "appliedHashtagsPreview",
    "likes",
    "likesPreview",
    "pendingSocialActivityTagIds",
    "atAllMention",
    "canDelete",
    "inferenceClassification"
})
@XmlSeeAlso({
    TaskType.class,
    PostItemType.class,
    CalendarItemType.class,
    RoleMemberItemType.class,
    NetworkItemType.class,
    AbchPersonItemType.class,
    ContactItemType.class,
    DistributionListType.class,
    MessageType.class,
    OneDriveItemType.class,
    FileItemType.class,
    DelveItemType.class
})
public class ItemType {

    @XmlElement(name = "MimeContent")
    protected MimeContentType mimeContent;
    @XmlElement(name = "ItemId")
    protected ItemIdType itemId;
    @XmlElement(name = "ParentFolderId")
    protected FolderIdType parentFolderId;
    @XmlElement(name = "ItemClass")
    protected String itemClass;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Sensitivity")
    @XmlSchemaType(name = "string")
    protected SensitivityChoicesType sensitivity;
    @XmlElement(name = "Body")
    protected BodyType body;
    @XmlElement(name = "Attachments")
    protected NonEmptyArrayOfAttachmentsType attachments;
    @XmlElement(name = "DateTimeReceived")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeReceived;
    @XmlElement(name = "Size")
    protected Integer size;
    @XmlElement(name = "Categories")
    protected ArrayOfStringsType categories;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType importance;
    @XmlElement(name = "InReplyTo")
    protected String inReplyTo;
    @XmlElement(name = "IsSubmitted")
    protected Boolean isSubmitted;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElement(name = "IsFromMe")
    protected Boolean isFromMe;
    @XmlElement(name = "IsResend")
    protected Boolean isResend;
    @XmlElement(name = "IsUnmodified")
    protected Boolean isUnmodified;
    @XmlElement(name = "InternetMessageHeaders")
    protected NonEmptyArrayOfInternetHeadersType internetMessageHeaders;
    @XmlElement(name = "DateTimeSent")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeSent;
    @XmlElement(name = "DateTimeCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeCreated;
    @XmlElement(name = "ResponseObjects")
    protected NonEmptyArrayOfResponseObjectsType responseObjects;
    @XmlElement(name = "ReminderDueBy")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderDueBy;
    @XmlElement(name = "ReminderIsSet")
    protected Boolean reminderIsSet;
    @XmlElement(name = "ReminderNextTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderNextTime;
    @XmlElement(name = "ReminderMinutesBeforeStart")
    @XmlSchemaType(name = "anySimpleType")
    protected String reminderMinutesBeforeStart;
    @XmlElement(name = "DisplayCc")
    protected String displayCc;
    @XmlElement(name = "DisplayTo")
    protected String displayTo;
    @XmlElement(name = "DisplayBcc")
    protected String displayBcc;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlElement(name = "ExtendedProperty")
    protected List<ExtendedPropertyType> extendedProperty;
    @XmlElement(name = "Culture")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String culture;
    @XmlElement(name = "EffectiveRights")
    protected EffectiveRightsType effectiveRights;
    @XmlElement(name = "LastModifiedName")
    protected String lastModifiedName;
    @XmlElement(name = "LastModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(name = "IsAssociated")
    protected Boolean isAssociated;
    @XmlElement(name = "WebClientReadFormQueryString")
    protected String webClientReadFormQueryString;
    @XmlElement(name = "WebClientEditFormQueryString")
    protected String webClientEditFormQueryString;
    @XmlElement(name = "ConversationId")
    protected ItemIdType conversationId;
    @XmlElement(name = "UniqueBody")
    protected BodyType uniqueBody;
    @XmlElement(name = "Flag")
    protected FlagType flag;
    @XmlElement(name = "StoreEntryId")
    protected byte[] storeEntryId;
    @XmlElement(name = "InstanceKey")
    protected byte[] instanceKey;
    @XmlElement(name = "NormalizedBody")
    protected BodyType normalizedBody;
    @XmlElement(name = "EntityExtractionResult")
    protected EntityExtractionResultType entityExtractionResult;
    @XmlElement(name = "PolicyTag")
    protected RetentionTagType policyTag;
    @XmlElement(name = "ArchiveTag")
    protected RetentionTagType archiveTag;
    @XmlElement(name = "RetentionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retentionDate;
    @XmlElement(name = "Preview")
    protected String preview;
    @XmlElement(name = "RightsManagementLicenseData")
    protected RightsManagementLicenseDataType rightsManagementLicenseData;
    @XmlElement(name = "PredictedActionReasons")
    protected NonEmptyArrayOfPredictedActionReasonType predictedActionReasons;
    @XmlElement(name = "IsClutter")
    protected Boolean isClutter;
    @XmlElement(name = "BlockStatus")
    protected Boolean blockStatus;
    @XmlElement(name = "HasBlockedImages")
    protected Boolean hasBlockedImages;
    @XmlElement(name = "TextBody")
    protected BodyType textBody;
    @XmlElement(name = "IconIndex")
    @XmlSchemaType(name = "string")
    protected IconIndexType iconIndex;
    @XmlElement(name = "SearchKey")
    protected byte[] searchKey;
    @XmlElement(name = "SortKey")
    protected Long sortKey;
    @XmlElement(name = "Hashtags")
    protected ArrayOfStringsType hashtags;
    @XmlElement(name = "Mentions")
    protected ArrayOfRecipientsType mentions;
    @XmlElement(name = "MentionedMe")
    protected Boolean mentionedMe;
    @XmlElement(name = "MentionsPreview")
    protected MentionsPreviewType mentionsPreview;
    @XmlElement(name = "MentionsEx")
    protected NonEmptyArrayOfMentionActionsType mentionsEx;
    @XmlElement(name = "AppliedHashtags")
    protected NonEmptyArrayOfAppliedHashtagType appliedHashtags;
    @XmlElement(name = "AppliedHashtagsPreview")
    protected AppliedHashtagsPreviewType appliedHashtagsPreview;
    @XmlElement(name = "Likes")
    protected NonEmptyArrayOfLikeType likes;
    @XmlElement(name = "LikesPreview")
    protected LikesPreviewType likesPreview;
    @XmlElement(name = "PendingSocialActivityTagIds")
    protected ArrayOfStringsType pendingSocialActivityTagIds;
    @XmlElement(name = "AtAllMention")
    protected Boolean atAllMention;
    @XmlElement(name = "CanDelete")
    protected Boolean canDelete;
    @XmlElement(name = "InferenceClassification")
    @XmlSchemaType(name = "string")
    protected InferenceClassificationType inferenceClassification;

    /**
     * Ruft den Wert der mimeContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MimeContentType }
     *     
     */
    public MimeContentType getMimeContent() {
        return mimeContent;
    }

    /**
     * Legt den Wert der mimeContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeContentType }
     *     
     */
    public void setMimeContent(MimeContentType value) {
        this.mimeContent = value;
    }

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der parentFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Legt den Wert der parentFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setParentFolderId(FolderIdType value) {
        this.parentFolderId = value;
    }

    /**
     * Ruft den Wert der itemClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * Legt den Wert der itemClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * Ruft den Wert der subject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Legt den Wert der subject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Ruft den Wert der sensitivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityChoicesType }
     *     
     */
    public SensitivityChoicesType getSensitivity() {
        return sensitivity;
    }

    /**
     * Legt den Wert der sensitivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityChoicesType }
     *     
     */
    public void setSensitivity(SensitivityChoicesType value) {
        this.sensitivity = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setBody(BodyType value) {
        this.body = value;
    }

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAttachmentsType }
     *     
     */
    public NonEmptyArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAttachmentsType }
     *     
     */
    public void setAttachments(NonEmptyArrayOfAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Ruft den Wert der dateTimeReceived-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeReceived() {
        return dateTimeReceived;
    }

    /**
     * Legt den Wert der dateTimeReceived-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeReceived(XMLGregorianCalendar value) {
        this.dateTimeReceived = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der categories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getCategories() {
        return categories;
    }

    /**
     * Legt den Wert der categories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setCategories(ArrayOfStringsType value) {
        this.categories = value;
    }

    /**
     * Ruft den Wert der importance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public ImportanceChoicesType getImportance() {
        return importance;
    }

    /**
     * Legt den Wert der importance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public void setImportance(ImportanceChoicesType value) {
        this.importance = value;
    }

    /**
     * Ruft den Wert der inReplyTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Legt den Wert der inReplyTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyTo(String value) {
        this.inReplyTo = value;
    }

    /**
     * Ruft den Wert der isSubmitted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubmitted() {
        return isSubmitted;
    }

    /**
     * Legt den Wert der isSubmitted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubmitted(Boolean value) {
        this.isSubmitted = value;
    }

    /**
     * Ruft den Wert der isDraft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDraft() {
        return isDraft;
    }

    /**
     * Legt den Wert der isDraft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    /**
     * Ruft den Wert der isFromMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFromMe() {
        return isFromMe;
    }

    /**
     * Legt den Wert der isFromMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFromMe(Boolean value) {
        this.isFromMe = value;
    }

    /**
     * Ruft den Wert der isResend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResend() {
        return isResend;
    }

    /**
     * Legt den Wert der isResend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResend(Boolean value) {
        this.isResend = value;
    }

    /**
     * Ruft den Wert der isUnmodified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnmodified() {
        return isUnmodified;
    }

    /**
     * Legt den Wert der isUnmodified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnmodified(Boolean value) {
        this.isUnmodified = value;
    }

    /**
     * Ruft den Wert der internetMessageHeaders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfInternetHeadersType }
     *     
     */
    public NonEmptyArrayOfInternetHeadersType getInternetMessageHeaders() {
        return internetMessageHeaders;
    }

    /**
     * Legt den Wert der internetMessageHeaders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfInternetHeadersType }
     *     
     */
    public void setInternetMessageHeaders(NonEmptyArrayOfInternetHeadersType value) {
        this.internetMessageHeaders = value;
    }

    /**
     * Ruft den Wert der dateTimeSent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeSent() {
        return dateTimeSent;
    }

    /**
     * Legt den Wert der dateTimeSent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeSent(XMLGregorianCalendar value) {
        this.dateTimeSent = value;
    }

    /**
     * Ruft den Wert der dateTimeCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeCreated() {
        return dateTimeCreated;
    }

    /**
     * Legt den Wert der dateTimeCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeCreated(XMLGregorianCalendar value) {
        this.dateTimeCreated = value;
    }

    /**
     * Ruft den Wert der responseObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfResponseObjectsType }
     *     
     */
    public NonEmptyArrayOfResponseObjectsType getResponseObjects() {
        return responseObjects;
    }

    /**
     * Legt den Wert der responseObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfResponseObjectsType }
     *     
     */
    public void setResponseObjects(NonEmptyArrayOfResponseObjectsType value) {
        this.responseObjects = value;
    }

    /**
     * Ruft den Wert der reminderDueBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderDueBy() {
        return reminderDueBy;
    }

    /**
     * Legt den Wert der reminderDueBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderDueBy(XMLGregorianCalendar value) {
        this.reminderDueBy = value;
    }

    /**
     * Ruft den Wert der reminderIsSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReminderIsSet() {
        return reminderIsSet;
    }

    /**
     * Legt den Wert der reminderIsSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReminderIsSet(Boolean value) {
        this.reminderIsSet = value;
    }

    /**
     * Ruft den Wert der reminderNextTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderNextTime() {
        return reminderNextTime;
    }

    /**
     * Legt den Wert der reminderNextTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderNextTime(XMLGregorianCalendar value) {
        this.reminderNextTime = value;
    }

    /**
     * Ruft den Wert der reminderMinutesBeforeStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderMinutesBeforeStart() {
        return reminderMinutesBeforeStart;
    }

    /**
     * Legt den Wert der reminderMinutesBeforeStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderMinutesBeforeStart(String value) {
        this.reminderMinutesBeforeStart = value;
    }

    /**
     * Ruft den Wert der displayCc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCc() {
        return displayCc;
    }

    /**
     * Legt den Wert der displayCc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCc(String value) {
        this.displayCc = value;
    }

    /**
     * Ruft den Wert der displayTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTo() {
        return displayTo;
    }

    /**
     * Legt den Wert der displayTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTo(String value) {
        this.displayTo = value;
    }

    /**
     * Ruft den Wert der displayBcc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayBcc() {
        return displayBcc;
    }

    /**
     * Legt den Wert der displayBcc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayBcc(String value) {
        this.displayBcc = value;
    }

    /**
     * Ruft den Wert der hasAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Legt den Wert der hasAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the extendedProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPropertyType }
     * 
     * 
     */
    public List<ExtendedPropertyType> getExtendedProperty() {
        if (extendedProperty == null) {
            extendedProperty = new ArrayList<ExtendedPropertyType>();
        }
        return this.extendedProperty;
    }

    /**
     * Ruft den Wert der culture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Legt den Wert der culture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * Ruft den Wert der effectiveRights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveRightsType }
     *     
     */
    public EffectiveRightsType getEffectiveRights() {
        return effectiveRights;
    }

    /**
     * Legt den Wert der effectiveRights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveRightsType }
     *     
     */
    public void setEffectiveRights(EffectiveRightsType value) {
        this.effectiveRights = value;
    }

    /**
     * Ruft den Wert der lastModifiedName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedName() {
        return lastModifiedName;
    }

    /**
     * Legt den Wert der lastModifiedName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedName(String value) {
        this.lastModifiedName = value;
    }

    /**
     * Ruft den Wert der lastModifiedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Legt den Wert der lastModifiedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Ruft den Wert der isAssociated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssociated() {
        return isAssociated;
    }

    /**
     * Legt den Wert der isAssociated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssociated(Boolean value) {
        this.isAssociated = value;
    }

    /**
     * Ruft den Wert der webClientReadFormQueryString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebClientReadFormQueryString() {
        return webClientReadFormQueryString;
    }

    /**
     * Legt den Wert der webClientReadFormQueryString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebClientReadFormQueryString(String value) {
        this.webClientReadFormQueryString = value;
    }

    /**
     * Ruft den Wert der webClientEditFormQueryString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebClientEditFormQueryString() {
        return webClientEditFormQueryString;
    }

    /**
     * Legt den Wert der webClientEditFormQueryString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebClientEditFormQueryString(String value) {
        this.webClientEditFormQueryString = value;
    }

    /**
     * Ruft den Wert der conversationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getConversationId() {
        return conversationId;
    }

    /**
     * Legt den Wert der conversationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setConversationId(ItemIdType value) {
        this.conversationId = value;
    }

    /**
     * Ruft den Wert der uniqueBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getUniqueBody() {
        return uniqueBody;
    }

    /**
     * Legt den Wert der uniqueBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setUniqueBody(BodyType value) {
        this.uniqueBody = value;
    }

    /**
     * Ruft den Wert der flag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlagType }
     *     
     */
    public FlagType getFlag() {
        return flag;
    }

    /**
     * Legt den Wert der flag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagType }
     *     
     */
    public void setFlag(FlagType value) {
        this.flag = value;
    }

    /**
     * Ruft den Wert der storeEntryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStoreEntryId() {
        return storeEntryId;
    }

    /**
     * Legt den Wert der storeEntryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStoreEntryId(byte[] value) {
        this.storeEntryId = value;
    }

    /**
     * Ruft den Wert der instanceKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInstanceKey() {
        return instanceKey;
    }

    /**
     * Legt den Wert der instanceKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInstanceKey(byte[] value) {
        this.instanceKey = value;
    }

    /**
     * Ruft den Wert der normalizedBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getNormalizedBody() {
        return normalizedBody;
    }

    /**
     * Legt den Wert der normalizedBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setNormalizedBody(BodyType value) {
        this.normalizedBody = value;
    }

    /**
     * Ruft den Wert der entityExtractionResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityExtractionResultType }
     *     
     */
    public EntityExtractionResultType getEntityExtractionResult() {
        return entityExtractionResult;
    }

    /**
     * Legt den Wert der entityExtractionResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExtractionResultType }
     *     
     */
    public void setEntityExtractionResult(EntityExtractionResultType value) {
        this.entityExtractionResult = value;
    }

    /**
     * Ruft den Wert der policyTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionTagType }
     *     
     */
    public RetentionTagType getPolicyTag() {
        return policyTag;
    }

    /**
     * Legt den Wert der policyTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionTagType }
     *     
     */
    public void setPolicyTag(RetentionTagType value) {
        this.policyTag = value;
    }

    /**
     * Ruft den Wert der archiveTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionTagType }
     *     
     */
    public RetentionTagType getArchiveTag() {
        return archiveTag;
    }

    /**
     * Legt den Wert der archiveTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionTagType }
     *     
     */
    public void setArchiveTag(RetentionTagType value) {
        this.archiveTag = value;
    }

    /**
     * Ruft den Wert der retentionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetentionDate() {
        return retentionDate;
    }

    /**
     * Legt den Wert der retentionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetentionDate(XMLGregorianCalendar value) {
        this.retentionDate = value;
    }

    /**
     * Ruft den Wert der preview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Legt den Wert der preview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreview(String value) {
        this.preview = value;
    }

    /**
     * Ruft den Wert der rightsManagementLicenseData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RightsManagementLicenseDataType }
     *     
     */
    public RightsManagementLicenseDataType getRightsManagementLicenseData() {
        return rightsManagementLicenseData;
    }

    /**
     * Legt den Wert der rightsManagementLicenseData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsManagementLicenseDataType }
     *     
     */
    public void setRightsManagementLicenseData(RightsManagementLicenseDataType value) {
        this.rightsManagementLicenseData = value;
    }

    /**
     * Ruft den Wert der predictedActionReasons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPredictedActionReasonType }
     *     
     */
    public NonEmptyArrayOfPredictedActionReasonType getPredictedActionReasons() {
        return predictedActionReasons;
    }

    /**
     * Legt den Wert der predictedActionReasons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPredictedActionReasonType }
     *     
     */
    public void setPredictedActionReasons(NonEmptyArrayOfPredictedActionReasonType value) {
        this.predictedActionReasons = value;
    }

    /**
     * Ruft den Wert der isClutter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClutter() {
        return isClutter;
    }

    /**
     * Legt den Wert der isClutter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClutter(Boolean value) {
        this.isClutter = value;
    }

    /**
     * Ruft den Wert der blockStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockStatus() {
        return blockStatus;
    }

    /**
     * Legt den Wert der blockStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockStatus(Boolean value) {
        this.blockStatus = value;
    }

    /**
     * Ruft den Wert der hasBlockedImages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBlockedImages() {
        return hasBlockedImages;
    }

    /**
     * Legt den Wert der hasBlockedImages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBlockedImages(Boolean value) {
        this.hasBlockedImages = value;
    }

    /**
     * Ruft den Wert der textBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getTextBody() {
        return textBody;
    }

    /**
     * Legt den Wert der textBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setTextBody(BodyType value) {
        this.textBody = value;
    }

    /**
     * Ruft den Wert der iconIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IconIndexType }
     *     
     */
    public IconIndexType getIconIndex() {
        return iconIndex;
    }

    /**
     * Legt den Wert der iconIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IconIndexType }
     *     
     */
    public void setIconIndex(IconIndexType value) {
        this.iconIndex = value;
    }

    /**
     * Ruft den Wert der searchKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSearchKey() {
        return searchKey;
    }

    /**
     * Legt den Wert der searchKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSearchKey(byte[] value) {
        this.searchKey = value;
    }

    /**
     * Ruft den Wert der sortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSortKey() {
        return sortKey;
    }

    /**
     * Legt den Wert der sortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSortKey(Long value) {
        this.sortKey = value;
    }

    /**
     * Ruft den Wert der hashtags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getHashtags() {
        return hashtags;
    }

    /**
     * Legt den Wert der hashtags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setHashtags(ArrayOfStringsType value) {
        this.hashtags = value;
    }

    /**
     * Ruft den Wert der mentions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getMentions() {
        return mentions;
    }

    /**
     * Legt den Wert der mentions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setMentions(ArrayOfRecipientsType value) {
        this.mentions = value;
    }

    /**
     * Ruft den Wert der mentionedMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMentionedMe() {
        return mentionedMe;
    }

    /**
     * Legt den Wert der mentionedMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMentionedMe(Boolean value) {
        this.mentionedMe = value;
    }

    /**
     * Ruft den Wert der mentionsPreview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MentionsPreviewType }
     *     
     */
    public MentionsPreviewType getMentionsPreview() {
        return mentionsPreview;
    }

    /**
     * Legt den Wert der mentionsPreview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MentionsPreviewType }
     *     
     */
    public void setMentionsPreview(MentionsPreviewType value) {
        this.mentionsPreview = value;
    }

    /**
     * Ruft den Wert der mentionsEx-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfMentionActionsType }
     *     
     */
    public NonEmptyArrayOfMentionActionsType getMentionsEx() {
        return mentionsEx;
    }

    /**
     * Legt den Wert der mentionsEx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfMentionActionsType }
     *     
     */
    public void setMentionsEx(NonEmptyArrayOfMentionActionsType value) {
        this.mentionsEx = value;
    }

    /**
     * Ruft den Wert der appliedHashtags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAppliedHashtagType }
     *     
     */
    public NonEmptyArrayOfAppliedHashtagType getAppliedHashtags() {
        return appliedHashtags;
    }

    /**
     * Legt den Wert der appliedHashtags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAppliedHashtagType }
     *     
     */
    public void setAppliedHashtags(NonEmptyArrayOfAppliedHashtagType value) {
        this.appliedHashtags = value;
    }

    /**
     * Ruft den Wert der appliedHashtagsPreview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AppliedHashtagsPreviewType }
     *     
     */
    public AppliedHashtagsPreviewType getAppliedHashtagsPreview() {
        return appliedHashtagsPreview;
    }

    /**
     * Legt den Wert der appliedHashtagsPreview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedHashtagsPreviewType }
     *     
     */
    public void setAppliedHashtagsPreview(AppliedHashtagsPreviewType value) {
        this.appliedHashtagsPreview = value;
    }

    /**
     * Ruft den Wert der likes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfLikeType }
     *     
     */
    public NonEmptyArrayOfLikeType getLikes() {
        return likes;
    }

    /**
     * Legt den Wert der likes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfLikeType }
     *     
     */
    public void setLikes(NonEmptyArrayOfLikeType value) {
        this.likes = value;
    }

    /**
     * Ruft den Wert der likesPreview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LikesPreviewType }
     *     
     */
    public LikesPreviewType getLikesPreview() {
        return likesPreview;
    }

    /**
     * Legt den Wert der likesPreview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LikesPreviewType }
     *     
     */
    public void setLikesPreview(LikesPreviewType value) {
        this.likesPreview = value;
    }

    /**
     * Ruft den Wert der pendingSocialActivityTagIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getPendingSocialActivityTagIds() {
        return pendingSocialActivityTagIds;
    }

    /**
     * Legt den Wert der pendingSocialActivityTagIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setPendingSocialActivityTagIds(ArrayOfStringsType value) {
        this.pendingSocialActivityTagIds = value;
    }

    /**
     * Ruft den Wert der atAllMention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtAllMention() {
        return atAllMention;
    }

    /**
     * Legt den Wert der atAllMention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtAllMention(Boolean value) {
        this.atAllMention = value;
    }

    /**
     * Ruft den Wert der canDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Legt den Wert der canDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDelete(Boolean value) {
        this.canDelete = value;
    }

    /**
     * Ruft den Wert der inferenceClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InferenceClassificationType }
     *     
     */
    public InferenceClassificationType getInferenceClassification() {
        return inferenceClassification;
    }

    /**
     * Legt den Wert der inferenceClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InferenceClassificationType }
     *     
     */
    public void setInferenceClassification(InferenceClassificationType value) {
        this.inferenceClassification = value;
    }

}
