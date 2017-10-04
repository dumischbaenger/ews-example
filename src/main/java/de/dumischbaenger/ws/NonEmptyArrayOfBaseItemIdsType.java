
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfBaseItemIdsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfBaseItemIdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="OccurrenceItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}OccurrenceItemIdType"/&gt;
 *         &lt;element name="RecurringMasterItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringMasterItemIdType"/&gt;
 *         &lt;element name="RecurringMasterItemIdRanges" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringMasterItemIdRangesType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfBaseItemIdsType", propOrder = {
    "itemIdOrOccurrenceItemIdOrRecurringMasterItemId"
})
public class NonEmptyArrayOfBaseItemIdsType {

    @XmlElements({
        @XmlElement(name = "ItemId", type = ItemIdType.class),
        @XmlElement(name = "OccurrenceItemId", type = OccurrenceItemIdType.class),
        @XmlElement(name = "RecurringMasterItemId", type = RecurringMasterItemIdType.class),
        @XmlElement(name = "RecurringMasterItemIdRanges", type = RecurringMasterItemIdRangesType.class)
    })
    protected List<BaseItemIdType> itemIdOrOccurrenceItemIdOrRecurringMasterItemId;

    /**
     * Gets the value of the itemIdOrOccurrenceItemIdOrRecurringMasterItemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIdOrOccurrenceItemIdOrRecurringMasterItemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIdOrOccurrenceItemIdOrRecurringMasterItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdType }
     * {@link OccurrenceItemIdType }
     * {@link RecurringMasterItemIdType }
     * {@link RecurringMasterItemIdRangesType }
     * 
     * 
     */
    public List<BaseItemIdType> getItemIdOrOccurrenceItemIdOrRecurringMasterItemId() {
        if (itemIdOrOccurrenceItemIdOrRecurringMasterItemId == null) {
            itemIdOrOccurrenceItemIdOrRecurringMasterItemId = new ArrayList<BaseItemIdType>();
        }
        return this.itemIdOrOccurrenceItemIdOrRecurringMasterItemId;
    }

}
