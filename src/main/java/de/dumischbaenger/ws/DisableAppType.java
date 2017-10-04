
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DisableAppType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DisableAppType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisableReason" type="{http://schemas.microsoft.com/exchange/services/2006/types}DisableReasonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisableAppType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "id",
    "disableReason"
})
public class DisableAppType
    extends BaseRequestType
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "DisableReason", required = true)
    @XmlSchemaType(name = "string")
    protected DisableReasonType disableReason;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der disableReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisableReasonType }
     *     
     */
    public DisableReasonType getDisableReason() {
        return disableReason;
    }

    /**
     * Legt den Wert der disableReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisableReasonType }
     *     
     */
    public void setDisableReason(DisableReasonType value) {
        this.disableReason = value;
    }

}
