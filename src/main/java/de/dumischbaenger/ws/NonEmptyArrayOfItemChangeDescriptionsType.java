
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfItemChangeDescriptionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfItemChangeDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="AppendToItemField" type="{http://schemas.microsoft.com/exchange/services/2006/types}AppendToItemFieldType"/&gt;
 *         &lt;element name="SetItemField" type="{http://schemas.microsoft.com/exchange/services/2006/types}SetItemFieldType"/&gt;
 *         &lt;element name="DeleteItemField" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeleteItemFieldType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfItemChangeDescriptionsType", propOrder = {
    "appendToItemFieldOrSetItemFieldOrDeleteItemField"
})
public class NonEmptyArrayOfItemChangeDescriptionsType {

    @XmlElements({
        @XmlElement(name = "AppendToItemField", type = AppendToItemFieldType.class),
        @XmlElement(name = "SetItemField", type = SetItemFieldType.class),
        @XmlElement(name = "DeleteItemField", type = DeleteItemFieldType.class)
    })
    protected List<ItemChangeDescriptionType> appendToItemFieldOrSetItemFieldOrDeleteItemField;

    /**
     * Gets the value of the appendToItemFieldOrSetItemFieldOrDeleteItemField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendToItemFieldOrSetItemFieldOrDeleteItemField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendToItemFieldOrSetItemFieldOrDeleteItemField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendToItemFieldType }
     * {@link SetItemFieldType }
     * {@link DeleteItemFieldType }
     * 
     * 
     */
    public List<ItemChangeDescriptionType> getAppendToItemFieldOrSetItemFieldOrDeleteItemField() {
        if (appendToItemFieldOrSetItemFieldOrDeleteItemField == null) {
            appendToItemFieldOrSetItemFieldOrDeleteItemField = new ArrayList<ItemChangeDescriptionType>();
        }
        return this.appendToItemFieldOrSetItemFieldOrDeleteItemField;
    }

}
