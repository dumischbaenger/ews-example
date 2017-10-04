
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyStateDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyStateDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="DeletedOccurrenceStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeletedOccurrenceStateDefinitionType"/&gt;
 *         &lt;element name="DeleteFromFolderStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeleteFromFolderStateDefinitionType"/&gt;
 *         &lt;element name="LocationBasedStateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}LocationBasedStateDefinitionType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyStateDefinitionType", propOrder = {
    "deletedOccurrenceStateDefinition",
    "deleteFromFolderStateDefinition",
    "locationBasedStateDefinition"
})
public class NonEmptyStateDefinitionType {

    @XmlElement(name = "DeletedOccurrenceStateDefinition")
    protected DeletedOccurrenceStateDefinitionType deletedOccurrenceStateDefinition;
    @XmlElement(name = "DeleteFromFolderStateDefinition")
    protected DeleteFromFolderStateDefinitionType deleteFromFolderStateDefinition;
    @XmlElement(name = "LocationBasedStateDefinition")
    protected LocationBasedStateDefinitionType locationBasedStateDefinition;

    /**
     * Ruft den Wert der deletedOccurrenceStateDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeletedOccurrenceStateDefinitionType }
     *     
     */
    public DeletedOccurrenceStateDefinitionType getDeletedOccurrenceStateDefinition() {
        return deletedOccurrenceStateDefinition;
    }

    /**
     * Legt den Wert der deletedOccurrenceStateDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedOccurrenceStateDefinitionType }
     *     
     */
    public void setDeletedOccurrenceStateDefinition(DeletedOccurrenceStateDefinitionType value) {
        this.deletedOccurrenceStateDefinition = value;
    }

    /**
     * Ruft den Wert der deleteFromFolderStateDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFromFolderStateDefinitionType }
     *     
     */
    public DeleteFromFolderStateDefinitionType getDeleteFromFolderStateDefinition() {
        return deleteFromFolderStateDefinition;
    }

    /**
     * Legt den Wert der deleteFromFolderStateDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFromFolderStateDefinitionType }
     *     
     */
    public void setDeleteFromFolderStateDefinition(DeleteFromFolderStateDefinitionType value) {
        this.deleteFromFolderStateDefinition = value;
    }

    /**
     * Ruft den Wert der locationBasedStateDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationBasedStateDefinitionType }
     *     
     */
    public LocationBasedStateDefinitionType getLocationBasedStateDefinition() {
        return locationBasedStateDefinition;
    }

    /**
     * Legt den Wert der locationBasedStateDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBasedStateDefinitionType }
     *     
     */
    public void setLocationBasedStateDefinition(LocationBasedStateDefinitionType value) {
        this.locationBasedStateDefinition = value;
    }

}
