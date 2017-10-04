
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfPrivateCatalogAddInsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrivateCatalogAddInsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddIn" type="{http://schemas.microsoft.com/exchange/services/2006/messages}PrivateCatalogAddInsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrivateCatalogAddInsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "addIn"
})
public class ArrayOfPrivateCatalogAddInsType {

    @XmlElement(name = "AddIn")
    protected List<PrivateCatalogAddInsType> addIn;

    /**
     * Gets the value of the addIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCatalogAddInsType }
     * 
     * 
     */
    public List<PrivateCatalogAddInsType> getAddIn() {
        if (addIn == null) {
            addIn = new ArrayList<PrivateCatalogAddInsType>();
        }
        return this.addIn;
    }

}
