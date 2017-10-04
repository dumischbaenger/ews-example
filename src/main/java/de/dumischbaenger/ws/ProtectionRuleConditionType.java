
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProtectionRuleConditionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProtectionRuleConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AllInternal" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAllInternalType"/&gt;
 *         &lt;element name="And" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAndType"/&gt;
 *         &lt;element name="RecipientIs" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleRecipientIsType"/&gt;
 *         &lt;element name="SenderDepartments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleSenderDepartmentsType"/&gt;
 *         &lt;element name="True" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleTrueType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionRuleConditionType", propOrder = {
    "allInternal",
    "and",
    "recipientIs",
    "senderDepartments",
    "_true"
})
public class ProtectionRuleConditionType {

    @XmlElement(name = "AllInternal")
    protected String allInternal;
    @XmlElement(name = "And")
    protected ProtectionRuleAndType and;
    @XmlElement(name = "RecipientIs")
    protected ProtectionRuleRecipientIsType recipientIs;
    @XmlElement(name = "SenderDepartments")
    protected ProtectionRuleSenderDepartmentsType senderDepartments;
    @XmlElement(name = "True")
    protected String _true;

    /**
     * Ruft den Wert der allInternal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllInternal() {
        return allInternal;
    }

    /**
     * Legt den Wert der allInternal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllInternal(String value) {
        this.allInternal = value;
    }

    /**
     * Ruft den Wert der and-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleAndType }
     *     
     */
    public ProtectionRuleAndType getAnd() {
        return and;
    }

    /**
     * Legt den Wert der and-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleAndType }
     *     
     */
    public void setAnd(ProtectionRuleAndType value) {
        this.and = value;
    }

    /**
     * Ruft den Wert der recipientIs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleRecipientIsType }
     *     
     */
    public ProtectionRuleRecipientIsType getRecipientIs() {
        return recipientIs;
    }

    /**
     * Legt den Wert der recipientIs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleRecipientIsType }
     *     
     */
    public void setRecipientIs(ProtectionRuleRecipientIsType value) {
        this.recipientIs = value;
    }

    /**
     * Ruft den Wert der senderDepartments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleSenderDepartmentsType }
     *     
     */
    public ProtectionRuleSenderDepartmentsType getSenderDepartments() {
        return senderDepartments;
    }

    /**
     * Legt den Wert der senderDepartments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleSenderDepartmentsType }
     *     
     */
    public void setSenderDepartments(ProtectionRuleSenderDepartmentsType value) {
        this.senderDepartments = value;
    }

    /**
     * Ruft den Wert der true-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrue() {
        return _true;
    }

    /**
     * Legt den Wert der true-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrue(String value) {
        this._true = value;
    }

}
