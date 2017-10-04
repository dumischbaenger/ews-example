
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WorkingHours complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkingHours"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeZone" type="{http://schemas.microsoft.com/exchange/services/2006/types}SerializableTimeZone"/&gt;
 *         &lt;element name="WorkingPeriodArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfWorkingPeriod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingHours", propOrder = {
    "timeZone",
    "workingPeriodArray"
})
public class WorkingHours {

    @XmlElement(name = "TimeZone", required = true)
    protected SerializableTimeZone timeZone;
    @XmlElement(name = "WorkingPeriodArray", required = true)
    protected ArrayOfWorkingPeriod workingPeriodArray;

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SerializableTimeZone }
     *     
     */
    public SerializableTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializableTimeZone }
     *     
     */
    public void setTimeZone(SerializableTimeZone value) {
        this.timeZone = value;
    }

    /**
     * Ruft den Wert der workingPeriodArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkingPeriod }
     *     
     */
    public ArrayOfWorkingPeriod getWorkingPeriodArray() {
        return workingPeriodArray;
    }

    /**
     * Legt den Wert der workingPeriodArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkingPeriod }
     *     
     */
    public void setWorkingPeriodArray(ArrayOfWorkingPeriod value) {
        this.workingPeriodArray = value;
    }

}
