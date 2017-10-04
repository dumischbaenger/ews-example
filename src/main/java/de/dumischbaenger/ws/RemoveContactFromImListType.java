
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemoveContactFromImListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemoveContactFromImListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveContactFromImListType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "contactId"
})
public class RemoveContactFromImListType
    extends BaseRequestType
{

    @XmlElement(name = "ContactId", required = true)
    protected ItemIdType contactId;

    /**
     * Ruft den Wert der contactId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getContactId() {
        return contactId;
    }

    /**
     * Legt den Wert der contactId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setContactId(ItemIdType value) {
        this.contactId = value;
    }

}
