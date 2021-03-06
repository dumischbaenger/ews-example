
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ProtectionRuleActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProtectionRuleActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Argument" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleArgumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleActionKindType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionRuleActionType", propOrder = {
    "argument"
})
public class ProtectionRuleActionType {

    @XmlElement(name = "Argument")
    protected List<ProtectionRuleArgumentType> argument;
    @XmlAttribute(name = "Name", required = true)
    protected ProtectionRuleActionKindType name;

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectionRuleArgumentType }
     * 
     * 
     */
    public List<ProtectionRuleArgumentType> getArgument() {
        if (argument == null) {
            argument = new ArrayList<ProtectionRuleArgumentType>();
        }
        return this.argument;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRuleActionKindType }
     *     
     */
    public ProtectionRuleActionKindType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRuleActionKindType }
     *     
     */
    public void setName(ProtectionRuleActionKindType value) {
        this.name = value;
    }

}
