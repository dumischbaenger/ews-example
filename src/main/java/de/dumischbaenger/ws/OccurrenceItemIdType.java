
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OccurrenceItemIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OccurrenceItemIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseItemIdType"&gt;
 *       &lt;attribute name="RecurringMasterId" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}DerivedItemIdType" /&gt;
 *       &lt;attribute name="ChangeKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstanceIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccurrenceItemIdType")
public class OccurrenceItemIdType
    extends BaseItemIdType
{

    @XmlAttribute(name = "RecurringMasterId", required = true)
    protected String recurringMasterId;
    @XmlAttribute(name = "ChangeKey")
    protected String changeKey;
    @XmlAttribute(name = "InstanceIndex", required = true)
    protected int instanceIndex;

    /**
     * Ruft den Wert der recurringMasterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringMasterId() {
        return recurringMasterId;
    }

    /**
     * Legt den Wert der recurringMasterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringMasterId(String value) {
        this.recurringMasterId = value;
    }

    /**
     * Ruft den Wert der changeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeKey() {
        return changeKey;
    }

    /**
     * Legt den Wert der changeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeKey(String value) {
        this.changeKey = value;
    }

    /**
     * Ruft den Wert der instanceIndex-Eigenschaft ab.
     * 
     */
    public int getInstanceIndex() {
        return instanceIndex;
    }

    /**
     * Legt den Wert der instanceIndex-Eigenschaft fest.
     * 
     */
    public void setInstanceIndex(int value) {
        this.instanceIndex = value;
    }

}
