
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetStreamingEventsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetStreamingEventsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notifications" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfNotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorSubscriptionIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfSubscriptionIdsType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConnectionStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStreamingEventsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "notifications",
    "errorSubscriptionIds",
    "connectionStatus"
})
public class GetStreamingEventsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Notifications")
    protected NonEmptyArrayOfNotificationsType notifications;
    @XmlElement(name = "ErrorSubscriptionIds")
    protected NonEmptyArrayOfSubscriptionIdsType errorSubscriptionIds;
    @XmlElement(name = "ConnectionStatus")
    @XmlSchemaType(name = "string")
    protected ConnectionStatusType connectionStatus;

    /**
     * Ruft den Wert der notifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfNotificationsType }
     *     
     */
    public NonEmptyArrayOfNotificationsType getNotifications() {
        return notifications;
    }

    /**
     * Legt den Wert der notifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfNotificationsType }
     *     
     */
    public void setNotifications(NonEmptyArrayOfNotificationsType value) {
        this.notifications = value;
    }

    /**
     * Ruft den Wert der errorSubscriptionIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfSubscriptionIdsType }
     *     
     */
    public NonEmptyArrayOfSubscriptionIdsType getErrorSubscriptionIds() {
        return errorSubscriptionIds;
    }

    /**
     * Legt den Wert der errorSubscriptionIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfSubscriptionIdsType }
     *     
     */
    public void setErrorSubscriptionIds(NonEmptyArrayOfSubscriptionIdsType value) {
        this.errorSubscriptionIds = value;
    }

    /**
     * Ruft den Wert der connectionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStatusType }
     *     
     */
    public ConnectionStatusType getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Legt den Wert der connectionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStatusType }
     *     
     */
    public void setConnectionStatus(ConnectionStatusType value) {
        this.connectionStatus = value;
    }

}
