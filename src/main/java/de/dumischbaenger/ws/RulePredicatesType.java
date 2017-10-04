
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Rule predicates, used as rule conditions or exceptions
 * 
 * <p>Java-Klasse für RulePredicatesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RulePredicatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Categories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsBodyStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsHeaderStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsRecipientStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsSenderStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsSubjectOrBodyStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContainsSubjectStrings" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="FlaggedForAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}FlaggedForActionType" minOccurs="0"/&gt;
 *         &lt;element name="FromAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="FromConnectedAccounts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="IsApprovalRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAutomaticForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAutomaticReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMeetingRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMeetingResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNDR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPermissionControlled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReadReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoicemail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemClasses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="MessageClassifications" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="NotSentToMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SentCcMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SentOnlyToMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SentToAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="SentToMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SentToOrCcMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sensitivity" type="{http://schemas.microsoft.com/exchange/services/2006/types}SensitivityChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="WithinDateRange" type="{http://schemas.microsoft.com/exchange/services/2006/types}RulePredicateDateRangeType" minOccurs="0"/&gt;
 *         &lt;element name="WithinSizeRange" type="{http://schemas.microsoft.com/exchange/services/2006/types}RulePredicateSizeRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RulePredicatesType", propOrder = {
    "categories",
    "containsBodyStrings",
    "containsHeaderStrings",
    "containsRecipientStrings",
    "containsSenderStrings",
    "containsSubjectOrBodyStrings",
    "containsSubjectStrings",
    "flaggedForAction",
    "fromAddresses",
    "fromConnectedAccounts",
    "hasAttachments",
    "importance",
    "isApprovalRequest",
    "isAutomaticForward",
    "isAutomaticReply",
    "isEncrypted",
    "isMeetingRequest",
    "isMeetingResponse",
    "isNDR",
    "isPermissionControlled",
    "isReadReceipt",
    "isSigned",
    "isVoicemail",
    "itemClasses",
    "messageClassifications",
    "notSentToMe",
    "sentCcMe",
    "sentOnlyToMe",
    "sentToAddresses",
    "sentToMe",
    "sentToOrCcMe",
    "sensitivity",
    "withinDateRange",
    "withinSizeRange"
})
public class RulePredicatesType {

