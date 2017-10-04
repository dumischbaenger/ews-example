
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeopleRefinerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PeopleRefinerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchRefinerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeopleRefinerType", propOrder = {
    "displayName",
    "smtpAddress"
})
public class PeopleRefinerType
    extends SearchRefinerType
{

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "SmtpAddress")
    protected SmtpAddressType smtpAddress;

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der smtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpAddressType }
     *     
     */
    public SmtpAddressType getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Legt den Wert der smtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpAddressType }
     *     
     */
    public void setSmtpAddress(SmtpAddressType value) {
        this.smtpAddress = value;
    }

}
