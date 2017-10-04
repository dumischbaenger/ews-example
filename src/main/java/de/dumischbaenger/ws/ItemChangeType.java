
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ItemChangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *           &lt;element name="OccurrenceItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}OccurrenceItemIdType"/&gt;
 *           &lt;element name="RecurringMasterItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringMasterItemIdType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Updates" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemChangeDescriptionsType"/&gt;
 *         &lt;element name="CalendarActivityData" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarActivityDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemChangeType", propOrder = {
    "itemId",
    "occurrenceItemId",
    "recurringMasterItemId",
    "updates",
    "calendarActivityData"
})
public class ItemChangeType {

    @XmlElement(name = "ItemId")
    protected ItemIdType itemId;
    @XmlElement(name = "OccurrenceItemId")
    protected OccurrenceItemIdType occurrenceItemId;
    @XmlElement(name = "RecurringMasterItemId")
    protected RecurringMasterItemIdType recurringMasterItemId;
    @XmlElement(name = "Updates", required = true)
    protected NonEmptyArrayOfItemChangeDescriptionsType updates;
    @XmlElement(name = "CalendarActivityData")
    protected CalendarActivityDataType calendarActivityData;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der occurrenceItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceItemIdType }
     *     
     */
    public OccurrenceItemIdType getOccurrenceItemId() {
        return occurrenceItemId;
    }

    /**
     * Legt den Wert der occurrenceItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceItemIdType }
     *     
     */
    public void setOccurrenceItemId(OccurrenceItemIdType value) {
        this.occurrenceItemId = value;
    }

    /**
     * Ruft den Wert der recurringMasterItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecurringMasterItemIdType }
     *     
     */
    public RecurringMasterItemIdType getRecurringMasterItemId() {
        return recurringMasterItemId;
    }

    /**
     * Legt den Wert der recurringMasterItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringMasterItemIdType }
     *     
     */
    public void setRecurringMasterItemId(RecurringMasterItemIdType value) {
        this.recurringMasterItemId = value;
    }

    /**
     * Ruft den Wert der updates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemChangeDescriptionsType }
     *     
     */
    public NonEmptyArrayOfItemChangeDescriptionsType getUpdates() {
        return updates;
    }

    /**
     * Legt den Wert der updates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemChangeDescriptionsType }
     *     
     */
    public void setUpdates(NonEmptyArrayOfItemChangeDescriptionsType value) {
        this.updates = value;
    }

    /**
     * Ruft den Wert der calendarActivityData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarActivityDataType }
     *     
     */
    public CalendarActivityDataType getCalendarActivityData() {
        return calendarActivityData;
    }

    /**
     * Legt den Wert der calendarActivityData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarActivityDataType }
     *     
     */
    public void setCalendarActivityData(CalendarActivityDataType value) {
        this.calendarActivityData = value;
    }

}
