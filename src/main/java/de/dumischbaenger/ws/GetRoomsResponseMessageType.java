
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetRoomsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetRoomsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rooms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRoomsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRoomsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "rooms"
})
public class GetRoomsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Rooms")
    protected ArrayOfRoomsType rooms;

    /**
     * Ruft den Wert der rooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomsType }
     *     
     */
    public ArrayOfRoomsType getRooms() {
        return rooms;
    }

    /**
     * Legt den Wert der rooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomsType }
     *     
     */
    public void setRooms(ArrayOfRoomsType value) {
        this.rooms = value;
    }

}
