
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CreateMeetingInstanceRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateMeetingInstanceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingInstance" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingInstanceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMeetingInstanceRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "meetingInstance"
})
public class CreateMeetingInstanceRequestType
    extends BaseRequestType
{

    @XmlElement(name = "MeetingInstance", required = true)
    protected MeetingInstanceType meetingInstance;

    /**
     * Ruft den Wert der meetingInstance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstanceType }
     *     
     */
    public MeetingInstanceType getMeetingInstance() {
        return meetingInstance;
    }

    /**
     * Legt den Wert der meetingInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstanceType }
     *     
     */
    public void setMeetingInstance(MeetingInstanceType value) {
        this.meetingInstance = value;
    }

}
