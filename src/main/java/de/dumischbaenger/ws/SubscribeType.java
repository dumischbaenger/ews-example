
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubscribeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscribeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PullSubscriptionRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}PullSubscriptionRequestType"/&gt;
 *         &lt;element name="PushSubscriptionRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}PushSubscriptionRequestType"/&gt;
 *         &lt;element name="StreamingSubscriptionRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}StreamingSubscriptionRequestType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "pullSubscriptionRequest",
    "pushSubscriptionRequest",
    "streamingSubscriptionRequest"
})
public class SubscribeType
    extends BaseRequestType
{

    @XmlElement(name = "PullSubscriptionRequest")
    protected PullSubscriptionRequestType pullSubscriptionRequest;
    @XmlElement(name = "PushSubscriptionRequest")
    protected PushSubscriptionRequestType pushSubscriptionRequest;
    @XmlElement(name = "StreamingSubscriptionRequest")
    protected StreamingSubscriptionRequestType streamingSubscriptionRequest;

    /**
     * Ruft den Wert der pullSubscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PullSubscriptionRequestType }
     *     
     */
    public PullSubscriptionRequestType getPullSubscriptionRequest() {
        return pullSubscriptionRequest;
    }

    /**
     * Legt den Wert der pullSubscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PullSubscriptionRequestType }
     *     
     */
    public void setPullSubscriptionRequest(PullSubscriptionRequestType value) {
        this.pullSubscriptionRequest = value;
    }

    /**
     * Ruft den Wert der pushSubscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushSubscriptionRequestType }
     *     
     */
    public PushSubscriptionRequestType getPushSubscriptionRequest() {
        return pushSubscriptionRequest;
    }

    /**
     * Legt den Wert der pushSubscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushSubscriptionRequestType }
     *     
     */
    public void setPushSubscriptionRequest(PushSubscriptionRequestType value) {
        this.pushSubscriptionRequest = value;
    }

    /**
     * Ruft den Wert der streamingSubscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StreamingSubscriptionRequestType }
     *     
     */
    public StreamingSubscriptionRequestType getStreamingSubscriptionRequest() {
        return streamingSubscriptionRequest;
    }

    /**
     * Legt den Wert der streamingSubscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingSubscriptionRequestType }
     *     
     */
    public void setStreamingSubscriptionRequest(StreamingSubscriptionRequestType value) {
        this.streamingSubscriptionRequest = value;
    }

}
