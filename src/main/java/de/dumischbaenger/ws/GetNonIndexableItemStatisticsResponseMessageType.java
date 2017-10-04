
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the GetNonIndexableItemStatistics web method.
 *       
 * 
 * <p>Java-Klasse für GetNonIndexableItemStatisticsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemStatisticsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonIndexableItemStatistics" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfNonIndexableItemStatisticsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNonIndexableItemStatisticsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "nonIndexableItemStatistics"
})
public class GetNonIndexableItemStatisticsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "NonIndexableItemStatistics")
    protected ArrayOfNonIndexableItemStatisticsType nonIndexableItemStatistics;

    /**
     * Ruft den Wert der nonIndexableItemStatistics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonIndexableItemStatisticsType }
     *     
     */
    public ArrayOfNonIndexableItemStatisticsType getNonIndexableItemStatistics() {
        return nonIndexableItemStatistics;
    }

    /**
     * Legt den Wert der nonIndexableItemStatistics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonIndexableItemStatisticsType }
     *     
     */
    public void setNonIndexableItemStatistics(ArrayOfNonIndexableItemStatisticsType value) {
        this.nonIndexableItemStatistics = value;
    }

}
