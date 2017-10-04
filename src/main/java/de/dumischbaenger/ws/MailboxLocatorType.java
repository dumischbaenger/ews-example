
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxLocatorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxLocatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalDirectoryObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegacyDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxLocatorType", propOrder = {
    "externalDirectoryObjectId",
    "legacyDn"
})
@XmlSeeAlso({
    GroupLocatorType.class,
    UserLocatorType.class
})
public class MailboxLocatorType {

    @XmlElement(name = "ExternalDirectoryObjectId")
    protected String externalDirectoryObjectId;
    @XmlElement(name = "LegacyDn")
    protected String legacyDn;

    /**
     * Ruft den Wert der externalDirectoryObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDirectoryObjectId() {
        return externalDirectoryObjectId;
    }

    /**
     * Legt den Wert der externalDirectoryObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDirectoryObjectId(String value) {
        this.externalDirectoryObjectId = value;
    }

    /**
     * Ruft den Wert der legacyDn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyDn() {
        return legacyDn;
    }

    /**
     * Legt den Wert der legacyDn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyDn(String value) {
        this.legacyDn = value;
    }

}
