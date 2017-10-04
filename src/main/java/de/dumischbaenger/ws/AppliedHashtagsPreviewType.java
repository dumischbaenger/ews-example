
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AppliedHashtagsPreviewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AppliedHashtagsPreviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hashtags" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedHashtagsPreviewType", propOrder = {
    "hashtags"
})
public class AppliedHashtagsPreviewType {

    @XmlElement(name = "Hashtags", required = true)
    protected ArrayOfStringsType hashtags;

    /**
     * Ruft den Wert der hashtags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getHashtags() {
        return hashtags;
    }

    /**
     * Legt den Wert der hashtags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setHashtags(ArrayOfStringsType value) {
        this.hashtags = value;
    }

}
