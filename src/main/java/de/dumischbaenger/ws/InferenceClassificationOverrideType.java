
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InferenceClassificationOverrideType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InferenceClassificationOverrideType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="SenderSmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SenderDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AlwaysClassifyAs" type="{http://schemas.microsoft.com/exchange/services/2006/types}InferenceClassificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InferenceClassificationOverrideType", propOrder = {
    "id",
    "senderSmtpAddress",
    "senderDisplayName",
    "alwaysClassifyAs"
})
public class InferenceClassificationOverrideType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SenderSmtpAddress", required = true)
    protected String senderSmtpAddress;
    @XmlElement(name = "SenderDisplayName", required = true)
    protected String senderDisplayName;
    @XmlElement(name = "AlwaysClassifyAs", required = true)
    @XmlSchemaType(name = "string")
    protected InferenceClassificationType alwaysClassifyAs;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der senderSmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderSmtpAddress() {
        return senderSmtpAddress;
    }

    /**
     * Legt den Wert der senderSmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderSmtpAddress(String value) {
        this.senderSmtpAddress = value;
    }

    /**
     * Ruft den Wert der senderDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderDisplayName() {
        return senderDisplayName;
    }

    /**
     * Legt den Wert der senderDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderDisplayName(String value) {
        this.senderDisplayName = value;
    }

    /**
     * Ruft den Wert der alwaysClassifyAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InferenceClassificationType }
     *     
     */
    public InferenceClassificationType getAlwaysClassifyAs() {
        return alwaysClassifyAs;
    }

    /**
     * Legt den Wert der alwaysClassifyAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InferenceClassificationType }
     *     
     */
    public void setAlwaysClassifyAs(InferenceClassificationType value) {
        this.alwaysClassifyAs = value;
    }

}
