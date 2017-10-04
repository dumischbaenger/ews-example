
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetServerTimeZonesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetServerTimeZonesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ids" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfTimeZoneIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnFullTimeZoneData" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerTimeZonesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "ids"
})
public class GetServerTimeZonesType
    extends BaseRequestType
{

    @XmlElement(name = "Ids")
    protected NonEmptyArrayOfTimeZoneIdType ids;
    @XmlAttribute(name = "ReturnFullTimeZoneData")
    protected Boolean returnFullTimeZoneData;

    /**
     * Ruft den Wert der ids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfTimeZoneIdType }
     *     
     */
    public NonEmptyArrayOfTimeZoneIdType getIds() {
        return ids;
    }

    /**
     * Legt den Wert der ids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfTimeZoneIdType }
     *     
     */
    public void setIds(NonEmptyArrayOfTimeZoneIdType value) {
        this.ids = value;
    }

    /**
     * Ruft den Wert der returnFullTimeZoneData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFullTimeZoneData() {
        return returnFullTimeZoneData;
    }

    /**
     * Legt den Wert der returnFullTimeZoneData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFullTimeZoneData(Boolean value) {
        this.returnFullTimeZoneData = value;
    }

}
