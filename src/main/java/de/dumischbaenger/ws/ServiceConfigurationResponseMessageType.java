
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ServiceConfigurationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfigurationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailTipsConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailTipsServiceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="UnifiedMessagingConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}UnifiedMessageServiceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="ProtectionRulesConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRulesServiceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNudgeRulesConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}PolicyNudgeRulesServiceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="SharePointURLsConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}SharePointURLsServiceConfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfigurationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailTipsConfiguration",
    "unifiedMessagingConfiguration",
    "protectionRulesConfiguration",
    "policyNudgeRulesConfiguration",
    "sharePointURLsConfiguration"
})
public class ServiceConfigurationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MailTipsConfiguration")
    protected MailTipsServiceConfiguration mailTipsConfiguration;
    @XmlElement(name = "UnifiedMessagingConfiguration")
    protected UnifiedMessageServiceConfiguration unifiedMessagingConfiguration;
    @XmlElement(name = "ProtectionRulesConfiguration")
    protected ProtectionRulesServiceConfiguration protectionRulesConfiguration;
    @XmlElement(name = "PolicyNudgeRulesConfiguration")
    protected PolicyNudgeRulesServiceConfiguration policyNudgeRulesConfiguration;
    @XmlElement(name = "SharePointURLsConfiguration")
    protected SharePointURLsServiceConfiguration sharePointURLsConfiguration;

    /**
     * Ruft den Wert der mailTipsConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailTipsServiceConfiguration }
     *     
     */
    public MailTipsServiceConfiguration getMailTipsConfiguration() {
        return mailTipsConfiguration;
    }

    /**
     * Legt den Wert der mailTipsConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailTipsServiceConfiguration }
     *     
     */
    public void setMailTipsConfiguration(MailTipsServiceConfiguration value) {
        this.mailTipsConfiguration = value;
    }

    /**
     * Ruft den Wert der unifiedMessagingConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedMessageServiceConfiguration }
     *     
     */
    public UnifiedMessageServiceConfiguration getUnifiedMessagingConfiguration() {
        return unifiedMessagingConfiguration;
    }

    /**
     * Legt den Wert der unifiedMessagingConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedMessageServiceConfiguration }
     *     
     */
    public void setUnifiedMessagingConfiguration(UnifiedMessageServiceConfiguration value) {
        this.unifiedMessagingConfiguration = value;
    }

    /**
     * Ruft den Wert der protectionRulesConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRulesServiceConfiguration }
     *     
     */
    public ProtectionRulesServiceConfiguration getProtectionRulesConfiguration() {
        return protectionRulesConfiguration;
    }

    /**
     * Legt den Wert der protectionRulesConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRulesServiceConfiguration }
     *     
     */
    public void setProtectionRulesConfiguration(ProtectionRulesServiceConfiguration value) {
        this.protectionRulesConfiguration = value;
    }

    /**
     * Ruft den Wert der policyNudgeRulesConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolicyNudgeRulesServiceConfiguration }
     *     
     */
    public PolicyNudgeRulesServiceConfiguration getPolicyNudgeRulesConfiguration() {
        return policyNudgeRulesConfiguration;
    }

    /**
     * Legt den Wert der policyNudgeRulesConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyNudgeRulesServiceConfiguration }
     *     
     */
    public void setPolicyNudgeRulesConfiguration(PolicyNudgeRulesServiceConfiguration value) {
        this.policyNudgeRulesConfiguration = value;
    }

    /**
     * Ruft den Wert der sharePointURLsConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SharePointURLsServiceConfiguration }
     *     
     */
    public SharePointURLsServiceConfiguration getSharePointURLsConfiguration() {
        return sharePointURLsConfiguration;
    }

    /**
     * Legt den Wert der sharePointURLsConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SharePointURLsServiceConfiguration }
     *     
     */
    public void setSharePointURLsConfiguration(SharePointURLsServiceConfiguration value) {
        this.sharePointURLsConfiguration = value;
    }

}
