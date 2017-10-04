
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfSenderAddInsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSenderAddInsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Microsoft.OutlookServices.SenderApp" type="{http://schemas.microsoft.com/exchange/services/2006/types}SenderAddInEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSenderAddInsType", propOrder = {
    "microsoftOutlookServicesSenderApp"
})
public class ArrayOfSenderAddInsType {

    @XmlElement(name = "Microsoft.OutlookServices.SenderApp")
    protected List<SenderAddInEntityType> microsoftOutlookServicesSenderApp;

    /**
     * Gets the value of the microsoftOutlookServicesSenderApp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microsoftOutlookServicesSenderApp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrosoftOutlookServicesSenderApp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SenderAddInEntityType }
     * 
     * 
     */
    public List<SenderAddInEntityType> getMicrosoftOutlookServicesSenderApp() {
        if (microsoftOutlookServicesSenderApp == null) {
            microsoftOutlookServicesSenderApp = new ArrayList<SenderAddInEntityType>();
        }
        return this.microsoftOutlookServicesSenderApp;
    }

}
