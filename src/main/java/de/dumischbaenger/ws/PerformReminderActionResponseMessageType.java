
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PerformReminderActionResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PerformReminderActionResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatedItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemIdsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformReminderActionResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "updatedItemIds"
})
public class PerformReminderActionResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "UpdatedItemIds", required = true)
    protected NonEmptyArrayOfItemIdsType updatedItemIds;

    /**
     * Ruft den Wert der updatedItemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public NonEmptyArrayOfItemIdsType getUpdatedItemIds() {
        return updatedItemIds;
    }

    /**
     * Legt den Wert der updatedItemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public void setUpdatedItemIds(NonEmptyArrayOfItemIdsType value) {
        this.updatedItemIds = value;
    }

}
