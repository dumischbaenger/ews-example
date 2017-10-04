
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NotificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionIdType"/&gt;
 *         &lt;element name="PreviousWatermark" type="{http://schemas.microsoft.com/exchange/services/2006/types}WatermarkType" minOccurs="0"/&gt;
 *         &lt;element name="MoreEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="CopiedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}MovedCopiedEventType"/&gt;
 *           &lt;element name="CreatedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/&gt;
 *           &lt;element name="DeletedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/&gt;
 *           &lt;element name="ModifiedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}ModifiedEventType"/&gt;
 *           &lt;element name="MovedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}MovedCopiedEventType"/&gt;
 *           &lt;element name="NewMailEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/&gt;
 *           &lt;element name="StatusEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseNotificationEventType"/&gt;
 *           &lt;element name="FreeBusyChangedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "subscriptionId",
    "previousWatermark",
    "moreEvents",
    "copiedEventOrCreatedEventOrDeletedEvent"
})
public class NotificationType {

    @XmlElement(name = "SubscriptionId", required = true)
    protected String subscriptionId;
    @XmlElement(name = "PreviousWatermark")
    protected String previousWatermark;
    @XmlElement(name = "MoreEvents")
    protected Boolean moreEvents;
    @XmlElementRefs({
        @XmlElementRef(name = "DeletedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CreatedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MovedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NewMailEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FreeBusyChangedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CopiedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StatusEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ModifiedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends BaseNotificationEventType>> copiedEventOrCreatedEventOrDeletedEvent;

    /**
     * Ruft den Wert der subscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Legt den Wert der subscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Ruft den Wert der previousWatermark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousWatermark() {
        return previousWatermark;
    }

    /**
     * Legt den Wert der previousWatermark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousWatermark(String value) {
        this.previousWatermark = value;
    }

    /**
     * Ruft den Wert der moreEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreEvents() {
        return moreEvents;
    }

    /**
     * Legt den Wert der moreEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreEvents(Boolean value) {
        this.moreEvents = value;
    }

    /**
     * Gets the value of the copiedEventOrCreatedEventOrDeletedEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiedEventOrCreatedEventOrDeletedEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiedEventOrCreatedEventOrDeletedEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovedCopiedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovedCopiedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseNotificationEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModifiedEventType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseNotificationEventType>> getCopiedEventOrCreatedEventOrDeletedEvent() {
        if (copiedEventOrCreatedEventOrDeletedEvent == null) {
            copiedEventOrCreatedEventOrDeletedEvent = new ArrayList<JAXBElement<? extends BaseNotificationEventType>>();
        }
        return this.copiedEventOrCreatedEventOrDeletedEvent;
    }

}
