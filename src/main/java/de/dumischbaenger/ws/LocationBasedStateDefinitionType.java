
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocationBasedStateDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocationBasedStateDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseCalendarItemStateDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizerLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AttendeeLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationBasedStateDefinitionType", propOrder = {
    "organizerLocation",
    "attendeeLocation"
})
public class LocationBasedStateDefinitionType
    extends BaseCalendarItemStateDefinitionType
{

    @XmlElement(name = "OrganizerLocation", required = true)
    protected String organizerLocation;
    @XmlElement(name = "AttendeeLocation", required = true)
    protected String attendeeLocation;

    /**
     * Ruft den Wert der organizerLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizerLocation() {
        return organizerLocation;
    }

    /**
     * Legt den Wert der organizerLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizerLocation(String value) {
        this.organizerLocation = value;
    }

    /**
     * Ruft den Wert der attendeeLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeLocation() {
        return attendeeLocation;
    }

    /**
     * Legt den Wert der attendeeLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeLocation(String value) {
        this.attendeeLocation = value;
    }

}
