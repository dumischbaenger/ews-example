
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NumberedRecurrenceRangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NumberedRecurrenceRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrenceRangeBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfOccurrences" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberedRecurrenceRangeType", propOrder = {
    "numberOfOccurrences"
})
public class NumberedRecurrenceRangeType
    extends RecurrenceRangeBaseType
{

    @XmlElement(name = "NumberOfOccurrences")
    protected int numberOfOccurrences;

    /**
     * Ruft den Wert der numberOfOccurrences-Eigenschaft ab.
     * 
     */
    public int getNumberOfOccurrences() {
        return numberOfOccurrences;
    }

    /**
     * Legt den Wert der numberOfOccurrences-Eigenschaft fest.
     * 
     */
    public void setNumberOfOccurrences(int value) {
        this.numberOfOccurrences = value;
    }

}
