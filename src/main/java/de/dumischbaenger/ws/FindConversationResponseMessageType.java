
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindConversationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindConversationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conversations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationsType" minOccurs="0"/&gt;
 *         &lt;element name="HighlightTerms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfHighlightTermsType" minOccurs="0"/&gt;
 *         &lt;element name="TotalConversationsInView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IndexedOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindConversationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "conversations",
    "highlightTerms",
    "totalConversationsInView",
    "indexedOffset"
})
public class FindConversationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Conversations")
    protected ArrayOfConversationsType conversations;
    @XmlElement(name = "HighlightTerms")
    protected ArrayOfHighlightTermsType highlightTerms;
    @XmlElement(name = "TotalConversationsInView")
    protected Integer totalConversationsInView;
    @XmlElement(name = "IndexedOffset")
    protected Integer indexedOffset;

    /**
     * Ruft den Wert der conversations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public ArrayOfConversationsType getConversations() {
        return conversations;
    }

    /**
     * Legt den Wert der conversations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public void setConversations(ArrayOfConversationsType value) {
        this.conversations = value;
    }

    /**
     * Ruft den Wert der highlightTerms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public ArrayOfHighlightTermsType getHighlightTerms() {
        return highlightTerms;
    }

    /**
     * Legt den Wert der highlightTerms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHighlightTermsType }
     *     
     */
    public void setHighlightTerms(ArrayOfHighlightTermsType value) {
        this.highlightTerms = value;
    }

    /**
     * Ruft den Wert der totalConversationsInView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalConversationsInView() {
        return totalConversationsInView;
    }

    /**
     * Legt den Wert der totalConversationsInView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalConversationsInView(Integer value) {
        this.totalConversationsInView = value;
    }

    /**
     * Ruft den Wert der indexedOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexedOffset() {
        return indexedOffset;
    }

    /**
     * Legt den Wert der indexedOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexedOffset(Integer value) {
        this.indexedOffset = value;
    }

}
