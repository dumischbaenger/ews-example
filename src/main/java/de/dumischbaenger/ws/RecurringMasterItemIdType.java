
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RecurringMasterItemIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecurringMasterItemIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseItemIdType"&gt;
 *       &lt;attribute name="OccurrenceId" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}DerivedItemIdType" /&gt;
 *       &lt;attribute name="ChangeKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringMasterItemIdType")
public class RecurringMasterItemIdType
    extends BaseItemIdType
{

    @XmlAttribute(name = "OccurrenceId", required = true)
    protected String occurrenceId;
    @XmlAttribute(name = "ChangeKey")
    protected String changeKey;

    /**
     * Ruft den Wert der occurrenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceId() {
        return occurrenceId;
    }

    /**
     * Legt den Wert der occurrenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceId(String value) {
        this.occurrenceId = value;
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

}
