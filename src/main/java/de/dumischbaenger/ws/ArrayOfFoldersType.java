
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ArrayOfFoldersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFoldersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "ArrayOfFoldersType", propOrder = {
    "folderOrCalendarFolderOrContactsFolder"
})
public class ArrayOfFoldersType {

    @XmlElements({
        @XmlElement(name = "Folder", type = FolderType.class),
        @XmlElement(name = "CalendarFolder", type = CalendarFolderType.class),
        @XmlElement(name = "ContactsFolder", type = ContactsFolderType.class),
        @XmlElement(name = "SearchFolder", type = SearchFolderType.class),
        @XmlElement(name = "TasksFolder", type = TasksFolderType.class)
    })
    protected List<BaseFolderType> folderOrCalendarFolderOrContactsFolder;

    /**
     * Gets the value of the folderOrCalendarFolderOrContactsFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderOrCalendarFolderOrContactsFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderOrCalendarFolderOrContactsFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderType }
     * {@link CalendarFolderType }
     * {@link ContactsFolderType }
     * {@link SearchFolderType }
     * {@link TasksFolderType }
     * 
     * 
     */
    public List<BaseFolderType> getFolderOrCalendarFolderOrContactsFolder() {
        if (folderOrCalendarFolderOrContactsFolder == null) {
            folderOrCalendarFolderOrContactsFolder = new ArrayList<BaseFolderType>();
        }
        return this.folderOrCalendarFolderOrContactsFolder;
    }

}
