
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RuleFieldURIType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleFieldURIType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RuleId"/&gt;
 *     &lt;enumeration value="DisplayName"/&gt;
 *     &lt;enumeration value="Priority"/&gt;
 *     &lt;enumeration value="IsNotSupported"/&gt;
 *     &lt;enumeration value="Actions"/&gt;
 *     &lt;enumeration value="Condition:Categories"/&gt;
 *     &lt;enumeration value="Condition:ContainsBodyStrings"/&gt;
 *     &lt;enumeration value="Condition:ContainsHeaderStrings"/&gt;
 *     &lt;enumeration value="Condition:ContainsRecipientStrings"/&gt;
 *     &lt;enumeration value="Condition:ContainsSenderStrings"/&gt;
 *     &lt;enumeration value="Condition:ContainsSubjectOrBodyStrings"/&gt;
 *     &lt;enumeration value="Condition:ContainsSubjectStrings"/&gt;
 *     &lt;enumeration value="Condition:FlaggedForAction"/&gt;
 *     &lt;enumeration value="Condition:FromAddresses"/&gt;
 *     &lt;enumeration value="Condition:FromConnectedAccounts"/&gt;
 *     &lt;enumeration value="Condition:HasAttachments"/&gt;
 *     &lt;enumeration value="Condition:Importance"/&gt;
 *     &lt;enumeration value="Condition:IsApprovalRequest"/&gt;
 *     &lt;enumeration value="Condition:IsAutomaticForward"/&gt;
 *     &lt;enumeration value="Condition:IsAutomaticReply"/&gt;
 *     &lt;enumeration value="Condition:IsEncrypted"/&gt;
 *     &lt;enumeration value="Condition:IsMeetingRequest"/&gt;
 *     &lt;enumeration value="Condition:IsMeetingResponse"/&gt;
 *     &lt;enumeration value="Condition:IsNDR"/&gt;
 *     &lt;enumeration value="Condition:IsPermissionControlled"/&gt;
 *     &lt;enumeration value="Condition:IsReadReceipt"/&gt;
 *     &lt;enumeration value="Condition:IsSigned"/&gt;
 *     &lt;enumeration value="Condition:IsVoicemail"/&gt;
 *     &lt;enumeration value="Condition:ItemClasses"/&gt;
 *     &lt;enumeration value="Condition:MessageClassifications"/&gt;
 *     &lt;enumeration value="Condition:NotSentToMe"/&gt;
 *     &lt;enumeration value="Condition:SentCcMe"/&gt;
 *     &lt;enumeration value="Condition:SentOnlyToMe"/&gt;
 *     &lt;enumeration value="Condition:SentToAddresses"/&gt;
 *     &lt;enumeration value="Condition:SentToMe"/&gt;
 *     &lt;enumeration value="Condition:SentToOrCcMe"/&gt;
 *     &lt;enumeration value="Condition:Sensitivity"/&gt;
 *     &lt;enumeration value="Condition:WithinDateRange"/&gt;
 *     &lt;enumeration value="Condition:WithinSizeRange"/&gt;
 *     &lt;enumeration value="Exception:Categories"/&gt;
 *     &lt;enumeration value="Exception:ContainsBodyStrings"/&gt;
 *     &lt;enumeration value="Exception:ContainsHeaderStrings"/&gt;
 *     &lt;enumeration value="Exception:ContainsRecipientStrings"/&gt;
 *     &lt;enumeration value="Exception:ContainsSenderStrings"/&gt;
 *     &lt;enumeration value="Exception:ContainsSubjectOrBodyStrings"/&gt;
 *     &lt;enumeration value="Exception:ContainsSubjectStrings"/&gt;
 *     &lt;enumeration value="Exception:FlaggedForAction"/&gt;
 *     &lt;enumeration value="Exception:FromAddresses"/&gt;
 *     &lt;enumeration value="Exception:FromConnectedAccounts"/&gt;
 *     &lt;enumeration value="Exception:HasAttachments"/&gt;
 *     &lt;enumeration value="Exception:Importance"/&gt;
 *     &lt;enumeration value="Exception:IsApprovalRequest"/&gt;
 *     &lt;enumeration value="Exception:IsAutomaticForward"/&gt;
 *     &lt;enumeration value="Exception:IsAutomaticReply"/&gt;
 *     &lt;enumeration value="Exception:IsEncrypted"/&gt;
 *     &lt;enumeration value="Exception:IsMeetingRequest"/&gt;
 *     &lt;enumeration value="Exception:IsMeetingResponse"/&gt;
 *     &lt;enumeration value="Exception:IsNDR"/&gt;
 *     &lt;enumeration value="Exception:IsPermissionControlled"/&gt;
 *     &lt;enumeration value="Exception:IsReadReceipt"/&gt;
 *     &lt;enumeration value="Exception:IsSigned"/&gt;
 *     &lt;enumeration value="Exception:IsVoicemail"/&gt;
 *     &lt;enumeration value="Exception:ItemClasses"/&gt;
 *     &lt;enumeration value="Exception:MessageClassifications"/&gt;
 *     &lt;enumeration value="Exception:NotSentToMe"/&gt;
 *     &lt;enumeration value="Exception:SentCcMe"/&gt;
 *     &lt;enumeration value="Exception:SentOnlyToMe"/&gt;
 *     &lt;enumeration value="Exception:SentToAddresses"/&gt;
 *     &lt;enumeration value="Exception:SentToMe"/&gt;
 *     &lt;enumeration value="Exception:SentToOrCcMe"/&gt;
 *     &lt;enumeration value="Exception:Sensitivity"/&gt;
 *     &lt;enumeration value="Exception:WithinDateRange"/&gt;
 *     &lt;enumeration value="Exception:WithinSizeRange"/&gt;
 *     &lt;enumeration value="Action:AssignCategories"/&gt;
 *     &lt;enumeration value="Action:CopyToFolder"/&gt;
 *     &lt;enumeration value="Action:Delete"/&gt;
 *     &lt;enumeration value="Action:ForwardAsAttachmentToRecipients"/&gt;
 *     &lt;enumeration value="Action:ForwardToRecipients"/&gt;
 *     &lt;enumeration value="Action:MarkImportance"/&gt;
 *     &lt;enumeration value="Action:MarkAsRead"/&gt;
 *     &lt;enumeration value="Action:MoveToFolder"/&gt;
 *     &lt;enumeration value="Action:PermanentDelete"/&gt;
 *     &lt;enumeration value="Action:RedirectToRecipients"/&gt;
 *     &lt;enumeration value="Action:SendSMSAlertToRecipients"/&gt;
 *     &lt;enumeration value="Action:ServerReplyWithMessage"/&gt;
 *     &lt;enumeration value="Action:StopProcessingRules"/&gt;
 *     &lt;enumeration value="IsEnabled"/&gt;
 *     &lt;enumeration value="IsInError"/&gt;
 *     &lt;enumeration value="Conditions"/&gt;
 *     &lt;enumeration value="Exceptions"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RuleFieldURIType")
