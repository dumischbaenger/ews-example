
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMeetingTimesSearchConstraints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMeetingTimesSearchConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchWindows" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTimeSlot" minOccurs="0"/&gt;
 *         &lt;element name="MeetingDurationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityDomain" type="{http://schemas.microsoft.com/exchange/services/2006/types}ActivityDomainType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMeetingTimesSearchConstraints", propOrder = {
    "searchWindows",
    "meetingDurationInMinutes",
    "activityDomain"
})
public class FindMeetingTimesSearchConstraints {

    @XmlElement(name = "SearchWindows")
    protected ArrayOfTimeSlot searchWindows;
    @XmlElement(name = "MeetingDurationInMinutes")
    protected Integer meetingDurationInMinutes;
    @XmlElement(name = "ActivityDomain")
    @XmlSchemaType(name = "string")
    protected ActivityDomainType activityDomain;

    /**
     * Ruft den Wert der searchWindows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeSlot }
     *     
     */
    public ArrayOfTimeSlot getSearchWindows() {
        return searchWindows;
    }

    /**
     * Legt den Wert der searchWindows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeSlot }
     *     
     */
    public void setSearchWindows(ArrayOfTimeSlot value) {
        this.searchWindows = value;
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
