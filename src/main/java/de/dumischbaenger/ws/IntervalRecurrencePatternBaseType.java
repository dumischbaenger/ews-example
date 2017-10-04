
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntervalRecurrencePatternBaseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IntervalRecurrencePatternBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrencePatternBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalRecurrencePatternBaseType", propOrder = {
    "interval"
})
@XmlSeeAlso({
    RegeneratingPatternBaseType.class,
    RelativeMonthlyRecurrencePatternType.class,
    AbsoluteMonthlyRecurrencePatternType.class,
    WeeklyRecurrencePatternType.class,
    DailyRecurrencePatternType.class
})
public abstract class IntervalRecurrencePatternBaseType
    extends RecurrencePatternBaseType
{

    @XmlElement(name = "Interval")
    protected int interval;

    /**
     * Ruft den Wert der interval-Eigenschaft ab.
     * 
     */
    public int getInterval() {
        return interval;
    }

    /**
     * Legt den Wert der interval-Eigenschaft fest.
     * 
     */
    public void setInterval(int value) {
        this.interval = value;
    }

}
