
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndividualAttendeeConflictData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndividualAttendeeConflictData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}AttendeeConflictData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}LegacyFreeBusyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAttendeeConflictData", propOrder = {
    "busyType"
})
public class IndividualAttendeeConflictData
    extends AttendeeConflictData
{

    @XmlElement(name = "BusyType", required = true)
    @XmlSchemaType(name = "string")
    protected LegacyFreeBusyType busyType;

    /**
     * Ruft den Wert der busyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public LegacyFreeBusyType getBusyType() {
        return busyType;
    }

    /**
     * Legt den Wert der busyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public void setBusyType(LegacyFreeBusyType value) {
        this.busyType = value;
    }

}
