
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RecurringMasterItemIdRangesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecurringMasterItemIdRangesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ranges" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfOccurrenceRangesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringMasterItemIdRangesType", propOrder = {
    "ranges"
})
public class RecurringMasterItemIdRangesType
    extends ItemIdType
{

    @XmlElement(name = "Ranges")
    protected ArrayOfOccurrenceRangesType ranges;

    /**
     * Ruft den Wert der ranges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOccurrenceRangesType }
     *     
     */
    public ArrayOfOccurrenceRangesType getRanges() {
        return ranges;
    }

    /**
     * Legt den Wert der ranges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOccurrenceRangesType }
     *     
     */
    public void setRanges(ArrayOfOccurrenceRangesType value) {
        this.ranges = value;
    }

}
