
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfPathsToElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfPathsToElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}Path"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfPathsToElementType", propOrder = {
    "path"
})
public class NonEmptyArrayOfPathsToElementType {

    @XmlElementRef(name = "Path", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends BasePathToElementType>> path;

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PathToExtendedFieldType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathToIndexedFieldType }{@code >}
     * {@link JAXBElement }{@code <}{@link BasePathToElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathToUnindexedFieldType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BasePathToElementType>> getPath() {
        if (path == null) {
            path = new ArrayList<JAXBElement<? extends BasePathToElementType>>();
        }
        return this.path;
    }

}
