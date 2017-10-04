
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SerializableTimeZoneTime complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SerializableTimeZoneTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DayOrder" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializableTimeZoneTime", propOrder = {
    "bias",
    "time",
    "dayOrder",
    "month",
    "dayOfWeek",
    "year"
})
public class SerializableTimeZoneTime {

    @XmlElement(name = "Bias")
    protected int bias;
    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "DayOrder")
    protected short dayOrder;
    @XmlElement(name = "Month")
    protected short month;
    @XmlElement(name = "DayOfWeek", required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "Year")
    protected String year;

    /**
     * Ruft den Wert der bias-Eigenschaft ab.
     * 
     */
    public int getBias() {
        return bias;
    }

    /**
     * Legt den Wert der bias-Eigenschaft fest.
     * 
     */
    public void setBias(int value) {
        this.bias = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der dayOrder-Eigenschaft ab.
     * 
     */
    public short getDayOrder() {
        return dayOrder;
    }

    /**
     * Legt den Wert der dayOrder-Eigenschaft fest.
     * 
     */
    public void setDayOrder(short value) {
        this.dayOrder = value;
    }

    /**
     * Ruft den Wert der month-Eigenschaft ab.
     * 
     */
    public short getMonth() {
        return month;
    }

    /**
     * Legt den Wert der month-Eigenschaft fest.
     * 
     */
    public void setMonth(short value) {
        this.month = value;
    }

    /**
     * Ruft den Wert der dayOfWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Legt den Wert der dayOfWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
    }

    /**
     * Ruft den Wert der year-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Legt den Wert der year-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
