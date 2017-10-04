
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetStreamingEventsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetStreamingEventsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfSubscriptionIdsType"/&gt;
 *         &lt;element name="ConnectionTimeout" type="{http://schemas.microsoft.com/exchange/services/2006/types}StreamingSubscriptionConnectionTimeoutType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStreamingEventsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "subscriptionIds",
    "connectionTimeout"
})
public class GetStreamingEventsType
    extends BaseRequestType
{

    @XmlElement(name = "SubscriptionIds", required = true)
    protected NonEmptyArrayOfSubscriptionIdsType subscriptionIds;
    @XmlElement(name = "ConnectionTimeout")
    protected int connectionTimeout;

    /**
     * Ruft den Wert der subscriptionIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfSubscriptionIdsType }
     *     
     */
    public NonEmptyArrayOfSubscriptionIdsType getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Legt den Wert der subscriptionIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfSubscriptionIdsType }
     *     
     */
    public void setSubscriptionIds(NonEmptyArrayOfSubscriptionIdsType value) {
        this.subscriptionIds = value;
    }

    /**
     * Ruft den Wert der connectionTimeout-Eigenschaft ab.
     * 
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Legt den Wert der connectionTimeout-Eigenschaft fest.
     * 
     */
    public void setConnectionTimeout(int value) {
        this.connectionTimeout = value;
    }

}
