
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserConfigurationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserConfigurationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserConfigurationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "userConfiguration"
})
public class GetUserConfigurationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "UserConfiguration")
    protected UserConfigurationType userConfiguration;

    /**
     * Ruft den Wert der userConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationType }
     *     
     */
    public UserConfigurationType getUserConfiguration() {
        return userConfiguration;
    }

    /**
     * Legt den Wert der userConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationType }
     *     
     */
    public void setUserConfiguration(UserConfigurationType value) {
        this.userConfiguration = value;
    }

}
