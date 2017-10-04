
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für DeletedOccurrenceStateDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeletedOccurrenceStateDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseCalendarItemStateDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OccurrenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsOccurrencePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletedOccurrenceStateDefinitionType", propOrder = {
    "occurrenceDate",
    "isOccurrencePresent"
})
public class DeletedOccurrenceStateDefinitionType
    extends BaseCalendarItemStateDefinitionType
{

    @XmlElement(name = "OccurrenceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occurrenceDate;
    @XmlElement(name = "IsOccurrencePresent")
    protected Boolean isOccurrencePresent;

    /**
     * Ruft den Wert der occurrenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Legt den Wert der occurrenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOccurrenceDate(XMLGregorianCalendar value) {
        this.occurrenceDate = value;
    }

    /**
     * Ruft den Wert der isOccurrencePresent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOccurrencePresent() {
        return isOccurrencePresent;
    }

    /**
     * Legt den Wert der isOccurrencePresent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOccurrencePresent(Boolean value) {
        this.isOccurrencePresent = value;
    }

}
