
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MessageTrackingReportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageTrackingReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Sender" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PurportedSender" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="RecipientTrackingEvents" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientTrackingEventType"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTrackingPropertiesType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageTrackingReportType", propOrder = {

})
public class MessageTrackingReportType {

    @XmlElement(name = "Sender")
    protected EmailAddressType sender;
    @XmlElement(name = "PurportedSender")
    protected EmailAddressType purportedSender;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "SubmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitTime;
    @XmlElement(name = "OriginalRecipients")
    protected ArrayOfEmailAddressesType originalRecipients;
    @XmlElement(name = "RecipientTrackingEvents", required = true)
    protected ArrayOfRecipientTrackingEventType recipientTrackingEvents;
    @XmlElement(name = "Properties")
    protected ArrayOfTrackingPropertiesType properties;

    /**
     * Ruft den Wert der sender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getSender() {
        return sender;
    }

    /**
     * Legt den Wert der sender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setSender(EmailAddressType value) {
        this.sender = value;
    }

    /**
     * Ruft den Wert der purportedSender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getPurportedSender() {
        return purportedSender;
    }

    /**
     * Legt den Wert der purportedSender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setPurportedSender(EmailAddressType value) {
        this.purportedSender = value;
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
     * Ruft den Wert der submitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitTime() {
        return submitTime;
    }

    /**
     * Legt den Wert der submitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitTime(XMLGregorianCalendar value) {
        this.submitTime = value;
    }

    /**
     * Ruft den Wert der originalRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getOriginalRecipients() {
        return originalRecipients;
    }

    /**
     * Legt den Wert der originalRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setOriginalRecipients(ArrayOfEmailAddressesType value) {
        this.originalRecipients = value;
    }

    /**
     * Ruft den Wert der recipientTrackingEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientTrackingEventType }
     *     
     */
    public ArrayOfRecipientTrackingEventType getRecipientTrackingEvents() {
        return recipientTrackingEvents;
    }

    /**
     * Legt den Wert der recipientTrackingEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientTrackingEventType }
     *     
     */
    public void setRecipientTrackingEvents(ArrayOfRecipientTrackingEventType value) {
        this.recipientTrackingEvents = value;
    }

    /**
     * Ruft den Wert der properties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingPropertiesType }
     *     
     */
    public ArrayOfTrackingPropertiesType getProperties() {
        return properties;
    }

    /**
     * Legt den Wert der properties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingPropertiesType }
     *     
     */
    public void setProperties(ArrayOfTrackingPropertiesType value) {
        this.properties = value;
    }

}
