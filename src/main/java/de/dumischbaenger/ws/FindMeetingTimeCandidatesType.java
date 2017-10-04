
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMeetingTimeCandidatesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMeetingTimeCandidatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttendeeConstraints" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindMeetingTimesAttendeeConstraints" minOccurs="0"/&gt;
 *         &lt;element name="LocationConstraints" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindMeetingTimesLocationConstraints" minOccurs="0"/&gt;
 *         &lt;element name="SearchConstraints" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindMeetingTimesSearchConstraints" minOccurs="0"/&gt;
 *         &lt;element name="Constraints" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindMeetingTimesConstraints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMeetingTimeCandidatesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attendeeConstraints",
    "locationConstraints",
    "searchConstraints",
    "constraints"
})
public class FindMeetingTimeCandidatesType
    extends BaseRequestType
{

    @XmlElement(name = "AttendeeConstraints")
    protected FindMeetingTimesAttendeeConstraints attendeeConstraints;
    @XmlElement(name = "LocationConstraints")
    protected FindMeetingTimesLocationConstraints locationConstraints;
    @XmlElement(name = "SearchConstraints")
    protected FindMeetingTimesSearchConstraints searchConstraints;
    @XmlElement(name = "Constraints")
    protected FindMeetingTimesConstraints constraints;

    /**
     * Ruft den Wert der attendeeConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindMeetingTimesAttendeeConstraints }
     *     
     */
    public FindMeetingTimesAttendeeConstraints getAttendeeConstraints() {
        return attendeeConstraints;
    }

    /**
     * Legt den Wert der attendeeConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMeetingTimesAttendeeConstraints }
     *     
     */
    public void setAttendeeConstraints(FindMeetingTimesAttendeeConstraints value) {
        this.attendeeConstraints = value;
    }

    /**
     * Ruft den Wert der locationConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindMeetingTimesLocationConstraints }
     *     
     */
    public FindMeetingTimesLocationConstraints getLocationConstraints() {
        return locationConstraints;
    }

    /**
     * Legt den Wert der locationConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMeetingTimesLocationConstraints }
     *     
     */
    public void setLocationConstraints(FindMeetingTimesLocationConstraints value) {
        this.locationConstraints = value;
    }

    /**
     * Ruft den Wert der searchConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindMeetingTimesSearchConstraints }
     *     
     */
    public FindMeetingTimesSearchConstraints getSearchConstraints() {
        return searchConstraints;
    }

    /**
     * Legt den Wert der searchConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMeetingTimesSearchConstraints }
     *     
     */
    public void setSearchConstraints(FindMeetingTimesSearchConstraints value) {
        this.searchConstraints = value;
    }

    /**
     * Ruft den Wert der constraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindMeetingTimesConstraints }
     *     
     */
    public FindMeetingTimesConstraints getConstraints() {
        return constraints;
    }

    /**
     * Legt den Wert der constraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMeetingTimesConstraints }
     *     
     */
    public void setConstraints(FindMeetingTimesConstraints value) {
        this.constraints = value;
    }

}
