
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifier for a conversation item in search results
 * 
 * <p>Java-Klasse für SearchResultConversationIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchResultConversationIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutlookConversationId" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultConversationIdType", propOrder = {
    "outlookConversationId"
})
public class SearchResultConversationIdType
    extends ItemIdType
{

    @XmlElement(name = "OutlookConversationId")
    protected byte[] outlookConversationId;

    /**
     * Ruft den Wert der outlookConversationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutlookConversationId() {
        return outlookConversationId;
    }

    /**
     * Legt den Wert der outlookConversationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutlookConversationId(byte[] value) {
        this.outlookConversationId = value;
    }

}
