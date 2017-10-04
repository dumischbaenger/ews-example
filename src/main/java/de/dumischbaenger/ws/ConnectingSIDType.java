
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConnectingSIDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConnectingSIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PrincipalName" type="{http://schemas.microsoft.com/exchange/services/2006/types}PrincipalNameType"/&gt;
 *         &lt;element name="SID" type="{http://schemas.microsoft.com/exchange/services/2006/types}SIDType"/&gt;
 *         &lt;element name="PrimarySmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}PrimarySmtpAddressType"/&gt;
 *         &lt;element name="SmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpAddressType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectingSIDType", propOrder = {
    "principalName",
    "sid",
    "primarySmtpAddress",
    "smtpAddress"
})
public class ConnectingSIDType {

    @XmlElement(name = "PrincipalName")
    protected PrincipalNameType principalName;
    @XmlElement(name = "SID")
    protected SIDType sid;
    @XmlElement(name = "PrimarySmtpAddress")
    protected PrimarySmtpAddressType primarySmtpAddress;
    @XmlElement(name = "SmtpAddress")
    protected SmtpAddressType smtpAddress;

    /**
     * Ruft den Wert der principalName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalNameType }
     *     
     */
    public PrincipalNameType getPrincipalName() {
        return principalName;
    }

    /**
     * Legt den Wert der principalName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalNameType }
     *     
     */
    public void setPrincipalName(PrincipalNameType value) {
        this.principalName = value;
    }

    /**
     * Ruft den Wert der sid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SIDType }
     *     
     */
    public SIDType getSID() {
        return sid;
    }

    /**
     * Legt den Wert der sid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SIDType }
     *     
     */
    public void setSID(SIDType value) {
        this.sid = value;
    }

    /**
     * Ruft den Wert der primarySmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrimarySmtpAddressType }
     *     
     */
    public PrimarySmtpAddressType getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Legt den Wert der primarySmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimarySmtpAddressType }
     *     
     */
    public void setPrimarySmtpAddress(PrimarySmtpAddressType value) {
        this.primarySmtpAddress = value;
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
