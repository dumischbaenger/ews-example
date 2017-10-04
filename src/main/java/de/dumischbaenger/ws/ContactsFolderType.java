
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContactsFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactsFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SharingEffectiveRights" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionReadAccessType" minOccurs="0"/&gt;
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionSetType" minOccurs="0"/&gt;
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactsFolderType", propOrder = {
    "sharingEffectiveRights",
    "permissionSet",
    "sourceId",
    "accountName"
})
public class ContactsFolderType
    extends BaseFolderType
{

    @XmlElement(name = "SharingEffectiveRights")
    @XmlSchemaType(name = "string")
    protected PermissionReadAccessType sharingEffectiveRights;
    @XmlElement(name = "PermissionSet")
    protected PermissionSetType permissionSet;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElement(name = "AccountName")
    protected String accountName;

    /**
     * Ruft den Wert der sharingEffectiveRights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionReadAccessType }
     *     
     */
    public PermissionReadAccessType getSharingEffectiveRights() {
        return sharingEffectiveRights;
    }

    /**
     * Legt den Wert der sharingEffectiveRights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionReadAccessType }
     *     
     */
    public void setSharingEffectiveRights(PermissionReadAccessType value) {
        this.sharingEffectiveRights = value;
    }

    /**
     * Ruft den Wert der permissionSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionSetType }
     *     
     */
    public PermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Legt den Wert der permissionSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionSetType }
     *     
     */
    public void setPermissionSet(PermissionSetType value) {
        this.permissionSet = value;
    }

    /**
     * Ruft den Wert der sourceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Legt den Wert der sourceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Ruft den Wert der accountName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Legt den Wert der accountName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

}
