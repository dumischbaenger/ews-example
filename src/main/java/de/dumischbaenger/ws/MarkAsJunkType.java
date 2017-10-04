
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarkAsJunkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarkAsJunkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsJunk" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoveItem" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAsJunkType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemIds"
})
public class MarkAsJunkType
    extends BaseRequestType
{

    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;
    @XmlAttribute(name = "IsJunk", required = true)
    protected boolean isJunk;
    @XmlAttribute(name = "MoveItem", required = true)
    protected boolean moveItem;

    /**
     * Ruft den Wert der itemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Legt den Wert der itemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }

    /**
     * Ruft den Wert der isJunk-Eigenschaft ab.
     * 
     */
    public boolean isIsJunk() {
        return isJunk;
    }

    /**
     * Legt den Wert der isJunk-Eigenschaft fest.
     * 
     */
    public void setIsJunk(boolean value) {
        this.isJunk = value;
    }

    /**
     * Ruft den Wert der moveItem-Eigenschaft ab.
     * 
     */
    public boolean isMoveItem() {
        return moveItem;
    }

    /**
     * Legt den Wert der moveItem-Eigenschaft fest.
     * 
     */
    public void setMoveItem(boolean value) {
        this.moveItem = value;
    }

}
