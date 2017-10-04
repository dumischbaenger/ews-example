
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A non-empty array of alternate Ids.
 *       
 * 
 * <p>Java-Klasse f�r NonEmptyArrayOfAlternateIdsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfAlternateIdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="AlternateId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternateIdType"/&gt;
 *         &lt;element name="AlternatePublicFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternatePublicFolderIdType"/&gt;
 *         &lt;element name="AlternatePublicFolderItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternatePublicFolderItemIdType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfAlternateIdsType", propOrder = {
    "alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId"
})
public class NonEmptyArrayOfAlternateIdsType {

    @XmlElements({
        @XmlElement(name = "AlternateId", type = AlternateIdType.class),
        @XmlElement(name = "AlternatePublicFolderId", type = AlternatePublicFolderIdType.class),
        @XmlElement(name = "AlternatePublicFolderItemId", type = AlternatePublicFolderItemIdType.class)
    })
    protected List<AlternateIdBaseType> alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId;

    /**
     * Gets the value of the alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateIdType }
     * {@link AlternatePublicFolderIdType }
     * {@link AlternatePublicFolderItemIdType }
     * 
     * 
     */
    public List<AlternateIdBaseType> getAlternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId() {
        if (alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId == null) {
            alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId = new ArrayList<AlternateIdBaseType>();
        }
        return this.alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId;
    }

}
