
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RelativeYearlyRecurrencePatternType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelativeYearlyRecurrencePatternType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrencePatternBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType"/&gt;
 *         &lt;element name="DayOfWeekIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekIndexType"/&gt;
 *         &lt;element name="Month" type="{http://schemas.microsoft.com/exchange/services/2006/types}MonthNamesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeYearlyRecurrencePatternType", propOrder = {
    "daysOfWeek",
    "dayOfWeekIndex",
    "month"
})
public class RelativeYearlyRecurrencePatternType
    extends RecurrencePatternBaseType
{

    @XmlElement(name = "DaysOfWeek", required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeekType daysOfWeek;
    @XmlElement(name = "DayOfWeekIndex", required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeekIndexType dayOfWeekIndex;
    @XmlElement(name = "Month", required = true)
    @XmlSchemaType(name = "string")
    protected MonthNamesType month;

    /**
     * Ruft den Wert der daysOfWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Legt den Wert der daysOfWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDaysOfWeek(DayOfWeekType value) {
        this.daysOfWeek = value;
    }

    /**
     * Ruft den Wert der dayOfWeekIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekIndexType }
     *     
     */
    public DayOfWeekIndexType getDayOfWeekIndex() {
        return dayOfWeekIndex;
    }

    /**
     * Legt den Wert der dayOfWeekIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekIndexType }
     *     
     */
    public void setDayOfWeekIndex(DayOfWeekIndexType value) {
        this.dayOfWeekIndex = value;
    }

    /**
     * Ruft den Wert der month-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonthNamesType }
     *     
     */
    public MonthNamesType getMonth() {
        return month;
    }

    /**
     * Legt den Wert der month-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthNamesType }
     *     
     */
    public void setMonth(MonthNamesType value) {
        this.month = value;
    }

}
