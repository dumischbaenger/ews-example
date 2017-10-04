
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rule type
 * 
 * <p>Java-Klasse für RuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsNotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Conditions" type="{http://schemas.microsoft.com/exchange/services/2006/types}RulePredicatesType" minOccurs="0"/&gt;
 *         &lt;element name="Exceptions" type="{http://schemas.microsoft.com/exchange/services/2006/types}RulePredicatesType" minOccurs="0"/&gt;
 *         &lt;element name="Actions" type="{http://schemas.microsoft.com/exchange/services/2006/types}RuleActionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
    "ruleId",
    "displayName",
    "priority",
    "isEnabled",
    "isNotSupported",
    "isInError",
    "conditions",
    "exceptions",
    "actions"
})
public class RuleType {

    @XmlElement(name = "RuleId")
    protected String ruleId;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "IsEnabled")
    protected boolean isEnabled;
    @XmlElement(name = "IsNotSupported")
    protected Boolean isNotSupported;
    @XmlElement(name = "IsInError")
    protected Boolean isInError;
    @XmlElement(name = "Conditions")
    protected RulePredicatesType conditions;
    @XmlElement(name = "Exceptions")
    protected RulePredicatesType exceptions;
    @XmlElement(name = "Actions")
    protected RuleActionsType actions;

    /**
     * Ruft den Wert der ruleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Legt den Wert der ruleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der isEnabled-Eigenschaft ab.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Legt den Wert der isEnabled-Eigenschaft fest.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

    /**
     * Ruft den Wert der isNotSupported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotSupported() {
        return isNotSupported;
    }

    /**
     * Legt den Wert der isNotSupported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotSupported(Boolean value) {
        this.isNotSupported = value;
    }

    /**
     * Ruft den Wert der isInError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInError() {
        return isInError;
    }

    /**
     * Legt den Wert der isInError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInError(Boolean value) {
        this.isInError = value;
    }

    /**
     * Ruft den Wert der conditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RulePredicatesType }
     *     
     */
    public RulePredicatesType getConditions() {
        return conditions;
    }

    /**
     * Legt den Wert der conditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RulePredicatesType }
     *     
     */
    public void setConditions(RulePredicatesType value) {
        this.conditions = value;
    }

    /**
     * Ruft den Wert der exceptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RulePredicatesType }
     *     
     */
    public RulePredicatesType getExceptions() {
        return exceptions;
    }

    /**
     * Legt den Wert der exceptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RulePredicatesType }
     *     
     */
    public void setExceptions(RulePredicatesType value) {
        this.exceptions = value;
    }

    /**
     * Ruft den Wert der actions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RuleActionsType }
     *     
     */
    public RuleActionsType getActions() {
        return actions;
    }

    /**
     * Legt den Wert der actions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleActionsType }
     *     
     */
    public void setActions(RuleActionsType value) {
        this.actions = value;
    }

}
