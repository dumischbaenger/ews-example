
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Set of mailbox, search scope and its extended attributes.
 *       
 * 
 * <p>Java-Klasse für MailboxSearchScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxSearchScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType"/&gt;
 *         &lt;element name="ExtendedAttributes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfExtendedAttributesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxSearchScopeType", propOrder = {
    "mailbox",
    "searchScope",
    "extendedAttributes"
})
public class MailboxSearchScopeType {

    @XmlElement(name = "Mailbox", required = true)
    protected String mailbox;
    @XmlElement(name = "SearchScope", required = true)
    @XmlSchemaType(name = "string")
    protected MailboxSearchLocationType searchScope;
    @XmlElement(name = "ExtendedAttributes")
    protected ArrayOfExtendedAttributesType extendedAttributes;

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailbox(String value) {
        this.mailbox = value;
    }

    /**
     * Ruft den Wert der searchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getSearchScope() {
        return searchScope;
    }

    /**
     * Legt den Wert der searchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setSearchScope(MailboxSearchLocationType value) {
        this.searchScope = value;
    }

    /**
     * Ruft den Wert der extendedAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedAttributesType }
     *     
     */
    public ArrayOfExtendedAttributesType getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Legt den Wert der extendedAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedAttributesType }
     *     
     */
    public void setExtendedAttributes(ArrayOfExtendedAttributesType value) {
        this.extendedAttributes = value;
    }

}
