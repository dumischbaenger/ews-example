
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfServiceConfigurationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceConfigurationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceConfigurationResponseMessageType" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ServiceConfigurationResponseMessageType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceConfigurationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "serviceConfigurationResponseMessageType"
})
public class ArrayOfServiceConfigurationResponseMessageType {

    @XmlElement(name = "ServiceConfigurationResponseMessageType", required = true)
    protected List<ServiceConfigurationResponseMessageType> serviceConfigurationResponseMessageType;

    /**
     * Gets the value of the serviceConfigurationResponseMessageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfigurationResponseMessageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfigurationResponseMessageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConfigurationResponseMessageType }
     * 
     * 
     */
    public List<ServiceConfigurationResponseMessageType> getServiceConfigurationResponseMessageType() {
        if (serviceConfigurationResponseMessageType == null) {
            serviceConfigurationResponseMessageType = new ArrayList<ServiceConfigurationResponseMessageType>();
        }
        return this.serviceConfigurationResponseMessageType;
    }

}
