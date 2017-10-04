
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Internal abstract base type for reply objects.
 *         Should not appear in client code
 *       
 * 
 * <p>Java-Klasse für ResponseObjectCoreType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseObjectCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}MessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseObjectCoreType", propOrder = {
    "referenceItemId"
})
@XmlSeeAlso({
    ResponseObjectType.class
})
public abstract class ResponseObjectCoreType
    extends MessageType
{

    @XmlElement(name = "ReferenceItemId")
    protected ItemIdType referenceItemId;

    /**
     * Ruft den Wert der referenceItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getReferenceItemId() {
        return referenceItemId;
    }

    /**
     * Legt den Wert der referenceItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setReferenceItemId(ItemIdType value) {
        this.referenceItemId = value;
    }

}
