
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RecurringDayTransitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecurringDayTransitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringTimeTransitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType"/&gt;
 *         &lt;element name="Occurrence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringDayTransitionType", propOrder = {
    "dayOfWeek",
    "occurrence"
})
public class RecurringDayTransitionType
    extends RecurringTimeTransitionType
{

    @XmlElement(name = "DayOfWeek", required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "Occurrence")
    protected int occurrence;

    /**
     * Ruft den Wert der dayOfWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Legt den Wert der dayOfWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
    }

    /**
     * Ruft den Wert der occurrence-Eigenschaft ab.
     * 
     */
    public int getOccurrence() {
        return occurrence;
    }

    /**
     * Legt den Wert der occurrence-Eigenschaft fest.
     * 
     */
    public void setOccurrence(int value) {
        this.occurrence = value;
    }

}
