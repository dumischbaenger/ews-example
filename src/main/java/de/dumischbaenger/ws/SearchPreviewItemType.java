
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Mailbox search preview item.
 *       
 * 
 * <p>Java-Klasse für SearchPreviewItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchPreviewItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="Mailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemMailboxType" minOccurs="0"/&gt;
 *         &lt;element name="ParentId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="ItemClass" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemClassType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="CcRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="BccRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPreviewItemType", propOrder = {
    "id",
    "mailbox",
    "parentId",
    "itemClass",
    "uniqueHash",
    "sortValue",
    "owaLink",
    "sender",
    "toRecipients",
    "ccRecipients",
    "bccRecipients",
    "createdTime",
    "receivedTime",
    "sentTime",
    "subject",
    "size",
    "preview",
    "importance",
    "read",
    "hasAttachment",
    "extendedProperties"
})
public class SearchPreviewItemType {

    @XmlElement(name = "Id", required = true)
    protected ItemIdType id;
    @XmlElement(name = "Mailbox")
    protected PreviewItemMailboxType mailbox;
    @XmlElement(name = "ParentId")
    protected ItemIdType parentId;
    @XmlElement(name = "ItemClass")
    protected String itemClass;
    @XmlElement(name = "UniqueHash")
    protected String uniqueHash;
    @XmlElement(name = "SortValue")
    protected String sortValue;
    @XmlElement(name = "OwaLink")
    protected String owaLink;
    @XmlElement(name = "Sender")
    protected String sender;
    @XmlElement(name = "ToRecipients")
    protected ArrayOfSmtpAddressType toRecipients;
    @XmlElement(name = "CcRecipients")
    protected ArrayOfSmtpAddressType ccRecipients;
    @XmlElement(name = "BccRecipients")
    protected ArrayOfSmtpAddressType bccRecipients;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "ReceivedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedTime;
    @XmlElement(name = "SentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTime;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Size")
    protected Long size;
    @XmlElement(name = "Preview")
    protected String preview;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType importance;
    @XmlElement(name = "Read")
    protected Boolean read;
    @XmlElement(name = "HasAttachment")
    protected Boolean hasAttachment;
    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedPropertyType extendedProperties;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setId(ItemIdType value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemMailboxType }
     *     
     */
    public PreviewItemMailboxType getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemMailboxType }
     *     
     */
    public void setMailbox(PreviewItemMailboxType value) {
        this.mailbox = value;
    }

    /**
     * Ruft den Wert der parentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getParentId() {
        return parentId;
    }

    /**
     * Legt den Wert der parentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setParentId(ItemIdType value) {
        this.parentId = value;
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
     * Ruft den Wert der uniqueHash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueHash() {
        return uniqueHash;
    }

    /**
     * Legt den Wert der uniqueHash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueHash(String value) {
        this.uniqueHash = value;
    }

    /**
     * Ruft den Wert der sortValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortValue() {
        return sortValue;
    }

    /**
     * Legt den Wert der sortValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortValue(String value) {
        this.sortValue = value;
    }

    /**
     * Ruft den Wert der owaLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwaLink() {
        return owaLink;
    }

    /**
     * Legt den Wert der owaLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwaLink(String value) {
        this.owaLink = value;
    }

    /**
     * Ruft den Wert der sender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Legt den Wert der sender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Ruft den Wert der toRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getToRecipients() {
        return toRecipients;
    }

    /**
     * Legt den Wert der toRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setToRecipients(ArrayOfSmtpAddressType value) {
        this.toRecipients = value;
    }

    /**
     * Ruft den Wert der ccRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getCcRecipients() {
        return ccRecipients;
    }

    /**
     * Legt den Wert der ccRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setCcRecipients(ArrayOfSmtpAddressType value) {
        this.ccRecipients = value;
    }

    /**
     * Ruft den Wert der bccRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getBccRecipients() {
        return bccRecipients;
    }

    /**
     * Legt den Wert der bccRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setBccRecipients(ArrayOfSmtpAddressType value) {
        this.bccRecipients = value;
    }

    /**
     * Ruft den Wert der createdTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Legt den Wert der createdTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Ruft den Wert der receivedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedTime() {
        return receivedTime;
    }

    /**
     * Legt den Wert der receivedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedTime(XMLGregorianCalendar value) {
        this.receivedTime = value;
    }

    /**
     * Ruft den Wert der sentTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Legt den Wert der sentTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
        this.sentTime = value;
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
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
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
     * Ruft den Wert der read-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRead() {
        return read;
    }

    /**
     * Legt den Wert der read-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRead(Boolean value) {
        this.read = value;
    }

    /**
     * Ruft den Wert der hasAttachment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Legt den Wert der hasAttachment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
    }

    /**
     * Ruft den Wert der extendedProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public NonEmptyArrayOfExtendedPropertyType getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Legt den Wert der extendedProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedPropertyType value) {
        this.extendedProperties = value;
    }

}