@XmlEnum
public enum RuleFieldURIType {

    @XmlEnumValue("RuleId")
    RULE_ID("RuleId"),
    @XmlEnumValue("DisplayName")
    DISPLAY_NAME("DisplayName"),
    @XmlEnumValue("Priority")
    PRIORITY("Priority"),
    @XmlEnumValue("IsNotSupported")
    IS_NOT_SUPPORTED("IsNotSupported"),
    @XmlEnumValue("Actions")
    ACTIONS("Actions"),
    @XmlEnumValue("Condition:Categories")
    CONDITION_CATEGORIES("Condition:Categories"),
    @XmlEnumValue("Condition:ContainsBodyStrings")
    CONDITION_CONTAINS_BODY_STRINGS("Condition:ContainsBodyStrings"),
    @XmlEnumValue("Condition:ContainsHeaderStrings")
    CONDITION_CONTAINS_HEADER_STRINGS("Condition:ContainsHeaderStrings"),
    @XmlEnumValue("Condition:ContainsRecipientStrings")
    CONDITION_CONTAINS_RECIPIENT_STRINGS("Condition:ContainsRecipientStrings"),
    @XmlEnumValue("Condition:ContainsSenderStrings")
    CONDITION_CONTAINS_SENDER_STRINGS("Condition:ContainsSenderStrings"),
    @XmlEnumValue("Condition:ContainsSubjectOrBodyStrings")
    CONDITION_CONTAINS_SUBJECT_OR_BODY_STRINGS("Condition:ContainsSubjectOrBodyStrings"),
    @XmlEnumValue("Condition:ContainsSubjectStrings")
    CONDITION_CONTAINS_SUBJECT_STRINGS("Condition:ContainsSubjectStrings"),
    @XmlEnumValue("Condition:FlaggedForAction")
    CONDITION_FLAGGED_FOR_ACTION("Condition:FlaggedForAction"),
    @XmlEnumValue("Condition:FromAddresses")
    CONDITION_FROM_ADDRESSES("Condition:FromAddresses"),
    @XmlEnumValue("Condition:FromConnectedAccounts")
    CONDITION_FROM_CONNECTED_ACCOUNTS("Condition:FromConnectedAccounts"),
    @XmlEnumValue("Condition:HasAttachments")
    CONDITION_HAS_ATTACHMENTS("Condition:HasAttachments"),
    @XmlEnumValue("Condition:Importance")
    CONDITION_IMPORTANCE("Condition:Importance"),
    @XmlEnumValue("Condition:IsApprovalRequest")
    CONDITION_IS_APPROVAL_REQUEST("Condition:IsApprovalRequest"),
    @XmlEnumValue("Condition:IsAutomaticForward")
    CONDITION_IS_AUTOMATIC_FORWARD("Condition:IsAutomaticForward"),
    @XmlEnumValue("Condition:IsAutomaticReply")
    CONDITION_IS_AUTOMATIC_REPLY("Condition:IsAutomaticReply"),
    @XmlEnumValue("Condition:IsEncrypted")
    CONDITION_IS_ENCRYPTED("Condition:IsEncrypted"),
    @XmlEnumValue("Condition:IsMeetingRequest")
    CONDITION_IS_MEETING_REQUEST("Condition:IsMeetingRequest"),
    @XmlEnumValue("Condition:IsMeetingResponse")
    CONDITION_IS_MEETING_RESPONSE("Condition:IsMeetingResponse"),
    @XmlEnumValue("Condition:IsNDR")
    CONDITION_IS_NDR("Condition:IsNDR"),
    @XmlEnumValue("Condition:IsPermissionControlled")
    CONDITION_IS_PERMISSION_CONTROLLED("Condition:IsPermissionControlled"),
    @XmlEnumValue("Condition:IsReadReceipt")
    CONDITION_IS_READ_RECEIPT("Condition:IsReadReceipt"),
    @XmlEnumValue("Condition:IsSigned")
    CONDITION_IS_SIGNED("Condition:IsSigned"),
    @XmlEnumValue("Condition:IsVoicemail")
    CONDITION_IS_VOICEMAIL("Condition:IsVoicemail"),
    @XmlEnumValue("Condition:ItemClasses")
    CONDITION_ITEM_CLASSES("Condition:ItemClasses"),
    @XmlEnumValue("Condition:MessageClassifications")
    CONDITION_MESSAGE_CLASSIFICATIONS("Condition:MessageClassifications"),
    @XmlEnumValue("Condition:NotSentToMe")
    CONDITION_NOT_SENT_TO_ME("Condition:NotSentToMe"),
    @XmlEnumValue("Condition:SentCcMe")
    CONDITION_SENT_CC_ME("Condition:SentCcMe"),
    @XmlEnumValue("Condition:SentOnlyToMe")
    CONDITION_SENT_ONLY_TO_ME("Condition:SentOnlyToMe"),
    @XmlEnumValue("Condition:SentToAddresses")
    CONDITION_SENT_TO_ADDRESSES("Condition:SentToAddresses"),
    @XmlEnumValue("Condition:SentToMe")
    CONDITION_SENT_TO_ME("Condition:SentToMe"),
    @XmlEnumValue("Condition:SentToOrCcMe")
    CONDITION_SENT_TO_OR_CC_ME("Condition:SentToOrCcMe"),
    @XmlEnumValue("Condition:Sensitivity")
    CONDITION_SENSITIVITY("Condition:Sensitivity"),
    @XmlEnumValue("Condition:WithinDateRange")
    CONDITION_WITHIN_DATE_RANGE("Condition:WithinDateRange"),
    @XmlEnumValue("Condition:WithinSizeRange")
    CONDITION_WITHIN_SIZE_RANGE("Condition:WithinSizeRange"),
    @XmlEnumValue("Exception:Categories")
    EXCEPTION_CATEGORIES("Exception:Categories"),
    @XmlEnumValue("Exception:ContainsBodyStrings")
    EXCEPTION_CONTAINS_BODY_STRINGS("Exception:ContainsBodyStrings"),
    @XmlEnumValue("Exception:ContainsHeaderStrings")
    EXCEPTION_CONTAINS_HEADER_STRINGS("Exception:ContainsHeaderStrings"),
    @XmlEnumValue("Exception:ContainsRecipientStrings")
    EXCEPTION_CONTAINS_RECIPIENT_STRINGS("Exception:ContainsRecipientStrings"),
    @XmlEnumValue("Exception:ContainsSenderStrings")
    EXCEPTION_CONTAINS_SENDER_STRINGS("Exception:ContainsSenderStrings"),
    @XmlEnumValue("Exception:ContainsSubjectOrBodyStrings")
    EXCEPTION_CONTAINS_SUBJECT_OR_BODY_STRINGS("Exception:ContainsSubjectOrBodyStrings"),
    @XmlEnumValue("Exception:ContainsSubjectStrings")
    EXCEPTION_CONTAINS_SUBJECT_STRINGS("Exception:ContainsSubjectStrings"),
    @XmlEnumValue("Exception:FlaggedForAction")
    EXCEPTION_FLAGGED_FOR_ACTION("Exception:FlaggedForAction"),
    @XmlEnumValue("Exception:FromAddresses")
    EXCEPTION_FROM_ADDRESSES("Exception:FromAddresses"),
    @XmlEnumValue("Exception:FromConnectedAccounts")
    EXCEPTION_FROM_CONNECTED_ACCOUNTS("Exception:FromConnectedAccounts"),
    @XmlEnumValue("Exception:HasAttachments")
    EXCEPTION_HAS_ATTACHMENTS("Exception:HasAttachments"),
    @XmlEnumValue("Exception:Importance")
    EXCEPTION_IMPORTANCE("Exception:Importance"),
    @XmlEnumValue("Exception:IsApprovalRequest")
    EXCEPTION_IS_APPROVAL_REQUEST("Exception:IsApprovalRequest"),
    @XmlEnumValue("Exception:IsAutomaticForward")
    EXCEPTION_IS_AUTOMATIC_FORWARD("Exception:IsAutomaticForward"),
    @XmlEnumValue("Exception:IsAutomaticReply")
    EXCEPTION_IS_AUTOMATIC_REPLY("Exception:IsAutomaticReply"),
    @XmlEnumValue("Exception:IsEncrypted")
    EXCEPTION_IS_ENCRYPTED("Exception:IsEncrypted"),
    @XmlEnumValue("Exception:IsMeetingRequest")
    EXCEPTION_IS_MEETING_REQUEST("Exception:IsMeetingRequest"),
    @XmlEnumValue("Exception:IsMeetingResponse")
    EXCEPTION_IS_MEETING_RESPONSE("Exception:IsMeetingResponse"),
    @XmlEnumValue("Exception:IsNDR")
    EXCEPTION_IS_NDR("Exception:IsNDR"),
    @XmlEnumValue("Exception:IsPermissionControlled")
    EXCEPTION_IS_PERMISSION_CONTROLLED("Exception:IsPermissionControlled"),
    @XmlEnumValue("Exception:IsReadReceipt")
    EXCEPTION_IS_READ_RECEIPT("Exception:IsReadReceipt"),
    @XmlEnumValue("Exception:IsSigned")
    EXCEPTION_IS_SIGNED("Exception:IsSigned"),
    @XmlEnumValue("Exception:IsVoicemail")
    EXCEPTION_IS_VOICEMAIL("Exception:IsVoicemail"),
    @XmlEnumValue("Exception:ItemClasses")
    EXCEPTION_ITEM_CLASSES("Exception:ItemClasses"),
    @XmlEnumValue("Exception:MessageClassifications")
    EXCEPTION_MESSAGE_CLASSIFICATIONS("Exception:MessageClassifications"),
    @XmlEnumValue("Exception:NotSentToMe")
    EXCEPTION_NOT_SENT_TO_ME("Exception:NotSentToMe"),
    @XmlEnumValue("Exception:SentCcMe")
    EXCEPTION_SENT_CC_ME("Exception:SentCcMe"),
    @XmlEnumValue("Exception:SentOnlyToMe")
    EXCEPTION_SENT_ONLY_TO_ME("Exception:SentOnlyToMe"),
    @XmlEnumValue("Exception:SentToAddresses")
    EXCEPTION_SENT_TO_ADDRESSES("Exception:SentToAddresses"),
    @XmlEnumValue("Exception:SentToMe")
    EXCEPTION_SENT_TO_ME("Exception:SentToMe"),
    @XmlEnumValue("Exception:SentToOrCcMe")
    EXCEPTION_SENT_TO_OR_CC_ME("Exception:SentToOrCcMe"),
    @XmlEnumValue("Exception:Sensitivity")
    EXCEPTION_SENSITIVITY("Exception:Sensitivity"),
    @XmlEnumValue("Exception:WithinDateRange")
    EXCEPTION_WITHIN_DATE_RANGE("Exception:WithinDateRange"),
    @XmlEnumValue("Exception:WithinSizeRange")
    EXCEPTION_WITHIN_SIZE_RANGE("Exception:WithinSizeRange"),
    @XmlEnumValue("Action:AssignCategories")
    ACTION_ASSIGN_CATEGORIES("Action:AssignCategories"),
    @XmlEnumValue("Action:CopyToFolder")
    ACTION_COPY_TO_FOLDER("Action:CopyToFolder"),
    @XmlEnumValue("Action:Delete")
    ACTION_DELETE("Action:Delete"),
    @XmlEnumValue("Action:ForwardAsAttachmentToRecipients")
    ACTION_FORWARD_AS_ATTACHMENT_TO_RECIPIENTS("Action:ForwardAsAttachmentToRecipients"),
    @XmlEnumValue("Action:ForwardToRecipients")
    ACTION_FORWARD_TO_RECIPIENTS("Action:ForwardToRecipients"),
    @XmlEnumValue("Action:MarkImportance")
    ACTION_MARK_IMPORTANCE("Action:MarkImportance"),
    @XmlEnumValue("Action:MarkAsRead")
    ACTION_MARK_AS_READ("Action:MarkAsRead"),
    @XmlEnumValue("Action:MoveToFolder")
    ACTION_MOVE_TO_FOLDER("Action:MoveToFolder"),
    @XmlEnumValue("Action:PermanentDelete")
    ACTION_PERMANENT_DELETE("Action:PermanentDelete"),
    @XmlEnumValue("Action:RedirectToRecipients")
    ACTION_REDIRECT_TO_RECIPIENTS("Action:RedirectToRecipients"),
    @XmlEnumValue("Action:SendSMSAlertToRecipients")
    ACTION_SEND_SMS_ALERT_TO_RECIPIENTS("Action:SendSMSAlertToRecipients"),
    @XmlEnumValue("Action:ServerReplyWithMessage")
    ACTION_SERVER_REPLY_WITH_MESSAGE("Action:ServerReplyWithMessage"),
    @XmlEnumValue("Action:StopProcessingRules")
    ACTION_STOP_PROCESSING_RULES("Action:StopProcessingRules"),
    @XmlEnumValue("IsEnabled")
    IS_ENABLED("IsEnabled"),
    @XmlEnumValue("IsInError")
    IS_IN_ERROR("IsInError"),
    @XmlEnumValue("Conditions")
    CONDITIONS("Conditions"),
    @XmlEnumValue("Exceptions")
    EXCEPTIONS("Exceptions");
    private final String value;

    RuleFieldURIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleFieldURIType fromValue(String v) {
        for (RuleFieldURIType c: RuleFieldURIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
