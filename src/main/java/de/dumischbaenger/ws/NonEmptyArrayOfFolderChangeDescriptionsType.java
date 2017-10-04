
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfFolderChangeDescriptionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfFolderChangeDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="AppendToFolderField" type="{http://schemas.microsoft.com/exchange/services/2006/types}AppendToFolderFieldType"/&gt;
 *         &lt;element name="SetFolderField" type="{http://schemas.microsoft.com/exchange/services/2006/types}SetFolderFieldType"/&gt;
 *         &lt;element name="DeleteFolderField" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeleteFolderFieldType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfFolderChangeDescriptionsType", propOrder = {
    "appendToFolderFieldOrSetFolderFieldOrDeleteFolderField"
})
public class NonEmptyArrayOfFolderChangeDescriptionsType {

    @XmlElements({
        @XmlElement(name = "AppendToFolderField", type = AppendToFolderFieldType.class),
        @XmlElement(name = "SetFolderField", type = SetFolderFieldType.class),
        @XmlElement(name = "DeleteFolderField", type = DeleteFolderFieldType.class)
    })
    protected List<FolderChangeDescriptionType> appendToFolderFieldOrSetFolderFieldOrDeleteFolderField;

    /**
     * Gets the value of the appendToFolderFieldOrSetFolderFieldOrDeleteFolderField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendToFolderFieldOrSetFolderFieldOrDeleteFolderField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendToFolderFieldOrSetFolderFieldOrDeleteFolderField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendToFolderFieldType }
     * {@link SetFolderFieldType }
     * {@link DeleteFolderFieldType }
     * 
     * 
     */
    public List<FolderChangeDescriptionType> getAppendToFolderFieldOrSetFolderFieldOrDeleteFolderField() {
        if (appendToFolderFieldOrSetFolderFieldOrDeleteFolderField == null) {
            appendToFolderFieldOrSetFolderFieldOrDeleteFolderField = new ArrayList<FolderChangeDescriptionType>();
        }
        return this.appendToFolderFieldOrSetFolderFieldOrDeleteFolderField;
    }

}
