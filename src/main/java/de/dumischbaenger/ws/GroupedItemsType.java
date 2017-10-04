
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupedItemsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupedItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRealItemsType"/&gt;
 *         &lt;element name="GroupSummary" type="{http://schemas.microsoft.com/exchange/services/2006/types}GroupSummaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedItemsType", propOrder = {
    "groupIndex",
    "items",
    "groupSummary"
})
public class GroupedItemsType {

    @XmlElement(name = "GroupIndex", required = true)
    protected String groupIndex;
    @XmlElement(name = "Items", required = true)
    protected ArrayOfRealItemsType items;
    @XmlElement(name = "GroupSummary")
    protected GroupSummaryType groupSummary;

    /**
     * Ruft den Wert der groupIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIndex() {
        return groupIndex;
    }

    /**
     * Legt den Wert der groupIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIndex(String value) {
        this.groupIndex = value;
    }

    /**
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRealItemsType }
     *     
     */
    public ArrayOfRealItemsType getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRealItemsType }
     *     
     */
    public void setItems(ArrayOfRealItemsType value) {
        this.items = value;
    }

    /**
     * Ruft den Wert der groupSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupSummaryType }
     *     
     */
    public GroupSummaryType getGroupSummary() {
        return groupSummary;
    }

    /**
     * Legt den Wert der groupSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSummaryType }
     *     
     */
    public void setGroupSummary(GroupSummaryType value) {
        this.groupSummary = value;
    }

}
