
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DelegateUserType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DelegateUserType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserId" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserIdType"/&gt;
 *         &lt;element name="DelegatePermissions" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegatePermissionsType" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveCopiesOfMeetingMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewPrivateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelegateUserType", propOrder = {
    "userId",
    "delegatePermissions",
    "receiveCopiesOfMeetingMessages",
    "viewPrivateItems"
})
public class DelegateUserType {

    @XmlElement(name = "UserId", required = true)
    protected UserIdType userId;
    @XmlElement(name = "DelegatePermissions")
    protected DelegatePermissionsType delegatePermissions;
    @XmlElement(name = "ReceiveCopiesOfMeetingMessages")
    protected Boolean receiveCopiesOfMeetingMessages;
    @XmlElement(name = "ViewPrivateItems")
    protected Boolean viewPrivateItems;

    /**
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserIdType }
     *     
     */
    public UserIdType getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdType }
     *     
     */
    public void setUserId(UserIdType value) {
        this.userId = value;
    }

    /**
     * Ruft den Wert der delegatePermissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegatePermissionsType }
     *     
     */
    public DelegatePermissionsType getDelegatePermissions() {
        return delegatePermissions;
    }

    /**
     * Legt den Wert der delegatePermissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegatePermissionsType }
     *     
     */
    public void setDelegatePermissions(DelegatePermissionsType value) {
        this.delegatePermissions = value;
    }

    /**
     * Ruft den Wert der receiveCopiesOfMeetingMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveCopiesOfMeetingMessages() {
        return receiveCopiesOfMeetingMessages;
    }

    /**
     * Legt den Wert der receiveCopiesOfMeetingMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveCopiesOfMeetingMessages(Boolean value) {
        this.receiveCopiesOfMeetingMessages = value;
    }

    /**
     * Ruft den Wert der viewPrivateItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewPrivateItems() {
        return viewPrivateItems;
    }

    /**
     * Legt den Wert der viewPrivateItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewPrivateItems(Boolean value) {
        this.viewPrivateItems = value;
    }

}
