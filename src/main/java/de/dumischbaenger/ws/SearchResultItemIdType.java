
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifier for an item in search results
 * 
 * <p>Java-Klasse für SearchResultItemIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchResultItemIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryId" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="OutlookItemId" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultItemIdType", propOrder = {
    "entryId",
    "outlookItemId"
})
public class SearchResultItemIdType
    extends ItemIdType
{

    @XmlElement(name = "EntryId")
    protected byte[] entryId;
    @XmlElement(name = "OutlookItemId")
    protected byte[] outlookItemId;

    /**
     * Ruft den Wert der entryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEntryId() {
        return entryId;
    }

    /**
     * Legt den Wert der entryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEntryId(byte[] value) {
        this.entryId = value;
    }

    /**
     * Ruft den Wert der outlookItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutlookItemId() {
        return outlookItemId;
    }

    /**
     * Legt den Wert der outlookItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutlookItemId(byte[] value) {
        this.outlookItemId = value;
    }

}
