
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SmartResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SmartResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SmartResponseBaseType"&gt;
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
@XmlType(name = "SmartResponseType", propOrder = {
    "newBodyContent"
})
@XmlSeeAlso({
    ReplyToItemType.class,
    ReplyAllToItemType.class,
    ForwardItemType.class,
    CancelCalendarItemType.class
})
public class SmartResponseType
    extends SmartResponseBaseType
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
