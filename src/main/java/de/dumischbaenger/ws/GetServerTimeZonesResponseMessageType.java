
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetServerTimeZonesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetServerTimeZonesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeZoneDefinitions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTimeZoneDefinitionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerTimeZonesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "timeZoneDefinitions"
})
public class GetServerTimeZonesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "TimeZoneDefinitions", required = true)
    protected ArrayOfTimeZoneDefinitionType timeZoneDefinitions;

    /**
     * Ruft den Wert der timeZoneDefinitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeZoneDefinitionType }
     *     
     */
    public ArrayOfTimeZoneDefinitionType getTimeZoneDefinitions() {
        return timeZoneDefinitions;
    }

    /**
     * Legt den Wert der timeZoneDefinitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeZoneDefinitionType }
     *     
     */
    public void setTimeZoneDefinitions(ArrayOfTimeZoneDefinitionType value) {
        this.timeZoneDefinitions = value;
    }

}
