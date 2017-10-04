
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für CalendarEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BusyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}LegacyFreeBusyType"/&gt;
 *         &lt;element name="CalendarEventDetails" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarEventDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEvent", propOrder = {
    "startTime",
    "endTime",
    "busyType",
    "calendarEventDetails"
})
public class CalendarEvent {

    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "BusyType", required = true)
    @XmlSchemaType(name = "string")
    protected LegacyFreeBusyType busyType;
    @XmlElement(name = "CalendarEventDetails")
    protected CalendarEventDetails calendarEventDetails;

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der busyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public LegacyFreeBusyType getBusyType() {
        return busyType;
    }

    /**
     * Legt den Wert der busyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public void setBusyType(LegacyFreeBusyType value) {
        this.busyType = value;
    }

    /**
     * Ruft den Wert der calendarEventDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventDetails }
     *     
     */
    public CalendarEventDetails getCalendarEventDetails() {
        return calendarEventDetails;
    }

    /**
     * Legt den Wert der calendarEventDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventDetails }
     *     
     */
    public void setCalendarEventDetails(CalendarEventDetails value) {
        this.calendarEventDetails = value;
    }

}