    @XmlElement(name = "Categories")
    protected ArrayOfStringsType categories;
    @XmlElement(name = "ContainsBodyStrings")
    protected ArrayOfStringsType containsBodyStrings;
    @XmlElement(name = "ContainsHeaderStrings")
    protected ArrayOfStringsType containsHeaderStrings;
    @XmlElement(name = "ContainsRecipientStrings")
    protected ArrayOfStringsType containsRecipientStrings;
    @XmlElement(name = "ContainsSenderStrings")
    protected ArrayOfStringsType containsSenderStrings;
    @XmlElement(name = "ContainsSubjectOrBodyStrings")
    protected ArrayOfStringsType containsSubjectOrBodyStrings;
    @XmlElement(name = "ContainsSubjectStrings")
    protected ArrayOfStringsType containsSubjectStrings;
    @XmlElement(name = "FlaggedForAction")
    @XmlSchemaType(name = "string")
    protected FlaggedForActionType flaggedForAction;
    @XmlElement(name = "FromAddresses")
    protected ArrayOfEmailAddressesType fromAddresses;
    @XmlElement(name = "FromConnectedAccounts")
    protected ArrayOfStringsType fromConnectedAccounts;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType importance;
    @XmlElement(name = "IsApprovalRequest")
    protected Boolean isApprovalRequest;
    @XmlElement(name = "IsAutomaticForward")
    protected Boolean isAutomaticForward;
    @XmlElement(name = "IsAutomaticReply")
    protected Boolean isAutomaticReply;
    @XmlElement(name = "IsEncrypted")
    protected Boolean isEncrypted;
    @XmlElement(name = "IsMeetingRequest")
    protected Boolean isMeetingRequest;
    @XmlElement(name = "IsMeetingResponse")
    protected Boolean isMeetingResponse;
    @XmlElement(name = "IsNDR")
    protected Boolean isNDR;
    @XmlElement(name = "IsPermissionControlled")
    protected Boolean isPermissionControlled;
    @XmlElement(name = "IsReadReceipt")
    protected Boolean isReadReceipt;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "IsVoicemail")
    protected Boolean isVoicemail;
    @XmlElement(name = "ItemClasses")
    protected ArrayOfStringsType itemClasses;
    @XmlElement(name = "MessageClassifications")
    protected ArrayOfStringsType messageClassifications;
    @XmlElement(name = "NotSentToMe")
    protected Boolean notSentToMe;
    @XmlElement(name = "SentCcMe")
    protected Boolean sentCcMe;
    @XmlElement(name = "SentOnlyToMe")
    protected Boolean sentOnlyToMe;
    @XmlElement(name = "SentToAddresses")
    protected ArrayOfEmailAddressesType sentToAddresses;
    @XmlElement(name = "SentToMe")
    protected Boolean sentToMe;
    @XmlElement(name = "SentToOrCcMe")
    protected Boolean sentToOrCcMe;
    @XmlElement(name = "Sensitivity")
    @XmlSchemaType(name = "string")
    protected SensitivityChoicesType sensitivity;
    @XmlElement(name = "WithinDateRange")
    protected RulePredicateDateRangeType withinDateRange;
    @XmlElement(name = "WithinSizeRange")
    protected RulePredicateSizeRangeType withinSizeRange;

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
     * Ruft den Wert der containsBodyStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsBodyStrings() {
        return containsBodyStrings;
    }

    /**
     * Legt den Wert der containsBodyStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsBodyStrings(ArrayOfStringsType value) {
        this.containsBodyStrings = value;
    }

    /**
     * Ruft den Wert der containsHeaderStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsHeaderStrings() {
        return containsHeaderStrings;
    }

    /**
     * Legt den Wert der containsHeaderStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsHeaderStrings(ArrayOfStringsType value) {
        this.containsHeaderStrings = value;
    }

    /**
     * Ruft den Wert der containsRecipientStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsRecipientStrings() {
        return containsRecipientStrings;
    }

    /**
     * Legt den Wert der containsRecipientStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsRecipientStrings(ArrayOfStringsType value) {
        this.containsRecipientStrings = value;
    }

    /**
     * Ruft den Wert der containsSenderStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsSenderStrings() {
        return containsSenderStrings;
    }

    /**
     * Legt den Wert der containsSenderStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsSenderStrings(ArrayOfStringsType value) {
        this.containsSenderStrings = value;
    }

    /**
     * Ruft den Wert der containsSubjectOrBodyStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsSubjectOrBodyStrings() {
        return containsSubjectOrBodyStrings;
    }

    /**
     * Legt den Wert der containsSubjectOrBodyStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsSubjectOrBodyStrings(ArrayOfStringsType value) {
        this.containsSubjectOrBodyStrings = value;
    }

    /**
     * Ruft den Wert der containsSubjectStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContainsSubjectStrings() {
        return containsSubjectStrings;
    }

    /**
     * Legt den Wert der containsSubjectStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContainsSubjectStrings(ArrayOfStringsType value) {
        this.containsSubjectStrings = value;
    }

    /**
     * Ruft den Wert der flaggedForAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlaggedForActionType }
     *     
     */
    public FlaggedForActionType getFlaggedForAction() {
        return flaggedForAction;
    }

    /**
     * Legt den Wert der flaggedForAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlaggedForActionType }
     *     
     */
    public void setFlaggedForAction(FlaggedForActionType value) {
        this.flaggedForAction = value;
    }

    /**
     * Ruft den Wert der fromAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getFromAddresses() {
        return fromAddresses;
    }

    /**
     * Legt den Wert der fromAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setFromAddresses(ArrayOfEmailAddressesType value) {
        this.fromAddresses = value;
    }

    /**
     * Ruft den Wert der fromConnectedAccounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getFromConnectedAccounts() {
        return fromConnectedAccounts;
    }

    /**
     * Legt den Wert der fromConnectedAccounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setFromConnectedAccounts(ArrayOfStringsType value) {
        this.fromConnectedAccounts = value;
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
     * Ruft den Wert der isApprovalRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApprovalRequest() {
        return isApprovalRequest;
    }

    /**
     * Legt den Wert der isApprovalRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApprovalRequest(Boolean value) {
        this.isApprovalRequest = value;
    }

    /**
     * Ruft den Wert der isAutomaticForward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomaticForward() {
        return isAutomaticForward;
    }

    /**
     * Legt den Wert der isAutomaticForward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomaticForward(Boolean value) {
        this.isAutomaticForward = value;
    }

    /**
     * Ruft den Wert der isAutomaticReply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutomaticReply() {
        return isAutomaticReply;
    }

    /**
     * Legt den Wert der isAutomaticReply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutomaticReply(Boolean value) {
        this.isAutomaticReply = value;
    }

    /**
     * Ruft den Wert der isEncrypted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Legt den Wert der isEncrypted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEncrypted(Boolean value) {
        this.isEncrypted = value;
    }

    /**
     * Ruft den Wert der isMeetingRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMeetingRequest() {
        return isMeetingRequest;
    }

    /**
     * Legt den Wert der isMeetingRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMeetingRequest(Boolean value) {
        this.isMeetingRequest = value;
    }

    /**
     * Ruft den Wert der isMeetingResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMeetingResponse() {
        return isMeetingResponse;
    }

    /**
     * Legt den Wert der isMeetingResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMeetingResponse(Boolean value) {
        this.isMeetingResponse = value;
    }

    /**
     * Ruft den Wert der isNDR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNDR() {
        return isNDR;
    }

    /**
     * Legt den Wert der isNDR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNDR(Boolean value) {
        this.isNDR = value;
    }

    /**
     * Ruft den Wert der isPermissionControlled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPermissionControlled() {
        return isPermissionControlled;
    }

    /**
     * Legt den Wert der isPermissionControlled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPermissionControlled(Boolean value) {
        this.isPermissionControlled = value;
    }

    /**
     * Ruft den Wert der isReadReceipt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadReceipt() {
        return isReadReceipt;
    }

    /**
     * Legt den Wert der isReadReceipt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadReceipt(Boolean value) {
        this.isReadReceipt = value;
    }

    /**
     * Ruft den Wert der isSigned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSigned() {
        return isSigned;
    }

    /**
     * Legt den Wert der isSigned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSigned(Boolean value) {
        this.isSigned = value;
    }

    /**
     * Ruft den Wert der isVoicemail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVoicemail() {
        return isVoicemail;
    }

    /**
     * Legt den Wert der isVoicemail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVoicemail(Boolean value) {
        this.isVoicemail = value;
    }

    /**
     * Ruft den Wert der itemClasses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getItemClasses() {
        return itemClasses;
    }

    /**
     * Legt den Wert der itemClasses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setItemClasses(ArrayOfStringsType value) {
        this.itemClasses = value;
    }

    /**
     * Ruft den Wert der messageClassifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getMessageClassifications() {
        return messageClassifications;
    }

    /**
     * Legt den Wert der messageClassifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setMessageClassifications(ArrayOfStringsType value) {
        this.messageClassifications = value;
    }

    /**
     * Ruft den Wert der notSentToMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSentToMe() {
        return notSentToMe;
    }

    /**
     * Legt den Wert der notSentToMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSentToMe(Boolean value) {
        this.notSentToMe = value;
    }

    /**
     * Ruft den Wert der sentCcMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentCcMe() {
        return sentCcMe;
    }

    /**
     * Legt den Wert der sentCcMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentCcMe(Boolean value) {
        this.sentCcMe = value;
    }

    /**
     * Ruft den Wert der sentOnlyToMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentOnlyToMe() {
        return sentOnlyToMe;
    }

    /**
     * Legt den Wert der sentOnlyToMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentOnlyToMe(Boolean value) {
        this.sentOnlyToMe = value;
    }

    /**
     * Ruft den Wert der sentToAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getSentToAddresses() {
        return sentToAddresses;
    }

    /**
     * Legt den Wert der sentToAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setSentToAddresses(ArrayOfEmailAddressesType value) {
        this.sentToAddresses = value;
    }

    /**
     * Ruft den Wert der sentToMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentToMe() {
        return sentToMe;
    }

    /**
     * Legt den Wert der sentToMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentToMe(Boolean value) {
        this.sentToMe = value;
    }

    /**
     * Ruft den Wert der sentToOrCcMe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentToOrCcMe() {
        return sentToOrCcMe;
    }

    /**
     * Legt den Wert der sentToOrCcMe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentToOrCcMe(Boolean value) {
        this.sentToOrCcMe = value;
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
     * Ruft den Wert der withinDateRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RulePredicateDateRangeType }
     *     
     */
    public RulePredicateDateRangeType getWithinDateRange() {
        return withinDateRange;
    }

    /**
     * Legt den Wert der withinDateRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RulePredicateDateRangeType }
     *     
     */
    public void setWithinDateRange(RulePredicateDateRangeType value) {
        this.withinDateRange = value;
    }

    /**
     * Ruft den Wert der withinSizeRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RulePredicateSizeRangeType }
     *     
     */
    public RulePredicateSizeRangeType getWithinSizeRange() {
        return withinSizeRange;
    }

    /**
     * Legt den Wert der withinSizeRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RulePredicateSizeRangeType }
     *     
     */
    public void setWithinSizeRange(RulePredicateSizeRangeType value) {
        this.withinSizeRange = value;
    }

}
