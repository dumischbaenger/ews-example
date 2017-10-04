
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Suggestion complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Suggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsWorkTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SuggestionQuality" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionQuality"/&gt;
 *         &lt;element name="AttendeeConflictDataArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttendeeConflictData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suggestion", propOrder = {
    "meetingTime",
    "isWorkTime",
    "suggestionQuality",
    "attendeeConflictDataArray"
})
public class Suggestion {

    @XmlElement(name = "MeetingTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar meetingTime;
    @XmlElement(name = "IsWorkTime")
    protected boolean isWorkTime;
    @XmlElement(name = "SuggestionQuality", required = true)
    @XmlSchemaType(name = "string")
    protected SuggestionQuality suggestionQuality;
    @XmlElement(name = "AttendeeConflictDataArray")
    protected ArrayOfAttendeeConflictData attendeeConflictDataArray;

    /**
     * Ruft den Wert der meetingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeetingTime() {
        return meetingTime;
    }

    /**
     * Legt den Wert der meetingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeetingTime(XMLGregorianCalendar value) {
        this.meetingTime = value;
    }

    /**
     * Ruft den Wert der isWorkTime-Eigenschaft ab.
     * 
     */
    public boolean isIsWorkTime() {
        return isWorkTime;
    }

    /**
     * Legt den Wert der isWorkTime-Eigenschaft fest.
     * 
     */
    public void setIsWorkTime(boolean value) {
        this.isWorkTime = value;
    }

    /**
     * Ruft den Wert der suggestionQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionQuality }
     *     
     */
    public SuggestionQuality getSuggestionQuality() {
        return suggestionQuality;
    }

    /**
     * Legt den Wert der suggestionQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionQuality }
     *     
     */
    public void setSuggestionQuality(SuggestionQuality value) {
        this.suggestionQuality = value;
    }

    /**
     * Ruft den Wert der attendeeConflictDataArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttendeeConflictData }
     *     
     */
    public ArrayOfAttendeeConflictData getAttendeeConflictDataArray() {
        return attendeeConflictDataArray;
    }

    /**
     * Legt den Wert der attendeeConflictDataArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttendeeConflictData }
     *     
     */
    public void setAttendeeConflictDataArray(ArrayOfAttendeeConflictData value) {
        this.attendeeConflictDataArray = value;
    }

}
