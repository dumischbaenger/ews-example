
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SharingEffectiveRights" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarPermissionReadAccessType" minOccurs="0"/&gt;
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarPermissionSetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarFolderType", propOrder = {
    "sharingEffectiveRights",
    "permissionSet"
})
public class CalendarFolderType
    extends BaseFolderType
{

    @XmlElement(name = "SharingEffectiveRights")
    @XmlSchemaType(name = "string")
    protected CalendarPermissionReadAccessType sharingEffectiveRights;
    @XmlElement(name = "PermissionSet")
    protected CalendarPermissionSetType permissionSet;

    /**
     * Ruft den Wert der sharingEffectiveRights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPermissionReadAccessType }
     *     
     */
    public CalendarPermissionReadAccessType getSharingEffectiveRights() {
        return sharingEffectiveRights;
    }

    /**
     * Legt den Wert der sharingEffectiveRights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPermissionReadAccessType }
     *     
     */
    public void setSharingEffectiveRights(CalendarPermissionReadAccessType value) {
        this.sharingEffectiveRights = value;
    }

    /**
     * Ruft den Wert der permissionSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPermissionSetType }
     *     
     */
    public CalendarPermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Legt den Wert der permissionSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPermissionSetType }
     *     
     */
    public void setPermissionSet(CalendarPermissionSetType value) {
        this.permissionSet = value;
    }

}
