
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResolveNamesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResolveNamesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolutionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfResolutionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveNamesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "resolutionSet"
})
public class ResolveNamesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ResolutionSet")
    protected ArrayOfResolutionType resolutionSet;

    /**
     * Ruft den Wert der resolutionSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResolutionType }
     *     
     */
    public ArrayOfResolutionType getResolutionSet() {
        return resolutionSet;
    }

    /**
     * Legt den Wert der resolutionSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResolutionType }
     *     
     */
    public void setResolutionSet(ArrayOfResolutionType value) {
        this.resolutionSet = value;
    }

}
