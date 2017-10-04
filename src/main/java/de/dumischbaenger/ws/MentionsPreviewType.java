
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MentionsPreviewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MentionsPreviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsMentioned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MentionsPreviewType", propOrder = {
    "isMentioned"
})
public class MentionsPreviewType {

    @XmlElement(name = "IsMentioned")
    protected boolean isMentioned;

    /**
     * Ruft den Wert der isMentioned-Eigenschaft ab.
     * 
     */
    public boolean isIsMentioned() {
        return isMentioned;
    }

    /**
     * Legt den Wert der isMentioned-Eigenschaft fest.
     * 
     */
    public void setIsMentioned(boolean value) {
        this.isMentioned = value;
    }

}
