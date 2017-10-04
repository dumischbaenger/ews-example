
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetPrivateCatalogAddInsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetPrivateCatalogAddInsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://schemas.microsoft.com/exchange/services/2006/types}OfficeClientType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPrivateCatalogAddInsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "client"
})
public class GetPrivateCatalogAddInsType
    extends BaseRequestType
{

    @XmlElement(name = "Client")
    protected OfficeClientType client;

    /**
     * Ruft den Wert der client-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OfficeClientType }
     *     
     */
    public OfficeClientType getClient() {
        return client;
    }

    /**
     * Legt den Wert der client-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeClientType }
     *     
     */
    public void setClient(OfficeClientType value) {
        this.client = value;
    }

}
