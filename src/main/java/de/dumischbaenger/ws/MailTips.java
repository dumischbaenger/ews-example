
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailTips complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailTips"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/&gt;
 *         &lt;element name="PendingMailTips" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailTipTypes"/&gt;
 *         &lt;element name="OutOfOffice" type="{http://schemas.microsoft.com/exchange/services/2006/types}OutOfOfficeMailTip" minOccurs="0"/&gt;
 *         &lt;element name="MailboxFull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomMailTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalMemberCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExternalMemberCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxMessageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsModerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InvalidRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecipientSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientSuggestionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailTips", propOrder = {
    "recipientAddress",
    "pendingMailTips",
    "outOfOffice",
    "mailboxFull",
    "customMailTip",
    "totalMemberCount",
    "externalMemberCount",
    "maxMessageSize",
    "deliveryRestricted",
    "isModerated",
    "invalidRecipient",
    "scope",
    "recipientSuggestions"
})
public class MailTips {

    @XmlElement(name = "RecipientAddress", required = true)
    protected EmailAddressType recipientAddress;
    @XmlList
    @XmlElement(name = "PendingMailTips", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> pendingMailTips;
    @XmlElement(name = "OutOfOffice")
    protected OutOfOfficeMailTip outOfOffice;
    @XmlElement(name = "MailboxFull")
    protected Boolean mailboxFull;
    @XmlElement(name = "CustomMailTip")
    protected String customMailTip;
    @XmlElement(name = "TotalMemberCount")
    protected Integer totalMemberCount;
    @XmlElement(name = "ExternalMemberCount")
    protected Integer externalMemberCount;
    @XmlElement(name = "MaxMessageSize")
    protected Integer maxMessageSize;
    @XmlElement(name = "DeliveryRestricted")
    protected Boolean deliveryRestricted;
    @XmlElement(name = "IsModerated")
    protected Boolean isModerated;
    @XmlElement(name = "InvalidRecipient")
    protected Boolean invalidRecipient;
    @XmlElement(name = "Scope")
    protected Integer scope;
    @XmlElement(name = "RecipientSuggestions")
    protected ArrayOfRecipientSuggestionsType recipientSuggestions;

    /**
     * Ruft den Wert der recipientAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getRecipientAddress() {
        return recipientAddress;
    }

    /**
     * Legt den Wert der recipientAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setRecipientAddress(EmailAddressType value) {
        this.recipientAddress = value;
    }

    /**
     * Gets the value of the pendingMailTips property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingMailTips property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingMailTips().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPendingMailTips() {
        if (pendingMailTips == null) {
            pendingMailTips = new ArrayList<String>();
        }
        return this.pendingMailTips;
    }

    /**
     * Ruft den Wert der outOfOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutOfOfficeMailTip }
     *     
     */
    public OutOfOfficeMailTip getOutOfOffice() {
        return outOfOffice;
    }

    /**
     * Legt den Wert der outOfOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfOfficeMailTip }
     *     
     */
    public void setOutOfOffice(OutOfOfficeMailTip value) {
        this.outOfOffice = value;
    }

    /**
     * Ruft den Wert der mailboxFull-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailboxFull() {
        return mailboxFull;
    }

    /**
     * Legt den Wert der mailboxFull-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailboxFull(Boolean value) {
        this.mailboxFull = value;
    }

    /**
     * Ruft den Wert der customMailTip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomMailTip() {
        return customMailTip;
    }

    /**
     * Legt den Wert der customMailTip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomMailTip(String value) {
        this.customMailTip = value;
    }

    /**
     * Ruft den Wert der totalMemberCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMemberCount() {
        return totalMemberCount;
    }

    /**
     * Legt den Wert der totalMemberCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMemberCount(Integer value) {
        this.totalMemberCount = value;
    }

    /**
     * Ruft den Wert der externalMemberCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalMemberCount() {
        return externalMemberCount;
    }

    /**
     * Legt den Wert der externalMemberCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalMemberCount(Integer value) {
        this.externalMemberCount = value;
    }

    /**
     * Ruft den Wert der maxMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMessageSize() {
        return maxMessageSize;
    }

    /**
     * Legt den Wert der maxMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMessageSize(Integer value) {
        this.maxMessageSize = value;
    }

    /**
     * Ruft den Wert der deliveryRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryRestricted() {
        return deliveryRestricted;
    }

    /**
     * Legt den Wert der deliveryRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryRestricted(Boolean value) {
        this.deliveryRestricted = value;
    }

    /**
     * Ruft den Wert der isModerated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModerated() {
        return isModerated;
    }

    /**
     * Legt den Wert der isModerated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModerated(Boolean value) {
        this.isModerated = value;
    }

    /**
     * Ruft den Wert der invalidRecipient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidRecipient() {
        return invalidRecipient;
    }

    /**
     * Legt den Wert der invalidRecipient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidRecipient(Boolean value) {
        this.invalidRecipient = value;
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScope(Integer value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der recipientSuggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientSuggestionsType }
     *     
     */
    public ArrayOfRecipientSuggestionsType getRecipientSuggestions() {
        return recipientSuggestions;
    }

    /**
     * Legt den Wert der recipientSuggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientSuggestionsType }
     *     
     */
    public void setRecipientSuggestions(ArrayOfRecipientSuggestionsType value) {
        this.recipientSuggestions = value;
    }

}
