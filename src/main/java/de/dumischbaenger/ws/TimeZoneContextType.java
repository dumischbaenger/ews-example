
package de.dumischbaenger.ws;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java-Klasse für TimeZoneContextType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeZoneDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeZoneDefinitionType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='http://schemas.xmlsoap.org/soap/envelope/'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneContextType", propOrder = {
    "timeZoneDefinition"
})
public class TimeZoneContextType {

    @XmlElement(name = "TimeZoneDefinition", required = true)
    protected TimeZoneDefinitionType timeZoneDefinition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der timeZoneDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public TimeZoneDefinitionType getTimeZoneDefinition() {
        return timeZoneDefinition;
    }

    /**
     * Legt den Wert der timeZoneDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public void setTimeZoneDefinition(TimeZoneDefinitionType value) {
        this.timeZoneDefinition = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
