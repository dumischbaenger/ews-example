
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Insight complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Insight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://schemas.microsoft.com/exchange/services/2006/types}InsightContent" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="RequiresToken" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insight", propOrder = {
    "insightType",
    "rank",
    "content",
    "text",
    "itemList",
    "requiresToken"
})
public class Insight {

    @XmlElement(name = "InsightType")
    protected String insightType;
    @XmlElement(name = "Rank")
    protected Double rank;
    @XmlElement(name = "Content")
    protected InsightContent content;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "ItemList")
    protected ArrayOfInsightValue itemList;
    @XmlElement(name = "RequiresToken")
    protected Boolean requiresToken;

    /**
     * Ruft den Wert der insightType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsightType() {
        return insightType;
    }

    /**
     * Legt den Wert der insightType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsightType(String value) {
        this.insightType = value;
    }

    /**
     * Ruft den Wert der rank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRank() {
        return rank;
    }

    /**
     * Legt den Wert der rank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRank(Double value) {
        this.rank = value;
    }

    /**
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InsightContent }
     *     
     */
    public InsightContent getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsightContent }
     *     
     */
    public void setContent(InsightContent value) {
        this.content = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der itemList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsightValue }
     *     
     */
    public ArrayOfInsightValue getItemList() {
        return itemList;
    }

    /**
     * Legt den Wert der itemList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsightValue }
     *     
     */
    public void setItemList(ArrayOfInsightValue value) {
        this.itemList = value;
    }

    /**
     * Ruft den Wert der requiresToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresToken() {
        return requiresToken;
    }

    /**
     * Legt den Wert der requiresToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresToken(Boolean value) {
        this.requiresToken = value;
    }

}
