
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DistributionListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistributionListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactSource" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactSourceType" minOccurs="0"/&gt;
 *         &lt;element name="Members" type="{http://schemas.microsoft.com/exchange/services/2006/types}MembersListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionListType", propOrder = {
    "displayName",
    "fileAs",
    "contactSource",
    "members"
})
public class DistributionListType
    extends ItemType
{

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "FileAs")
    protected String fileAs;
    @XmlElement(name = "ContactSource")
    @XmlSchemaType(name = "string")
    protected ContactSourceType contactSource;
    @XmlElement(name = "Members")
    protected MembersListType members;

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
     * Ruft den Wert der fileAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAs() {
        return fileAs;
    }

    /**
     * Legt den Wert der fileAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAs(String value) {
        this.fileAs = value;
    }

    /**
     * Ruft den Wert der contactSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactSourceType }
     *     
     */
    public ContactSourceType getContactSource() {
        return contactSource;
    }

    /**
     * Legt den Wert der contactSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSourceType }
     *     
     */
    public void setContactSource(ContactSourceType value) {
        this.contactSource = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MembersListType }
     *     
     */
    public MembersListType getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MembersListType }
     *     
     */
    public void setMembers(MembersListType value) {
        this.members = value;
    }

}
