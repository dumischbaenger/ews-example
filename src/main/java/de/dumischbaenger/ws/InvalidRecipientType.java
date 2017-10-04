
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InvalidRecipientType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InvalidRecipientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ResponseCode" type="{http://schemas.microsoft.com/exchange/services/2006/types}InvalidRecipientResponseCodeType"/&gt;
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidRecipientType", propOrder = {
    "smtpAddress",
    "responseCode",
    "messageText"
})
public class InvalidRecipientType {

    @XmlElement(name = "SmtpAddress", required = true)
    protected String smtpAddress;
    @XmlElement(name = "ResponseCode", required = true)
    @XmlSchemaType(name = "string")
    protected InvalidRecipientResponseCodeType responseCode;
    @XmlElement(name = "MessageText")
    protected String messageText;

    /**
     * Ruft den Wert der smtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Legt den Wert der smtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddress(String value) {
        this.smtpAddress = value;
    }

    /**
     * Ruft den Wert der responseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InvalidRecipientResponseCodeType }
     *     
     */
    public InvalidRecipientResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Legt den Wert der responseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidRecipientResponseCodeType }
     *     
     */
    public void setResponseCode(InvalidRecipientResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Ruft den Wert der messageText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Legt den Wert der messageText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
