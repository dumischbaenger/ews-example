
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindItemResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindItemResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RootFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindItemParentType" minOccurs="0"/&gt;
 *         &lt;element name="HighlightTerms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfHighlightTermsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "rootFolder",
    "highlightTerms"
})
public class FindItemResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RootFolder")
    protected FindItemParentType rootFolder;
    @XmlElement(name = "HighlightTerms")
    protected ArrayOfHighlightTermsType highlightTerms;

    /**
     * Ruft den Wert der rootFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindItemParentType }
     *     
     */
    public FindItemParentType getRootFolder() {
        return rootFolder;
    }

    /**
     * Legt den Wert der rootFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindItemParentType }
     *     
     */
    public void setRootFolder(FindItemParentType value) {
        this.rootFolder = value;
    }

    /**
     * Ruft den Wert der highlightTerms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public ArrayOfHighlightTermsType getHighlightTerms() {
        return highlightTerms;
    }

    /**
     * Legt den Wert der highlightTerms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public void setHighlightTerms(ArrayOfHighlightTermsType value) {
        this.highlightTerms = value;
    }

}
