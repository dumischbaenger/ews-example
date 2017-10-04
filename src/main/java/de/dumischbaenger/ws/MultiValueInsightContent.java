
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MultiValueInsightContent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiValueInsightContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}InsightContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInsightValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiValueInsightContent", propOrder = {
    "itemList"
})
public class MultiValueInsightContent
    extends InsightContent
{

    @XmlElement(name = "ItemList")
    protected ArrayOfInsightValue itemList;

    /**
     * Ruft den Wert der itemList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsightValue }
     *     
     */
    public ArrayOfInsightValue getItemList() {
        return itemList;
    }

    /**
     * Legt den Wert der itemList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsightValue }
     *     
     */
    public void setItemList(ArrayOfInsightValue value) {
        this.itemList = value;
    }

}
