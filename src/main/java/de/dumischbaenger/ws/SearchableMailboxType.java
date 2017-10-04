
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Searchable mailbox.
 *       
 * 
 * <p>Java-Klasse für SearchableMailboxType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchableMailboxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsExternalMailbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExternalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsMembershipGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchableMailboxType", propOrder = {
    "guid",
    "primarySmtpAddress",
    "isExternalMailbox",
    "externalEmailAddress",
    "displayName",
    "isMembershipGroup",
    "referenceId"
})
public class SearchableMailboxType {

    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "PrimarySmtpAddress", required = true)
    protected String primarySmtpAddress;
    @XmlElement(name = "IsExternalMailbox")
    protected boolean isExternalMailbox;
    @XmlElement(name = "ExternalEmailAddress", required = true)
    protected String externalEmailAddress;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "IsMembershipGroup")
    protected boolean isMembershipGroup;
    @XmlElement(name = "ReferenceId", required = true)
    protected String referenceId;

    /**
     * Ruft den Wert der guid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Legt den Wert der guid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     * Ruft den Wert der isExternalMailbox-Eigenschaft ab.
     * 
     */
    public boolean isIsExternalMailbox() {
        return isExternalMailbox;
    }

    /**
     * Legt den Wert der isExternalMailbox-Eigenschaft fest.
     * 
     */
    public void setIsExternalMailbox(boolean value) {
        this.isExternalMailbox = value;
    }

    /**
     * Ruft den Wert der externalEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEmailAddress() {
        return externalEmailAddress;
    }

    /**
     * Legt den Wert der externalEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEmailAddress(String value) {
        this.externalEmailAddress = value;
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
     * Ruft den Wert der isMembershipGroup-Eigenschaft ab.
     * 
     */
    public boolean isIsMembershipGroup() {
        return isMembershipGroup;
    }

    /**
     * Legt den Wert der isMembershipGroup-Eigenschaft fest.
     * 
     */
    public void setIsMembershipGroup(boolean value) {
        this.isMembershipGroup = value;
    }

    /**
     * Ruft den Wert der referenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Legt den Wert der referenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

}
