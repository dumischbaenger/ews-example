
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         IM Contact List
 *       
 * 
 * <p>Java-Klasse für ImItemListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Groups" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfImGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Personas" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImItemListType", propOrder = {
    "groups",
    "personas"
})
public class ImItemListType {

    @XmlElement(name = "Groups")
    protected ArrayOfImGroupType groups;
    @XmlElement(name = "Personas")
    protected ArrayOfPeopleType personas;

    /**
     * Ruft den Wert der groups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImGroupType }
     *     
     */
    public ArrayOfImGroupType getGroups() {
        return groups;
    }

    /**
     * Legt den Wert der groups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImGroupType }
     *     
     */
    public void setGroups(ArrayOfImGroupType value) {
        this.groups = value;
    }

    /**
     * Ruft den Wert der personas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public ArrayOfPeopleType getPersonas() {
        return personas;
    }

    /**
     * Legt den Wert der personas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public void setPersonas(ArrayOfPeopleType value) {
        this.personas = value;
    }

}
