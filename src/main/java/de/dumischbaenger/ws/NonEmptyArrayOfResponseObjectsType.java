
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfResponseObjectsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfResponseObjectsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="AcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptItemType"/&gt;
 *         &lt;element name="TentativelyAcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}TentativelyAcceptItemType"/&gt;
 *         &lt;element name="DeclineItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeclineItemType"/&gt;
 *         &lt;element name="ReplyToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyToItemType"/&gt;
 *         &lt;element name="ForwardItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ForwardItemType"/&gt;
 *         &lt;element name="ReplyAllToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyAllToItemType"/&gt;
 *         &lt;element name="CancelCalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CancelCalendarItemType"/&gt;
 *         &lt;element name="RemoveItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}RemoveItemType"/&gt;
 *         &lt;element name="SuppressReadReceipt" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuppressReadReceiptType"/&gt;
 *         &lt;element name="PostReplyItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostReplyItemType"/&gt;
 *         &lt;element name="AcceptSharingInvitation" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptSharingInvitationType"/&gt;
 *         &lt;element name="AddItemToMyCalendar" type="{http://schemas.microsoft.com/exchange/services/2006/types}AddItemToMyCalendarType"/&gt;
 *         &lt;element name="ProposeNewTime" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProposeNewTimeType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfResponseObjectsType", propOrder = {
    "acceptItemOrTentativelyAcceptItemOrDeclineItem"
})
public class NonEmptyArrayOfResponseObjectsType {

    @XmlElements({
        @XmlElement(name = "AcceptItem", type = AcceptItemType.class),
        @XmlElement(name = "TentativelyAcceptItem", type = TentativelyAcceptItemType.class),
        @XmlElement(name = "DeclineItem", type = DeclineItemType.class),
        @XmlElement(name = "ReplyToItem", type = ReplyToItemType.class),
        @XmlElement(name = "ForwardItem", type = ForwardItemType.class),
        @XmlElement(name = "ReplyAllToItem", type = ReplyAllToItemType.class),
        @XmlElement(name = "CancelCalendarItem", type = CancelCalendarItemType.class),
        @XmlElement(name = "RemoveItem", type = RemoveItemType.class),
        @XmlElement(name = "SuppressReadReceipt", type = SuppressReadReceiptType.class),
        @XmlElement(name = "PostReplyItem", type = PostReplyItemType.class),
        @XmlElement(name = "AcceptSharingInvitation", type = AcceptSharingInvitationType.class),
        @XmlElement(name = "AddItemToMyCalendar", type = AddItemToMyCalendarType.class),
        @XmlElement(name = "ProposeNewTime", type = ProposeNewTimeType.class)
    })
    protected List<ResponseObjectType> acceptItemOrTentativelyAcceptItemOrDeclineItem;

    /**
     * Gets the value of the acceptItemOrTentativelyAcceptItemOrDeclineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptItemOrTentativelyAcceptItemOrDeclineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptItemOrTentativelyAcceptItemOrDeclineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptItemType }
     * {@link TentativelyAcceptItemType }
     * {@link DeclineItemType }
     * {@link ReplyToItemType }
     * {@link ForwardItemType }
     * {@link ReplyAllToItemType }
     * {@link CancelCalendarItemType }
     * {@link RemoveItemType }
     * {@link SuppressReadReceiptType }
     * {@link PostReplyItemType }
     * {@link AcceptSharingInvitationType }
     * {@link AddItemToMyCalendarType }
     * {@link ProposeNewTimeType }
     * 
     * 
     */
    public List<ResponseObjectType> getAcceptItemOrTentativelyAcceptItemOrDeclineItem() {
        if (acceptItemOrTentativelyAcceptItemOrDeclineItem == null) {
            acceptItemOrTentativelyAcceptItemOrDeclineItem = new ArrayList<ResponseObjectType>();
        }
        return this.acceptItemOrTentativelyAcceptItemOrDeclineItem;
    }

}
