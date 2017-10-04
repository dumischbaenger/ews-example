
package de.dumischbaenger.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Allows consumers to specify arbitrary groupings for FindItem queries.
 *       
 * 
 * <p>Java-Klasse für GroupByType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupByType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseGroupByType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToUnindexedFieldType"/&gt;
 *           &lt;element name="IndexedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToIndexedFieldType"/&gt;
 *           &lt;element name="ExtendedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToExtendedFieldType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AggregateOn" type="{http://schemas.microsoft.com/exchange/services/2006/types}AggregateOnType"/&gt;
 *         &lt;element name="UseCollapsibleGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemsPerGroup" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="MaxItemsPerGroup" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="GroupsToExpand" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfGroupIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupByType", propOrder = {
    "fieldURI",
    "indexedFieldURI",
    "extendedFieldURI",
    "aggregateOn",
    "useCollapsibleGroups",
    "itemsPerGroup",
    "maxItemsPerGroup",
    "groupsToExpand"
})
public class GroupByType
    extends BaseGroupByType
{

    @XmlElement(name = "FieldURI")
    protected PathToUnindexedFieldType fieldURI;
    @XmlElement(name = "IndexedFieldURI")
    protected PathToIndexedFieldType indexedFieldURI;
    @XmlElement(name = "ExtendedFieldURI")
    protected PathToExtendedFieldType extendedFieldURI;
    @XmlElement(name = "AggregateOn", required = true)
    protected AggregateOnType aggregateOn;
    @XmlElement(name = "UseCollapsibleGroups")
    protected Boolean useCollapsibleGroups;
    @XmlElement(name = "ItemsPerGroup")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger itemsPerGroup;
    @XmlElement(name = "MaxItemsPerGroup")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxItemsPerGroup;
    @XmlElement(name = "GroupsToExpand")
    protected ArrayOfGroupIdType groupsToExpand;

    /**
     * Ruft den Wert der fieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathToUnindexedFieldType }
     *     
     */
    public PathToUnindexedFieldType getFieldURI() {
        return fieldURI;
    }

    /**
     * Legt den Wert der fieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathToUnindexedFieldType }
     *     
     */
    public void setFieldURI(PathToUnindexedFieldType value) {
        this.fieldURI = value;
    }

    /**
     * Ruft den Wert der indexedFieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathToIndexedFieldType }
     *     
     */
    public PathToIndexedFieldType getIndexedFieldURI() {
        return indexedFieldURI;
    }

    /**
     * Legt den Wert der indexedFieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathToIndexedFieldType }
     *     
     */
    public void setIndexedFieldURI(PathToIndexedFieldType value) {
        this.indexedFieldURI = value;
    }

    /**
     * Ruft den Wert der extendedFieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathToExtendedFieldType }
     *     
     */
    public PathToExtendedFieldType getExtendedFieldURI() {
        return extendedFieldURI;
    }

    /**
     * Legt den Wert der extendedFieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathToExtendedFieldType }
     *     
     */
    public void setExtendedFieldURI(PathToExtendedFieldType value) {
        this.extendedFieldURI = value;
    }

    /**
     * Ruft den Wert der aggregateOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregateOnType }
     *     
     */
    public AggregateOnType getAggregateOn() {
        return aggregateOn;
    }

    /**
     * Legt den Wert der aggregateOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateOnType }
     *     
     */
    public void setAggregateOn(AggregateOnType value) {
        this.aggregateOn = value;
    }

    /**
     * Ruft den Wert der useCollapsibleGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCollapsibleGroups() {
        return useCollapsibleGroups;
    }

    /**
     * Legt den Wert der useCollapsibleGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCollapsibleGroups(Boolean value) {
        this.useCollapsibleGroups = value;
    }

    /**
     * Ruft den Wert der itemsPerGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemsPerGroup() {
        return itemsPerGroup;
    }

    /**
     * Legt den Wert der itemsPerGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemsPerGroup(BigInteger value) {
        this.itemsPerGroup = value;
    }

    /**
     * Ruft den Wert der maxItemsPerGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItemsPerGroup() {
        return maxItemsPerGroup;
    }

    /**
     * Legt den Wert der maxItemsPerGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItemsPerGroup(BigInteger value) {
        this.maxItemsPerGroup = value;
    }

    /**
     * Ruft den Wert der groupsToExpand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroupIdType }
     *     
     */
    public ArrayOfGroupIdType getGroupsToExpand() {
        return groupsToExpand;
    }

    /**
     * Legt den Wert der groupsToExpand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroupIdType }
     *     
     */
    public void setGroupsToExpand(ArrayOfGroupIdType value) {
        this.groupsToExpand = value;
    }

}
