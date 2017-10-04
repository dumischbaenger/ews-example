
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sender" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="ToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="CcRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="BccRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="IsReadReceiptRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeliveryReceiptRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConversationIndex" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ConversationTopic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="From" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="InternetMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsResponseRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="References" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyTo" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedRepresenting" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalRequestData" type="{http://schemas.microsoft.com/exchange/services/2006/types}ApprovalRequestDataType" minOccurs="0"/&gt;
 *         &lt;element name="VotingInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}VotingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ReminderMessageData" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReminderMessageDataType" minOccurs="0"/&gt;
 *         &lt;element name="SenderSMTPAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="MailboxGuids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "sender",
    "toRecipients",
    "ccRecipients",
    "bccRecipients",
    "isReadReceiptRequested",
    "isDeliveryReceiptRequested",
    "conversationIndex",
    "conversationTopic",
    "from",
    "internetMessageId",
    "isRead",
    "isResponseRequested",
    "references",
    "replyTo",
    "receivedBy",
    "receivedRepresenting",
    "approvalRequestData",
    "votingInformation",
    "reminderMessageData",
    "senderSMTPAddress",
    "mailboxGuids"
})
@XmlSeeAlso({
    MeetingMessageType.class,
    ResponseObjectCoreType.class
})
public class MessageType
    extends ItemType
{

    @XmlElement(name = "Sender")
    protected SingleRecipientType sender;
    @XmlElement(name = "ToRecipients")
    protected ArrayOfRecipientsType toRecipients;
    @XmlElement(name = "CcRecipients")
    protected ArrayOfRecipientsType ccRecipients;
    @XmlElement(name = "BccRecipients")
    protected ArrayOfRecipientsType bccRecipients;
    @XmlElement(name = "IsReadReceiptRequested")
    protected Boolean isReadReceiptRequested;
    @XmlElement(name = "IsDeliveryReceiptRequested")
    protected Boolean isDeliveryReceiptRequested;
    @XmlElement(name = "ConversationIndex")
    protected byte[] conversationIndex;
    @XmlElement(name = "ConversationTopic")
    protected String conversationTopic;
    @XmlElement(name = "From")
    protected SingleRecipientType from;
    @XmlElement(name = "InternetMessageId")
    protected String internetMessageId;
    @XmlElement(name = "IsRead")
    protected Boolean isRead;
    @XmlElement(name = "IsResponseRequested")
    protected Boolean isResponseRequested;
    @XmlElement(name = "References")
    protected String references;
    @XmlElement(name = "ReplyTo")
    protected ArrayOfRecipientsType replyTo;
    @XmlElement(name = "ReceivedBy")
    protected SingleRecipientType receivedBy;
    @XmlElement(name = "ReceivedRepresenting")
    protected SingleRecipientType receivedRepresenting;
    @XmlElement(name = "ApprovalRequestData")
    protected ApprovalRequestDataType approvalRequestData;
    @XmlElement(name = "VotingInformation")
    protected VotingInformationType votingInformation;
    @XmlElement(name = "ReminderMessageData")
    protected ReminderMessageDataType reminderMessageData;
    @XmlElement(name = "SenderSMTPAddress")
    protected SmtpAddressType senderSMTPAddress;
    @XmlElement(name = "MailboxGuids")
    protected MessageType.MailboxGuids mailboxGuids;

    /**
     * Ruft den Wert der sender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getSender() {
        return sender;
    }

    /**
     * Legt den Wert der sender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setSender(SingleRecipientType value) {
        this.sender = value;
    }

    /**
     * Ruft den Wert der toRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getToRecipients() {
        return toRecipients;
    }

    /**
     * Legt den Wert der toRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setToRecipients(ArrayOfRecipientsType value) {
        this.toRecipients = value;
    }

    /**
     * Ruft den Wert der ccRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getCcRecipients() {
        return ccRecipients;
    }

    /**
     * Legt den Wert der ccRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setCcRecipients(ArrayOfRecipientsType value) {
        this.ccRecipients = value;
    }

    /**
     * Ruft den Wert der bccRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getBccRecipients() {
        return bccRecipients;
    }

    /**
     * Legt den Wert der bccRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setBccRecipients(ArrayOfRecipientsType value) {
        this.bccRecipients = value;
    }

    /**
     * Ruft den Wert der isReadReceiptRequested-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadReceiptRequested() {
        return isReadReceiptRequested;
    }

    /**
     * Legt den Wert der isReadReceiptRequested-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadReceiptRequested(Boolean value) {
        this.isReadReceiptRequested = value;
    }

    /**
     * Ruft den Wert der isDeliveryReceiptRequested-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeliveryReceiptRequested() {
        return isDeliveryReceiptRequested;
    }

    /**
     * Legt den Wert der isDeliveryReceiptRequested-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeliveryReceiptRequested(Boolean value) {
        this.isDeliveryReceiptRequested = value;
    }

    /**
     * Ruft den Wert der conversationIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getConversationIndex() {
        return conversationIndex;
    }

    /**
     * Legt den Wert der conversationIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setConversationIndex(byte[] value) {
        this.conversationIndex = value;
    }

    /**
     * Ruft den Wert der conversationTopic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationTopic() {
        return conversationTopic;
    }

    /**
     * Legt den Wert der conversationTopic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationTopic(String value) {
        this.conversationTopic = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setFrom(SingleRecipientType value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der internetMessageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetMessageId() {
        return internetMessageId;
    }

    /**
     * Legt den Wert der internetMessageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetMessageId(String value) {
        this.internetMessageId = value;
    }

    /**
     * Ruft den Wert der isRead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRead() {
        return isRead;
    }

    /**
     * Legt den Wert der isRead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRead(Boolean value) {
        this.isRead = value;
    }

    /**
     * Ruft den Wert der isResponseRequested-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResponseRequested() {
        return isResponseRequested;
    }

    /**
     * Legt den Wert der isResponseRequested-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResponseRequested(Boolean value) {
        this.isResponseRequested = value;
    }

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * Ruft den Wert der replyTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getReplyTo() {
        return replyTo;
    }

    /**
     * Legt den Wert der replyTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setReplyTo(ArrayOfRecipientsType value) {
        this.replyTo = value;
    }

    /**
     * Ruft den Wert der receivedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getReceivedBy() {
        return receivedBy;
    }

    /**
     * Legt den Wert der receivedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setReceivedBy(SingleRecipientType value) {
        this.receivedBy = value;
    }

    /**
     * Ruft den Wert der receivedRepresenting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getReceivedRepresenting() {
        return receivedRepresenting;
    }

    /**
     * Legt den Wert der receivedRepresenting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setReceivedRepresenting(SingleRecipientType value) {
        this.receivedRepresenting = value;
    }

    /**
     * Ruft den Wert der approvalRequestData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalRequestDataType }
     *     
     */
    public ApprovalRequestDataType getApprovalRequestData() {
        return approvalRequestData;
    }

    /**
     * Legt den Wert der approvalRequestData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalRequestDataType }
     *     
     */
    public void setApprovalRequestData(ApprovalRequestDataType value) {
        this.approvalRequestData = value;
    }

    /**
     * Ruft den Wert der votingInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VotingInformationType }
     *     
     */
    public VotingInformationType getVotingInformation() {
        return votingInformation;
    }

    /**
     * Legt den Wert der votingInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingInformationType }
     *     
     */
    public void setVotingInformation(VotingInformationType value) {
        this.votingInformation = value;
    }

    /**
     * Ruft den Wert der reminderMessageData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReminderMessageDataType }
     *     
     */
    public ReminderMessageDataType getReminderMessageData() {
        return reminderMessageData;
    }

    /**
     * Legt den Wert der reminderMessageData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderMessageDataType }
     *     
     */
    public void setReminderMessageData(ReminderMessageDataType value) {
        this.reminderMessageData = value;
    }

    /**
     * Ruft den Wert der senderSMTPAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpAddressType }
     *     
     */
    public SmtpAddressType getSenderSMTPAddress() {
        return senderSMTPAddress;
    }

    /**
     * Legt den Wert der senderSMTPAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpAddressType }
     *     
     */
    public void setSenderSMTPAddress(SmtpAddressType value) {
        this.senderSMTPAddress = value;
    }

    /**
     * Ruft den Wert der mailboxGuids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageType.MailboxGuids }
     *     
     */
    public MessageType.MailboxGuids getMailboxGuids() {
        return mailboxGuids;
    }

    /**
     * Legt den Wert der mailboxGuids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.MailboxGuids }
     *     
     */
    public void setMailboxGuids(MessageType.MailboxGuids value) {
        this.mailboxGuids = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mailboxGuid"
    })
    public static class MailboxGuids {

        @XmlElement(name = "MailboxGuid", required = true)
        protected List<String> mailboxGuid;

        /**
         * Gets the value of the mailboxGuid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mailboxGuid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMailboxGuid().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMailboxGuid() {
            if (mailboxGuid == null) {
                mailboxGuid = new ArrayList<String>();
            }
            return this.mailboxGuid;
        }

    }

}
