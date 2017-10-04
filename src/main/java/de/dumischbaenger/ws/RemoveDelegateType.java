
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemoveDelegateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemoveDelegateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseDelegateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUserIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveDelegateType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "userIds"
})
public class RemoveDelegateType
    extends BaseDelegateType
{

    @XmlElement(name = "UserIds", required = true)
    protected ArrayOfUserIdType userIds;

    /**
     * Ruft den Wert der userIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserIdType }
     *     
     */
    public ArrayOfUserIdType getUserIds() {
        return userIds;
    }

    /**
     * Legt den Wert der userIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserIdType }
     *     
     */
    public void setUserIds(ArrayOfUserIdType value) {
        this.userIds = value;
    }

}
