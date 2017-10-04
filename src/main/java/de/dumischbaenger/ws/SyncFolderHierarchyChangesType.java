
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderHierarchyChangesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderHierarchyChangesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Create" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderHierarchyCreateOrUpdateType"/&gt;
 *           &lt;element name="Update" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderHierarchyCreateOrUpdateType"/&gt;
 *           &lt;element name="Delete" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderHierarchyDeleteType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderHierarchyChangesType", propOrder = {
    "createOrUpdateOrDelete"
})
public class SyncFolderHierarchyChangesType {

    @XmlElementRefs({
        @XmlElementRef(name = "Delete", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Create", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Update", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> createOrUpdateOrDelete;

    /**
     * Gets the value of the createOrUpdateOrDelete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrUpdateOrDelete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateOrUpdateOrDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SyncFolderHierarchyDeleteType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderHierarchyCreateOrUpdateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncFolderHierarchyCreateOrUpdateType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCreateOrUpdateOrDelete() {
        if (createOrUpdateOrDelete == null) {
            createOrUpdateOrDelete = new ArrayList<JAXBElement<?>>();
        }
        return this.createOrUpdateOrDelete;
    }

}
