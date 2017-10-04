
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfInboxReminderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInboxReminderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InboxReminder" type="{http://schemas.microsoft.com/exchange/services/2006/types}InboxReminderType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInboxReminderType", propOrder = {
    "inboxReminder"
})
public class ArrayOfInboxReminderType {

    @XmlElement(name = "InboxReminder")
    protected List<InboxReminderType> inboxReminder;

    /**
     * Gets the value of the inboxReminder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboxReminder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboxReminder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboxReminderType }
     * 
     * 
     */
    public List<InboxReminderType> getInboxReminder() {
        if (inboxReminder == null) {
            inboxReminder = new ArrayList<InboxReminderType>();
        }
        return this.inboxReminder;
    }

}
