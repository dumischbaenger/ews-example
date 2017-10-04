
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extends EmailAddress by adding the external object id
 * 
 * <p>Java-Klasse für EmailAddressExtendedType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressExtendedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryEmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressExtendedType", propOrder = {
    "externalObjectId",
    "primaryEmailAddress"
})
public class EmailAddressExtendedType
    extends EmailAddressType
{

    @XmlElement(name = "ExternalObjectId")
    protected String externalObjectId;
    @XmlElement(name = "PrimaryEmailAddress")
    protected String primaryEmailAddress;

    /**
     * Ruft den Wert der externalObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalObjectId() {
        return externalObjectId;
    }

    /**
     * Legt den Wert der externalObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalObjectId(String value) {
        this.externalObjectId = value;
    }

    /**
     * Ruft den Wert der primaryEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * Legt den Wert der primaryEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmailAddress(String value) {
        this.primaryEmailAddress = value;
    }

}
