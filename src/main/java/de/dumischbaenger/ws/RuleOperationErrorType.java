
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RuleOperationErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RuleOperationErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValidationErrors" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRuleValidationErrorsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleOperationErrorType", propOrder = {
    "operationIndex",
    "validationErrors"
})
public class RuleOperationErrorType {

    @XmlElement(name = "OperationIndex")
    protected int operationIndex;
    @XmlElement(name = "ValidationErrors", required = true)
    protected ArrayOfRuleValidationErrorsType validationErrors;

    /**
     * Ruft den Wert der operationIndex-Eigenschaft ab.
     * 
     */
    public int getOperationIndex() {
        return operationIndex;
    }

    /**
     * Legt den Wert der operationIndex-Eigenschaft fest.
     * 
     */
    public void setOperationIndex(int value) {
        this.operationIndex = value;
    }

    /**
     * Ruft den Wert der validationErrors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleValidationErrorsType }
     *     
     */
    public ArrayOfRuleValidationErrorsType getValidationErrors() {
        return validationErrors;
    }

    /**
     * Legt den Wert der validationErrors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleValidationErrorsType }
     *     
     */
    public void setValidationErrors(ArrayOfRuleValidationErrorsType value) {
        this.validationErrors = value;
    }

}
