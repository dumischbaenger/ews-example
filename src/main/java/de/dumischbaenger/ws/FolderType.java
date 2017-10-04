
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionSetType" minOccurs="0"/&gt;
 *         &lt;element name="UnreadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderType", propOrder = {
    "permissionSet",
    "unreadCount"
})
@XmlSeeAlso({
    SearchFolderType.class,
    TasksFolderType.class
})
public class FolderType
    extends BaseFolderType
{

    @XmlElement(name = "PermissionSet")
    protected PermissionSetType permissionSet;
    @XmlElement(name = "UnreadCount")
    protected Integer unreadCount;

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
     * Ruft den Wert der unreadCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     * Legt den Wert der unreadCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnreadCount(Integer value) {
        this.unreadCount = value;
    }

}
