
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ConversationActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConversationActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Action" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationActionTypeType"/&gt;
 *         &lt;element name="ConversationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="ContextFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="ConversationLastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRightAway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="EnableAlwaysDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeleteType" type="{http://schemas.microsoft.com/exchange/services/2006/types}DisposalType" minOccurs="0"/&gt;
 *         &lt;element name="RetentionPolicyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionType" minOccurs="0"/&gt;
 *         &lt;element name="RetentionPolicyTagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://schemas.microsoft.com/exchange/services/2006/types}FlagType" minOccurs="0"/&gt;
 *         &lt;element name="SuppressReadReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationActionType", propOrder = {
    "action",
    "conversationId",
    "contextFolderId",
    "conversationLastSyncTime",
    "processRightAway",
    "destinationFolderId",
    "categories",
    "enableAlwaysDelete",
    "isRead",
    "deleteType",
    "retentionPolicyType",
    "retentionPolicyTagId",
    "flag",
    "suppressReadReceipts"
})
public class ConversationActionType {

    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected ConversationActionTypeType action;
    @XmlElement(name = "ConversationId", required = true)
    protected ItemIdType conversationId;
    @XmlElement(name = "ContextFolderId")
    protected TargetFolderIdType contextFolderId;
    @XmlElement(name = "ConversationLastSyncTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar conversationLastSyncTime;
    @XmlElement(name = "ProcessRightAway")
    protected Boolean processRightAway;
    @XmlElement(name = "DestinationFolderId")
    protected TargetFolderIdType destinationFolderId;
    @XmlElement(name = "Categories")
    protected ArrayOfStringsType categories;
    @XmlElement(name = "EnableAlwaysDelete")
    protected Boolean enableAlwaysDelete;
    @XmlElement(name = "IsRead")
    protected Boolean isRead;
    @XmlElement(name = "DeleteType")
    @XmlSchemaType(name = "string")
    protected DisposalType deleteType;
    @XmlElement(name = "RetentionPolicyType")
    @XmlSchemaType(name = "string")
    protected RetentionType retentionPolicyType;
    @XmlElement(name = "RetentionPolicyTagId")
    protected String retentionPolicyTagId;
    @XmlElement(name = "Flag")
    protected FlagType flag;
    @XmlElement(name = "SuppressReadReceipts")
    protected Boolean suppressReadReceipts;

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationActionTypeType }
     *     
     */
    public ConversationActionTypeType getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationActionTypeType }
     *     
     */
    public void setAction(ConversationActionTypeType value) {
        this.action = value;
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
     * Ruft den Wert der contextFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getContextFolderId() {
        return contextFolderId;
    }

    /**
     * Legt den Wert der contextFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setContextFolderId(TargetFolderIdType value) {
        this.contextFolderId = value;
    }

    /**
     * Ruft den Wert der conversationLastSyncTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConversationLastSyncTime() {
        return conversationLastSyncTime;
    }

    /**
     * Legt den Wert der conversationLastSyncTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConversationLastSyncTime(XMLGregorianCalendar value) {
        this.conversationLastSyncTime = value;
    }

    /**
     * Ruft den Wert der processRightAway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessRightAway() {
        return processRightAway;
    }

    /**
     * Legt den Wert der processRightAway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessRightAway(Boolean value) {
        this.processRightAway = value;
    }

    /**
     * Ruft den Wert der destinationFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getDestinationFolderId() {
        return destinationFolderId;
    }

    /**
     * Legt den Wert der destinationFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setDestinationFolderId(TargetFolderIdType value) {
        this.destinationFolderId = value;
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
     * Ruft den Wert der enableAlwaysDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAlwaysDelete() {
        return enableAlwaysDelete;
    }

    /**
     * Legt den Wert der enableAlwaysDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAlwaysDelete(Boolean value) {
        this.enableAlwaysDelete = value;
    }

    /**
     * Ruft den Wert der isRead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRead() {
        return isRead;
    }

    /**
     * Legt den Wert der isRead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRead(Boolean value) {
        this.isRead = value;
    }

    /**
     * Ruft den Wert der deleteType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisposalType }
     *     
     */
    public DisposalType getDeleteType() {
        return deleteType;
    }

    /**
     * Legt den Wert der deleteType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisposalType }
     *     
     */
    public void setDeleteType(DisposalType value) {
        this.deleteType = value;
    }

    /**
     * Ruft den Wert der retentionPolicyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionType }
     *     
     */
    public RetentionType getRetentionPolicyType() {
        return retentionPolicyType;
    }

    /**
     * Legt den Wert der retentionPolicyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionType }
     *     
     */
    public void setRetentionPolicyType(RetentionType value) {
        this.retentionPolicyType = value;
    }

    /**
     * Ruft den Wert der retentionPolicyTagId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetentionPolicyTagId() {
        return retentionPolicyTagId;
    }

    /**
     * Legt den Wert der retentionPolicyTagId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetentionPolicyTagId(String value) {
        this.retentionPolicyTagId = value;
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
     * Ruft den Wert der suppressReadReceipts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressReadReceipts() {
        return suppressReadReceipts;
    }

    /**
     * Legt den Wert der suppressReadReceipts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressReadReceipts(Boolean value) {
        this.suppressReadReceipts = value;
    }

}
