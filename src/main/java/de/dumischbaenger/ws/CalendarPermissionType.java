
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarPermissionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarPermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePermissionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadItems" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarPermissionReadAccessType" minOccurs="0"/&gt;
 *         &lt;element name="CalendarPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarPermissionLevelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarPermissionType", propOrder = {
    "readItems",
    "calendarPermissionLevel"
})
public class CalendarPermissionType
    extends BasePermissionType
{

    @XmlElement(name = "ReadItems")
    @XmlSchemaType(name = "string")
    protected CalendarPermissionReadAccessType readItems;
    @XmlElement(name = "CalendarPermissionLevel", required = true)
    @XmlSchemaType(name = "string")
    protected CalendarPermissionLevelType calendarPermissionLevel;

    /**
     * Ruft den Wert der readItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPermissionReadAccessType }
     *     
     */
    public CalendarPermissionReadAccessType getReadItems() {
        return readItems;
    }

    /**
     * Legt den Wert der readItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPermissionReadAccessType }
     *     
     */
    public void setReadItems(CalendarPermissionReadAccessType value) {
        this.readItems = value;
    }

    /**
     * Ruft den Wert der calendarPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPermissionLevelType }
     *     
     */
    public CalendarPermissionLevelType getCalendarPermissionLevel() {
        return calendarPermissionLevel;
    }

    /**
     * Legt den Wert der calendarPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPermissionLevelType }
     *     
     */
    public void setCalendarPermissionLevel(CalendarPermissionLevelType value) {
        this.calendarPermissionLevel = value;
    }

}
