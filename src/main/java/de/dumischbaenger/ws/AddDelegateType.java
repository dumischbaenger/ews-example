
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddDelegateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddDelegateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseDelegateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelegateUsers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfDelegateUserType"/&gt;
 *         &lt;element name="DeliverMeetingRequests" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeliverMeetingRequestsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDelegateType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "delegateUsers",
    "deliverMeetingRequests"
})
public class AddDelegateType
    extends BaseDelegateType
{

    @XmlElement(name = "DelegateUsers", required = true)
    protected ArrayOfDelegateUserType delegateUsers;
    @XmlElement(name = "DeliverMeetingRequests")
    @XmlSchemaType(name = "string")
    protected DeliverMeetingRequestsType deliverMeetingRequests;

    /**
     * Ruft den Wert der delegateUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDelegateUserType }
     *     
     */
    public ArrayOfDelegateUserType getDelegateUsers() {
        return delegateUsers;
    }

    /**
     * Legt den Wert der delegateUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDelegateUserType }
     *     
     */
    public void setDelegateUsers(ArrayOfDelegateUserType value) {
        this.delegateUsers = value;
    }

    /**
     * Ruft den Wert der deliverMeetingRequests-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeliverMeetingRequestsType }
     *     
     */
    public DeliverMeetingRequestsType getDeliverMeetingRequests() {
        return deliverMeetingRequests;
    }

    /**
     * Legt den Wert der deliverMeetingRequests-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverMeetingRequestsType }
     *     
     */
    public void setDeliverMeetingRequests(DeliverMeetingRequestsType value) {
        this.deliverMeetingRequests = value;
    }

}
