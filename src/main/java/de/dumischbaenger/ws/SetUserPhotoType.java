
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetUserPhotoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetUserPhotoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SetUserPhotoType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "email",
    "content",
    "typeRequested"
})
public class SetUserPhotoType
    extends BaseRequestType
{

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Content", required = true)
    protected String content;
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
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
