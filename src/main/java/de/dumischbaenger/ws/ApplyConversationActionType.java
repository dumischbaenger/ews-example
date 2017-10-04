
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApplyConversationActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApplyConversationActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConversationActions" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfApplyConversationActionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyConversationActionType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "conversationActions"
})
public class ApplyConversationActionType
    extends BaseRequestType
{

    @XmlElement(name = "ConversationActions", required = true)
    protected NonEmptyArrayOfApplyConversationActionType conversationActions;

    /**
     * Ruft den Wert der conversationActions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfApplyConversationActionType }
     *     
     */
    public NonEmptyArrayOfApplyConversationActionType getConversationActions() {
        return conversationActions;
    }

    /**
     * Legt den Wert der conversationActions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfApplyConversationActionType }
     *     
     */
    public void setConversationActions(NonEmptyArrayOfApplyConversationActionType value) {
        this.conversationActions = value;
    }

}
