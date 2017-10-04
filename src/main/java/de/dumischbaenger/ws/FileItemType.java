
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FileItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FileCreatedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileModifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StorageProviderContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemReceivedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemSentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileContexts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="VisualizationContainerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisualizationContainerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileItemType", propOrder = {
    "fileName",
    "fileExtension",
    "fileSize",
    "fileCreatedTime",
    "fileModifiedTime",
    "storageProviderContext",
    "fileID",
    "itemReferenceId",
    "referenceId",
    "sender",
    "itemReceivedTime",
    "itemPath",
    "itemSentTime",
    "fileContexts",
    "visualizationContainerUrl",
    "visualizationContainerTitle"
})
@XmlSeeAlso({
    DocumentFileItemType.class
})
public class FileItemType
    extends ItemType
{

    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileExtension")
    protected String fileExtension;
    @XmlElement(name = "FileSize")
    protected Long fileSize;
    @XmlElement(name = "FileCreatedTime")
    protected String fileCreatedTime;
    @XmlElement(name = "FileModifiedTime")
    protected String fileModifiedTime;
    @XmlElement(name = "StorageProviderContext")
    protected String storageProviderContext;
    @XmlElement(name = "FileID")
    protected String fileID;
    @XmlElement(name = "ItemReferenceId")
    protected String itemReferenceId;
    @XmlElement(name = "ReferenceId")
    protected String referenceId;
    @XmlElement(name = "Sender")
    protected String sender;
    @XmlElement(name = "ItemReceivedTime")
    protected String itemReceivedTime;
    @XmlElement(name = "ItemPath")
    protected String itemPath;
    @XmlElement(name = "ItemSentTime")
    protected String itemSentTime;
    @XmlElement(name = "FileContexts")
    protected ArrayOfStringsType fileContexts;
    @XmlElement(name = "VisualizationContainerUrl")
    protected String visualizationContainerUrl;
    @XmlElement(name = "VisualizationContainerTitle")
    protected String visualizationContainerTitle;

    /**
     * Ruft den Wert der fileName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Legt den Wert der fileName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Ruft den Wert der fileExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Legt den Wert der fileExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Ruft den Wert der fileSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Legt den Wert der fileSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Ruft den Wert der fileCreatedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCreatedTime() {
        return fileCreatedTime;
    }

    /**
     * Legt den Wert der fileCreatedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCreatedTime(String value) {
        this.fileCreatedTime = value;
    }

    /**
     * Ruft den Wert der fileModifiedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileModifiedTime() {
        return fileModifiedTime;
    }

    /**
     * Legt den Wert der fileModifiedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileModifiedTime(String value) {
        this.fileModifiedTime = value;
    }

    /**
     * Ruft den Wert der storageProviderContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageProviderContext() {
        return storageProviderContext;
    }

    /**
     * Legt den Wert der storageProviderContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageProviderContext(String value) {
        this.storageProviderContext = value;
    }

    /**
     * Ruft den Wert der fileID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Legt den Wert der fileID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Ruft den Wert der itemReferenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemReferenceId() {
        return itemReferenceId;
    }

    /**
     * Legt den Wert der itemReferenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemReferenceId(String value) {
        this.itemReferenceId = value;
    }

    /**
     * Ruft den Wert der referenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Legt den Wert der referenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Ruft den Wert der sender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Legt den Wert der sender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Ruft den Wert der itemReceivedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemReceivedTime() {
        return itemReceivedTime;
    }

    /**
     * Legt den Wert der itemReceivedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemReceivedTime(String value) {
        this.itemReceivedTime = value;
    }

    /**
     * Ruft den Wert der itemPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPath() {
        return itemPath;
    }

    /**
     * Legt den Wert der itemPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPath(String value) {
        this.itemPath = value;
    }

    /**
     * Ruft den Wert der itemSentTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSentTime() {
        return itemSentTime;
    }

    /**
     * Legt den Wert der itemSentTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSentTime(String value) {
        this.itemSentTime = value;
    }

    /**
     * Ruft den Wert der fileContexts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getFileContexts() {
        return fileContexts;
    }

    /**
     * Legt den Wert der fileContexts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setFileContexts(ArrayOfStringsType value) {
        this.fileContexts = value;
    }

    /**
     * Ruft den Wert der visualizationContainerUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualizationContainerUrl() {
        return visualizationContainerUrl;
    }

    /**
     * Legt den Wert der visualizationContainerUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualizationContainerUrl(String value) {
        this.visualizationContainerUrl = value;
    }

    /**
     * Ruft den Wert der visualizationContainerTitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualizationContainerTitle() {
        return visualizationContainerTitle;
    }

    /**
     * Legt den Wert der visualizationContainerTitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualizationContainerTitle(String value) {
        this.visualizationContainerTitle = value;
    }

}
