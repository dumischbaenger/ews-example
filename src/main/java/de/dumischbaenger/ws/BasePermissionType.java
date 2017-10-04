
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A permission on a folder
 * 
 * <p>Java-Klasse für BasePermissionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BasePermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserId" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserIdType"/&gt;
 *         &lt;element name="CanCreateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanCreateSubFolders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFolderOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFolderVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFolderContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EditItems" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionActionType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteItems" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionActionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePermissionType", propOrder = {
    "userId",
    "canCreateItems",
    "canCreateSubFolders",
    "isFolderOwner",
    "isFolderVisible",
    "isFolderContact",
    "editItems",
    "deleteItems"
})
@XmlSeeAlso({
    PermissionType.class,
    CalendarPermissionType.class
})
public abstract class BasePermissionType {

    @XmlElement(name = "UserId", required = true)
    protected UserIdType userId;
    @XmlElement(name = "CanCreateItems")
    protected Boolean canCreateItems;
    @XmlElement(name = "CanCreateSubFolders")
    protected Boolean canCreateSubFolders;
    @XmlElement(name = "IsFolderOwner")
    protected Boolean isFolderOwner;
    @XmlElement(name = "IsFolderVisible")
    protected Boolean isFolderVisible;
    @XmlElement(name = "IsFolderContact")
    protected Boolean isFolderContact;
    @XmlElement(name = "EditItems")
    @XmlSchemaType(name = "string")
    protected PermissionActionType editItems;
    @XmlElement(name = "DeleteItems")
    @XmlSchemaType(name = "string")
    protected PermissionActionType deleteItems;

    /**
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserIdType }
     *     
     */
    public UserIdType getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdType }
     *     
     */
    public void setUserId(UserIdType value) {
        this.userId = value;
    }

    /**
     * Ruft den Wert der canCreateItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateItems() {
        return canCreateItems;
    }

    /**
     * Legt den Wert der canCreateItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateItems(Boolean value) {
        this.canCreateItems = value;
    }

    /**
     * Ruft den Wert der canCreateSubFolders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateSubFolders() {
        return canCreateSubFolders;
    }

    /**
     * Legt den Wert der canCreateSubFolders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateSubFolders(Boolean value) {
        this.canCreateSubFolders = value;
    }

    /**
     * Ruft den Wert der isFolderOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFolderOwner() {
        return isFolderOwner;
    }

    /**
     * Legt den Wert der isFolderOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFolderOwner(Boolean value) {
        this.isFolderOwner = value;
    }

    /**
     * Ruft den Wert der isFolderVisible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFolderVisible() {
        return isFolderVisible;
    }

    /**
     * Legt den Wert der isFolderVisible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFolderVisible(Boolean value) {
        this.isFolderVisible = value;
    }

    /**
     * Ruft den Wert der isFolderContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFolderContact() {
        return isFolderContact;
    }

    /**
     * Legt den Wert der isFolderContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFolderContact(Boolean value) {
        this.isFolderContact = value;
    }

    /**
     * Ruft den Wert der editItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionActionType }
     *     
     */
    public PermissionActionType getEditItems() {
        return editItems;
    }

    /**
     * Legt den Wert der editItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionActionType }
     *     
     */
    public void setEditItems(PermissionActionType value) {
        this.editItems = value;
    }

    /**
     * Ruft den Wert der deleteItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionActionType }
     *     
     */
    public PermissionActionType getDeleteItems() {
        return deleteItems;
    }

    /**
     * Legt den Wert der deleteItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionActionType }
     *     
     */
    public void setDeleteItems(PermissionActionType value) {
        this.deleteItems = value;
    }

}
