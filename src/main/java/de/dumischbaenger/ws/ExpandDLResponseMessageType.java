
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExpandDLResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExpandDLResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DLExpansion" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfDLExpansionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://schemas.microsoft.com/exchange/services/2006/types}FindResponsePagingAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpandDLResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "dlExpansion"
})
public class ExpandDLResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "DLExpansion")
    protected ArrayOfDLExpansionType dlExpansion;
    @XmlAttribute(name = "IndexedPagingOffset")
    protected Integer indexedPagingOffset;
    @XmlAttribute(name = "NumeratorOffset")
    protected Integer numeratorOffset;
    @XmlAttribute(name = "AbsoluteDenominator")
    protected Integer absoluteDenominator;
    @XmlAttribute(name = "IncludesLastItemInRange")
    protected Boolean includesLastItemInRange;
    @XmlAttribute(name = "TotalItemsInView")
    protected Integer totalItemsInView;

    /**
     * Ruft den Wert der dlExpansion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDLExpansionType }
     *     
     */
    public ArrayOfDLExpansionType getDLExpansion() {
        return dlExpansion;
    }

    /**
     * Legt den Wert der dlExpansion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDLExpansionType }
     *     
     */
    public void setDLExpansion(ArrayOfDLExpansionType value) {
        this.dlExpansion = value;
    }

    /**
     * Ruft den Wert der indexedPagingOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexedPagingOffset() {
        return indexedPagingOffset;
    }

    /**
     * Legt den Wert der indexedPagingOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexedPagingOffset(Integer value) {
        this.indexedPagingOffset = value;
    }

    /**
     * Ruft den Wert der numeratorOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeratorOffset() {
        return numeratorOffset;
    }

    /**
     * Legt den Wert der numeratorOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeratorOffset(Integer value) {
        this.numeratorOffset = value;
    }

    /**
     * Ruft den Wert der absoluteDenominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbsoluteDenominator() {
        return absoluteDenominator;
    }

    /**
     * Legt den Wert der absoluteDenominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbsoluteDenominator(Integer value) {
        this.absoluteDenominator = value;
    }

    /**
     * Ruft den Wert der includesLastItemInRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesLastItemInRange() {
        return includesLastItemInRange;
    }

    /**
     * Legt den Wert der includesLastItemInRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesLastItemInRange(Boolean value) {
        this.includesLastItemInRange = value;
    }

    /**
     * Ruft den Wert der totalItemsInView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalItemsInView() {
        return totalItemsInView;
    }

    /**
     * Legt den Wert der totalItemsInView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalItemsInView(Integer value) {
        this.totalItemsInView = value;
    }

}
