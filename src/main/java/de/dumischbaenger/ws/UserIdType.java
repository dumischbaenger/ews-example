
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistinguishedUser" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedUserType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUserIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdType", propOrder = {
    "sid",
    "primarySmtpAddress",
    "displayName",
    "distinguishedUser",
    "externalUserIdentity"
})
public class UserIdType {

    @XmlElement(name = "SID")
    protected String sid;
    @XmlElement(name = "PrimarySmtpAddress")
    protected String primarySmtpAddress;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "DistinguishedUser")
    @XmlSchemaType(name = "string")
    protected DistinguishedUserType distinguishedUser;
    @XmlElement(name = "ExternalUserIdentity")
    protected String externalUserIdentity;

    /**
     * Ruft den Wert der sid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Legt den Wert der sid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

    /**
     * Ruft den Wert der primarySmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Legt den Wert der primarySmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySmtpAddress(String value) {
        this.primarySmtpAddress = value;
    }

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
     * Ruft den Wert der distinguishedUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedUserType }
     *     
     */
    public DistinguishedUserType getDistinguishedUser() {
        return distinguishedUser;
    }

    /**
     * Legt den Wert der distinguishedUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedUserType }
     *     
     */
    public void setDistinguishedUser(DistinguishedUserType value) {
        this.distinguishedUser = value;
    }

    /**
     * Ruft den Wert der externalUserIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserIdentity() {
        return externalUserIdentity;
    }

    /**
     * Legt den Wert der externalUserIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserIdentity(String value) {
        this.externalUserIdentity = value;
    }

}
