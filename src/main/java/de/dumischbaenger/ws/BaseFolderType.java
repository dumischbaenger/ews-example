
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="FolderClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChildFolderCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProperty" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ManagedFolderInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ManagedFolderInformationType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveRights" type="{http://schemas.microsoft.com/exchange/services/2006/types}EffectiveRightsType" minOccurs="0"/&gt;
 *         &lt;element name="DistinguishedFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedFolderIdNameType" minOccurs="0"/&gt;
 *         &lt;element name="PolicyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionTagType" minOccurs="0"/&gt;
 *         &lt;element name="ArchiveTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionTagType" minOccurs="0"/&gt;
 *         &lt;element name="ReplicaList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFolderType", propOrder = {
    "folderId",
    "parentFolderId",
    "folderClass",
    "displayName",
    "totalCount",
    "childFolderCount",
    "extendedProperty",
    "managedFolderInformation",
    "effectiveRights",
    "distinguishedFolderId",
    "policyTag",
    "archiveTag",
    "replicaList"
})
@XmlSeeAlso({
    CalendarFolderType.class,
    ContactsFolderType.class,
    FolderType.class
})
public abstract class BaseFolderType {

    @XmlElement(name = "FolderId")
    protected FolderIdType folderId;
    @XmlElement(name = "ParentFolderId")
    protected FolderIdType parentFolderId;
    @XmlElement(name = "FolderClass")
    protected String folderClass;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "TotalCount")
    protected Integer totalCount;
    @XmlElement(name = "ChildFolderCount")
    protected Integer childFolderCount;
    @XmlElement(name = "ExtendedProperty")
    protected List<ExtendedPropertyType> extendedProperty;
    @XmlElement(name = "ManagedFolderInformation")
    protected ManagedFolderInformationType managedFolderInformation;
    @XmlElement(name = "EffectiveRights")
    protected EffectiveRightsType effectiveRights;
    @XmlElement(name = "DistinguishedFolderId")
    @XmlSchemaType(name = "string")
    protected DistinguishedFolderIdNameType distinguishedFolderId;
    @XmlElement(name = "PolicyTag")
    protected RetentionTagType policyTag;
    @XmlElement(name = "ArchiveTag")
    protected RetentionTagType archiveTag;
    @XmlElement(name = "ReplicaList")
    protected ArrayOfStringsType replicaList;

    /**
     * Ruft den Wert der folderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getFolderId() {
        return folderId;
    }

    /**
     * Legt den Wert der folderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setFolderId(FolderIdType value) {
        this.folderId = value;
    }

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
     * Ruft den Wert der folderClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderClass() {
        return folderClass;
    }

    /**
     * Legt den Wert der folderClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderClass(String value) {
        this.folderClass = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der totalCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Legt den Wert der totalCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Ruft den Wert der childFolderCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildFolderCount() {
        return childFolderCount;
    }

    /**
     * Legt den Wert der childFolderCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildFolderCount(Integer value) {
        this.childFolderCount = value;
    }

    /**
     * Gets the value of the extendedProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPropertyType }
     * 
     * 
     */
    public List<ExtendedPropertyType> getExtendedProperty() {
        if (extendedProperty == null) {
            extendedProperty = new ArrayList<ExtendedPropertyType>();
        }
        return this.extendedProperty;
    }

    /**
     * Ruft den Wert der managedFolderInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ManagedFolderInformationType }
     *     
     */
    public ManagedFolderInformationType getManagedFolderInformation() {
        return managedFolderInformation;
    }

    /**
     * Legt den Wert der managedFolderInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedFolderInformationType }
     *     
     */
    public void setManagedFolderInformation(ManagedFolderInformationType value) {
        this.managedFolderInformation = value;
    }

    /**
     * Ruft den Wert der effectiveRights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveRightsType }
     *     
     */
    public EffectiveRightsType getEffectiveRights() {
        return effectiveRights;
    }

    /**
     * Legt den Wert der effectiveRights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveRightsType }
     *     
     */
    public void setEffectiveRights(EffectiveRightsType value) {
        this.effectiveRights = value;
    }

    /**
     * Ruft den Wert der distinguishedFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedFolderIdNameType }
     *     
     */
    public DistinguishedFolderIdNameType getDistinguishedFolderId() {
        return distinguishedFolderId;
    }

    /**
     * Legt den Wert der distinguishedFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedFolderIdNameType }
     *     
     */
    public void setDistinguishedFolderId(DistinguishedFolderIdNameType value) {
        this.distinguishedFolderId = value;
    }

    /**
     * Ruft den Wert der policyTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionTagType }
     *     
     */
    public RetentionTagType getPolicyTag() {
        return policyTag;
    }

    /**
     * Legt den Wert der policyTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionTagType }
     *     
     */
    public void setPolicyTag(RetentionTagType value) {
        this.policyTag = value;
    }

    /**
     * Ruft den Wert der archiveTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionTagType }
     *     
     */
    public RetentionTagType getArchiveTag() {
        return archiveTag;
    }

    /**
     * Legt den Wert der archiveTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionTagType }
     *     
     */
    public void setArchiveTag(RetentionTagType value) {
        this.archiveTag = value;
    }

    /**
     * Ruft den Wert der replicaList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getReplicaList() {
        return replicaList;
    }

    /**
     * Legt den Wert der replicaList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setReplicaList(ArrayOfStringsType value) {
        this.replicaList = value;
    }

}
