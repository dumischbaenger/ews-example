
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetMessageTrackingReportResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetMessageTrackingReportResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageTrackingReport" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageTrackingReportType" minOccurs="0"/&gt;
 *         &lt;element name="Diagnostics" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfArraysOfTrackingPropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTrackingPropertiesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageTrackingReportResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "messageTrackingReport",
    "diagnostics",
    "errors",
    "properties"
})
public class GetMessageTrackingReportResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MessageTrackingReport")
    protected MessageTrackingReportType messageTrackingReport;
    @XmlElement(name = "Diagnostics")
    protected ArrayOfStringsType diagnostics;
    @XmlElement(name = "Errors")
    protected ArrayOfArraysOfTrackingPropertiesType errors;
    @XmlElement(name = "Properties")
    protected ArrayOfTrackingPropertiesType properties;

    /**
     * Ruft den Wert der messageTrackingReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageTrackingReportType }
     *     
     */
    public MessageTrackingReportType getMessageTrackingReport() {
        return messageTrackingReport;
    }

    /**
     * Legt den Wert der messageTrackingReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTrackingReportType }
     *     
     */
    public void setMessageTrackingReport(MessageTrackingReportType value) {
        this.messageTrackingReport = value;
    }

    /**
     * Ruft den Wert der diagnostics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getDiagnostics() {
        return diagnostics;
    }

    /**
     * Legt den Wert der diagnostics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setDiagnostics(ArrayOfStringsType value) {
        this.diagnostics = value;
    }

    /**
     * Ruft den Wert der errors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArraysOfTrackingPropertiesType }
     *     
     */
    public ArrayOfArraysOfTrackingPropertiesType getErrors() {
        return errors;
    }

    /**
     * Legt den Wert der errors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArraysOfTrackingPropertiesType }
     *     
     */
    public void setErrors(ArrayOfArraysOfTrackingPropertiesType value) {
        this.errors = value;
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
