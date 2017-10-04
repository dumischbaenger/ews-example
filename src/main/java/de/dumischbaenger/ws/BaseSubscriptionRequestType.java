
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseSubscriptionRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseSubscriptionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType" minOccurs="0"/&gt;
 *         &lt;element name="EventTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfNotificationEventTypesType"/&gt;
 *         &lt;element name="Watermark" type="{http://schemas.microsoft.com/exchange/services/2006/types}WatermarkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubscribeToAllFolders" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSubscriptionRequestType", propOrder = {
    "folderIds",
    "eventTypes",
    "watermark"
})
@XmlSeeAlso({
    PushSubscriptionRequestType.class,
    PullSubscriptionRequestType.class
})
public abstract class BaseSubscriptionRequestType {

    @XmlElement(name = "FolderIds")
    protected NonEmptyArrayOfBaseFolderIdsType folderIds;
    @XmlElement(name = "EventTypes", required = true)
    protected NonEmptyArrayOfNotificationEventTypesType eventTypes;
    @XmlElement(name = "Watermark")
    protected String watermark;
    @XmlAttribute(name = "SubscribeToAllFolders")
    protected Boolean subscribeToAllFolders;

    /**
     * Ruft den Wert der folderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFolderIds() {
        return folderIds;
    }

    /**
     * Legt den Wert der folderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.folderIds = value;
    }

    /**
     * Ruft den Wert der eventTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfNotificationEventTypesType }
     *     
     */
    public NonEmptyArrayOfNotificationEventTypesType getEventTypes() {
        return eventTypes;
    }

    /**
     * Legt den Wert der eventTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfNotificationEventTypesType }
     *     
     */
    public void setEventTypes(NonEmptyArrayOfNotificationEventTypesType value) {
        this.eventTypes = value;
    }

    /**
     * Ruft den Wert der watermark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatermark() {
        return watermark;
    }

    /**
     * Legt den Wert der watermark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatermark(String value) {
        this.watermark = value;
    }

    /**
     * Ruft den Wert der subscribeToAllFolders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeToAllFolders() {
        return subscribeToAllFolders;
    }

    /**
     * Legt den Wert der subscribeToAllFolders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeToAllFolders(Boolean value) {
        this.subscribeToAllFolders = value;
    }

}
