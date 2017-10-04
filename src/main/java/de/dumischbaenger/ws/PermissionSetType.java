
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The set of permissions on a folder
 * 
 * <p>Java-Klasse für PermissionSetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Permissions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPermissionsType"/&gt;
 *         &lt;element name="UnknownEntries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUnknownEntriesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetType", propOrder = {
    "permissions",
    "unknownEntries"
})
public class PermissionSetType {

    @XmlElement(name = "Permissions", required = true)
    protected ArrayOfPermissionsType permissions;
    @XmlElement(name = "UnknownEntries")
    protected ArrayOfUnknownEntriesType unknownEntries;

    /**
     * Ruft den Wert der permissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPermissionsType }
     *     
     */
    public ArrayOfPermissionsType getPermissions() {
        return permissions;
    }

    /**
     * Legt den Wert der permissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPermissionsType }
     *     
     */
    public void setPermissions(ArrayOfPermissionsType value) {
        this.permissions = value;
    }

    /**
     * Ruft den Wert der unknownEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnknownEntriesType }
     *     
     */
    public ArrayOfUnknownEntriesType getUnknownEntries() {
        return unknownEntries;
    }

    /**
     * Legt den Wert der unknownEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnknownEntriesType }
     *     
     */
    public void setUnknownEntries(ArrayOfUnknownEntriesType value) {
        this.unknownEntries = value;
    }

}
