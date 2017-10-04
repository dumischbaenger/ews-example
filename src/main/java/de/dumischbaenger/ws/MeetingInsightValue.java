
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetingInsightValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingInsightValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}InsightValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EndUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organizer" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Attendees" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProfileInsightValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInsightValue", propOrder = {
    "id",
    "subject",
    "startUtcTicks",
    "endUtcTicks",
    "location",
    "organizer",
    "attendees"
})
public class MeetingInsightValue
    extends InsightValue
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "StartUtcTicks")
    protected Long startUtcTicks;
    @XmlElement(name = "EndUtcTicks")
    protected Long endUtcTicks;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Organizer")
    protected ProfileInsightValue organizer;
    @XmlElement(name = "Attendees")
    protected ArrayOfProfileInsightValue attendees;

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
     * Ruft den Wert der startUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartUtcTicks() {
        return startUtcTicks;
    }

    /**
     * Legt den Wert der startUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartUtcTicks(Long value) {
        this.startUtcTicks = value;
    }

    /**
     * Ruft den Wert der endUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndUtcTicks() {
        return endUtcTicks;
    }

    /**
     * Legt den Wert der endUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndUtcTicks(Long value) {
        this.endUtcTicks = value;
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
     * Ruft den Wert der organizer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileInsightValue }
     *     
     */
    public ProfileInsightValue getOrganizer() {
        return organizer;
    }

    /**
     * Legt den Wert der organizer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileInsightValue }
     *     
     */
    public void setOrganizer(ProfileInsightValue value) {
        this.organizer = value;
    }

    /**
     * Ruft den Wert der attendees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public ArrayOfProfileInsightValue getAttendees() {
        return attendees;
    }

    /**
     * Legt den Wert der attendees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public void setAttendees(ArrayOfProfileInsightValue value) {
        this.attendees = value;
    }

}
