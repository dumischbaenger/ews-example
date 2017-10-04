
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaskSuggestionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TaskSuggestionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}EntityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Assignees" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailUsersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSuggestionType", propOrder = {
    "taskString",
    "assignees"
})
public class TaskSuggestionType
    extends EntityType
{

    @XmlElement(name = "TaskString")
    protected String taskString;
    @XmlElement(name = "Assignees")
    protected ArrayOfEmailUsersType assignees;

    /**
     * Ruft den Wert der taskString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskString() {
        return taskString;
    }

    /**
     * Legt den Wert der taskString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskString(String value) {
        this.taskString = value;
    }

    /**
     * Ruft den Wert der assignees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailUsersType }
     *     
     */
    public ArrayOfEmailUsersType getAssignees() {
        return assignees;
    }

    /**
     * Legt den Wert der assignees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailUsersType }
     *     
     */
    public void setAssignees(ArrayOfEmailUsersType value) {
        this.assignees = value;
    }

}
