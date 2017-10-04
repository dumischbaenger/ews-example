
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateMeetingInstanceRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateMeetingInstanceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="MeetingInstance" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingInstanceType" minOccurs="0"/&gt;
 *         &lt;element name="ContentActivitiesToAdd" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfContentActivities" minOccurs="0"/&gt;
 *         &lt;element name="ParticipantActivitiesToAdd" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfParticipantActivities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMeetingInstanceRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemId",
    "meetingInstance",
    "contentActivitiesToAdd",
    "participantActivitiesToAdd"
})
public class UpdateMeetingInstanceRequestType
    extends BaseRequestType
{

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "MeetingInstance")
    protected MeetingInstanceType meetingInstance;
    @XmlElement(name = "ContentActivitiesToAdd")
    protected NonEmptyArrayOfContentActivities contentActivitiesToAdd;
    @XmlElement(name = "ParticipantActivitiesToAdd")
    protected NonEmptyArrayOfParticipantActivities participantActivitiesToAdd;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

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

    /**
     * Ruft den Wert der contentActivitiesToAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfContentActivities }
     *     
     */
    public NonEmptyArrayOfContentActivities getContentActivitiesToAdd() {
        return contentActivitiesToAdd;
    }

    /**
     * Legt den Wert der contentActivitiesToAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfContentActivities }
     *     
     */
    public void setContentActivitiesToAdd(NonEmptyArrayOfContentActivities value) {
        this.contentActivitiesToAdd = value;
    }

    /**
     * Ruft den Wert der participantActivitiesToAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfParticipantActivities }
     *     
     */
    public NonEmptyArrayOfParticipantActivities getParticipantActivitiesToAdd() {
        return participantActivitiesToAdd;
    }

    /**
     * Legt den Wert der participantActivitiesToAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfParticipantActivities }
     *     
     */
    public void setParticipantActivitiesToAdd(NonEmptyArrayOfParticipantActivities value) {
        this.participantActivitiesToAdd = value;
    }

}
