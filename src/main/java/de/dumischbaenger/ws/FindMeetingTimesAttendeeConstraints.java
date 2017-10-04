
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMeetingTimesAttendeeConstraints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMeetingTimesAttendeeConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttendeeEntries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttendeeConstraintItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMeetingTimesAttendeeConstraints", propOrder = {
    "attendeeEntries"
})
public class FindMeetingTimesAttendeeConstraints {

    @XmlElement(name = "AttendeeEntries")
    protected ArrayOfAttendeeConstraintItems attendeeEntries;

    /**
     * Ruft den Wert der attendeeEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttendeeConstraintItems }
     *     
     */
    public ArrayOfAttendeeConstraintItems getAttendeeEntries() {
        return attendeeEntries;
    }

    /**
     * Legt den Wert der attendeeEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttendeeConstraintItems }
     *     
     */
    public void setAttendeeEntries(ArrayOfAttendeeConstraintItems value) {
        this.attendeeEntries = value;
    }

}
