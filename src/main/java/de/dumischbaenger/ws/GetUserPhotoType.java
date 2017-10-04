
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserPhotoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserPhotoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SizeRequested" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserPhotoSizeType"/&gt;
 *         &lt;element name="TypeRequested" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserPhotoTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserPhotoType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "email",
    "sizeRequested",
    "typeRequested"
})
public class GetUserPhotoType
    extends BaseRequestType
{

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "SizeRequested", required = true)
    @XmlSchemaType(name = "string")
    protected UserPhotoSizeType sizeRequested;
    @XmlElement(name = "TypeRequested")
    @XmlSchemaType(name = "string")
    protected UserPhotoTypeType typeRequested;

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der sizeRequested-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserPhotoSizeType }
     *     
     */
    public UserPhotoSizeType getSizeRequested() {
        return sizeRequested;
    }

    /**
     * Legt den Wert der sizeRequested-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPhotoSizeType }
     *     
     */
    public void setSizeRequested(UserPhotoSizeType value) {
        this.sizeRequested = value;
    }

    /**
     * Ruft den Wert der typeRequested-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserPhotoTypeType }
     *     
     */
    public UserPhotoTypeType getTypeRequested() {
        return typeRequested;
    }

    /**
     * Legt den Wert der typeRequested-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPhotoTypeType }
     *     
     */
    public void setTypeRequested(UserPhotoTypeType value) {
        this.typeRequested = value;
    }

}
