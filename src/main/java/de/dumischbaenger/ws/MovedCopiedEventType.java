
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MovedCopiedEventType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MovedCopiedEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="OldFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *           &lt;element name="OldItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="OldParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovedCopiedEventType", propOrder = {
    "oldFolderId",
    "oldItemId",
    "oldParentFolderId"
})
public class MovedCopiedEventType
    extends BaseObjectChangedEventType
{

    @XmlElement(name = "OldFolderId")
    protected FolderIdType oldFolderId;
    @XmlElement(name = "OldItemId")
    protected ItemIdType oldItemId;
    @XmlElement(name = "OldParentFolderId", required = true)
    protected FolderIdType oldParentFolderId;

    /**
     * Ruft den Wert der oldFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getOldFolderId() {
        return oldFolderId;
    }

    /**
     * Legt den Wert der oldFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setOldFolderId(FolderIdType value) {
        this.oldFolderId = value;
    }

    /**
     * Ruft den Wert der oldItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getOldItemId() {
        return oldItemId;
    }

    /**
     * Legt den Wert der oldItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setOldItemId(ItemIdType value) {
        this.oldItemId = value;
    }

    /**
     * Ruft den Wert der oldParentFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getOldParentFolderId() {
        return oldParentFolderId;
    }

    /**
     * Legt den Wert der oldParentFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setOldParentFolderId(FolderIdType value) {
        this.oldParentFolderId = value;
    }

}
