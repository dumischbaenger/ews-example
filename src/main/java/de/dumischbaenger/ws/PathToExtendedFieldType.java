
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Represents an extended property.  Note that there are only a couple of valid attribute
 *         combinations.  Note that all occurances require the PropertyType attribute.
 * 
 *         1.  (DistinguishedPropertySetId || PropertySetId) + (PropertyName || Property Id)
 *         2.  PropertyTag
 * 
 *       
 * 
 * <p>Java-Klasse für PathToExtendedFieldType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathToExtendedFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePathToElementType"&gt;
 *       &lt;attribute name="DistinguishedPropertySetId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedPropertySetType" /&gt;
 *       &lt;attribute name="PropertySetId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" /&gt;
 *       &lt;attribute name="PropertyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}PropertyTagType" /&gt;
 *       &lt;attribute name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PropertyId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}MapiPropertyTypeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathToExtendedFieldType")
public class PathToExtendedFieldType
    extends BasePathToElementType
{

    @XmlAttribute(name = "DistinguishedPropertySetId")
    protected DistinguishedPropertySetType distinguishedPropertySetId;
    @XmlAttribute(name = "PropertySetId")
    protected String propertySetId;
    @XmlAttribute(name = "PropertyTag")
    protected String propertyTag;
    @XmlAttribute(name = "PropertyName")
    protected String propertyName;
    @XmlAttribute(name = "PropertyId")
    protected Integer propertyId;
    @XmlAttribute(name = "PropertyType", required = true)
    protected MapiPropertyTypeType propertyType;

    /**
     * Ruft den Wert der distinguishedPropertySetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedPropertySetType }
     *     
     */
    public DistinguishedPropertySetType getDistinguishedPropertySetId() {
        return distinguishedPropertySetId;
    }

    /**
     * Legt den Wert der distinguishedPropertySetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedPropertySetType }
     *     
     */
    public void setDistinguishedPropertySetId(DistinguishedPropertySetType value) {
        this.distinguishedPropertySetId = value;
    }

    /**
     * Ruft den Wert der propertySetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySetId() {
        return propertySetId;
    }

    /**
     * Legt den Wert der propertySetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySetId(String value) {
        this.propertySetId = value;
    }

    /**
     * Ruft den Wert der propertyTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTag() {
        return propertyTag;
    }

    /**
     * Legt den Wert der propertyTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTag(String value) {
        this.propertyTag = value;
    }

    /**
     * Ruft den Wert der propertyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Legt den Wert der propertyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Ruft den Wert der propertyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Legt den Wert der propertyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

    /**
     * Ruft den Wert der propertyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MapiPropertyTypeType }
     *     
     */
    public MapiPropertyTypeType getPropertyType() {
        return propertyType;
    }

    /**
     * Legt den Wert der propertyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MapiPropertyTypeType }
     *     
     */
    public void setPropertyType(MapiPropertyTypeType value) {
        this.propertyType = value;
    }

}
