
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RootItemIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RootItemIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseItemIdType"&gt;
 *       &lt;attribute name="RootItemId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RootItemChangeKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootItemIdType")
public class RootItemIdType
    extends BaseItemIdType
{

    @XmlAttribute(name = "RootItemId", required = true)
    protected String rootItemId;
    @XmlAttribute(name = "RootItemChangeKey", required = true)
    protected String rootItemChangeKey;

    /**
     * Ruft den Wert der rootItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootItemId() {
        return rootItemId;
    }

    /**
     * Legt den Wert der rootItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootItemId(String value) {
        this.rootItemId = value;
    }

    /**
     * Ruft den Wert der rootItemChangeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootItemChangeKey() {
        return rootItemChangeKey;
    }

    /**
     * Legt den Wert der rootItemChangeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootItemChangeKey(String value) {
        this.rootItemChangeKey = value;
    }

}
