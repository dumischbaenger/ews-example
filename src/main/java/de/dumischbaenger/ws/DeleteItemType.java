
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeleteItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DeleteType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}DisposalType" /&gt;
 *       &lt;attribute name="SendMeetingCancellations" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemCreateOrDeleteOperationType" /&gt;
 *       &lt;attribute name="AffectedTaskOccurrences" type="{http://schemas.microsoft.com/exchange/services/2006/types}AffectedTaskOccurrencesType" /&gt;
 *       &lt;attribute name="SuppressReadReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteItemType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemIds"
})
public class DeleteItemType
    extends BaseRequestType
{

    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;
    @XmlAttribute(name = "DeleteType", required = true)
    protected DisposalType deleteType;
    @XmlAttribute(name = "SendMeetingCancellations")
    protected CalendarItemCreateOrDeleteOperationType sendMeetingCancellations;
    @XmlAttribute(name = "AffectedTaskOccurrences")
    protected AffectedTaskOccurrencesType affectedTaskOccurrences;
    @XmlAttribute(name = "SuppressReadReceipts")
    protected Boolean suppressReadReceipts;

    /**
     * Ruft den Wert der itemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Legt den Wert der itemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseItemIdsType }
     *     
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }

    /**
     * Ruft den Wert der deleteType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisposalType }
     *     
     */
    public DisposalType getDeleteType() {
        return deleteType;
    }

    /**
     * Legt den Wert der deleteType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisposalType }
     *     
     */
    public void setDeleteType(DisposalType value) {
        this.deleteType = value;
    }

    /**
     * Ruft den Wert der sendMeetingCancellations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemCreateOrDeleteOperationType }
     *     
     */
    public CalendarItemCreateOrDeleteOperationType getSendMeetingCancellations() {
        return sendMeetingCancellations;
    }

    /**
     * Legt den Wert der sendMeetingCancellations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemCreateOrDeleteOperationType }
     *     
     */
    public void setSendMeetingCancellations(CalendarItemCreateOrDeleteOperationType value) {
        this.sendMeetingCancellations = value;
    }

    /**
     * Ruft den Wert der affectedTaskOccurrences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedTaskOccurrencesType }
     *     
     */
    public AffectedTaskOccurrencesType getAffectedTaskOccurrences() {
        return affectedTaskOccurrences;
    }

    /**
     * Legt den Wert der affectedTaskOccurrences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedTaskOccurrencesType }
     *     
     */
    public void setAffectedTaskOccurrences(AffectedTaskOccurrencesType value) {
        this.affectedTaskOccurrences = value;
    }

    /**
     * Ruft den Wert der suppressReadReceipts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressReadReceipts() {
        return suppressReadReceipts;
    }

    /**
     * Legt den Wert der suppressReadReceipts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressReadReceipts(Boolean value) {
        this.suppressReadReceipts = value;
    }

}
