
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LikesPreviewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LikesPreviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LikeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LikesPreviewType", propOrder = {
    "likeCount"
})
public class LikesPreviewType {

    @XmlElement(name = "LikeCount")
    protected int likeCount;

    /**
     * Ruft den Wert der likeCount-Eigenschaft ab.
     * 
     */
    public int getLikeCount() {
        return likeCount;
    }

    /**
     * Legt den Wert der likeCount-Eigenschaft fest.
     * 
     */
    public void setLikeCount(int value) {
        this.likeCount = value;
    }

}
