
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetImItemListResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetImItemListResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImItemList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImItemListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImItemListResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imItemList"
})
public class GetImItemListResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ImItemList")
    protected ImItemListType imItemList;

    /**
     * Ruft den Wert der imItemList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImItemListType }
     *     
     */
    public ImItemListType getImItemList() {
        return imItemList;
    }

    /**
     * Legt den Wert der imItemList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImItemListType }
     *     
     */
    public void setImItemList(ImItemListType value) {
        this.imItemList = value;
    }

}
