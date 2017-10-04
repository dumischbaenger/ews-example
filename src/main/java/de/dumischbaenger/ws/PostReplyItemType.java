
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PostReplyItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostReplyItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}PostReplyItemBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewBodyContent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostReplyItemType", propOrder = {
    "newBodyContent"
})
public class PostReplyItemType
    extends PostReplyItemBaseType
{

    @XmlElement(name = "NewBodyContent")
    protected BodyType newBodyContent;

    /**
     * Ruft den Wert der newBodyContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getNewBodyContent() {
        return newBodyContent;
    }

    /**
     * Legt den Wert der newBodyContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setNewBodyContent(BodyType value) {
        this.newBodyContent = value;
    }

}
