
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ArchiveItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArchiveItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArchiveSourceFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/&gt;
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveItemType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "archiveSourceFolderId",
    "itemIds"
})
public class ArchiveItemType
    extends BaseRequestType
{

    @XmlElement(name = "ArchiveSourceFolderId", required = true)
    protected TargetFolderIdType archiveSourceFolderId;
    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;

    /**
     * Ruft den Wert der archiveSourceFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getArchiveSourceFolderId() {
        return archiveSourceFolderId;
    }

    /**
     * Legt den Wert der archiveSourceFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setArchiveSourceFolderId(TargetFolderIdType value) {
        this.archiveSourceFolderId = value;
    }

    /**
     * Ruft den Wert der itemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Legt den Wert der itemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }

}
