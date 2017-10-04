
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InboxReminderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InboxReminderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *         &lt;element name="ReminderOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOrganizerReminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OccurrenceChange" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailReminderChangeType" minOccurs="0"/&gt;
 *         &lt;element name="SendOption" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailReminderSendOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboxReminderType", propOrder = {
    "id",
    "reminderOffset",
    "message",
    "isOrganizerReminder",
    "occurrenceChange",
    "sendOption"
})
public class InboxReminderType {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReminderOffset")
    protected Integer reminderOffset;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "IsOrganizerReminder")
    protected Boolean isOrganizerReminder;
    @XmlElement(name = "OccurrenceChange")
    @XmlSchemaType(name = "string")
    protected EmailReminderChangeType occurrenceChange;
    @XmlElement(name = "SendOption")
    @XmlSchemaType(name = "string")
    protected EmailReminderSendOption sendOption;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der reminderOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReminderOffset() {
        return reminderOffset;
    }

    /**
     * Legt den Wert der reminderOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReminderOffset(Integer value) {
        this.reminderOffset = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der isOrganizerReminder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrganizerReminder() {
        return isOrganizerReminder;
    }

    /**
     * Legt den Wert der isOrganizerReminder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrganizerReminder(Boolean value) {
        this.isOrganizerReminder = value;
    }

    /**
     * Ruft den Wert der occurrenceChange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailReminderChangeType }
     *     
     */
    public EmailReminderChangeType getOccurrenceChange() {
        return occurrenceChange;
    }

    /**
     * Legt den Wert der occurrenceChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailReminderChangeType }
     *     
     */
    public void setOccurrenceChange(EmailReminderChangeType value) {
        this.occurrenceChange = value;
    }

    /**
     * Ruft den Wert der sendOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailReminderSendOption }
     *     
     */
    public EmailReminderSendOption getSendOption() {
        return sendOption;
    }

    /**
     * Legt den Wert der sendOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailReminderSendOption }
     *     
     */
    public void setSendOption(EmailReminderSendOption value) {
        this.sendOption = value;
    }

}
