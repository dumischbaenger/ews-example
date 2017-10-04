
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DelegatePermissionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DelegatePermissionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalendarFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *         &lt;element name="TasksFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *         &lt;element name="InboxFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *         &lt;element name="ContactsFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *         &lt;element name="NotesFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *         &lt;element name="JournalFolderPermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelegateFolderPermissionLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelegatePermissionsType", propOrder = {
    "calendarFolderPermissionLevel",
    "tasksFolderPermissionLevel",
    "inboxFolderPermissionLevel",
    "contactsFolderPermissionLevel",
    "notesFolderPermissionLevel",
    "journalFolderPermissionLevel"
})
public class DelegatePermissionsType {

    @XmlElement(name = "CalendarFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType calendarFolderPermissionLevel;
    @XmlElement(name = "TasksFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType tasksFolderPermissionLevel;
    @XmlElement(name = "InboxFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType inboxFolderPermissionLevel;
    @XmlElement(name = "ContactsFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType contactsFolderPermissionLevel;
    @XmlElement(name = "NotesFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType notesFolderPermissionLevel;
    @XmlElement(name = "JournalFolderPermissionLevel")
    @XmlSchemaType(name = "string")
    protected DelegateFolderPermissionLevelType journalFolderPermissionLevel;

    /**
     * Ruft den Wert der calendarFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getCalendarFolderPermissionLevel() {
        return calendarFolderPermissionLevel;
    }

    /**
     * Legt den Wert der calendarFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setCalendarFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.calendarFolderPermissionLevel = value;
    }

    /**
     * Ruft den Wert der tasksFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getTasksFolderPermissionLevel() {
        return tasksFolderPermissionLevel;
    }

    /**
     * Legt den Wert der tasksFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setTasksFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.tasksFolderPermissionLevel = value;
    }

    /**
     * Ruft den Wert der inboxFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getInboxFolderPermissionLevel() {
        return inboxFolderPermissionLevel;
    }

    /**
     * Legt den Wert der inboxFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setInboxFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.inboxFolderPermissionLevel = value;
    }

    /**
     * Ruft den Wert der contactsFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getContactsFolderPermissionLevel() {
        return contactsFolderPermissionLevel;
    }

    /**
     * Legt den Wert der contactsFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setContactsFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.contactsFolderPermissionLevel = value;
    }

    /**
     * Ruft den Wert der notesFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getNotesFolderPermissionLevel() {
        return notesFolderPermissionLevel;
    }

    /**
     * Legt den Wert der notesFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setNotesFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.notesFolderPermissionLevel = value;
    }

    /**
     * Ruft den Wert der journalFolderPermissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public DelegateFolderPermissionLevelType getJournalFolderPermissionLevel() {
        return journalFolderPermissionLevel;
    }

    /**
     * Legt den Wert der journalFolderPermissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateFolderPermissionLevelType }
     *     
     */
    public void setJournalFolderPermissionLevel(DelegateFolderPermissionLevelType value) {
        this.journalFolderPermissionLevel = value;
    }

}
