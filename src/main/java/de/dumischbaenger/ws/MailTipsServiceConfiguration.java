
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailTipsServiceConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailTipsServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ServiceConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailTipsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxRecipientsPerGetMailTipsRequest" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxMessageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LargeAudienceThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShowExternalRecipientCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InternalDomains" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpDomainList"/&gt;
 *         &lt;element name="PolicyTipsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LargeAudienceCap" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailTipsServiceConfiguration", propOrder = {
    "mailTipsEnabled",
    "maxRecipientsPerGetMailTipsRequest",
    "maxMessageSize",
    "largeAudienceThreshold",
    "showExternalRecipientCount",
    "internalDomains",
    "policyTipsEnabled",
    "largeAudienceCap"
})
public class MailTipsServiceConfiguration
    extends ServiceConfiguration
{

    @XmlElement(name = "MailTipsEnabled")
    protected boolean mailTipsEnabled;
    @XmlElement(name = "MaxRecipientsPerGetMailTipsRequest")
    protected int maxRecipientsPerGetMailTipsRequest;
    @XmlElement(name = "MaxMessageSize")
    protected int maxMessageSize;
    @XmlElement(name = "LargeAudienceThreshold")
    protected int largeAudienceThreshold;
    @XmlElement(name = "ShowExternalRecipientCount")
    protected boolean showExternalRecipientCount;
    @XmlElement(name = "InternalDomains", required = true)
    protected SmtpDomainList internalDomains;
    @XmlElement(name = "PolicyTipsEnabled")
    protected boolean policyTipsEnabled;
    @XmlElement(name = "LargeAudienceCap")
    protected int largeAudienceCap;

    /**
     * Ruft den Wert der mailTipsEnabled-Eigenschaft ab.
     * 
     */
    public boolean isMailTipsEnabled() {
        return mailTipsEnabled;
    }

    /**
     * Legt den Wert der mailTipsEnabled-Eigenschaft fest.
     * 
     */
    public void setMailTipsEnabled(boolean value) {
        this.mailTipsEnabled = value;
    }

    /**
     * Ruft den Wert der maxRecipientsPerGetMailTipsRequest-Eigenschaft ab.
     * 
     */
    public int getMaxRecipientsPerGetMailTipsRequest() {
        return maxRecipientsPerGetMailTipsRequest;
    }

    /**
     * Legt den Wert der maxRecipientsPerGetMailTipsRequest-Eigenschaft fest.
     * 
     */
    public void setMaxRecipientsPerGetMailTipsRequest(int value) {
        this.maxRecipientsPerGetMailTipsRequest = value;
    }

    /**
     * Ruft den Wert der maxMessageSize-Eigenschaft ab.
     * 
     */
    public int getMaxMessageSize() {
        return maxMessageSize;
    }

    /**
     * Legt den Wert der maxMessageSize-Eigenschaft fest.
     * 
     */
    public void setMaxMessageSize(int value) {
        this.maxMessageSize = value;
    }

    /**
     * Ruft den Wert der largeAudienceThreshold-Eigenschaft ab.
     * 
     */
    public int getLargeAudienceThreshold() {
        return largeAudienceThreshold;
    }

    /**
     * Legt den Wert der largeAudienceThreshold-Eigenschaft fest.
     * 
     */
    public void setLargeAudienceThreshold(int value) {
        this.largeAudienceThreshold = value;
    }

    /**
     * Ruft den Wert der showExternalRecipientCount-Eigenschaft ab.
     * 
     */
    public boolean isShowExternalRecipientCount() {
        return showExternalRecipientCount;
    }

    /**
     * Legt den Wert der showExternalRecipientCount-Eigenschaft fest.
     * 
     */
    public void setShowExternalRecipientCount(boolean value) {
        this.showExternalRecipientCount = value;
    }

    /**
     * Ruft den Wert der internalDomains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpDomainList }
     *     
     */
    public SmtpDomainList getInternalDomains() {
        return internalDomains;
    }

    /**
     * Legt den Wert der internalDomains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpDomainList }
     *     
     */
    public void setInternalDomains(SmtpDomainList value) {
        this.internalDomains = value;
    }

    /**
     * Ruft den Wert der policyTipsEnabled-Eigenschaft ab.
     * 
     */
    public boolean isPolicyTipsEnabled() {
        return policyTipsEnabled;
    }

    /**
     * Legt den Wert der policyTipsEnabled-Eigenschaft fest.
     * 
     */
    public void setPolicyTipsEnabled(boolean value) {
        this.policyTipsEnabled = value;
    }

    /**
     * Ruft den Wert der largeAudienceCap-Eigenschaft ab.
     * 
     */
    public int getLargeAudienceCap() {
        return largeAudienceCap;
    }

    /**
     * Legt den Wert der largeAudienceCap-Eigenschaft fest.
     * 
     */
    public void setLargeAudienceCap(int value) {
        this.largeAudienceCap = value;
    }

}
