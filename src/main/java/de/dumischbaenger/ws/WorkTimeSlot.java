
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WorkTimeSlot complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkTimeSlot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "WorkTimeSlot", propOrder = {
    "startTimeInMinutes",
    "endTimeInMinutes"
})
public class WorkTimeSlot {

    @XmlElement(name = "StartTimeInMinutes")
    protected int startTimeInMinutes;
    @XmlElement(name = "EndTimeInMinutes")
    protected int endTimeInMinutes;

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
