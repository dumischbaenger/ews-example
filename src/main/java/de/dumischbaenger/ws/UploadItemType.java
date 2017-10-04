
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UploadItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UploadItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CreateAction" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}CreateActionType" /&gt;
 *       &lt;attribute name="IsAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadItemType", propOrder = {
    "parentFolderId",
    "itemId",
    "data"
})
public class UploadItemType {

    @XmlElement(name = "ParentFolderId", required = true)
    protected FolderIdType parentFolderId;
    @XmlElement(name = "ItemId")
    protected ItemIdType itemId;
    @XmlElement(name = "Data", required = true)
    protected byte[] data;
    @XmlAttribute(name = "CreateAction", required = true)
    protected CreateActionType createAction;
    @XmlAttribute(name = "IsAssociated")
    protected Boolean isAssociated;

    /**
     * Ruft den Wert der parentFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Legt den Wert der parentFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setParentFolderId(FolderIdType value) {
        this.parentFolderId = value;
    }

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Ruft den Wert der createAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CreateActionType }
     *     
     */
    public CreateActionType getCreateAction() {
        return createAction;
    }

    /**
     * Legt den Wert der createAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateActionType }
     *     
     */
    public void setCreateAction(CreateActionType value) {
        this.createAction = value;
    }

    /**
     * Ruft den Wert der isAssociated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssociated() {
        return isAssociated;
    }

    /**
     * Legt den Wert der isAssociated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssociated(Boolean value) {
        this.isAssociated = value;
    }

}
