
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchRefinerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchRefinerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefinerType" type="{http://schemas.microsoft.com/exchange/services/2006/types}RefinerTypeType"/&gt;
 *         &lt;element name="Refiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}DynamicRefinerQueryType"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRefinerType", propOrder = {
    "refinerType",
    "refiner",
    "resultCount"
})
@XmlSeeAlso({
    FolderRefinerType.class,
    PeopleRefinerType.class,
    MailboxRefinerType.class,
    AttachmentRefinerType.class,
    HashtagRefinerType.class
})
public class SearchRefinerType {

    @XmlElement(name = "RefinerType", required = true)
    @XmlSchemaType(name = "string")
    protected RefinerTypeType refinerType;
    @XmlElement(name = "Refiner", required = true)
    protected DynamicRefinerQueryType refiner;
    @XmlElement(name = "ResultCount")
    protected Long resultCount;

    /**
     * Ruft den Wert der refinerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RefinerTypeType }
     *     
     */
    public RefinerTypeType getRefinerType() {
        return refinerType;
    }

    /**
     * Legt den Wert der refinerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinerTypeType }
     *     
     */
    public void setRefinerType(RefinerTypeType value) {
        this.refinerType = value;
    }

    /**
     * Ruft den Wert der refiner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicRefinerQueryType }
     *     
     */
    public DynamicRefinerQueryType getRefiner() {
        return refiner;
    }

    /**
     * Legt den Wert der refiner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicRefinerQueryType }
     *     
     */
    public void setRefiner(DynamicRefinerQueryType value) {
        this.refiner = value;
    }

    /**
     * Ruft den Wert der resultCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultCount() {
        return resultCount;
    }

    /**
     * Legt den Wert der resultCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultCount(Long value) {
        this.resultCount = value;
    }

}
