
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OneDriveSearchScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OneDriveSearchScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OneDriveView" type="{http://schemas.microsoft.com/exchange/services/2006/types}OneDriveViewType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneDriveSearchScopeType", propOrder = {
    "oneDriveView"
})
public class OneDriveSearchScopeType {

    @XmlList
    @XmlElement(name = "OneDriveView", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> oneDriveView;

    /**
     * Gets the value of the oneDriveView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneDriveView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneDriveView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOneDriveView() {
        if (oneDriveView == null) {
            oneDriveView = new ArrayList<String>();
        }
        return this.oneDriveView;
    }

}
