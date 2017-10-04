
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ItemResponseShapeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemResponseShapeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}DefaultShapeNamesType"/&gt;
 *         &lt;element name="IncludeMimeContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BodyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeResponseType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueBodyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeResponseType" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedBodyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeResponseType" minOccurs="0"/&gt;
 *         &lt;element name="FilterHtmlContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConvertHtmlCodePageToUTF8" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InlineImageUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockExternalImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddBlankTargetToLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumBodySize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPathsToElementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResponseShapeType", propOrder = {
    "baseShape",
    "includeMimeContent",
    "bodyType",
    "uniqueBodyType",
    "normalizedBodyType",
    "filterHtmlContent",
    "convertHtmlCodePageToUTF8",
    "inlineImageUrlTemplate",
    "blockExternalImages",
    "addBlankTargetToLinks",
    "maximumBodySize",
    "additionalProperties"
})
public class ItemResponseShapeType {

    @XmlElement(name = "BaseShape", required = true)
    @XmlSchemaType(name = "string")
    protected DefaultShapeNamesType baseShape;
    @XmlElement(name = "IncludeMimeContent")
    protected Boolean includeMimeContent;
    @XmlElement(name = "BodyType")
    @XmlSchemaType(name = "string")
    protected BodyTypeResponseType bodyType;
    @XmlElement(name = "UniqueBodyType")
    @XmlSchemaType(name = "string")
    protected BodyTypeResponseType uniqueBodyType;
    @XmlElement(name = "NormalizedBodyType")
    @XmlSchemaType(name = "string")
    protected BodyTypeResponseType normalizedBodyType;
    @XmlElement(name = "FilterHtmlContent")
    protected Boolean filterHtmlContent;
    @XmlElement(name = "ConvertHtmlCodePageToUTF8")
    protected Boolean convertHtmlCodePageToUTF8;
    @XmlElement(name = "InlineImageUrlTemplate")
    protected String inlineImageUrlTemplate;
    @XmlElement(name = "BlockExternalImages")
    protected Boolean blockExternalImages;
    @XmlElement(name = "AddBlankTargetToLinks")
    protected Boolean addBlankTargetToLinks;
    @XmlElement(name = "MaximumBodySize")
    protected Integer maximumBodySize;
    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfPathsToElementType additionalProperties;

    /**
     * Ruft den Wert der baseShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public DefaultShapeNamesType getBaseShape() {
        return baseShape;
    }

    /**
     * Legt den Wert der baseShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public void setBaseShape(DefaultShapeNamesType value) {
        this.baseShape = value;
    }

    /**
     * Ruft den Wert der includeMimeContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeMimeContent() {
        return includeMimeContent;
    }

    /**
     * Legt den Wert der includeMimeContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeMimeContent(Boolean value) {
        this.includeMimeContent = value;
    }

    /**
     * Ruft den Wert der bodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public BodyTypeResponseType getBodyType() {
        return bodyType;
    }

    /**
     * Legt den Wert der bodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public void setBodyType(BodyTypeResponseType value) {
        this.bodyType = value;
    }

    /**
     * Ruft den Wert der uniqueBodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public BodyTypeResponseType getUniqueBodyType() {
        return uniqueBodyType;
    }

    /**
     * Legt den Wert der uniqueBodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public void setUniqueBodyType(BodyTypeResponseType value) {
        this.uniqueBodyType = value;
    }

    /**
     * Ruft den Wert der normalizedBodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public BodyTypeResponseType getNormalizedBodyType() {
        return normalizedBodyType;
    }

    /**
     * Legt den Wert der normalizedBodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeResponseType }
     *     
     */
    public void setNormalizedBodyType(BodyTypeResponseType value) {
        this.normalizedBodyType = value;
    }

    /**
     * Ruft den Wert der filterHtmlContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterHtmlContent() {
        return filterHtmlContent;
    }

    /**
     * Legt den Wert der filterHtmlContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterHtmlContent(Boolean value) {
        this.filterHtmlContent = value;
    }

    /**
     * Ruft den Wert der convertHtmlCodePageToUTF8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertHtmlCodePageToUTF8() {
        return convertHtmlCodePageToUTF8;
    }

    /**
     * Legt den Wert der convertHtmlCodePageToUTF8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertHtmlCodePageToUTF8(Boolean value) {
        this.convertHtmlCodePageToUTF8 = value;
    }

    /**
     * Ruft den Wert der inlineImageUrlTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineImageUrlTemplate() {
        return inlineImageUrlTemplate;
    }

    /**
     * Legt den Wert der inlineImageUrlTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineImageUrlTemplate(String value) {
        this.inlineImageUrlTemplate = value;
    }

    /**
     * Ruft den Wert der blockExternalImages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockExternalImages() {
        return blockExternalImages;
    }

    /**
     * Legt den Wert der blockExternalImages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockExternalImages(Boolean value) {
        this.blockExternalImages = value;
    }

    /**
     * Ruft den Wert der addBlankTargetToLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddBlankTargetToLinks() {
        return addBlankTargetToLinks;
    }

    /**
     * Legt den Wert der addBlankTargetToLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddBlankTargetToLinks(Boolean value) {
        this.addBlankTargetToLinks = value;
    }

    /**
     * Ruft den Wert der maximumBodySize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumBodySize() {
        return maximumBodySize;
    }

    /**
     * Legt den Wert der maximumBodySize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumBodySize(Integer value) {
        this.maximumBodySize = value;
    }

    /**
     * Ruft den Wert der additionalProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public NonEmptyArrayOfPathsToElementType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Legt den Wert der additionalProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public void setAdditionalProperties(NonEmptyArrayOfPathsToElementType value) {
        this.additionalProperties = value;
    }

}
