
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderResponseShapeType"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="IndexedPageFolderView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/&gt;
 *           &lt;element name="FractionalPageFolderView" type="{http://schemas.microsoft.com/exchange/services/2006/types}FractionalPageViewType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Traversal" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderQueryTraversalType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindFolderType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "folderShape",
    "indexedPageFolderView",
    "fractionalPageFolderView",
    "restriction",
    "parentFolderIds"
})
public class FindFolderType
    extends BaseRequestType
{

    @XmlElement(name = "FolderShape", required = true)
    protected FolderResponseShapeType folderShape;
    @XmlElement(name = "IndexedPageFolderView")
    protected IndexedPageViewType indexedPageFolderView;
    @XmlElement(name = "FractionalPageFolderView")
    protected FractionalPageViewType fractionalPageFolderView;
    @XmlElement(name = "Restriction")
    protected RestrictionType restriction;
    @XmlElement(name = "ParentFolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType parentFolderIds;
    @XmlAttribute(name = "Traversal", required = true)
    protected FolderQueryTraversalType traversal;

    /**
     * Ruft den Wert der folderShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderResponseShapeType }
     *     
     */
    public FolderResponseShapeType getFolderShape() {
        return folderShape;
    }

    /**
     * Legt den Wert der folderShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderResponseShapeType }
     *     
     */
    public void setFolderShape(FolderResponseShapeType value) {
        this.folderShape = value;
    }

    /**
     * Ruft den Wert der indexedPageFolderView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedPageViewType }
     *     
     */
    public IndexedPageViewType getIndexedPageFolderView() {
        return indexedPageFolderView;
    }

    /**
     * Legt den Wert der indexedPageFolderView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedPageViewType }
     *     
     */
    public void setIndexedPageFolderView(IndexedPageViewType value) {
        this.indexedPageFolderView = value;
    }

    /**
     * Ruft den Wert der fractionalPageFolderView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FractionalPageViewType }
     *     
     */
    public FractionalPageViewType getFractionalPageFolderView() {
        return fractionalPageFolderView;
    }

    /**
     * Legt den Wert der fractionalPageFolderView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalPageViewType }
     *     
     */
    public void setFractionalPageFolderView(FractionalPageViewType value) {
        this.fractionalPageFolderView = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Ruft den Wert der parentFolderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getParentFolderIds() {
        return parentFolderIds;
    }

    /**
     * Legt den Wert der parentFolderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setParentFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.parentFolderIds = value;
    }

    /**
     * Ruft den Wert der traversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderQueryTraversalType }
     *     
     */
    public FolderQueryTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Legt den Wert der traversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderQueryTraversalType }
     *     
     */
    public void setTraversal(FolderQueryTraversalType value) {
        this.traversal = value;
    }

}
