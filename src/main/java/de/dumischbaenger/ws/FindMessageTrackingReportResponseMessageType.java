
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMessageTrackingReportResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMessageTrackingReportResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Diagnostics" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="MessageTrackingSearchResults" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFindMessageTrackingSearchResultType" minOccurs="0"/&gt;
 *         &lt;element name="ExecutedSearchScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FindMessageTrackingReportResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "diagnostics",
    "messageTrackingSearchResults",
    "executedSearchScope",
    "errors",
    "properties"
})
public class FindMessageTrackingReportResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Diagnostics")
    protected ArrayOfStringsType diagnostics;
    @XmlElement(name = "MessageTrackingSearchResults")
    protected ArrayOfFindMessageTrackingSearchResultType messageTrackingSearchResults;
    @XmlElement(name = "ExecutedSearchScope")
    protected String executedSearchScope;
    @XmlElement(name = "Errors")
    protected ArrayOfArraysOfTrackingPropertiesType errors;
    @XmlElement(name = "Properties")
    protected ArrayOfTrackingPropertiesType properties;

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
     * Ruft den Wert der messageTrackingSearchResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFindMessageTrackingSearchResultType }
     *     
     */
    public ArrayOfFindMessageTrackingSearchResultType getMessageTrackingSearchResults() {
        return messageTrackingSearchResults;
    }

    /**
     * Legt den Wert der messageTrackingSearchResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFindMessageTrackingSearchResultType }
     *     
     */
    public void setMessageTrackingSearchResults(ArrayOfFindMessageTrackingSearchResultType value) {
        this.messageTrackingSearchResults = value;
    }

    /**
     * Ruft den Wert der executedSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutedSearchScope() {
        return executedSearchScope;
    }

    /**
     * Legt den Wert der executedSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutedSearchScope(String value) {
        this.executedSearchScope = value;
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
