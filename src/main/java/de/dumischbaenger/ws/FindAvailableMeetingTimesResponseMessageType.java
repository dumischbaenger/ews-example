
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindAvailableMeetingTimesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindAvailableMeetingTimesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingTimeCandidates" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMeetingTimeCandidate"/&gt;
 *         &lt;element name="EmptySuggestionsHint" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmptySuggestionReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAvailableMeetingTimesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "meetingTimeCandidates",
    "emptySuggestionsHint"
})
public class FindAvailableMeetingTimesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MeetingTimeCandidates", required = true)
    protected ArrayOfMeetingTimeCandidate meetingTimeCandidates;
    @XmlElement(name = "EmptySuggestionsHint")
    @XmlSchemaType(name = "string")
    protected EmptySuggestionReason emptySuggestionsHint;

    /**
     * Ruft den Wert der meetingTimeCandidates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeetingTimeCandidate }
     *     
     */
    public ArrayOfMeetingTimeCandidate getMeetingTimeCandidates() {
        return meetingTimeCandidates;
    }

    /**
     * Legt den Wert der meetingTimeCandidates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeetingTimeCandidate }
     *     
     */
    public void setMeetingTimeCandidates(ArrayOfMeetingTimeCandidate value) {
        this.meetingTimeCandidates = value;
    }

    /**
     * Ruft den Wert der emptySuggestionsHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptySuggestionReason }
     *     
     */
    public EmptySuggestionReason getEmptySuggestionsHint() {
        return emptySuggestionsHint;
    }

    /**
     * Legt den Wert der emptySuggestionsHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptySuggestionReason }
     *     
     */
    public void setEmptySuggestionsHint(EmptySuggestionReason value) {
        this.emptySuggestionsHint = value;
    }

}
