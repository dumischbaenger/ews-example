
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateUserConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserConfigurationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "userConfiguration"
})
public class UpdateUserConfigurationType
    extends BaseRequestType
{

    @XmlElement(name = "UserConfiguration", required = true)
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
