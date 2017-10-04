
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Allows consumers to access standard groupings for FindItem queries.  This is in
 *         contrast to the arbitrary (custom) groupings available via the t:GroupByType
 *       
 * 
 * <p>Java-Klasse für DistinguishedGroupByType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistinguishedGroupByType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseGroupByType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StandardGroupBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}StandardGroupByType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistinguishedGroupByType", propOrder = {
    "standardGroupBy"
})
public class DistinguishedGroupByType
    extends BaseGroupByType
{

    @XmlElement(name = "StandardGroupBy", required = true)
    @XmlSchemaType(name = "string")
    protected StandardGroupByType standardGroupBy;

    /**
     * Ruft den Wert der standardGroupBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StandardGroupByType }
     *     
     */
    public StandardGroupByType getStandardGroupBy() {
        return standardGroupBy;
    }

    /**
     * Legt den Wert der standardGroupBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardGroupByType }
     *     
     */
    public void setStandardGroupBy(StandardGroupByType value) {
        this.standardGroupBy = value;
    }

}
