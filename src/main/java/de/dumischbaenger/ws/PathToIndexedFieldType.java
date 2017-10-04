
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PathToIndexedFieldType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathToIndexedFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePathToElementType"&gt;
 *       &lt;attribute name="FieldURI" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}DictionaryURIType" /&gt;
 *       &lt;attribute name="FieldIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathToIndexedFieldType")
public class PathToIndexedFieldType
    extends BasePathToElementType
{

    @XmlAttribute(name = "FieldURI", required = true)
    protected DictionaryURIType fieldURI;
    @XmlAttribute(name = "FieldIndex", required = true)
    protected String fieldIndex;

    /**
     * Ruft den Wert der fieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryURIType }
     *     
     */
    public DictionaryURIType getFieldURI() {
        return fieldURI;
    }

    /**
     * Legt den Wert der fieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryURIType }
     *     
     */
    public void setFieldURI(DictionaryURIType value) {
        this.fieldURI = value;
    }

    /**
     * Ruft den Wert der fieldIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldIndex() {
        return fieldIndex;
    }

    /**
     * Legt den Wert der fieldIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldIndex(String value) {
        this.fieldIndex = value;
    }

}
