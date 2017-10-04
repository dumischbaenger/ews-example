
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MeetingRequestMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingRequestMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingRequestType" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingRequestTypeType" minOccurs="0"/&gt;
 *         &lt;element name="IntendedFreeBusyStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}LegacyFreeBusyType" minOccurs="0"/&gt;
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAllDayEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LegacyFreeBusyStatus" type="{http://schemas.microsoft.com/exchange/services/2006/types}LegacyFreeBusyType" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="When" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeetingRequestWasSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalendarItemType" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemTypeType" minOccurs="0"/&gt;
 *         &lt;element name="MyResponseType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Organizer" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="RequiredAttendees" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttendeesType" minOccurs="0"/&gt;
 *         &lt;element name="OptionalAttendees" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttendeesType" minOccurs="0"/&gt;
 *         &lt;element name="Resources" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttendeesType" minOccurs="0"/&gt;
 *         &lt;element name="ConflictingMeetingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdjacentMeetingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConflictingMeetings" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAllItemsType" minOccurs="0"/&gt;
 *         &lt;element name="AdjacentMeetings" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAllItemsType" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppointmentReplyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AppointmentSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AppointmentState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Recurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrenceType" minOccurs="0"/&gt;
 *         &lt;element name="FirstOccurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}OccurrenceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="LastOccurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}OccurrenceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedOccurrences" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfOccurrenceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DeletedOccurrences" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfDeletedOccurrencesType" minOccurs="0"/&gt;
 *         &lt;element name="MeetingTimeZone" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeZoneType" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeZone" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeZoneDefinitionType" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeZone" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeZoneDefinitionType" minOccurs="0"/&gt;
 *         &lt;element name="ConferenceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllowNewTimeProposal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOnlineMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeetingWorkspaceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetShowUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnhancedLocation" type="{http://schemas.microsoft.com/exchange/services/2006/types}EnhancedLocationType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeHighlights" type="{http://schemas.microsoft.com/exchange/services/2006/types}ChangeHighlightsType" minOccurs="0"/&gt;
 *         &lt;element name="StartWallClock" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndWallClock" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRequestMessageType", propOrder = {
    "meetingRequestType",
    "intendedFreeBusyStatus",
    "start",
    "end",
    "originalStart",
    "isAllDayEvent",
    "legacyFreeBusyStatus",
    "location",
    "when",
    "isMeeting",
    "isCancelled",
    "isRecurring",
    "meetingRequestWasSent",
    "calendarItemType",
    "myResponseType",
    "organizer",
    "requiredAttendees",
    "optionalAttendees",
    "resources",
    "conflictingMeetingCount",
    "adjacentMeetingCount",
    "conflictingMeetings",
    "adjacentMeetings",
    "duration",
    "timeZone",
    "appointmentReplyTime",
    "appointmentSequenceNumber",
    "appointmentState",
    "recurrence",
    "firstOccurrence",
    "lastOccurrence",
    "modifiedOccurrences",
    "deletedOccurrences",
    "meetingTimeZone",
    "startTimeZone",
    "endTimeZone",
    "conferenceType",
    "allowNewTimeProposal",
    "isOnlineMeeting",
    "meetingWorkspaceUrl",
    "netShowUrl",
    "enhancedLocation",
    "changeHighlights",
    "startWallClock",
    "endWallClock",
    "startTimeZoneId",
    "endTimeZoneId"
})
public class MeetingRequestMessageType
    extends MeetingMessageType
{

    @XmlElement(name = "MeetingRequestType")
    @XmlSchemaType(name = "string")
    protected MeetingRequestTypeType meetingRequestType;
    @XmlElement(name = "IntendedFreeBusyStatus")
    @XmlSchemaType(name = "string")
    protected LegacyFreeBusyType intendedFreeBusyStatus;
    @XmlElement(name = "Start")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "OriginalStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalStart;
    @XmlElement(name = "IsAllDayEvent")
    protected Boolean isAllDayEvent;
    @XmlElement(name = "LegacyFreeBusyStatus")
    @XmlSchemaType(name = "string")
    protected LegacyFreeBusyType legacyFreeBusyStatus;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "When")
    protected String when;
    @XmlElement(name = "IsMeeting")
    protected Boolean isMeeting;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElement(name = "IsRecurring")
    protected Boolean isRecurring;
    @XmlElement(name = "MeetingRequestWasSent")
    protected Boolean meetingRequestWasSent;
    @XmlElement(name = "CalendarItemType")
    @XmlSchemaType(name = "string")
    protected CalendarItemTypeType calendarItemType;
    @XmlElement(name = "MyResponseType")
    @XmlSchemaType(name = "string")
    protected ResponseTypeType myResponseType;
    @XmlElement(name = "Organizer")
    protected SingleRecipientType organizer;
    @XmlElement(name = "RequiredAttendees")
    protected NonEmptyArrayOfAttendeesType requiredAttendees;
    @XmlElement(name = "OptionalAttendees")
    protected NonEmptyArrayOfAttendeesType optionalAttendees;
    @XmlElement(name = "Resources")
    protected NonEmptyArrayOfAttendeesType resources;
    @XmlElement(name = "ConflictingMeetingCount")
    protected Integer conflictingMeetingCount;
    @XmlElement(name = "AdjacentMeetingCount")
    protected Integer adjacentMeetingCount;
    @XmlElement(name = "ConflictingMeetings")
    protected NonEmptyArrayOfAllItemsType conflictingMeetings;
    @XmlElement(name = "AdjacentMeetings")
    protected NonEmptyArrayOfAllItemsType adjacentMeetings;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "AppointmentReplyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentReplyTime;
    @XmlElement(name = "AppointmentSequenceNumber")
    protected Integer appointmentSequenceNumber;
    @XmlElement(name = "AppointmentState")
    protected Integer appointmentState;
    @XmlElement(name = "Recurrence")
    protected RecurrenceType recurrence;
    @XmlElement(name = "FirstOccurrence")
    protected OccurrenceInfoType firstOccurrence;
    @XmlElement(name = "LastOccurrence")
    protected OccurrenceInfoType lastOccurrence;
    @XmlElement(name = "ModifiedOccurrences")
    protected NonEmptyArrayOfOccurrenceInfoType modifiedOccurrences;
    @XmlElement(name = "DeletedOccurrences")
    protected NonEmptyArrayOfDeletedOccurrencesType deletedOccurrences;
    @XmlElement(name = "MeetingTimeZone")
    protected TimeZoneType meetingTimeZone;
    @XmlElement(name = "StartTimeZone")
    protected TimeZoneDefinitionType startTimeZone;
    @XmlElement(name = "EndTimeZone")
    protected TimeZoneDefinitionType endTimeZone;
    @XmlElement(name = "ConferenceType")
    protected Integer conferenceType;
    @XmlElement(name = "AllowNewTimeProposal")
    protected Boolean allowNewTimeProposal;
    @XmlElement(name = "IsOnlineMeeting")
    protected Boolean isOnlineMeeting;
    @XmlElement(name = "MeetingWorkspaceUrl")
    protected String meetingWorkspaceUrl;
    @XmlElement(name = "NetShowUrl")
    protected String netShowUrl;
    @XmlElement(name = "EnhancedLocation")
    protected EnhancedLocationType enhancedLocation;
    @XmlElement(name = "ChangeHighlights")
    protected ChangeHighlightsType changeHighlights;
    @XmlElement(name = "StartWallClock")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startWallClock;
    @XmlElement(name = "EndWallClock")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endWallClock;
    @XmlElement(name = "StartTimeZoneId")
    protected String startTimeZoneId;
    @XmlElement(name = "EndTimeZoneId")
    protected String endTimeZoneId;

    /**
     * Ruft den Wert der meetingRequestType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingRequestTypeType }
     *     
     */
    public MeetingRequestTypeType getMeetingRequestType() {
        return meetingRequestType;
    }

    /**
     * Legt den Wert der meetingRequestType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRequestTypeType }
     *     
     */
    public void setMeetingRequestType(MeetingRequestTypeType value) {
        this.meetingRequestType = value;
    }

    /**
     * Ruft den Wert der intendedFreeBusyStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public LegacyFreeBusyType getIntendedFreeBusyStatus() {
        return intendedFreeBusyStatus;
    }

    /**
     * Legt den Wert der intendedFreeBusyStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public void setIntendedFreeBusyStatus(LegacyFreeBusyType value) {
        this.intendedFreeBusyStatus = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Ruft den Wert der originalStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalStart() {
        return originalStart;
    }

    /**
     * Legt den Wert der originalStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalStart(XMLGregorianCalendar value) {
        this.originalStart = value;
    }

    /**
     * Ruft den Wert der isAllDayEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllDayEvent() {
        return isAllDayEvent;
    }

    /**
     * Legt den Wert der isAllDayEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllDayEvent(Boolean value) {
        this.isAllDayEvent = value;
    }

    /**
     * Ruft den Wert der legacyFreeBusyStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public LegacyFreeBusyType getLegacyFreeBusyStatus() {
        return legacyFreeBusyStatus;
    }

    /**
     * Legt den Wert der legacyFreeBusyStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegacyFreeBusyType }
     *     
     */
    public void setLegacyFreeBusyStatus(LegacyFreeBusyType value) {
        this.legacyFreeBusyStatus = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der when-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhen() {
        return when;
    }

    /**
     * Legt den Wert der when-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhen(String value) {
        this.when = value;
    }

    /**
     * Ruft den Wert der isMeeting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMeeting() {
        return isMeeting;
    }

    /**
     * Legt den Wert der isMeeting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMeeting(Boolean value) {
        this.isMeeting = value;
    }

    /**
     * Ruft den Wert der isCancelled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Legt den Wert der isCancelled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

    /**
     * Ruft den Wert der isRecurring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Legt den Wert der isRecurring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Ruft den Wert der meetingRequestWasSent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingRequestWasSent() {
        return meetingRequestWasSent;
    }

    /**
     * Legt den Wert der meetingRequestWasSent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingRequestWasSent(Boolean value) {
        this.meetingRequestWasSent = value;
    }

    /**
     * Ruft den Wert der calendarItemType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemTypeType }
     *     
     */
    public CalendarItemTypeType getCalendarItemType() {
        return calendarItemType;
    }

    /**
     * Legt den Wert der calendarItemType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemTypeType }
     *     
     */
    public void setCalendarItemType(CalendarItemTypeType value) {
        this.calendarItemType = value;
    }

    /**
     * Ruft den Wert der myResponseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeType }
     *     
     */
    public ResponseTypeType getMyResponseType() {
        return myResponseType;
    }

    /**
     * Legt den Wert der myResponseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeType }
     *     
     */
    public void setMyResponseType(ResponseTypeType value) {
        this.myResponseType = value;
    }

    /**
     * Ruft den Wert der organizer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getOrganizer() {
        return organizer;
    }

    /**
     * Legt den Wert der organizer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setOrganizer(SingleRecipientType value) {
        this.organizer = value;
    }

    /**
     * Ruft den Wert der requiredAttendees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public NonEmptyArrayOfAttendeesType getRequiredAttendees() {
        return requiredAttendees;
    }

    /**
     * Legt den Wert der requiredAttendees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public void setRequiredAttendees(NonEmptyArrayOfAttendeesType value) {
        this.requiredAttendees = value;
    }

    /**
     * Ruft den Wert der optionalAttendees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public NonEmptyArrayOfAttendeesType getOptionalAttendees() {
        return optionalAttendees;
    }

    /**
     * Legt den Wert der optionalAttendees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public void setOptionalAttendees(NonEmptyArrayOfAttendeesType value) {
        this.optionalAttendees = value;
    }

    /**
     * Ruft den Wert der resources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public NonEmptyArrayOfAttendeesType getResources() {
        return resources;
    }

    /**
     * Legt den Wert der resources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAttendeesType }
     *     
     */
    public void setResources(NonEmptyArrayOfAttendeesType value) {
        this.resources = value;
    }

    /**
     * Ruft den Wert der conflictingMeetingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConflictingMeetingCount() {
        return conflictingMeetingCount;
    }

    /**
     * Legt den Wert der conflictingMeetingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConflictingMeetingCount(Integer value) {
        this.conflictingMeetingCount = value;
    }

    /**
     * Ruft den Wert der adjacentMeetingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdjacentMeetingCount() {
        return adjacentMeetingCount;
    }

    /**
     * Legt den Wert der adjacentMeetingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdjacentMeetingCount(Integer value) {
        this.adjacentMeetingCount = value;
    }

    /**
     * Ruft den Wert der conflictingMeetings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public NonEmptyArrayOfAllItemsType getConflictingMeetings() {
        return conflictingMeetings;
    }

    /**
     * Legt den Wert der conflictingMeetings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public void setConflictingMeetings(NonEmptyArrayOfAllItemsType value) {
        this.conflictingMeetings = value;
    }

    /**
     * Ruft den Wert der adjacentMeetings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public NonEmptyArrayOfAllItemsType getAdjacentMeetings() {
        return adjacentMeetings;
    }

    /**
     * Legt den Wert der adjacentMeetings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public void setAdjacentMeetings(NonEmptyArrayOfAllItemsType value) {
        this.adjacentMeetings = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Ruft den Wert der appointmentReplyTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentReplyTime() {
        return appointmentReplyTime;
    }

    /**
     * Legt den Wert der appointmentReplyTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentReplyTime(XMLGregorianCalendar value) {
        this.appointmentReplyTime = value;
    }

    /**
     * Ruft den Wert der appointmentSequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentSequenceNumber() {
        return appointmentSequenceNumber;
    }

    /**
     * Legt den Wert der appointmentSequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentSequenceNumber(Integer value) {
        this.appointmentSequenceNumber = value;
    }

    /**
     * Ruft den Wert der appointmentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentState() {
        return appointmentState;
    }

    /**
     * Legt den Wert der appointmentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentState(Integer value) {
        this.appointmentState = value;
    }

    /**
     * Ruft den Wert der recurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceType }
     *     
     */
    public RecurrenceType getRecurrence() {
        return recurrence;
    }

    /**
     * Legt den Wert der recurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceType }
     *     
     */
    public void setRecurrence(RecurrenceType value) {
        this.recurrence = value;
    }

    /**
     * Ruft den Wert der firstOccurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceInfoType }
     *     
     */
    public OccurrenceInfoType getFirstOccurrence() {
        return firstOccurrence;
    }

    /**
     * Legt den Wert der firstOccurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceInfoType }
     *     
     */
    public void setFirstOccurrence(OccurrenceInfoType value) {
        this.firstOccurrence = value;
    }

    /**
     * Ruft den Wert der lastOccurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceInfoType }
     *     
     */
    public OccurrenceInfoType getLastOccurrence() {
        return lastOccurrence;
    }

    /**
     * Legt den Wert der lastOccurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceInfoType }
     *     
     */
    public void setLastOccurrence(OccurrenceInfoType value) {
        this.lastOccurrence = value;
    }

    /**
     * Ruft den Wert der modifiedOccurrences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfOccurrenceInfoType }
     *     
     */
    public NonEmptyArrayOfOccurrenceInfoType getModifiedOccurrences() {
        return modifiedOccurrences;
    }

    /**
     * Legt den Wert der modifiedOccurrences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfOccurrenceInfoType }
     *     
     */
    public void setModifiedOccurrences(NonEmptyArrayOfOccurrenceInfoType value) {
        this.modifiedOccurrences = value;
    }

    /**
     * Ruft den Wert der deletedOccurrences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfDeletedOccurrencesType }
     *     
     */
    public NonEmptyArrayOfDeletedOccurrencesType getDeletedOccurrences() {
        return deletedOccurrences;
    }

    /**
     * Legt den Wert der deletedOccurrences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfDeletedOccurrencesType }
     *     
     */
    public void setDeletedOccurrences(NonEmptyArrayOfDeletedOccurrencesType value) {
        this.deletedOccurrences = value;
    }

    /**
     * Ruft den Wert der meetingTimeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneType }
     *     
     */
    public TimeZoneType getMeetingTimeZone() {
        return meetingTimeZone;
    }

    /**
     * Legt den Wert der meetingTimeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneType }
     *     
     */
    public void setMeetingTimeZone(TimeZoneType value) {
        this.meetingTimeZone = value;
    }

    /**
     * Ruft den Wert der startTimeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public TimeZoneDefinitionType getStartTimeZone() {
        return startTimeZone;
    }

    /**
     * Legt den Wert der startTimeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public void setStartTimeZone(TimeZoneDefinitionType value) {
        this.startTimeZone = value;
    }

    /**
     * Ruft den Wert der endTimeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public TimeZoneDefinitionType getEndTimeZone() {
        return endTimeZone;
    }

    /**
     * Legt den Wert der endTimeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneDefinitionType }
     *     
     */
    public void setEndTimeZone(TimeZoneDefinitionType value) {
        this.endTimeZone = value;
    }

    /**
     * Ruft den Wert der conferenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConferenceType() {
        return conferenceType;
    }

    /**
     * Legt den Wert der conferenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConferenceType(Integer value) {
        this.conferenceType = value;
    }

    /**
     * Ruft den Wert der allowNewTimeProposal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNewTimeProposal() {
        return allowNewTimeProposal;
    }

    /**
     * Legt den Wert der allowNewTimeProposal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNewTimeProposal(Boolean value) {
        this.allowNewTimeProposal = value;
    }

    /**
     * Ruft den Wert der isOnlineMeeting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnlineMeeting() {
        return isOnlineMeeting;
    }

    /**
     * Legt den Wert der isOnlineMeeting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnlineMeeting(Boolean value) {
        this.isOnlineMeeting = value;
    }

    /**
     * Ruft den Wert der meetingWorkspaceUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingWorkspaceUrl() {
        return meetingWorkspaceUrl;
    }

    /**
     * Legt den Wert der meetingWorkspaceUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingWorkspaceUrl(String value) {
        this.meetingWorkspaceUrl = value;
    }

    /**
     * Ruft den Wert der netShowUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetShowUrl() {
        return netShowUrl;
    }

    /**
     * Legt den Wert der netShowUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetShowUrl(String value) {
        this.netShowUrl = value;
    }

    /**
     * Ruft den Wert der enhancedLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedLocationType }
     *     
     */
    public EnhancedLocationType getEnhancedLocation() {
        return enhancedLocation;
    }

    /**
     * Legt den Wert der enhancedLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedLocationType }
     *     
     */
    public void setEnhancedLocation(EnhancedLocationType value) {
        this.enhancedLocation = value;
    }

    /**
     * Ruft den Wert der changeHighlights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChangeHighlightsType }
     *     
     */
    public ChangeHighlightsType getChangeHighlights() {
        return changeHighlights;
    }

    /**
     * Legt den Wert der changeHighlights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeHighlightsType }
     *     
     */
    public void setChangeHighlights(ChangeHighlightsType value) {
        this.changeHighlights = value;
    }

    /**
     * Ruft den Wert der startWallClock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartWallClock() {
        return startWallClock;
    }

    /**
     * Legt den Wert der startWallClock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartWallClock(XMLGregorianCalendar value) {
        this.startWallClock = value;
    }

    /**
     * Ruft den Wert der endWallClock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndWallClock() {
        return endWallClock;
    }

    /**
     * Legt den Wert der endWallClock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndWallClock(XMLGregorianCalendar value) {
        this.endWallClock = value;
    }

    /**
     * Ruft den Wert der startTimeZoneId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeZoneId() {
        return startTimeZoneId;
    }

    /**
     * Legt den Wert der startTimeZoneId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeZoneId(String value) {
        this.startTimeZoneId = value;
    }

    /**
     * Ruft den Wert der endTimeZoneId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeZoneId() {
        return endTimeZoneId;
    }

    /**
     * Legt den Wert der endTimeZoneId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeZoneId(String value) {
        this.endTimeZoneId = value;
    }

}
