
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateItemInRecoverableItemsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateItemInRecoverableItemsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttachmentsType" minOccurs="0"/&gt;
 *         &lt;element name="ConflictResults" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConflictResultsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateItemInRecoverableItemsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attachments",
    "conflictResults"
})
public class UpdateItemInRecoverableItemsResponseMessageType
    extends ItemInfoResponseMessageType
{

    @XmlElement(name = "Attachments")
    protected ArrayOfAttachmentsType attachments;
    @XmlElement(name = "ConflictResults")
    protected ConflictResultsType conflictResults;

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentsType }
     *     
     */
    public ArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentsType }
     *     
     */
    public void setAttachments(ArrayOfAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Ruft den Wert der conflictResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConflictResultsType }
     *     
     */
    public ConflictResultsType getConflictResults() {
        return conflictResults;
    }

    /**
     * Legt den Wert der conflictResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConflictResultsType }
     *     
     */
    public void setConflictResults(ConflictResultsType value) {
        this.conflictResults = value;
    }

}
