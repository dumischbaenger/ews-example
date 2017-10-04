
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SharePointURLsServiceConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SharePointURLsServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ServiceConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalSPMySiteHostURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExternalSPMySiteHostURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharePointURLsServiceConfiguration", propOrder = {
    "internalSPMySiteHostURL",
    "externalSPMySiteHostURL"
})
public class SharePointURLsServiceConfiguration
    extends ServiceConfiguration
{

    @XmlElement(name = "InternalSPMySiteHostURL", required = true)
    protected String internalSPMySiteHostURL;
    @XmlElement(name = "ExternalSPMySiteHostURL", required = true)
    protected String externalSPMySiteHostURL;

    /**
     * Ruft den Wert der internalSPMySiteHostURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSPMySiteHostURL() {
        return internalSPMySiteHostURL;
    }

    /**
     * Legt den Wert der internalSPMySiteHostURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSPMySiteHostURL(String value) {
        this.internalSPMySiteHostURL = value;
    }

    /**
     * Ruft den Wert der externalSPMySiteHostURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSPMySiteHostURL() {
        return externalSPMySiteHostURL;
    }

    /**
     * Legt den Wert der externalSPMySiteHostURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSPMySiteHostURL(String value) {
        this.externalSPMySiteHostURL = value;
    }

}
