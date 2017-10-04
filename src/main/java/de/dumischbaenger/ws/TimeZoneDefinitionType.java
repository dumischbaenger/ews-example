
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimeZoneDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Periods" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPeriodsType"/&gt;
 *         &lt;element name="TransitionsGroups" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTransitionsGroupsType" minOccurs="0"/&gt;
 *         &lt;element name="Transitions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTransitionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneDefinitionType", propOrder = {
    "periods",
    "transitionsGroups",
    "transitions"
})
public class TimeZoneDefinitionType {

    @XmlElement(name = "Periods")
    protected NonEmptyArrayOfPeriodsType periods;
    @XmlElement(name = "TransitionsGroups")
    protected ArrayOfTransitionsGroupsType transitionsGroups;
    @XmlElement(name = "Transitions")
    protected ArrayOfTransitionsType transitions;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Ruft den Wert der periods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPeriodsType }
     *     
     */
    public NonEmptyArrayOfPeriodsType getPeriods() {
        return periods;
    }

    /**
     * Legt den Wert der periods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPeriodsType }
     *     
     */
    public void setPeriods(NonEmptyArrayOfPeriodsType value) {
        this.periods = value;
    }

    /**
     * Ruft den Wert der transitionsGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransitionsGroupsType }
     *     
     */
    public ArrayOfTransitionsGroupsType getTransitionsGroups() {
        return transitionsGroups;
    }

    /**
     * Legt den Wert der transitionsGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransitionsGroupsType }
     *     
     */
    public void setTransitionsGroups(ArrayOfTransitionsGroupsType value) {
        this.transitionsGroups = value;
    }

    /**
     * Ruft den Wert der transitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransitionsType }
     *     
     */
    public ArrayOfTransitionsType getTransitions() {
        return transitions;
    }

    /**
     * Legt den Wert der transitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransitionsType }
     *     
     */
    public void setTransitions(ArrayOfTransitionsType value) {
        this.transitions = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

}
