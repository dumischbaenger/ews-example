
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserOofSettingsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserOofSettingsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"/&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}OofSettings" minOccurs="0"/&gt;
 *         &lt;element name="AllowExternalOof" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExternalAudience" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserOofSettingsResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessage",
    "oofSettings",
    "allowExternalOof"
})
public class GetUserOofSettingsResponse {

    @XmlElement(name = "ResponseMessage", required = true)
    protected ResponseMessageType responseMessage;
    @XmlElement(name = "OofSettings", namespace = "http://schemas.microsoft.com/exchange/services/2006/types")
    protected UserOofSettings oofSettings;
    @XmlElement(name = "AllowExternalOof")
    @XmlSchemaType(name = "string")
    protected ExternalAudience allowExternalOof;

    /**
     * Ruft den Wert der responseMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType }
     *     
     */
    public ResponseMessageType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Legt den Wert der responseMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType }
     *     
     */
    public void setResponseMessage(ResponseMessageType value) {
        this.responseMessage = value;
    }

    /**
     * Ruft den Wert der oofSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserOofSettings }
     *     
     */
    public UserOofSettings getOofSettings() {
        return oofSettings;
    }

    /**
     * Legt den Wert der oofSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOofSettings }
     *     
     */
    public void setOofSettings(UserOofSettings value) {
        this.oofSettings = value;
    }

    /**
     * Ruft den Wert der allowExternalOof-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAudience }
     *     
     */
    public ExternalAudience getAllowExternalOof() {
        return allowExternalOof;
    }

    /**
     * Legt den Wert der allowExternalOof-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAudience }
     *     
     */
    public void setAllowExternalOof(ExternalAudience value) {
        this.allowExternalOof = value;
    }

}
