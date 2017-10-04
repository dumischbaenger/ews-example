
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
 * <p>Java-Klasse für WorkingPeriod complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkingPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DaysOfWeekType"/&gt;
 *         &lt;element name="StartTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingPeriod", propOrder = {
    "dayOfWeek",
    "startTimeInMinutes",
    "endTimeInMinutes"
})
public class WorkingPeriod {

    @XmlList
    @XmlElement(name = "DayOfWeek", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<DayOfWeekType> dayOfWeek;
    @XmlElement(name = "StartTimeInMinutes")
    protected int startTimeInMinutes;
    @XmlElement(name = "EndTimeInMinutes")
    protected int endTimeInMinutes;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<DayOfWeekType>();
        }
        return this.dayOfWeek;
    }

    /**
     * Ruft den Wert der startTimeInMinutes-Eigenschaft ab.
     * 
     */
    public int getStartTimeInMinutes() {
        return startTimeInMinutes;
    }

    /**
     * Legt den Wert der startTimeInMinutes-Eigenschaft fest.
     * 
     */
    public void setStartTimeInMinutes(int value) {
        this.startTimeInMinutes = value;
    }

    /**
     * Ruft den Wert der endTimeInMinutes-Eigenschaft ab.
     * 
     */
    public int getEndTimeInMinutes() {
        return endTimeInMinutes;
    }

    /**
     * Legt den Wert der endTimeInMinutes-Eigenschaft fest.
     * 
     */
    public void setEndTimeInMinutes(int value) {
        this.endTimeInMinutes = value;
    }

}
