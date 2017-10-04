
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetRemindersResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetRemindersResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reminders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRemindersType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRemindersResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "reminders"
})
public class GetRemindersResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Reminders", required = true)
    protected ArrayOfRemindersType reminders;

    /**
     * Ruft den Wert der reminders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemindersType }
     *     
     */
    public ArrayOfRemindersType getReminders() {
        return reminders;
    }

    /**
     * Legt den Wert der reminders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemindersType }
     *     
     */
    public void setReminders(ArrayOfRemindersType value) {
        this.reminders = value;
    }

}
