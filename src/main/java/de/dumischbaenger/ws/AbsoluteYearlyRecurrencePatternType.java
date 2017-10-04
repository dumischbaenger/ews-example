
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbsoluteYearlyRecurrencePatternType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteYearlyRecurrencePatternType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrencePatternBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "AbsoluteYearlyRecurrencePatternType", propOrder = {
    "dayOfMonth",
    "month"
})
public class AbsoluteYearlyRecurrencePatternType
    extends RecurrencePatternBaseType
{

    @XmlElement(name = "DayOfMonth")
    protected int dayOfMonth;
    @XmlElement(name = "Month", required = true)
    @XmlSchemaType(name = "string")
    protected MonthNamesType month;

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
