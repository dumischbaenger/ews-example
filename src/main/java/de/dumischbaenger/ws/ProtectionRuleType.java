
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProtectionRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProtectionRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleConditionType"/&gt;
 *         &lt;element name="Action" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleActionType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="UserOverridable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Priority" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionRuleType", propOrder = {
    "condition",
    "action"
})
public class ProtectionRuleType {

    @XmlElement(name = "Condition", required = true)
    protected ProtectionRuleConditionType condition;
    @XmlElement(name = "Action", required = true)
    protected ProtectionRuleActionType action;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "UserOverridable", required = true)
    protected boolean userOverridable;
    @XmlAttribute(name = "Priority", required = true)
    protected int priority;

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleConditionType }
     *     
     */
    public ProtectionRuleConditionType getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleConditionType }
     *     
     */
    public void setCondition(ProtectionRuleConditionType value) {
        this.condition = value;
    }

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleActionType }
     *     
     */
    public ProtectionRuleActionType getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleActionType }
     *     
     */
    public void setAction(ProtectionRuleActionType value) {
        this.action = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der userOverridable-Eigenschaft ab.
     * 
     */
    public boolean isUserOverridable() {
        return userOverridable;
    }

    /**
     * Legt den Wert der userOverridable-Eigenschaft fest.
     * 
     */
    public void setUserOverridable(boolean value) {
        this.userOverridable = value;
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

}
