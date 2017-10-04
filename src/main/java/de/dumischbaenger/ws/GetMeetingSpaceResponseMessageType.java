
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r GetMeetingSpaceResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetMeetingSpaceResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingSpace" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingSpaceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMeetingSpaceResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "meetingSpace"
})
public class GetMeetingSpaceResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MeetingSpace", required = true)
    protected MeetingSpaceType meetingSpace;

    /**
     * Ruft den Wert der meetingSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingSpaceType }
     *     
     */
    public MeetingSpaceType getMeetingSpace() {
        return meetingSpace;
    }

    /**
     * Legt den Wert der meetingSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingSpaceType }
     *     
     */
    public void setMeetingSpace(MeetingSpaceType value) {
        this.meetingSpace = value;
    }

}
