
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarkAllItemsAsReadType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarkAllItemsAsReadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SuppressReadReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAllItemsAsReadType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "readFlag",
    "suppressReadReceipts",
    "folderIds"
})
public class MarkAllItemsAsReadType
    extends BaseRequestType
{

    @XmlElement(name = "ReadFlag")
    protected boolean readFlag;
    @XmlElement(name = "SuppressReadReceipts")
    protected boolean suppressReadReceipts;
    @XmlElement(name = "FolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType folderIds;

    /**
     * Ruft den Wert der readFlag-Eigenschaft ab.
     * 
     */
    public boolean isReadFlag() {
        return readFlag;
    }

    /**
     * Legt den Wert der readFlag-Eigenschaft fest.
     * 
     */
    public void setReadFlag(boolean value) {
        this.readFlag = value;
    }

    /**
     * Ruft den Wert der suppressReadReceipts-Eigenschaft ab.
     * 
     */
    public boolean isSuppressReadReceipts() {
        return suppressReadReceipts;
    }

    /**
     * Legt den Wert der suppressReadReceipts-Eigenschaft fest.
     * 
     */
    public void setSuppressReadReceipts(boolean value) {
        this.suppressReadReceipts = value;
    }

    /**
     * Ruft den Wert der folderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFolderIds() {
        return folderIds;
    }

    /**
     * Legt den Wert der folderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.folderIds = value;
    }

}
