
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightEntityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirlineIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WindowsTimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureAirportIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalAirportIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightEntityType", propOrder = {
    "flightNumber",
    "airlineIataCode",
    "departureTime",
    "windowsTimeZoneName",
    "departureAirportIataCode",
    "arrivalAirportIataCode"
})
public class FlightEntityType {

    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "AirlineIataCode")
    protected String airlineIataCode;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "WindowsTimeZoneName")
    protected String windowsTimeZoneName;
    @XmlElement(name = "DepartureAirportIataCode")
    protected String departureAirportIataCode;
    @XmlElement(name = "ArrivalAirportIataCode")
    protected String arrivalAirportIataCode;

    /**
     * Ruft den Wert der flightNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Legt den Wert der flightNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Ruft den Wert der airlineIataCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    /**
     * Legt den Wert der airlineIataCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineIataCode(String value) {
        this.airlineIataCode = value;
    }

    /**
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Ruft den Wert der windowsTimeZoneName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowsTimeZoneName() {
        return windowsTimeZoneName;
    }

    /**
     * Legt den Wert der windowsTimeZoneName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowsTimeZoneName(String value) {
        this.windowsTimeZoneName = value;
    }

    /**
     * Ruft den Wert der departureAirportIataCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportIataCode() {
        return departureAirportIataCode;
    }

    /**
     * Legt den Wert der departureAirportIataCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportIataCode(String value) {
        this.departureAirportIataCode = value;
    }

    /**
     * Ruft den Wert der arrivalAirportIataCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportIataCode() {
        return arrivalAirportIataCode;
    }

    /**
     * Legt den Wert der arrivalAirportIataCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportIataCode(String value) {
        this.arrivalAirportIataCode = value;
    }

}
