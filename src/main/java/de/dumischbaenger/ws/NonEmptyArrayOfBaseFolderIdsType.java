
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfBaseFolderIdsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfBaseFolderIdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *         &lt;element name="DistinguishedFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedFolderIdType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfBaseFolderIdsType", propOrder = {
    "folderIdOrDistinguishedFolderId"
})
public class NonEmptyArrayOfBaseFolderIdsType {

    @XmlElements({
        @XmlElement(name = "FolderId", type = FolderIdType.class),
        @XmlElement(name = "DistinguishedFolderId", type = DistinguishedFolderIdType.class)
    })
    protected List<BaseFolderIdType> folderIdOrDistinguishedFolderId;

    /**
     * Gets the value of the folderIdOrDistinguishedFolderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderIdOrDistinguishedFolderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderIdOrDistinguishedFolderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderIdType }
     * {@link DistinguishedFolderIdType }
     * 
     * 
     */
    public List<BaseFolderIdType> getFolderIdOrDistinguishedFolderId() {
        if (folderIdOrDistinguishedFolderId == null) {
            folderIdOrDistinguishedFolderId = new ArrayList<BaseFolderIdType>();
        }
        return this.folderIdOrDistinguishedFolderId;
    }

}
