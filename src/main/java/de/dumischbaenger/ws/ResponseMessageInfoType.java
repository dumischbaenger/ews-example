
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResponseMessageInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessageInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseClass" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseClassType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageInfoType", propOrder = {
    "messageText",
    "responseCode"
})
public class ResponseMessageInfoType {

    @XmlElement(name = "MessageText")
    protected String messageText;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlAttribute(name = "ResponseClass", required = true)
    protected ResponseClassType responseClass;

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

    /**
     * Ruft den Wert der responseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Legt den Wert der responseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Ruft den Wert der responseClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClassType }
     *     
     */
    public ResponseClassType getResponseClass() {
        return responseClass;
    }

    /**
     * Legt den Wert der responseClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClassType }
     *     
     */
    public void setResponseClass(ResponseClassType value) {
        this.responseClass = value;
    }

}
