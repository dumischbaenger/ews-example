
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ConversationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConversationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConversationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="ConversationTopic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalUniqueRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueUnreadSenders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalUniqueUnreadSenders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueSenders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalUniqueSenders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="LastDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLastDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalCategories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="FlagStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}FlagStatusType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalFlagStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}FlagStatusType" minOccurs="0"/&gt;
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GlobalHasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GlobalMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnreadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GlobalUnreadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GlobalSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemClasses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfItemClassType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalItemClasses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfItemClassType" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalImportance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InstanceKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailboxScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType" minOccurs="0"/&gt;
 *         &lt;element name="IconIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}IconIndexType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalIconIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}IconIndexType" minOccurs="0"/&gt;
 *         &lt;element name="DraftItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType" minOccurs="0"/&gt;
 *         &lt;element name="HasIrm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GlobalHasIrm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InferenceClassification" type="{http://schemas.microsoft.com/exchange/services/2006/types}InferenceClassificationType" minOccurs="0"/&gt;
 *         &lt;element name="SortKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MentionedMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GlobalMentionedMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderSMTPAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="MailboxGuids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="From" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="AtAllMention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAtAllMention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationType", propOrder = {
    "conversationId",
    "conversationTopic",
    "uniqueRecipients",
    "globalUniqueRecipients",
    "uniqueUnreadSenders",
    "globalUniqueUnreadSenders",
    "uniqueSenders",
    "globalUniqueSenders",
    "lastDeliveryTime",
    "globalLastDeliveryTime",
    "categories",
    "globalCategories",
    "flagStatus",
    "globalFlagStatus",
    "hasAttachments",
    "globalHasAttachments",
    "messageCount",
    "globalMessageCount",
    "unreadCount",
    "globalUnreadCount",
    "size",
    "globalSize",
    "itemClasses",
    "globalItemClasses",
    "importance",
    "globalImportance",
    "itemIds",
    "globalItemIds",
    "lastModifiedTime",
    "instanceKey",
    "preview",
    "mailboxScope",
    "iconIndex",
    "globalIconIndex",
    "draftItemIds",
    "hasIrm",
    "globalHasIrm",
    "inferenceClassification",
    "sortKey",
    "mentionedMe",
    "globalMentionedMe",
    "senderSMTPAddress",
    "mailboxGuids",
    "from",
    "atAllMention",
    "globalAtAllMention"
})
public class ConversationType {

