
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeleteSearchSuggestionResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteSearchSuggestionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticsData" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchDiagnosticsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSearchSuggestionResponseType", propOrder = {
    "success",
    "statusMessage",
    "diagnosticsData"
})
public class DeleteSearchSuggestionResponseType {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "DiagnosticsData")
    protected SearchDiagnosticsType diagnosticsData;

    /**
     * Ruft den Wert der success-Eigenschaft ab.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Legt den Wert der success-Eigenschaft fest.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Ruft den Wert der statusMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Legt den Wert der statusMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Ruft den Wert der diagnosticsData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public SearchDiagnosticsType getDiagnosticsData() {
        return diagnosticsData;
    }

    /**
     * Legt den Wert der diagnosticsData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public void setDiagnosticsData(SearchDiagnosticsType value) {
        this.diagnosticsData = value;
    }

}
