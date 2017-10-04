
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
 * <p>Java-Klasse für FreeBusyViewOptionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FreeBusyViewOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeWindow" type="{http://schemas.microsoft.com/exchange/services/2006/types}Duration"/&gt;
 *         &lt;element name="MergedFreeBusyIntervalInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestedView" type="{http://schemas.microsoft.com/exchange/services/2006/types}FreeBusyViewType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeBusyViewOptionsType", propOrder = {
    "timeWindow",
    "mergedFreeBusyIntervalInMinutes",
    "requestedView"
})
public class FreeBusyViewOptionsType {

    @XmlElement(name = "TimeWindow", required = true)
    protected Duration timeWindow;
    @XmlElement(name = "MergedFreeBusyIntervalInMinutes")
    protected Integer mergedFreeBusyIntervalInMinutes;
    @XmlList
    @XmlElement(name = "RequestedView")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> requestedView;

    /**
     * Ruft den Wert der timeWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Legt den Wert der timeWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeWindow(Duration value) {
        this.timeWindow = value;
    }

    /**
     * Ruft den Wert der mergedFreeBusyIntervalInMinutes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMergedFreeBusyIntervalInMinutes() {
        return mergedFreeBusyIntervalInMinutes;
    }

    /**
     * Legt den Wert der mergedFreeBusyIntervalInMinutes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMergedFreeBusyIntervalInMinutes(Integer value) {
        this.mergedFreeBusyIntervalInMinutes = value;
    }

    /**
     * Gets the value of the requestedView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestedView() {
        if (requestedView == null) {
            requestedView = new ArrayList<String>();
        }
        return this.requestedView;
    }

}
