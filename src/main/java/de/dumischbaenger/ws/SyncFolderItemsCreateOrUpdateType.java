
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderItemsCreateOrUpdateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderItemsCreateOrUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Item" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"/&gt;
 *         &lt;element name="Message" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageType"/&gt;
 *         &lt;element name="CalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemType"/&gt;
 *         &lt;element name="Contact" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactItemType"/&gt;
 *         &lt;element name="DistributionList" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistributionListType"/&gt;
 *         &lt;element name="MeetingMessage" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingMessageType"/&gt;
 *         &lt;element name="MeetingRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingRequestMessageType"/&gt;
 *         &lt;element name="MeetingResponse" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingResponseMessageType"/&gt;
 *         &lt;element name="MeetingCancellation" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingCancellationMessageType"/&gt;
 *         &lt;element name="Task" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskType"/&gt;
 *         &lt;element name="PostItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostItemType"/&gt;
 *         &lt;element name="RoleMember" type="{http://schemas.microsoft.com/exchange/services/2006/types}RoleMemberItemType"/&gt;
 *         &lt;element name="Network" type="{http://schemas.microsoft.com/exchange/services/2006/types}NetworkItemType"/&gt;
 *         &lt;element name="Person" type="{http://schemas.microsoft.com/exchange/services/2006/types}AbchPersonItemType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderItemsCreateOrUpdateType", propOrder = {
    "item",
    "message",
    "calendarItem",
    "contact",
    "distributionList",
    "meetingMessage",
    "meetingRequest",
    "meetingResponse",
    "meetingCancellation",
    "task",
    "postItem",
    "roleMember",
    "network",
    "person"
})
public class SyncFolderItemsCreateOrUpdateType {

    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "Message")
    protected MessageType message;
    @XmlElement(name = "CalendarItem")
    protected CalendarItemType calendarItem;
    @XmlElement(name = "Contact")
    protected ContactItemType contact;
    @XmlElement(name = "DistributionList")
    protected DistributionListType distributionList;
    @XmlElement(name = "MeetingMessage")
    protected MeetingMessageType meetingMessage;
    @XmlElement(name = "MeetingRequest")
    protected MeetingRequestMessageType meetingRequest;
    @XmlElement(name = "MeetingResponse")
    protected MeetingResponseMessageType meetingResponse;
    @XmlElement(name = "MeetingCancellation")
    protected MeetingCancellationMessageType meetingCancellation;
    @XmlElement(name = "Task")
    protected TaskType task;
    @XmlElement(name = "PostItem")
    protected PostItemType postItem;
    @XmlElement(name = "RoleMember")
    protected RoleMemberItemType roleMember;
    @XmlElement(name = "Network")
    protected NetworkItemType network;
    @XmlElement(name = "Person")
    protected AbchPersonItemType person;

    /**
     * Ruft den Wert der item-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Legt den Wert der item-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der calendarItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemType }
     *     
     */
    public CalendarItemType getCalendarItem() {
        return calendarItem;
    }

    /**
     * Legt den Wert der calendarItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemType }
     *     
     */
    public void setCalendarItem(CalendarItemType value) {
        this.calendarItem = value;
    }

    /**
     * Ruft den Wert der contact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactItemType }
     *     
     */
    public ContactItemType getContact() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactItemType }
     *     
     */
    public void setContact(ContactItemType value) {
        this.contact = value;
    }

    /**
     * Ruft den Wert der distributionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionListType }
     *     
     */
    public DistributionListType getDistributionList() {
        return distributionList;
    }

    /**
     * Legt den Wert der distributionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionListType }
     *     
     */
    public void setDistributionList(DistributionListType value) {
        this.distributionList = value;
    }

    /**
     * Ruft den Wert der meetingMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingMessageType }
     *     
     */
    public MeetingMessageType getMeetingMessage() {
        return meetingMessage;
    }

    /**
     * Legt den Wert der meetingMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingMessageType }
     *     
     */
    public void setMeetingMessage(MeetingMessageType value) {
        this.meetingMessage = value;
    }

    /**
     * Ruft den Wert der meetingRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingRequestMessageType }
     *     
     */
    public MeetingRequestMessageType getMeetingRequest() {
        return meetingRequest;
    }

    /**
     * Legt den Wert der meetingRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRequestMessageType }
     *     
     */
    public void setMeetingRequest(MeetingRequestMessageType value) {
        this.meetingRequest = value;
    }

    /**
     * Ruft den Wert der meetingResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingResponseMessageType }
     *     
     */
    public MeetingResponseMessageType getMeetingResponse() {
        return meetingResponse;
    }

    /**
     * Legt den Wert der meetingResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingResponseMessageType }
     *     
     */
    public void setMeetingResponse(MeetingResponseMessageType value) {
        this.meetingResponse = value;
    }

    /**
     * Ruft den Wert der meetingCancellation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationMessageType }
     *     
     */
    public MeetingCancellationMessageType getMeetingCancellation() {
        return meetingCancellation;
    }

    /**
     * Legt den Wert der meetingCancellation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationMessageType }
     *     
     */
    public void setMeetingCancellation(MeetingCancellationMessageType value) {
        this.meetingCancellation = value;
    }

    /**
     * Ruft den Wert der task-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTask() {
        return task;
    }

    /**
     * Legt den Wert der task-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTask(TaskType value) {
        this.task = value;
    }

    /**
     * Ruft den Wert der postItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostItemType }
     *     
     */
    public PostItemType getPostItem() {
        return postItem;
    }

    /**
     * Legt den Wert der postItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostItemType }
     *     
     */
    public void setPostItem(PostItemType value) {
        this.postItem = value;
    }

    /**
     * Ruft den Wert der roleMember-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoleMemberItemType }
     *     
     */
    public RoleMemberItemType getRoleMember() {
        return roleMember;
    }

    /**
     * Legt den Wert der roleMember-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleMemberItemType }
     *     
     */
    public void setRoleMember(RoleMemberItemType value) {
        this.roleMember = value;
    }

    /**
     * Ruft den Wert der network-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkItemType }
     *     
     */
    public NetworkItemType getNetwork() {
        return network;
    }

    /**
     * Legt den Wert der network-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkItemType }
     *     
     */
    public void setNetwork(NetworkItemType value) {
        this.network = value;
    }

    /**
     * Ruft den Wert der person-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbchPersonItemType }
     *     
     */
    public AbchPersonItemType getPerson() {
        return person;
    }

    /**
     * Legt den Wert der person-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbchPersonItemType }
     *     
     */
    public void setPerson(AbchPersonItemType value) {
        this.person = value;
    }

}
