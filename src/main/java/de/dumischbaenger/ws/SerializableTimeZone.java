
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SerializableTimeZone complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SerializableTimeZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StandardTime" type="{http://schemas.microsoft.com/exchange/services/2006/types}SerializableTimeZoneTime"/&gt;
 *         &lt;element name="DaylightTime" type="{http://schemas.microsoft.com/exchange/services/2006/types}SerializableTimeZoneTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializableTimeZone", propOrder = {
    "bias",
    "standardTime",
    "daylightTime"
})
public class SerializableTimeZone {

    @XmlElement(name = "Bias")
    protected int bias;
    @XmlElement(name = "StandardTime", required = true)
    protected SerializableTimeZoneTime standardTime;
    @XmlElement(name = "DaylightTime", required = true)
    protected SerializableTimeZoneTime daylightTime;

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
     * Ruft den Wert der standardTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SerializableTimeZoneTime }
     *     
     */
    public SerializableTimeZoneTime getStandardTime() {
        return standardTime;
    }

    /**
     * Legt den Wert der standardTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializableTimeZoneTime }
     *     
     */
    public void setStandardTime(SerializableTimeZoneTime value) {
        this.standardTime = value;
    }

    /**
     * Ruft den Wert der daylightTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SerializableTimeZoneTime }
     *     
     */
    public SerializableTimeZoneTime getDaylightTime() {
        return daylightTime;
    }

    /**
     * Legt den Wert der daylightTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializableTimeZoneTime }
     *     
     */
    public void setDaylightTime(SerializableTimeZoneTime value) {
        this.daylightTime = value;
    }

}