    @XmlElement(name = "ConversationId")
    protected ItemIdType conversationId;
    @XmlElement(name = "ConversationTopic")
    protected String conversationTopic;
    @XmlElement(name = "UniqueRecipients")
    protected ArrayOfStringsType uniqueRecipients;
    @XmlElement(name = "GlobalUniqueRecipients")
    protected ArrayOfStringsType globalUniqueRecipients;
    @XmlElement(name = "UniqueUnreadSenders")
    protected ArrayOfStringsType uniqueUnreadSenders;
    @XmlElement(name = "GlobalUniqueUnreadSenders")
    protected ArrayOfStringsType globalUniqueUnreadSenders;
    @XmlElement(name = "UniqueSenders")
    protected ArrayOfStringsType uniqueSenders;
    @XmlElement(name = "GlobalUniqueSenders")
    protected ArrayOfStringsType globalUniqueSenders;
    @XmlElement(name = "LastDeliveryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDeliveryTime;
    @XmlElement(name = "GlobalLastDeliveryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar globalLastDeliveryTime;
    @XmlElement(name = "Categories")
    protected ArrayOfStringsType categories;
    @XmlElement(name = "GlobalCategories")
    protected ArrayOfStringsType globalCategories;
    @XmlElement(name = "FlagStatus")
    @XmlSchemaType(name = "string")
    protected FlagStatusType flagStatus;
    @XmlElement(name = "GlobalFlagStatus")
    @XmlSchemaType(name = "string")
    protected FlagStatusType globalFlagStatus;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlElement(name = "GlobalHasAttachments")
    protected Boolean globalHasAttachments;
    @XmlElement(name = "MessageCount")
    protected Integer messageCount;
    @XmlElement(name = "GlobalMessageCount")
    protected Integer globalMessageCount;
    @XmlElement(name = "UnreadCount")
    protected Integer unreadCount;
    @XmlElement(name = "GlobalUnreadCount")
    protected Integer globalUnreadCount;
    @XmlElement(name = "Size")
    protected Integer size;
    @XmlElement(name = "GlobalSize")
    protected Integer globalSize;
    @XmlElement(name = "ItemClasses")
    protected ArrayOfItemClassType itemClasses;
    @XmlElement(name = "GlobalItemClasses")
    protected ArrayOfItemClassType globalItemClasses;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType importance;
    @XmlElement(name = "GlobalImportance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType globalImportance;
    @XmlElement(name = "ItemIds")
    protected NonEmptyArrayOfBaseItemIdsType itemIds;
    @XmlElement(name = "GlobalItemIds")
    protected NonEmptyArrayOfBaseItemIdsType globalItemIds;
    @XmlElement(name = "LastModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(name = "InstanceKey")
    protected byte[] instanceKey;
    @XmlElement(name = "Preview")
    protected String preview;
    @XmlElement(name = "MailboxScope")
    @XmlSchemaType(name = "string")
    protected MailboxSearchLocationType mailboxScope;
    @XmlElement(name = "IconIndex")
    @XmlSchemaType(name = "string")
    protected IconIndexType iconIndex;
    @XmlElement(name = "GlobalIconIndex")
    @XmlSchemaType(name = "string")
    protected IconIndexType globalIconIndex;
    @XmlElement(name = "DraftItemIds")
    protected NonEmptyArrayOfBaseItemIdsType draftItemIds;
    @XmlElement(name = "HasIrm")
    protected Boolean hasIrm;
    @XmlElement(name = "GlobalHasIrm")
    protected Boolean globalHasIrm;
    @XmlElement(name = "InferenceClassification")
    @XmlSchemaType(name = "string")
    protected InferenceClassificationType inferenceClassification;
    @XmlElement(name = "SortKey")
    protected Long sortKey;
    @XmlElement(name = "MentionedMe")
    protected Boolean mentionedMe;
    @XmlElement(name = "GlobalMentionedMe")
    protected Boolean globalMentionedMe;
    @XmlElement(name = "SenderSMTPAddress")
    protected SmtpAddressType senderSMTPAddress;
    @XmlElement(name = "MailboxGuids")
    protected ConversationType.MailboxGuids mailboxGuids;
    @XmlElement(name = "From")
    protected SingleRecipientType from;
    @XmlElement(name = "AtAllMention")
    protected Boolean atAllMention;
    @XmlElement(name = "GlobalAtAllMention")
    protected Boolean globalAtAllMention;

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
     * Ruft den Wert der conversationTopic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationTopic() {
        return conversationTopic;
    }

    /**
     * Legt den Wert der conversationTopic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationTopic(String value) {
        this.conversationTopic = value;
    }

    /**
     * Ruft den Wert der uniqueRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getUniqueRecipients() {
        return uniqueRecipients;
    }

    /**
     * Legt den Wert der uniqueRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setUniqueRecipients(ArrayOfStringsType value) {
        this.uniqueRecipients = value;
    }

    /**
     * Ruft den Wert der globalUniqueRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getGlobalUniqueRecipients() {
        return globalUniqueRecipients;
    }

    /**
     * Legt den Wert der globalUniqueRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setGlobalUniqueRecipients(ArrayOfStringsType value) {
        this.globalUniqueRecipients = value;
    }

    /**
     * Ruft den Wert der uniqueUnreadSenders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getUniqueUnreadSenders() {
        return uniqueUnreadSenders;
    }

    /**
     * Legt den Wert der uniqueUnreadSenders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setUniqueUnreadSenders(ArrayOfStringsType value) {
        this.uniqueUnreadSenders = value;
    }

    /**
     * Ruft den Wert der globalUniqueUnreadSenders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getGlobalUniqueUnreadSenders() {
        return globalUniqueUnreadSenders;
    }

    /**
     * Legt den Wert der globalUniqueUnreadSenders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setGlobalUniqueUnreadSenders(ArrayOfStringsType value) {
        this.globalUniqueUnreadSenders = value;
    }

    /**
     * Ruft den Wert der uniqueSenders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getUniqueSenders() {
        return uniqueSenders;
    }

    /**
     * Legt den Wert der uniqueSenders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setUniqueSenders(ArrayOfStringsType value) {
        this.uniqueSenders = value;
    }

    /**
     * Ruft den Wert der globalUniqueSenders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getGlobalUniqueSenders() {
        return globalUniqueSenders;
    }

    /**
     * Legt den Wert der globalUniqueSenders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setGlobalUniqueSenders(ArrayOfStringsType value) {
        this.globalUniqueSenders = value;
    }

    /**
     * Ruft den Wert der lastDeliveryTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDeliveryTime() {
        return lastDeliveryTime;
    }

    /**
     * Legt den Wert der lastDeliveryTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDeliveryTime(XMLGregorianCalendar value) {
        this.lastDeliveryTime = value;
    }

    /**
     * Ruft den Wert der globalLastDeliveryTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGlobalLastDeliveryTime() {
        return globalLastDeliveryTime;
    }

    /**
     * Legt den Wert der globalLastDeliveryTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGlobalLastDeliveryTime(XMLGregorianCalendar value) {
        this.globalLastDeliveryTime = value;
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
     * Ruft den Wert der globalCategories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getGlobalCategories() {
        return globalCategories;
    }

    /**
     * Legt den Wert der globalCategories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setGlobalCategories(ArrayOfStringsType value) {
        this.globalCategories = value;
    }

    /**
     * Ruft den Wert der flagStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlagStatusType }
     *     
     */
    public FlagStatusType getFlagStatus() {
        return flagStatus;
    }

    /**
     * Legt den Wert der flagStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagStatusType }
     *     
     */
    public void setFlagStatus(FlagStatusType value) {
        this.flagStatus = value;
    }

    /**
     * Ruft den Wert der globalFlagStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlagStatusType }
     *     
     */
    public FlagStatusType getGlobalFlagStatus() {
        return globalFlagStatus;
    }

    /**
     * Legt den Wert der globalFlagStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagStatusType }
     *     
     */
    public void setGlobalFlagStatus(FlagStatusType value) {
        this.globalFlagStatus = value;
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
     * Ruft den Wert der globalHasAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalHasAttachments() {
        return globalHasAttachments;
    }

    /**
     * Legt den Wert der globalHasAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalHasAttachments(Boolean value) {
        this.globalHasAttachments = value;
    }

    /**
     * Ruft den Wert der messageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Legt den Wert der messageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageCount(Integer value) {
        this.messageCount = value;
    }

    /**
     * Ruft den Wert der globalMessageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalMessageCount() {
        return globalMessageCount;
    }

    /**
     * Legt den Wert der globalMessageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalMessageCount(Integer value) {
        this.globalMessageCount = value;
    }

    /**
     * Ruft den Wert der unreadCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     * Legt den Wert der unreadCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnreadCount(Integer value) {
        this.unreadCount = value;
    }

    /**
     * Ruft den Wert der globalUnreadCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalUnreadCount() {
        return globalUnreadCount;
    }

    /**
     * Legt den Wert der globalUnreadCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalUnreadCount(Integer value) {
        this.globalUnreadCount = value;
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
     * Ruft den Wert der globalSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalSize() {
        return globalSize;
    }

    /**
     * Legt den Wert der globalSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalSize(Integer value) {
        this.globalSize = value;
    }

    /**
     * Ruft den Wert der itemClasses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemClassType }
     *     
     */
    public ArrayOfItemClassType getItemClasses() {
        return itemClasses;
    }

    /**
     * Legt den Wert der itemClasses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemClassType }
     *     
     */
    public void setItemClasses(ArrayOfItemClassType value) {
        this.itemClasses = value;
    }

    /**
     * Ruft den Wert der globalItemClasses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemClassType }
     *     
     */
    public ArrayOfItemClassType getGlobalItemClasses() {
        return globalItemClasses;
    }

    /**
     * Legt den Wert der globalItemClasses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemClassType }
     *     
     */
    public void setGlobalItemClasses(ArrayOfItemClassType value) {
        this.globalItemClasses = value;
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
     * Ruft den Wert der globalImportance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public ImportanceChoicesType getGlobalImportance() {
        return globalImportance;
    }

    /**
     * Legt den Wert der globalImportance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public void setGlobalImportance(ImportanceChoicesType value) {
        this.globalImportance = value;
    }

    /**
     * Ruft den Wert der itemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Legt den Wert der itemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }

    /**
     * Ruft den Wert der globalItemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getGlobalItemIds() {
        return globalItemIds;
    }

    /**
     * Legt den Wert der globalItemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setGlobalItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.globalItemIds = value;
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
     * Ruft den Wert der mailboxScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getMailboxScope() {
        return mailboxScope;
    }

    /**
     * Legt den Wert der mailboxScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setMailboxScope(MailboxSearchLocationType value) {
        this.mailboxScope = value;
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
     * Ruft den Wert der globalIconIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IconIndexType }
     *     
     */
    public IconIndexType getGlobalIconIndex() {
        return globalIconIndex;
    }

    /**
     * Legt den Wert der globalIconIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IconIndexType }
     *     
     */
    public void setGlobalIconIndex(IconIndexType value) {
        this.globalIconIndex = value;
    }

    /**
     * Ruft den Wert der draftItemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getDraftItemIds() {
        return draftItemIds;
    }

    /**
     * Legt den Wert der draftItemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setDraftItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.draftItemIds = value;
    }

    /**
     * Ruft den Wert der hasIrm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIrm() {
        return hasIrm;
    }

    /**
     * Legt den Wert der hasIrm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIrm(Boolean value) {
        this.hasIrm = value;
    }

    /**
     * Ruft den Wert der globalHasIrm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalHasIrm() {
        return globalHasIrm;
    }

    /**
     * Legt den Wert der globalHasIrm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalHasIrm(Boolean value) {
        this.globalHasIrm = value;
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
     * Ruft den Wert der globalMentionedMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalMentionedMe() {
        return globalMentionedMe;
    }

    /**
     * Legt den Wert der globalMentionedMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalMentionedMe(Boolean value) {
        this.globalMentionedMe = value;
    }

    /**
     * Ruft den Wert der senderSMTPAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpAddressType }
     *     
     */
    public SmtpAddressType getSenderSMTPAddress() {
        return senderSMTPAddress;
    }

    /**
     * Legt den Wert der senderSMTPAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpAddressType }
     *     
     */
    public void setSenderSMTPAddress(SmtpAddressType value) {
        this.senderSMTPAddress = value;
    }

    /**
     * Ruft den Wert der mailboxGuids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationType.MailboxGuids }
     *     
     */
    public ConversationType.MailboxGuids getMailboxGuids() {
        return mailboxGuids;
    }

    /**
     * Legt den Wert der mailboxGuids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationType.MailboxGuids }
     *     
     */
    public void setMailboxGuids(ConversationType.MailboxGuids value) {
        this.mailboxGuids = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setFrom(SingleRecipientType value) {
        this.from = value;
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
     * Ruft den Wert der globalAtAllMention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalAtAllMention() {
        return globalAtAllMention;
    }

    /**
     * Legt den Wert der globalAtAllMention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalAtAllMention(Boolean value) {
        this.globalAtAllMention = value;
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
     *         &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" maxOccurs="unbounded"/&gt;
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
        "mailboxGuid"
    })
    public static class MailboxGuids {

        @XmlElement(name = "MailboxGuid", required = true)
        protected List<String> mailboxGuid;

        /**
         * Gets the value of the mailboxGuid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mailboxGuid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMailboxGuid().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMailboxGuid() {
            if (mailboxGuid == null) {
                mailboxGuid = new ArrayList<String>();
            }
            return this.mailboxGuid;
        }

    }

}
