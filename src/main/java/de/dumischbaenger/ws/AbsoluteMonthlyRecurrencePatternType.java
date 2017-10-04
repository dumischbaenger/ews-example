
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbsoluteMonthlyRecurrencePatternType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteMonthlyRecurrencePatternType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}IntervalRecurrencePatternBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteMonthlyRecurrencePatternType", propOrder = {
    "dayOfMonth"
})
public class AbsoluteMonthlyRecurrencePatternType
    extends IntervalRecurrencePatternBaseType
{

    @XmlElement(name = "DayOfMonth")
    protected int dayOfMonth;

    /**
     * Ruft den Wert der dayOfMonth-Eigenschaft ab.
     * 
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Legt den Wert der dayOfMonth-Eigenschaft fest.
     * 
     */
    public void setDayOfMonth(int value) {
        this.dayOfMonth = value;
    }

}
