
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Converts the passed source ids into the destination format.  Change keys are not
 *         returned.
 *       
 * 
 * <p>Java-Klasse für ConvertIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConvertIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAlternateIdsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DestinationFormat" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}IdFormatType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertIdType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "sourceIds"
})
public class ConvertIdType
    extends BaseRequestType
{

    @XmlElement(name = "SourceIds", required = true)
    protected NonEmptyArrayOfAlternateIdsType sourceIds;
    @XmlAttribute(name = "DestinationFormat", required = true)
    protected IdFormatType destinationFormat;

    /**
     * Ruft den Wert der sourceIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAlternateIdsType }
     *     
     */
    public NonEmptyArrayOfAlternateIdsType getSourceIds() {
        return sourceIds;
    }

    /**
     * Legt den Wert der sourceIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAlternateIdsType }
     *     
     */
    public void setSourceIds(NonEmptyArrayOfAlternateIdsType value) {
        this.sourceIds = value;
    }

    /**
     * Ruft den Wert der destinationFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdFormatType }
     *     
     */
    public IdFormatType getDestinationFormat() {
        return destinationFormat;
    }

    /**
     * Legt den Wert der destinationFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFormatType }
     *     
     */
    public void setDestinationFormat(IdFormatType value) {
        this.destinationFormat = value;
    }

}
