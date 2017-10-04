
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateInboxRulesResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateInboxRulesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleOperationErrors" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRuleOperationErrorsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInboxRulesResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "ruleOperationErrors"
})
public class UpdateInboxRulesResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "RuleOperationErrors")
    protected ArrayOfRuleOperationErrorsType ruleOperationErrors;

    /**
     * Ruft den Wert der ruleOperationErrors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleOperationErrorsType }
     *     
     */
    public ArrayOfRuleOperationErrorsType getRuleOperationErrors() {
        return ruleOperationErrors;
    }

    /**
     * Legt den Wert der ruleOperationErrors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleOperationErrorsType }
     *     
     */
    public void setRuleOperationErrors(ArrayOfRuleOperationErrorsType value) {
        this.ruleOperationErrors = value;
    }

}
