
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DelegateUserResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DelegateUserResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelegateUser" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateUserType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelegateUserResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "delegateUser"
})
public class DelegateUserResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "DelegateUser")
    protected DelegateUserType delegateUser;

    /**
     * Ruft den Wert der delegateUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateUserType }
     *     
     */
    public DelegateUserType getDelegateUser() {
        return delegateUser;
    }

    /**
     * Legt den Wert der delegateUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateUserType }
     *     
     */
    public void setDelegateUser(DelegateUserType value) {
        this.delegateUser = value;
    }

}
