
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityExtractionResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityExtractionResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAddressEntitiesType" minOccurs="0"/&gt;
 *         &lt;element name="MeetingSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMeetingSuggestionsType" minOccurs="0"/&gt;
 *         &lt;element name="TaskSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTaskSuggestionsType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressEntitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Contacts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfContactsType" minOccurs="0"/&gt;
 *         &lt;element name="Urls" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUrlEntitiesType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneEntitiesType" minOccurs="0"/&gt;
 *         &lt;element name="ParcelDeliveries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfParcelDeliveryEntitiesType" minOccurs="0"/&gt;
 *         &lt;element name="FlightReservations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFlightReservationsType" minOccurs="0"/&gt;
 *         &lt;element name="SenderAddIns" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSenderAddInsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityExtractionResultType", propOrder = {
    "addresses",
    "meetingSuggestions",
    "taskSuggestions",
    "emailAddresses",
    "contacts",
    "urls",
    "phoneNumbers",
    "parcelDeliveries",
    "flightReservations",
    "senderAddIns"
})
public class EntityExtractionResultType {

    @XmlElement(name = "Addresses")
    protected ArrayOfAddressEntitiesType addresses;
    @XmlElement(name = "MeetingSuggestions")
    protected ArrayOfMeetingSuggestionsType meetingSuggestions;
    @XmlElement(name = "TaskSuggestions")
    protected ArrayOfTaskSuggestionsType taskSuggestions;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfEmailAddressEntitiesType emailAddresses;
    @XmlElement(name = "Contacts")
    protected ArrayOfContactsType contacts;
    @XmlElement(name = "Urls")
    protected ArrayOfUrlEntitiesType urls;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhoneEntitiesType phoneNumbers;
    @XmlElement(name = "ParcelDeliveries")
    protected ArrayOfParcelDeliveryEntitiesType parcelDeliveries;
    @XmlElement(name = "FlightReservations")
    protected ArrayOfFlightReservationsType flightReservations;
    @XmlElement(name = "SenderAddIns")
    protected ArrayOfSenderAddInsType senderAddIns;

    /**
     * Ruft den Wert der addresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressEntitiesType }
     *     
     */
    public ArrayOfAddressEntitiesType getAddresses() {
        return addresses;
    }

    /**
     * Legt den Wert der addresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressEntitiesType }
     *     
     */
    public void setAddresses(ArrayOfAddressEntitiesType value) {
        this.addresses = value;
    }

    /**
     * Ruft den Wert der meetingSuggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeetingSuggestionsType }
     *     
     */
    public ArrayOfMeetingSuggestionsType getMeetingSuggestions() {
        return meetingSuggestions;
    }

    /**
     * Legt den Wert der meetingSuggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeetingSuggestionsType }
     *     
     */
    public void setMeetingSuggestions(ArrayOfMeetingSuggestionsType value) {
        this.meetingSuggestions = value;
    }

    /**
     * Ruft den Wert der taskSuggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaskSuggestionsType }
     *     
     */
    public ArrayOfTaskSuggestionsType getTaskSuggestions() {
        return taskSuggestions;
    }

    /**
     * Legt den Wert der taskSuggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaskSuggestionsType }
     *     
     */
    public void setTaskSuggestions(ArrayOfTaskSuggestionsType value) {
        this.taskSuggestions = value;
    }

    /**
     * Ruft den Wert der emailAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressEntitiesType }
     *     
     */
    public ArrayOfEmailAddressEntitiesType getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Legt den Wert der emailAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressEntitiesType }
     *     
     */
    public void setEmailAddresses(ArrayOfEmailAddressEntitiesType value) {
        this.emailAddresses = value;
    }

    /**
     * Ruft den Wert der contacts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactsType }
     *     
     */
    public ArrayOfContactsType getContacts() {
        return contacts;
    }

    /**
     * Legt den Wert der contacts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactsType }
     *     
     */
    public void setContacts(ArrayOfContactsType value) {
        this.contacts = value;
    }

    /**
     * Ruft den Wert der urls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUrlEntitiesType }
     *     
     */
    public ArrayOfUrlEntitiesType getUrls() {
        return urls;
    }

    /**
     * Legt den Wert der urls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUrlEntitiesType }
     *     
     */
    public void setUrls(ArrayOfUrlEntitiesType value) {
        this.urls = value;
    }

    /**
     * Ruft den Wert der phoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneEntitiesType }
     *     
     */
    public ArrayOfPhoneEntitiesType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Legt den Wert der phoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneEntitiesType }
     *     
     */
    public void setPhoneNumbers(ArrayOfPhoneEntitiesType value) {
        this.phoneNumbers = value;
    }

    /**
     * Ruft den Wert der parcelDeliveries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParcelDeliveryEntitiesType }
     *     
     */
    public ArrayOfParcelDeliveryEntitiesType getParcelDeliveries() {
        return parcelDeliveries;
    }

    /**
     * Legt den Wert der parcelDeliveries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParcelDeliveryEntitiesType }
     *     
     */
    public void setParcelDeliveries(ArrayOfParcelDeliveryEntitiesType value) {
        this.parcelDeliveries = value;
    }

    /**
     * Ruft den Wert der flightReservations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightReservationsType }
     *     
     */
    public ArrayOfFlightReservationsType getFlightReservations() {
        return flightReservations;
    }

    /**
     * Legt den Wert der flightReservations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightReservationsType }
     *     
     */
    public void setFlightReservations(ArrayOfFlightReservationsType value) {
        this.flightReservations = value;
    }

    /**
     * Ruft den Wert der senderAddIns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSenderAddInsType }
     *     
     */
    public ArrayOfSenderAddInsType getSenderAddIns() {
        return senderAddIns;
    }

    /**
     * Legt den Wert der senderAddIns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSenderAddInsType }
     *     
     */
    public void setSenderAddIns(ArrayOfSenderAddInsType value) {
        this.senderAddIns = value;
    }

}
