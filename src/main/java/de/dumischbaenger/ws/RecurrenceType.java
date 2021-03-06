
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RecurrenceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrencePatternTypes"/&gt;
 *         &lt;group ref="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrenceRangeTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceType", propOrder = {
    "relativeYearlyRecurrence",
    "absoluteYearlyRecurrence",
    "relativeMonthlyRecurrence",
    "absoluteMonthlyRecurrence",
    "weeklyRecurrence",
    "dailyRecurrence",
    "noEndRecurrence",
    "endDateRecurrence",
    "numberedRecurrence"
})
public class RecurrenceType {

    @XmlElement(name = "RelativeYearlyRecurrence")
    protected RelativeYearlyRecurrencePatternType relativeYearlyRecurrence;
    @XmlElement(name = "AbsoluteYearlyRecurrence")
    protected AbsoluteYearlyRecurrencePatternType absoluteYearlyRecurrence;
    @XmlElement(name = "RelativeMonthlyRecurrence")
    protected RelativeMonthlyRecurrencePatternType relativeMonthlyRecurrence;
    @XmlElement(name = "AbsoluteMonthlyRecurrence")
    protected AbsoluteMonthlyRecurrencePatternType absoluteMonthlyRecurrence;
    @XmlElement(name = "WeeklyRecurrence")
    protected WeeklyRecurrencePatternType weeklyRecurrence;
    @XmlElement(name = "DailyRecurrence")
    protected DailyRecurrencePatternType dailyRecurrence;
    @XmlElement(name = "NoEndRecurrence")
    protected NoEndRecurrenceRangeType noEndRecurrence;
    @XmlElement(name = "EndDateRecurrence")
    protected EndDateRecurrenceRangeType endDateRecurrence;
    @XmlElement(name = "NumberedRecurrence")
    protected NumberedRecurrenceRangeType numberedRecurrence;

    /**
     * Ruft den Wert der relativeYearlyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public RelativeYearlyRecurrencePatternType getRelativeYearlyRecurrence() {
        return relativeYearlyRecurrence;
    }

    /**
     * Legt den Wert der relativeYearlyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public void setRelativeYearlyRecurrence(RelativeYearlyRecurrencePatternType value) {
        this.relativeYearlyRecurrence = value;
    }

    /**
     * Ruft den Wert der absoluteYearlyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteYearlyRecurrencePatternType }
     *     
     */
    public AbsoluteYearlyRecurrencePatternType getAbsoluteYearlyRecurrence() {
        return absoluteYearlyRecurrence;
    }

    /**
     * Legt den Wert der absoluteYearlyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteYearlyRecurrencePatternType }
     *     
     */
    public void setAbsoluteYearlyRecurrence(AbsoluteYearlyRecurrencePatternType value) {
        this.absoluteYearlyRecurrence = value;
    }

    /**
     * Ruft den Wert der relativeMonthlyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeMonthlyRecurrencePatternType }
     *     
     */
    public RelativeMonthlyRecurrencePatternType getRelativeMonthlyRecurrence() {
        return relativeMonthlyRecurrence;
    }

    /**
     * Legt den Wert der relativeMonthlyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeMonthlyRecurrencePatternType }
     *     
     */
    public void setRelativeMonthlyRecurrence(RelativeMonthlyRecurrencePatternType value) {
        this.relativeMonthlyRecurrence = value;
    }

    /**
     * Ruft den Wert der absoluteMonthlyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteMonthlyRecurrencePatternType }
     *     
     */
    public AbsoluteMonthlyRecurrencePatternType getAbsoluteMonthlyRecurrence() {
        return absoluteMonthlyRecurrence;
    }

    /**
     * Legt den Wert der absoluteMonthlyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteMonthlyRecurrencePatternType }
     *     
     */
    public void setAbsoluteMonthlyRecurrence(AbsoluteMonthlyRecurrencePatternType value) {
        this.absoluteMonthlyRecurrence = value;
    }

    /**
     * Ruft den Wert der weeklyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyRecurrencePatternType }
     *     
     */
    public WeeklyRecurrencePatternType getWeeklyRecurrence() {
        return weeklyRecurrence;
    }

    /**
     * Legt den Wert der weeklyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyRecurrencePatternType }
     *     
     */
    public void setWeeklyRecurrence(WeeklyRecurrencePatternType value) {
        this.weeklyRecurrence = value;
    }

    /**
     * Ruft den Wert der dailyRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DailyRecurrencePatternType }
     *     
     */
    public DailyRecurrencePatternType getDailyRecurrence() {
        return dailyRecurrence;
    }

    /**
     * Legt den Wert der dailyRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRecurrencePatternType }
     *     
     */
    public void setDailyRecurrence(DailyRecurrencePatternType value) {
        this.dailyRecurrence = value;
    }

    /**
     * Ruft den Wert der noEndRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoEndRecurrenceRangeType }
     *     
     */
    public NoEndRecurrenceRangeType getNoEndRecurrence() {
        return noEndRecurrence;
    }

    /**
     * Legt den Wert der noEndRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoEndRecurrenceRangeType }
     *     
     */
    public void setNoEndRecurrence(NoEndRecurrenceRangeType value) {
        this.noEndRecurrence = value;
    }

    /**
     * Ruft den Wert der endDateRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndDateRecurrenceRangeType }
     *     
     */
    public EndDateRecurrenceRangeType getEndDateRecurrence() {
        return endDateRecurrence;
    }

    /**
     * Legt den Wert der endDateRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateRecurrenceRangeType }
     *     
     */
    public void setEndDateRecurrence(EndDateRecurrenceRangeType value) {
        this.endDateRecurrence = value;
    }

    /**
     * Ruft den Wert der numberedRecurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumberedRecurrenceRangeType }
     *     
     */
    public NumberedRecurrenceRangeType getNumberedRecurrence() {
        return numberedRecurrence;
    }

    /**
     * Legt den Wert der numberedRecurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberedRecurrenceRangeType }
     *     
     */
    public void setNumberedRecurrence(NumberedRecurrenceRangeType value) {
        this.numberedRecurrence = value;
    }

}
