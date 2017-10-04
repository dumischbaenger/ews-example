
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Keyword statistics search result.
 *       
 * 
 * <p>Java-Klasse für KeywordStatisticsSearchResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KeywordStatisticsSearchResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemHits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordStatisticsSearchResultType", propOrder = {
    "keyword",
    "itemHits",
    "size"
})
public class KeywordStatisticsSearchResultType {

    @XmlElement(name = "Keyword", required = true)
    protected String keyword;
    @XmlElement(name = "ItemHits")
    protected int itemHits;
    @XmlElement(name = "Size")
    protected long size;

    /**
     * Ruft den Wert der keyword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Legt den Wert der keyword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Ruft den Wert der itemHits-Eigenschaft ab.
     * 
     */
    public int getItemHits() {
        return itemHits;
    }

    /**
     * Legt den Wert der itemHits-Eigenschaft fest.
     * 
     */
    public void setItemHits(int value) {
        this.itemHits = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

}
