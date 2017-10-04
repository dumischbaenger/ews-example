
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightReservationEntityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightReservationEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flights" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFlightsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightReservationEntityType", propOrder = {
    "reservationId",
    "reservationStatus",
    "underName",
    "brokerName",
    "brokerPhone",
    "flights"
})
public class FlightReservationEntityType {

    @XmlElement(name = "ReservationId")
    protected String reservationId;
    @XmlElement(name = "ReservationStatus")
    protected String reservationStatus;
    @XmlElement(name = "UnderName")
    protected String underName;
    @XmlElement(name = "BrokerName")
    protected String brokerName;
    @XmlElement(name = "BrokerPhone")
    protected String brokerPhone;
    @XmlElement(name = "Flights")
    protected ArrayOfFlightsType flights;

    /**
     * Ruft den Wert der reservationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Legt den Wert der reservationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Ruft den Wert der reservationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Legt den Wert der reservationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }

    /**
     * Ruft den Wert der underName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderName() {
        return underName;
    }

    /**
     * Legt den Wert der underName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderName(String value) {
        this.underName = value;
    }

    /**
     * Ruft den Wert der brokerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * Legt den Wert der brokerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    /**
     * Ruft den Wert der brokerPhone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerPhone() {
        return brokerPhone;
    }

    /**
     * Legt den Wert der brokerPhone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerPhone(String value) {
        this.brokerPhone = value;
    }

    /**
     * Ruft den Wert der flights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightsType }
     *     
     */
    public ArrayOfFlightsType getFlights() {
        return flights;
    }

    /**
     * Legt den Wert der flights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightsType }
     *     
     */
    public void setFlights(ArrayOfFlightsType value) {
        this.flights = value;
    }

}
