
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WorkHoursType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkHoursType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkDay" type="{http://schemas.microsoft.com/exchange/services/2006/types}SystemDayOfWeek" minOccurs="0"/&gt;
 *         &lt;element name="TimeSlots" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfWorkTimeSlot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkHoursType", propOrder = {
    "workDay",
    "timeSlots"
})
public class WorkHoursType {

    @XmlElement(name = "WorkDay")
    @XmlSchemaType(name = "string")
    protected SystemDayOfWeek workDay;
    @XmlElement(name = "TimeSlots")
    protected ArrayOfWorkTimeSlot timeSlots;

    /**
     * Ruft den Wert der workDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemDayOfWeek }
     *     
     */
    public SystemDayOfWeek getWorkDay() {
        return workDay;
    }

    /**
     * Legt den Wert der workDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDayOfWeek }
     *     
     */
    public void setWorkDay(SystemDayOfWeek value) {
        this.workDay = value;
    }

    /**
     * Ruft den Wert der timeSlots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkTimeSlot }
     *     
     */
    public ArrayOfWorkTimeSlot getTimeSlots() {
        return timeSlots;
    }

    /**
     * Legt den Wert der timeSlots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkTimeSlot }
     *     
     */
    public void setTimeSlots(ArrayOfWorkTimeSlot value) {
        this.timeSlots = value;
    }

}
