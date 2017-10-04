
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderItemsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemResponseShapeType"/&gt;
 *         &lt;element name="SyncFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/&gt;
 *         &lt;element name="SyncState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ignore" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfBaseItemIdsType" minOccurs="0"/&gt;
 *         &lt;element name="MaxChangesReturned" type="{http://schemas.microsoft.com/exchange/services/2006/types}MaxSyncChangesReturnedType"/&gt;
 *         &lt;element name="SyncScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsScopeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderItemsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemShape",
    "syncFolderId",
    "syncState",
    "ignore",
    "maxChangesReturned",
    "syncScope"
})
public class SyncFolderItemsType
    extends BaseRequestType
{

    @XmlElement(name = "ItemShape", required = true)
    protected ItemResponseShapeType itemShape;
    @XmlElement(name = "SyncFolderId", required = true)
    protected TargetFolderIdType syncFolderId;
    @XmlElement(name = "SyncState")
    protected String syncState;
    @XmlElement(name = "Ignore")
    protected ArrayOfBaseItemIdsType ignore;
    @XmlElement(name = "MaxChangesReturned")
    protected int maxChangesReturned;
    @XmlElement(name = "SyncScope")
    @XmlSchemaType(name = "string")
    protected SyncFolderItemsScopeType syncScope;

    /**
     * Ruft den Wert der itemShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public ItemResponseShapeType getItemShape() {
        return itemShape;
    }

    /**
     * Legt den Wert der itemShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public void setItemShape(ItemResponseShapeType value) {
        this.itemShape = value;
    }

    /**
     * Ruft den Wert der syncFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getSyncFolderId() {
        return syncFolderId;
    }

    /**
     * Legt den Wert der syncFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setSyncFolderId(TargetFolderIdType value) {
        this.syncFolderId = value;
    }

    /**
     * Ruft den Wert der syncState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncState() {
        return syncState;
    }

    /**
     * Legt den Wert der syncState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncState(String value) {
        this.syncState = value;
    }

    /**
     * Ruft den Wert der ignore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseItemIdsType }
     *     
     */
    public ArrayOfBaseItemIdsType getIgnore() {
        return ignore;
    }

    /**
     * Legt den Wert der ignore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseItemIdsType }
     *     
     */
    public void setIgnore(ArrayOfBaseItemIdsType value) {
        this.ignore = value;
    }

    /**
     * Ruft den Wert der maxChangesReturned-Eigenschaft ab.
     * 
     */
    public int getMaxChangesReturned() {
        return maxChangesReturned;
    }

    /**
     * Legt den Wert der maxChangesReturned-Eigenschaft fest.
     * 
     */
    public void setMaxChangesReturned(int value) {
        this.maxChangesReturned = value;
    }

    /**
     * Ruft den Wert der syncScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SyncFolderItemsScopeType }
     *     
     */
    public SyncFolderItemsScopeType getSyncScope() {
        return syncScope;
    }

    /**
     * Legt den Wert der syncScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncFolderItemsScopeType }
     *     
     */
    public void setSyncScope(SyncFolderItemsScopeType value) {
        this.syncScope = value;
    }

}
