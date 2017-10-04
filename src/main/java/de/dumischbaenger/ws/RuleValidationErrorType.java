
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a single validation error on a particular rule property value, predicate property value or action property value
 * 
 * <p>Java-Klasse für RuleValidationErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RuleValidationErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}RuleFieldURIType"/&gt;
 *         &lt;element name="ErrorCode" type="{http://schemas.microsoft.com/exchange/services/2006/types}RuleValidationErrorCodeType"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleValidationErrorType", propOrder = {
    "fieldURI",
    "errorCode",
    "errorMessage",
    "fieldValue"
})
public class RuleValidationErrorType {

    @XmlElement(name = "FieldURI", required = true)
    @XmlSchemaType(name = "string")
    protected RuleFieldURIType fieldURI;
    @XmlElement(name = "ErrorCode", required = true)
    @XmlSchemaType(name = "string")
    protected RuleValidationErrorCodeType errorCode;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "FieldValue", required = true)
    protected String fieldValue;

    /**
     * Ruft den Wert der fieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RuleFieldURIType }
     *     
     */
    public RuleFieldURIType getFieldURI() {
        return fieldURI;
    }

    /**
     * Legt den Wert der fieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleFieldURIType }
     *     
     */
    public void setFieldURI(RuleFieldURIType value) {
        this.fieldURI = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RuleValidationErrorCodeType }
     *     
     */
    public RuleValidationErrorCodeType getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleValidationErrorCodeType }
     *     
     */
    public void setErrorCode(RuleValidationErrorCodeType value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Legt den Wert der errorMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Ruft den Wert der fieldValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Legt den Wert der fieldValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

}
