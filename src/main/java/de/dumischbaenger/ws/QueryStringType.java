
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für QueryStringType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryStringType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="ResetCache" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReturnHighlightTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReturnDeletedItems" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStringType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "value"
})
public class QueryStringType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ResetCache")
    protected Boolean resetCache;
    @XmlAttribute(name = "ReturnHighlightTerms")
    protected Boolean returnHighlightTerms;
    @XmlAttribute(name = "ReturnDeletedItems")
    protected Boolean returnDeletedItems;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der resetCache-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetCache() {
        return resetCache;
    }

    /**
     * Legt den Wert der resetCache-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetCache(Boolean value) {
        this.resetCache = value;
    }

    /**
     * Ruft den Wert der returnHighlightTerms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHighlightTerms() {
        return returnHighlightTerms;
    }

    /**
     * Legt den Wert der returnHighlightTerms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHighlightTerms(Boolean value) {
        this.returnHighlightTerms = value;
    }

    /**
     * Ruft den Wert der returnDeletedItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnDeletedItems() {
        return returnDeletedItems;
    }

    /**
     * Legt den Wert der returnDeletedItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnDeletedItems(Boolean value) {
        this.returnDeletedItems = value;
    }

}
