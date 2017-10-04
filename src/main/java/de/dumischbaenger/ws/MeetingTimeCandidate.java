
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetingTimeCandidate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingTimeCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingTimeslot" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeSlot"/&gt;
 *         &lt;element name="Confidence" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrganizerAvailability" type="{http://schemas.microsoft.com/exchange/services/2006/types}AvailabilityStatusType"/&gt;
 *         &lt;element name="AttendeeAvailabilities" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttendeeAvailability"/&gt;
 *         &lt;element name="Locations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMeetingLocation"/&gt;
 *         &lt;element name="SuggestionHint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingTimeCandidate", propOrder = {
    "meetingTimeslot",
    "confidence",
    "score",
    "organizerAvailability",
    "attendeeAvailabilities",
    "locations",
    "suggestionHint"
})
public class MeetingTimeCandidate {

    @XmlElement(name = "MeetingTimeslot", required = true)
    protected TimeSlot meetingTimeslot;
    @XmlElement(name = "Confidence")
    protected double confidence;
    @XmlElement(name = "Score")
    protected int score;
    @XmlElement(name = "OrganizerAvailability", required = true)
    @XmlSchemaType(name = "string")
    protected AvailabilityStatusType organizerAvailability;
    @XmlElement(name = "AttendeeAvailabilities", required = true)
    protected ArrayOfAttendeeAvailability attendeeAvailabilities;
    @XmlElement(name = "Locations", required = true)
    protected ArrayOfMeetingLocation locations;
    @XmlElement(name = "SuggestionHint", required = true)
    protected String suggestionHint;

    /**
     * Ruft den Wert der meetingTimeslot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeSlot }
     *     
     */
    public TimeSlot getMeetingTimeslot() {
        return meetingTimeslot;
    }

    /**
     * Legt den Wert der meetingTimeslot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSlot }
     *     
     */
    public void setMeetingTimeslot(TimeSlot value) {
        this.meetingTimeslot = value;
    }

    /**
     * Ruft den Wert der confidence-Eigenschaft ab.
     * 
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * Legt den Wert der confidence-Eigenschaft fest.
     * 
     */
    public void setConfidence(double value) {
        this.confidence = value;
    }

    /**
     * Ruft den Wert der score-Eigenschaft ab.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Legt den Wert der score-Eigenschaft fest.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

    /**
     * Ruft den Wert der organizerAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityStatusType }
     *     
     */
    public AvailabilityStatusType getOrganizerAvailability() {
        return organizerAvailability;
    }

    /**
     * Legt den Wert der organizerAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityStatusType }
     *     
     */
    public void setOrganizerAvailability(AvailabilityStatusType value) {
        this.organizerAvailability = value;
    }

    /**
     * Ruft den Wert der attendeeAvailabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttendeeAvailability }
     *     
     */
    public ArrayOfAttendeeAvailability getAttendeeAvailabilities() {
        return attendeeAvailabilities;
    }

    /**
     * Legt den Wert der attendeeAvailabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttendeeAvailability }
     *     
     */
    public void setAttendeeAvailabilities(ArrayOfAttendeeAvailability value) {
        this.attendeeAvailabilities = value;
    }

    /**
     * Ruft den Wert der locations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeetingLocation }
     *     
     */
    public ArrayOfMeetingLocation getLocations() {
        return locations;
    }

    /**
     * Legt den Wert der locations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeetingLocation }
     *     
     */
    public void setLocations(ArrayOfMeetingLocation value) {
        this.locations = value;
    }

    /**
     * Ruft den Wert der suggestionHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestionHint() {
        return suggestionHint;
    }

    /**
     * Legt den Wert der suggestionHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestionHint(String value) {
        this.suggestionHint = value;
    }

}
