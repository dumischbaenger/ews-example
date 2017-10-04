
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für FindAvailableMeetingTimesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindAvailableMeetingTimesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attendees" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="SearchWindowStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SearchWindowDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="MeetingDurationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxCandidates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityDomain" type="{http://schemas.microsoft.com/exchange/services/2006/types}ActivityDomainType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAvailableMeetingTimesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attendees",
    "searchWindowStart",
    "searchWindowDuration",
    "meetingDurationInMinutes",
    "location",
    "maxCandidates",
    "activityDomain"
})
public class FindAvailableMeetingTimesType
    extends BaseRequestType
{

    @XmlElement(name = "Attendees")
    protected ArrayOfSmtpAddressType attendees;
    @XmlElement(name = "SearchWindowStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchWindowStart;
    @XmlElement(name = "SearchWindowDuration", required = true)
    protected Duration searchWindowDuration;
    @XmlElement(name = "MeetingDurationInMinutes")
    protected Integer meetingDurationInMinutes;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "MaxCandidates")
    protected Integer maxCandidates;
    @XmlElement(name = "ActivityDomain")
    @XmlSchemaType(name = "string")
    protected ActivityDomainType activityDomain;

    /**
     * Ruft den Wert der attendees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getAttendees() {
        return attendees;
    }

    /**
     * Legt den Wert der attendees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setAttendees(ArrayOfSmtpAddressType value) {
        this.attendees = value;
    }

    /**
     * Ruft den Wert der searchWindowStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchWindowStart() {
        return searchWindowStart;
    }

    /**
     * Legt den Wert der searchWindowStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchWindowStart(XMLGregorianCalendar value) {
        this.searchWindowStart = value;
    }

    /**
     * Ruft den Wert der searchWindowDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSearchWindowDuration() {
        return searchWindowDuration;
    }

    /**
     * Legt den Wert der searchWindowDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSearchWindowDuration(Duration value) {
        this.searchWindowDuration = value;
    }

    /**
     * Ruft den Wert der meetingDurationInMinutes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeetingDurationInMinutes() {
        return meetingDurationInMinutes;
    }

    /**
     * Legt den Wert der meetingDurationInMinutes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeetingDurationInMinutes(Integer value) {
        this.meetingDurationInMinutes = value;
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
     * Ruft den Wert der maxCandidates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCandidates() {
        return maxCandidates;
    }

    /**
     * Legt den Wert der maxCandidates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCandidates(Integer value) {
        this.maxCandidates = value;
    }

    /**
     * Ruft den Wert der activityDomain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDomainType }
     *     
     */
    public ActivityDomainType getActivityDomain() {
        return activityDomain;
    }

    /**
     * Legt den Wert der activityDomain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDomainType }
     *     
     */
    public void setActivityDomain(ActivityDomainType value) {
        this.activityDomain = value;
    }

}
