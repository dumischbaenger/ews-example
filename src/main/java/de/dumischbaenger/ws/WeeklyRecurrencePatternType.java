
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WeeklyRecurrencePatternType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WeeklyRecurrencePatternType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}IntervalRecurrencePatternBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DaysOfWeekType"/&gt;
 *         &lt;element name="FirstDayOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyRecurrencePatternType", propOrder = {
    "daysOfWeek",
    "firstDayOfWeek"
})
public class WeeklyRecurrencePatternType
    extends IntervalRecurrencePatternBaseType
{

    @XmlList
    @XmlElement(name = "DaysOfWeek", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DayOfWeekType> daysOfWeek;
    @XmlElement(name = "FirstDayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType firstDayOfWeek;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DayOfWeekType>();
        }
        return this.daysOfWeek;
    }

    /**
     * Ruft den Wert der firstDayOfWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Legt den Wert der firstDayOfWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setFirstDayOfWeek(DayOfWeekType value) {
        this.firstDayOfWeek = value;
    }

}
