
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetServiceConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetServiceConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActingAs" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfServiceConfigurationType"/&gt;
 *         &lt;element name="ConfigurationRequestDetails" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConfigurationRequestDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceConfigurationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "actingAs",
    "requestedConfiguration",
    "configurationRequestDetails"
})
public class GetServiceConfigurationType
    extends BaseRequestType
{

    @XmlElement(name = "ActingAs")
    protected EmailAddressType actingAs;
    @XmlElement(name = "RequestedConfiguration", required = true)
    protected ArrayOfServiceConfigurationType requestedConfiguration;
    @XmlElement(name = "ConfigurationRequestDetails")
    protected ConfigurationRequestDetailsType configurationRequestDetails;

    /**
     * Ruft den Wert der actingAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getActingAs() {
        return actingAs;
    }

    /**
     * Legt den Wert der actingAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setActingAs(EmailAddressType value) {
        this.actingAs = value;
    }

    /**
     * Ruft den Wert der requestedConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceConfigurationType }
     *     
     */
    public ArrayOfServiceConfigurationType getRequestedConfiguration() {
        return requestedConfiguration;
    }

    /**
     * Legt den Wert der requestedConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceConfigurationType }
     *     
     */
    public void setRequestedConfiguration(ArrayOfServiceConfigurationType value) {
        this.requestedConfiguration = value;
    }

    /**
     * Ruft den Wert der configurationRequestDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationRequestDetailsType }
     *     
     */
    public ConfigurationRequestDetailsType getConfigurationRequestDetails() {
        return configurationRequestDetails;
    }

    /**
     * Legt den Wert der configurationRequestDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationRequestDetailsType }
     *     
     */
    public void setConfigurationRequestDetails(ConfigurationRequestDetailsType value) {
        this.configurationRequestDetails = value;
    }

}
