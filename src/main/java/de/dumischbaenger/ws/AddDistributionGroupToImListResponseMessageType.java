
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddDistributionGroupToImListResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddDistributionGroupToImListResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImGroup" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDistributionGroupToImListResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imGroup"
})
public class AddDistributionGroupToImListResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ImGroup")
    protected ImGroupType imGroup;

    /**
     * Ruft den Wert der imGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImGroupType }
     *     
     */
    public ImGroupType getImGroup() {
        return imGroup;
    }

    /**
     * Legt den Wert der imGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImGroupType }
     *     
     */
    public void setImGroup(ImGroupType value) {
        this.imGroup = value;
    }

}
