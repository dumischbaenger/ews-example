
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchParametersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType"/&gt;
 *         &lt;element name="BaseFolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Traversal" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchFolderTraversalType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParametersType", propOrder = {
    "restriction",
    "baseFolderIds"
})
public class SearchParametersType {

    @XmlElement(name = "Restriction", required = true)
    protected RestrictionType restriction;
    @XmlElement(name = "BaseFolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType baseFolderIds;
    @XmlAttribute(name = "Traversal")
    protected SearchFolderTraversalType traversal;

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
     * Ruft den Wert der baseFolderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getBaseFolderIds() {
        return baseFolderIds;
    }

    /**
     * Legt den Wert der baseFolderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setBaseFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.baseFolderIds = value;
    }

    /**
     * Ruft den Wert der traversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchFolderTraversalType }
     *     
     */
    public SearchFolderTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Legt den Wert der traversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFolderTraversalType }
     *     
     */
    public void setTraversal(SearchFolderTraversalType value) {
        this.traversal = value;
    }

}
