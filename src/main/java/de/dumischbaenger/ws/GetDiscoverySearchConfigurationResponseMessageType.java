
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Response message type for the GetDiscoverySearchConfiguration web method.
 *         
 * 
 * <p>Java-Klasse für GetDiscoverySearchConfigurationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetDiscoverySearchConfigurationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoverySearchConfigurations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfDiscoverySearchConfigurationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDiscoverySearchConfigurationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "discoverySearchConfigurations"
})
public class GetDiscoverySearchConfigurationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "DiscoverySearchConfigurations", required = true)
    protected ArrayOfDiscoverySearchConfigurationType discoverySearchConfigurations;

    /**
     * Ruft den Wert der discoverySearchConfigurations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiscoverySearchConfigurationType }
     *     
     */
    public ArrayOfDiscoverySearchConfigurationType getDiscoverySearchConfigurations() {
        return discoverySearchConfigurations;
    }

    /**
     * Legt den Wert der discoverySearchConfigurations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiscoverySearchConfigurationType }
     *     
     */
    public void setDiscoverySearchConfigurations(ArrayOfDiscoverySearchConfigurationType value) {
        this.discoverySearchConfigurations = value;
    }

}
