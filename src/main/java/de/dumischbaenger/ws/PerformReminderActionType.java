
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PerformReminderActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PerformReminderActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReminderItemActions" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfReminderItemActionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformReminderActionType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "reminderItemActions"
})
public class PerformReminderActionType
    extends BaseRequestType
{

    @XmlElement(name = "ReminderItemActions", required = true)
    protected NonEmptyArrayOfReminderItemActionType reminderItemActions;

    /**
     * Ruft den Wert der reminderItemActions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfReminderItemActionType }
     *     
     */
    public NonEmptyArrayOfReminderItemActionType getReminderItemActions() {
        return reminderItemActions;
    }

    /**
     * Legt den Wert der reminderItemActions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfReminderItemActionType }
     *     
     */
    public void setReminderItemActions(NonEmptyArrayOfReminderItemActionType value) {
        this.reminderItemActions = value;
    }

}
