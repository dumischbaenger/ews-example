
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegisterConsentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegisterConsentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsentState" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConsentStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterConsentType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "id",
    "consentState"
})
public class RegisterConsentType
    extends BaseRequestType
{

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ConsentState", required = true)
    @XmlSchemaType(name = "string")
    protected ConsentStateType consentState;

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
     * Ruft den Wert der consentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConsentStateType }
     *     
     */
    public ConsentStateType getConsentState() {
        return consentState;
    }

    /**
     * Legt den Wert der consentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentStateType }
     *     
     */
    public void setConsentState(ConsentStateType value) {
        this.consentState = value;
    }

}
