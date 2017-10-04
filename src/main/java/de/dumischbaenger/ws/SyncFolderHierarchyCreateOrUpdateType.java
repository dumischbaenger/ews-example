
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderHierarchyCreateOrUpdateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderHierarchyCreateOrUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Folder" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderType"/&gt;
 *         &lt;element name="CalendarFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarFolderType"/&gt;
 *         &lt;element name="ContactsFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactsFolderType"/&gt;
 *         &lt;element name="SearchFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchFolderType"/&gt;
 *         &lt;element name="TasksFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}TasksFolderType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderHierarchyCreateOrUpdateType", propOrder = {
    "folder",
    "calendarFolder",
    "contactsFolder",
    "searchFolder",
    "tasksFolder"
})
public class SyncFolderHierarchyCreateOrUpdateType {

    @XmlElement(name = "Folder")
    protected FolderType folder;
    @XmlElement(name = "CalendarFolder")
    protected CalendarFolderType calendarFolder;
    @XmlElement(name = "ContactsFolder")
    protected ContactsFolderType contactsFolder;
    @XmlElement(name = "SearchFolder")
    protected SearchFolderType searchFolder;
    @XmlElement(name = "TasksFolder")
    protected TasksFolderType tasksFolder;

    /**
     * Ruft den Wert der folder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderType }
     *     
     */
    public FolderType getFolder() {
        return folder;
    }

    /**
     * Legt den Wert der folder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderType }
     *     
     */
    public void setFolder(FolderType value) {
        this.folder = value;
    }

    /**
     * Ruft den Wert der calendarFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarFolderType }
     *     
     */
    public CalendarFolderType getCalendarFolder() {
        return calendarFolder;
    }

    /**
     * Legt den Wert der calendarFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarFolderType }
     *     
     */
    public void setCalendarFolder(CalendarFolderType value) {
        this.calendarFolder = value;
    }

    /**
     * Ruft den Wert der contactsFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactsFolderType }
     *     
     */
    public ContactsFolderType getContactsFolder() {
        return contactsFolder;
    }

    /**
     * Legt den Wert der contactsFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsFolderType }
     *     
     */
    public void setContactsFolder(ContactsFolderType value) {
        this.contactsFolder = value;
    }

    /**
     * Ruft den Wert der searchFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchFolderType }
     *     
     */
    public SearchFolderType getSearchFolder() {
        return searchFolder;
    }

    /**
     * Legt den Wert der searchFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFolderType }
     *     
     */
    public void setSearchFolder(SearchFolderType value) {
        this.searchFolder = value;
    }

    /**
     * Ruft den Wert der tasksFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TasksFolderType }
     *     
     */
    public TasksFolderType getTasksFolder() {
        return tasksFolder;
    }

    /**
     * Legt den Wert der tasksFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksFolderType }
     *     
     */
    public void setTasksFolder(TasksFolderType value) {
        this.tasksFolder = value;
    }

}
