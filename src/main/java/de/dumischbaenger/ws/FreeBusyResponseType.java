
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FreeBusyResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FreeBusyResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType" minOccurs="0"/&gt;
 *         &lt;element name="FreeBusyView" type="{http://schemas.microsoft.com/exchange/services/2006/types}FreeBusyView" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeBusyResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessage",
    "freeBusyView"
})
public class FreeBusyResponseType {

    @XmlElement(name = "ResponseMessage")
    protected ResponseMessageType responseMessage;
    @XmlElement(name = "FreeBusyView")
    protected FreeBusyView freeBusyView;

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
     * Ruft den Wert der freeBusyView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FreeBusyView }
     *     
     */
    public FreeBusyView getFreeBusyView() {
        return freeBusyView;
    }

    /**
     * Legt den Wert der freeBusyView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBusyView }
     *     
     */
    public void setFreeBusyView(FreeBusyView value) {
        this.freeBusyView = value;
    }

}
