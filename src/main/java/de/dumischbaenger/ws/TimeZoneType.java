
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für TimeZoneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="BaseOffset" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Standard" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangeType"/&gt;
 *           &lt;element name="Daylight" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangeType"/&gt;
 *         &lt;/sequence&gt;
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
@XmlType(name = "TimeZoneType", propOrder = {
    "baseOffset",
    "standard",
    "daylight"
})
public class TimeZoneType {

    @XmlElement(name = "BaseOffset")
    protected Duration baseOffset;
    @XmlElement(name = "Standard")
    protected TimeChangeType standard;
    @XmlElement(name = "Daylight")
    protected TimeChangeType daylight;
    @XmlAttribute(name = "TimeZoneName")
    protected String timeZoneName;

    /**
     * Ruft den Wert der baseOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBaseOffset() {
        return baseOffset;
    }

    /**
     * Legt den Wert der baseOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBaseOffset(Duration value) {
        this.baseOffset = value;
    }

    /**
     * Ruft den Wert der standard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeChangeType }
     *     
     */
    public TimeChangeType getStandard() {
        return standard;
    }

    /**
     * Legt den Wert der standard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeChangeType }
     *     
     */
    public void setStandard(TimeChangeType value) {
        this.standard = value;
    }

    /**
     * Ruft den Wert der daylight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeChangeType }
     *     
     */
    public TimeChangeType getDaylight() {
        return daylight;
    }

    /**
     * Legt den Wert der daylight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeChangeType }
     *     
     */
    public void setDaylight(TimeChangeType value) {
        this.daylight = value;
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
