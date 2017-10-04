
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupAttendeeConflictData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupAttendeeConflictData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}AttendeeConflictData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfMembers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumberOfMembersAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumberOfMembersWithConflict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumberOfMembersWithNoData" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAttendeeConflictData", propOrder = {
    "numberOfMembers",
    "numberOfMembersAvailable",
    "numberOfMembersWithConflict",
    "numberOfMembersWithNoData"
})
public class GroupAttendeeConflictData
    extends AttendeeConflictData
{

    @XmlElement(name = "NumberOfMembers")
    protected int numberOfMembers;
    @XmlElement(name = "NumberOfMembersAvailable")
    protected int numberOfMembersAvailable;
    @XmlElement(name = "NumberOfMembersWithConflict")
    protected int numberOfMembersWithConflict;
    @XmlElement(name = "NumberOfMembersWithNoData")
    protected int numberOfMembersWithNoData;

    /**
     * Ruft den Wert der numberOfMembers-Eigenschaft ab.
     * 
     */
    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * Legt den Wert der numberOfMembers-Eigenschaft fest.
     * 
     */
    public void setNumberOfMembers(int value) {
        this.numberOfMembers = value;
    }

    /**
     * Ruft den Wert der numberOfMembersAvailable-Eigenschaft ab.
     * 
     */
    public int getNumberOfMembersAvailable() {
        return numberOfMembersAvailable;
    }

    /**
     * Legt den Wert der numberOfMembersAvailable-Eigenschaft fest.
     * 
     */
    public void setNumberOfMembersAvailable(int value) {
        this.numberOfMembersAvailable = value;
    }

    /**
     * Ruft den Wert der numberOfMembersWithConflict-Eigenschaft ab.
     * 
     */
    public int getNumberOfMembersWithConflict() {
        return numberOfMembersWithConflict;
    }

    /**
     * Legt den Wert der numberOfMembersWithConflict-Eigenschaft fest.
     * 
     */
    public void setNumberOfMembersWithConflict(int value) {
        this.numberOfMembersWithConflict = value;
    }

    /**
     * Ruft den Wert der numberOfMembersWithNoData-Eigenschaft ab.
     * 
     */
    public int getNumberOfMembersWithNoData() {
        return numberOfMembersWithNoData;
    }

    /**
     * Legt den Wert der numberOfMembersWithNoData-Eigenschaft fest.
     * 
     */
    public void setNumberOfMembersWithNoData(int value) {
        this.numberOfMembersWithNoData = value;
    }

}
