
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
 * <p>Java-Klasse für ProtectionRuleAndType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProtectionRuleAndType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="AllInternal" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAllInternalType"/&gt;
 *           &lt;element name="And" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAndType"/&gt;
 *           &lt;element name="RecipientIs" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleRecipientIsType"/&gt;
 *           &lt;element name="SenderDepartments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleSenderDepartmentsType"/&gt;
 *           &lt;element name="True" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleTrueType"/&gt;
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
@XmlType(name = "ProtectionRuleAndType", propOrder = {
    "allInternalOrAndOrRecipientIs"
})
public class ProtectionRuleAndType {

    @XmlElementRefs({
        @XmlElementRef(name = "RecipientIs", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllInternal", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SenderDepartments", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "True", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "And", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> allInternalOrAndOrRecipientIs;

    /**
     * Gets the value of the allInternalOrAndOrRecipientIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allInternalOrAndOrRecipientIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllInternalOrAndOrRecipientIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ProtectionRuleRecipientIsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtectionRuleSenderDepartmentsType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtectionRuleAndType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAllInternalOrAndOrRecipientIs() {
        if (allInternalOrAndOrRecipientIs == null) {
            allInternalOrAndOrRecipientIs = new ArrayList<JAXBElement<?>>();
        }
        return this.allInternalOrAndOrRecipientIs;
    }

}
