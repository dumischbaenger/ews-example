
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base type for reply objects
 * 
 * <p>Java-Klasse für ResponseObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseObjectCoreType"&gt;
 *       &lt;attribute name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseObjectType")
@XmlSeeAlso({
    SmartResponseBaseType.class,
    WellKnownResponseObjectType.class,
    ProposeNewTimeType.class,
    RemoveItemType.class,
    AddItemToMyCalendarType.class,
    PostReplyItemBaseType.class,
    ReferenceItemResponseType.class
})
public abstract class ResponseObjectType
    extends ResponseObjectCoreType
{

    @XmlAttribute(name = "ObjectName")
    protected String objectName;

    /**
     * Ruft den Wert der objectName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Legt den Wert der objectName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

}
