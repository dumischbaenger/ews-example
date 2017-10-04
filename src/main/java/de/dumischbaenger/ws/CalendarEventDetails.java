
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarEventDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarEventDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsException" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsReminderSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEventDetails", propOrder = {
    "id",
    "subject",
    "location",
    "isMeeting",
    "isRecurring",
    "isException",
    "isReminderSet",
    "isPrivate"
})
public class CalendarEventDetails {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "IsMeeting")
    protected boolean isMeeting;
    @XmlElement(name = "IsRecurring")
    protected boolean isRecurring;
    @XmlElement(name = "IsException")
    protected boolean isException;
    @XmlElement(name = "IsReminderSet")
    protected boolean isReminderSet;
    @XmlElement(name = "IsPrivate")
    protected boolean isPrivate;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
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
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der isMeeting-Eigenschaft ab.
     * 
     */
    public boolean isIsMeeting() {
        return isMeeting;
    }

    /**
     * Legt den Wert der isMeeting-Eigenschaft fest.
     * 
     */
    public void setIsMeeting(boolean value) {
        this.isMeeting = value;
    }

    /**
     * Ruft den Wert der isRecurring-Eigenschaft ab.
     * 
     */
    public boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Legt den Wert der isRecurring-Eigenschaft fest.
     * 
     */
    public void setIsRecurring(boolean value) {
        this.isRecurring = value;
    }

    /**
     * Ruft den Wert der isException-Eigenschaft ab.
     * 
     */
    public boolean isIsException() {
        return isException;
    }

    /**
     * Legt den Wert der isException-Eigenschaft fest.
     * 
     */
    public void setIsException(boolean value) {
        this.isException = value;
    }

    /**
     * Ruft den Wert der isReminderSet-Eigenschaft ab.
     * 
     */
    public boolean isIsReminderSet() {
        return isReminderSet;
    }

    /**
     * Legt den Wert der isReminderSet-Eigenschaft fest.
     * 
     */
    public void setIsReminderSet(boolean value) {
        this.isReminderSet = value;
    }

    /**
     * Ruft den Wert der isPrivate-Eigenschaft ab.
     * 
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Legt den Wert der isPrivate-Eigenschaft fest.
     * 
     */
    public void setIsPrivate(boolean value) {
        this.isPrivate = value;
    }

}
