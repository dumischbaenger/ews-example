
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetMessageTrackingReportRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetMessageTrackingReportRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Scope" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ReportTemplate" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageTrackingReportTemplateType"/&gt;
 *         &lt;element name="RecipientFilter" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="MessageTrackingReportId" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ReturnQueueEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticsLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTrackingPropertiesType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageTrackingReportRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "scope",
    "reportTemplate",
    "recipientFilter",
    "messageTrackingReportId",
    "returnQueueEvents",
    "diagnosticsLevel",
    "properties"
})
public class GetMessageTrackingReportRequestType
    extends BaseRequestType
{

    @XmlElement(name = "Scope", required = true)
    protected String scope;
    @XmlElement(name = "ReportTemplate", required = true)
    @XmlSchemaType(name = "string")
    protected MessageTrackingReportTemplateType reportTemplate;
    @XmlElement(name = "RecipientFilter")
    protected EmailAddressType recipientFilter;
    @XmlElement(name = "MessageTrackingReportId", required = true)
    protected String messageTrackingReportId;
    @XmlElement(name = "ReturnQueueEvents")
    protected Boolean returnQueueEvents;
    @XmlElement(name = "DiagnosticsLevel")
    protected String diagnosticsLevel;
    @XmlElement(name = "Properties")
    protected ArrayOfTrackingPropertiesType properties;

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der reportTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageTrackingReportTemplateType }
     *     
     */
    public MessageTrackingReportTemplateType getReportTemplate() {
        return reportTemplate;
    }

    /**
     * Legt den Wert der reportTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTrackingReportTemplateType }
     *     
     */
    public void setReportTemplate(MessageTrackingReportTemplateType value) {
        this.reportTemplate = value;
    }

    /**
     * Ruft den Wert der recipientFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getRecipientFilter() {
        return recipientFilter;
    }

    /**
     * Legt den Wert der recipientFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setRecipientFilter(EmailAddressType value) {
        this.recipientFilter = value;
    }

    /**
     * Ruft den Wert der messageTrackingReportId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTrackingReportId() {
        return messageTrackingReportId;
    }

    /**
     * Legt den Wert der messageTrackingReportId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTrackingReportId(String value) {
        this.messageTrackingReportId = value;
    }

    /**
     * Ruft den Wert der returnQueueEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnQueueEvents() {
        return returnQueueEvents;
    }

    /**
     * Legt den Wert der returnQueueEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnQueueEvents(Boolean value) {
        this.returnQueueEvents = value;
    }

    /**
     * Ruft den Wert der diagnosticsLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticsLevel() {
        return diagnosticsLevel;
    }

    /**
     * Legt den Wert der diagnosticsLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticsLevel(String value) {
        this.diagnosticsLevel = value;
    }

    /**
     * Ruft den Wert der properties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingPropertiesType }
     *     
     */
    public ArrayOfTrackingPropertiesType getProperties() {
        return properties;
    }

    /**
     * Legt den Wert der properties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingPropertiesType }
     *     
     */
    public void setProperties(ArrayOfTrackingPropertiesType value) {
        this.properties = value;
    }

}
