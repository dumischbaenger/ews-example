
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfDistinguishedFolderIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDistinguishedFolderIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "ArrayOfDistinguishedFolderIdType", propOrder = {
    "distinguishedFolderId"
})
public class ArrayOfDistinguishedFolderIdType {

    @XmlElement(name = "DistinguishedFolderId")
    protected List<DistinguishedFolderIdType> distinguishedFolderId;

    /**
     * Gets the value of the distinguishedFolderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distinguishedFolderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistinguishedFolderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistinguishedFolderIdType }
     * 
     * 
     */
    public List<DistinguishedFolderIdType> getDistinguishedFolderId() {
        if (distinguishedFolderId == null) {
            distinguishedFolderId = new ArrayList<DistinguishedFolderIdType>();
        }
        return this.distinguishedFolderId;
    }

}
