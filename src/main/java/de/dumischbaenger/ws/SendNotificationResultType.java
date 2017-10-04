
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SendNotificationResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SendNotificationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNotificationResultType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "subscriptionStatus"
})
public class SendNotificationResultType {

    @XmlElement(name = "SubscriptionStatus", required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionStatusType subscriptionStatus;

    /**
     * Ruft den Wert der subscriptionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatusType }
     *     
     */
    public SubscriptionStatusType getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Legt den Wert der subscriptionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatusType }
     *     
     */
    public void setSubscriptionStatus(SubscriptionStatusType value) {
        this.subscriptionStatus = value;
    }

}
