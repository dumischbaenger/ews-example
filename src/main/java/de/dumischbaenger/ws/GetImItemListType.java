
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetImItemListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetImItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedFieldURIs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImItemListType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "extendedProperties"
})
public class GetImItemListType
    extends BaseRequestType
{

    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedFieldURIs extendedProperties;

    /**
     * Ruft den Wert der extendedProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedFieldURIs }
     *     
     */
    public NonEmptyArrayOfExtendedFieldURIs getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Legt den Wert der extendedProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedFieldURIs }
     *     
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedFieldURIs value) {
        this.extendedProperties = value;
    }

}
