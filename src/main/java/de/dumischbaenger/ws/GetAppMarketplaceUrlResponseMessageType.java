
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetAppMarketplaceUrlResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetAppMarketplaceUrlResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppMarketplaceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAppMarketplaceUrlResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "appMarketplaceUrl"
})
public class GetAppMarketplaceUrlResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "AppMarketplaceUrl")
    protected String appMarketplaceUrl;

    /**
     * Ruft den Wert der appMarketplaceUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppMarketplaceUrl() {
        return appMarketplaceUrl;
    }

    /**
     * Legt den Wert der appMarketplaceUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppMarketplaceUrl(String value) {
        this.appMarketplaceUrl = value;
    }

}
