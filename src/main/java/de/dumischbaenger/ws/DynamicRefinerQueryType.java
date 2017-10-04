
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DynamicRefinerQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DynamicRefinerQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefinerQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TDRefinerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicRefinerQueryType", propOrder = {
    "refinerQuery",
    "tdRefinerId"
})
public class DynamicRefinerQueryType {

    @XmlElement(name = "RefinerQuery", required = true)
    protected String refinerQuery;
    @XmlElement(name = "TDRefinerId")
    protected int tdRefinerId;

    /**
     * Ruft den Wert der refinerQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefinerQuery() {
        return refinerQuery;
    }

    /**
     * Legt den Wert der refinerQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefinerQuery(String value) {
        this.refinerQuery = value;
    }

    /**
     * Ruft den Wert der tdRefinerId-Eigenschaft ab.
     * 
     */
    public int getTDRefinerId() {
        return tdRefinerId;
    }

    /**
     * Legt den Wert der tdRefinerId-Eigenschaft fest.
     * 
     */
    public void setTDRefinerId(int value) {
        this.tdRefinerId = value;
    }

}
