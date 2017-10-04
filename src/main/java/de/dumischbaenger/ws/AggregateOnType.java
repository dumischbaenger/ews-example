
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Represents the field of each item to aggregate on and the qualifier to apply to that
 *         field in determining which item will represent the group.
 *       
 * 
 * <p>Java-Klasse für AggregateOnType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AggregateOnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToUnindexedFieldType"/&gt;
 *         &lt;element name="IndexedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToIndexedFieldType"/&gt;
 *         &lt;element name="ExtendedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToExtendedFieldType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Aggregate" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}AggregateType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateOnType", propOrder = {
    "fieldURI",
    "indexedFieldURI",
    "extendedFieldURI"
})
public class AggregateOnType {

    @XmlElement(name = "FieldURI")
    protected PathToUnindexedFieldType fieldURI;
    @XmlElement(name = "IndexedFieldURI")
    protected PathToIndexedFieldType indexedFieldURI;
    @XmlElement(name = "ExtendedFieldURI")
    protected PathToExtendedFieldType extendedFieldURI;
    @XmlAttribute(name = "Aggregate", required = true)
    protected AggregateType aggregate;

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
     * Ruft den Wert der aggregate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregateType }
     *     
     */
    public AggregateType getAggregate() {
        return aggregate;
    }

    /**
     * Legt den Wert der aggregate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateType }
     *     
     */
    public void setAggregate(AggregateType value) {
        this.aggregate = value;
    }

}
