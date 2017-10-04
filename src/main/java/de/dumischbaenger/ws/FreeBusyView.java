
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
 * <p>Java-Klasse für FreeBusyView complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FreeBusyView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreeBusyViewType" type="{http://schemas.microsoft.com/exchange/services/2006/types}FreeBusyViewType"/&gt;
 *         &lt;element name="MergedFreeBusy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalendarEventArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfCalendarEvent" minOccurs="0"/&gt;
 *         &lt;element name="WorkingHours" type="{http://schemas.microsoft.com/exchange/services/2006/types}WorkingHours" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeBusyView", propOrder = {
    "freeBusyViewType",
    "mergedFreeBusy",
    "calendarEventArray",
    "workingHours"
})
public class FreeBusyView {

    @XmlList
    @XmlElement(name = "FreeBusyViewType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> freeBusyViewType;
    @XmlElement(name = "MergedFreeBusy")
    protected String mergedFreeBusy;
    @XmlElement(name = "CalendarEventArray")
    protected ArrayOfCalendarEvent calendarEventArray;
    @XmlElement(name = "WorkingHours")
    protected WorkingHours workingHours;

    /**
     * Gets the value of the freeBusyViewType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeBusyViewType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeBusyViewType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreeBusyViewType() {
        if (freeBusyViewType == null) {
            freeBusyViewType = new ArrayList<String>();
        }
        return this.freeBusyViewType;
    }

    /**
     * Ruft den Wert der mergedFreeBusy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergedFreeBusy() {
        return mergedFreeBusy;
    }

    /**
     * Legt den Wert der mergedFreeBusy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergedFreeBusy(String value) {
        this.mergedFreeBusy = value;
    }

    /**
     * Ruft den Wert der calendarEventArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCalendarEvent }
     *     
     */
    public ArrayOfCalendarEvent getCalendarEventArray() {
        return calendarEventArray;
    }

    /**
     * Legt den Wert der calendarEventArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCalendarEvent }
     *     
     */
    public void setCalendarEventArray(ArrayOfCalendarEvent value) {
        this.calendarEventArray = value;
    }

    /**
     * Ruft den Wert der workingHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkingHours }
     *     
     */
    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    /**
     * Legt den Wert der workingHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingHours }
     *     
     */
    public void setWorkingHours(WorkingHours value) {
        this.workingHours = value;
    }

}
