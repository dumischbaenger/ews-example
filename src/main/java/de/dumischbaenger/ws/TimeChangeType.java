
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für TimeChangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;group ref="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangePatternTypes" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeChangeType", propOrder = {
    "offset",
    "relativeYearlyRecurrence",
    "absoluteDate",
    "time"
})
public class TimeChangeType {

    @XmlElement(name = "Offset", required = true)
    protected Duration offset;
    @XmlElement(name = "RelativeYearlyRecurrence")
    protected RelativeYearlyRecurrencePatternType relativeYearlyRecurrence;
    @XmlElement(name = "AbsoluteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar absoluteDate;
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "TimeZoneName")
    protected String timeZoneName;

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffset(Duration value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der relativeYearlyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public RelativeYearlyRecurrencePatternType getRelativeYearlyRecurrence() {
        return relativeYearlyRecurrence;
    }

    /**
     * Legt den Wert der relativeYearlyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public void setRelativeYearlyRecurrence(RelativeYearlyRecurrencePatternType value) {
        this.relativeYearlyRecurrence = value;
    }

    /**
     * Ruft den Wert der absoluteDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDate() {
        return absoluteDate;
    }

    /**
     * Legt den Wert der absoluteDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDate(XMLGregorianCalendar value) {
        this.absoluteDate = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der timeZoneName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Legt den Wert der timeZoneName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

}
