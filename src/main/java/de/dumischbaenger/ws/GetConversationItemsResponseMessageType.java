
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetConversationItemsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetConversationItemsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conversation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConversationItemsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "conversation"
})
public class GetConversationItemsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Conversation")
    protected ConversationResponseType conversation;

    /**
     * Ruft den Wert der conversation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationResponseType }
     *     
     */
    public ConversationResponseType getConversation() {
        return conversation;
    }

    /**
     * Legt den Wert der conversation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationResponseType }
     *     
     */
    public void setConversation(ConversationResponseType value) {
        this.conversation = value;
    }

}
