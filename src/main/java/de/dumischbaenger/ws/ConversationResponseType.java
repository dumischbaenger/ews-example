
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConversationResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConversationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConversationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="SyncState" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ConversationNodes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationNodesType" minOccurs="0"/&gt;
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversationResponseType", propOrder = {
    "conversationId",
    "syncState",
    "conversationNodes",
    "canDelete"
})
public class ConversationResponseType {

    @XmlElement(name = "ConversationId", required = true)
    protected ItemIdType conversationId;
    @XmlElement(name = "SyncState")
    protected byte[] syncState;
    @XmlElement(name = "ConversationNodes")
    protected ArrayOfConversationNodesType conversationNodes;
    @XmlElement(name = "CanDelete")
    protected Boolean canDelete;

    /**
     * Ruft den Wert der conversationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getConversationId() {
        return conversationId;
    }

    /**
     * Legt den Wert der conversationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setConversationId(ItemIdType value) {
        this.conversationId = value;
    }

    /**
     * Ruft den Wert der syncState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSyncState() {
        return syncState;
    }

    /**
     * Legt den Wert der syncState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSyncState(byte[] value) {
        this.syncState = value;
    }

    /**
     * Ruft den Wert der conversationNodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationNodesType }
     *     
     */
    public ArrayOfConversationNodesType getConversationNodes() {
        return conversationNodes;
    }

    /**
     * Legt den Wert der conversationNodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationNodesType }
     *     
     */
    public void setConversationNodes(ArrayOfConversationNodesType value) {
        this.conversationNodes = value;
    }

    /**
     * Ruft den Wert der canDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Legt den Wert der canDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDelete(Boolean value) {
        this.canDelete = value;
    }

}
