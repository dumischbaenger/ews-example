
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserConfigurationName" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationNameType"/&gt;
 *         &lt;element name="UserConfigurationProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserConfigurationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "userConfigurationName",
    "userConfigurationProperties"
})
public class GetUserConfigurationType
    extends BaseRequestType
{

    @XmlElement(name = "UserConfigurationName", required = true)
    protected UserConfigurationNameType userConfigurationName;
    @XmlList
    @XmlElement(name = "UserConfigurationProperties", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> userConfigurationProperties;

    /**
     * Ruft den Wert der userConfigurationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationNameType }
     *     
     */
    public UserConfigurationNameType getUserConfigurationName() {
        return userConfigurationName;
    }

    /**
     * Legt den Wert der userConfigurationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationNameType }
     *     
     */
    public void setUserConfigurationName(UserConfigurationNameType value) {
        this.userConfigurationName = value;
    }

    /**
     * Gets the value of the userConfigurationProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userConfigurationProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserConfigurationProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserConfigurationProperties() {
        if (userConfigurationProperties == null) {
            userConfigurationProperties = new ArrayList<String>();
        }
        return this.userConfigurationProperties;
    }

}
