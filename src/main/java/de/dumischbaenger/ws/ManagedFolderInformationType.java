
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Compound property for Managed Folder related information for Managed Folders.
 * 
 * <p>Java-Klasse für ManagedFolderInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ManagedFolderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanRenameOrMove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustDisplayComment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasQuota" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsManagedFoldersRoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagedFolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StorageQuota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FolderSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedFolderInformationType", propOrder = {
    "canDelete",
    "canRenameOrMove",
    "mustDisplayComment",
    "hasQuota",
    "isManagedFoldersRoot",
    "managedFolderId",
    "comment",
    "storageQuota",
    "folderSize",
    "homePage"
})
public class ManagedFolderInformationType {

    @XmlElement(name = "CanDelete")
    protected Boolean canDelete;
    @XmlElement(name = "CanRenameOrMove")
    protected Boolean canRenameOrMove;
    @XmlElement(name = "MustDisplayComment")
    protected Boolean mustDisplayComment;
    @XmlElement(name = "HasQuota")
    protected Boolean hasQuota;
    @XmlElement(name = "IsManagedFoldersRoot")
    protected Boolean isManagedFoldersRoot;
    @XmlElement(name = "ManagedFolderId")
    protected String managedFolderId;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "StorageQuota")
    protected Integer storageQuota;
    @XmlElement(name = "FolderSize")
    protected Integer folderSize;
    @XmlElement(name = "HomePage")
    protected String homePage;

    /**
     * Ruft den Wert der canDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Legt den Wert der canDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDelete(Boolean value) {
        this.canDelete = value;
    }

    /**
     * Ruft den Wert der canRenameOrMove-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRenameOrMove() {
        return canRenameOrMove;
    }

    /**
     * Legt den Wert der canRenameOrMove-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRenameOrMove(Boolean value) {
        this.canRenameOrMove = value;
    }

    /**
     * Ruft den Wert der mustDisplayComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustDisplayComment() {
        return mustDisplayComment;
    }

    /**
     * Legt den Wert der mustDisplayComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustDisplayComment(Boolean value) {
        this.mustDisplayComment = value;
    }

    /**
     * Ruft den Wert der hasQuota-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasQuota() {
        return hasQuota;
    }

    /**
     * Legt den Wert der hasQuota-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasQuota(Boolean value) {
        this.hasQuota = value;
    }

    /**
     * Ruft den Wert der isManagedFoldersRoot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManagedFoldersRoot() {
        return isManagedFoldersRoot;
    }

    /**
     * Legt den Wert der isManagedFoldersRoot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManagedFoldersRoot(Boolean value) {
        this.isManagedFoldersRoot = value;
    }

    /**
     * Ruft den Wert der managedFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedFolderId() {
        return managedFolderId;
    }

    /**
     * Legt den Wert der managedFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedFolderId(String value) {
        this.managedFolderId = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der storageQuota-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStorageQuota() {
        return storageQuota;
    }

    /**
     * Legt den Wert der storageQuota-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStorageQuota(Integer value) {
        this.storageQuota = value;
    }

    /**
     * Ruft den Wert der folderSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderSize() {
        return folderSize;
    }

    /**
     * Legt den Wert der folderSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderSize(Integer value) {
        this.folderSize = value;
    }

    /**
     * Ruft den Wert der homePage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Legt den Wert der homePage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

}
