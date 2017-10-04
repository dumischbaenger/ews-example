
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddress"/&gt;
 *         &lt;element name="AttendeeType" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingAttendeeType"/&gt;
 *         &lt;element name="ExcludeConflicts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxData", propOrder = {
    "email",
    "attendeeType",
    "excludeConflicts"
})
public class MailboxData {

    @XmlElement(name = "Email", required = true)
    protected EmailAddress email;
    @XmlElement(name = "AttendeeType", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingAttendeeType attendeeType;
    @XmlElement(name = "ExcludeConflicts")
    protected Boolean excludeConflicts;

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmail(EmailAddress value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der attendeeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingAttendeeType }
     *     
     */
    public MeetingAttendeeType getAttendeeType() {
        return attendeeType;
    }

    /**
     * Legt den Wert der attendeeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingAttendeeType }
     *     
     */
    public void setAttendeeType(MeetingAttendeeType value) {
        this.attendeeType = value;
    }

    /**
     * Ruft den Wert der excludeConflicts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeConflicts() {
        return excludeConflicts;
    }

    /**
     * Legt den Wert der excludeConflicts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeConflicts(Boolean value) {
        this.excludeConflicts = value;
    }

}
