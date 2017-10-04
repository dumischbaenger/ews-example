
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PhoneCallInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PhoneCallInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneCallState" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneCallStateType"/&gt;
 *         &lt;element name="ConnectionFailureCause" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConnectionFailureCauseType"/&gt;
 *         &lt;element name="SIPResponseText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIPResponseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneCallInformationType", propOrder = {
    "phoneCallState",
    "connectionFailureCause",
    "sipResponseText",
    "sipResponseCode"
})
public class PhoneCallInformationType {

    @XmlElement(name = "PhoneCallState", required = true)
    @XmlSchemaType(name = "string")
    protected PhoneCallStateType phoneCallState;
    @XmlElement(name = "ConnectionFailureCause", required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionFailureCauseType connectionFailureCause;
    @XmlElement(name = "SIPResponseText")
    protected String sipResponseText;
    @XmlElement(name = "SIPResponseCode")
    protected Integer sipResponseCode;

    /**
     * Ruft den Wert der phoneCallState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallStateType }
     *     
     */
    public PhoneCallStateType getPhoneCallState() {
        return phoneCallState;
    }

    /**
     * Legt den Wert der phoneCallState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallStateType }
     *     
     */
    public void setPhoneCallState(PhoneCallStateType value) {
        this.phoneCallState = value;
    }

    /**
     * Ruft den Wert der connectionFailureCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionFailureCauseType }
     *     
     */
    public ConnectionFailureCauseType getConnectionFailureCause() {
        return connectionFailureCause;
    }

    /**
     * Legt den Wert der connectionFailureCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionFailureCauseType }
     *     
     */
    public void setConnectionFailureCause(ConnectionFailureCauseType value) {
        this.connectionFailureCause = value;
    }

    /**
     * Ruft den Wert der sipResponseText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPResponseText() {
        return sipResponseText;
    }

    /**
     * Legt den Wert der sipResponseText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPResponseText(String value) {
        this.sipResponseText = value;
    }

    /**
     * Ruft den Wert der sipResponseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIPResponseCode() {
        return sipResponseCode;
    }

    /**
     * Legt den Wert der sipResponseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIPResponseCode(Integer value) {
        this.sipResponseCode = value;
    }

}
