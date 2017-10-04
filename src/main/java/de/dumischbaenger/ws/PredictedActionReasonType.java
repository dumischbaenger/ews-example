
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PredictedActionReasonType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PredictedActionReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ConversationStarterIsYou"/&gt;
 *     &lt;enumeration value="OnlyRecipient"/&gt;
 *     &lt;enumeration value="ConversationContributions"/&gt;
 *     &lt;enumeration value="MarkedImportantBySender"/&gt;
 *     &lt;enumeration value="SenderIsManager"/&gt;
 *     &lt;enumeration value="SenderIsInManagementChain"/&gt;
 *     &lt;enumeration value="SenderIsDirectReport"/&gt;
 *     &lt;enumeration value="ActionBasedOnSender"/&gt;
 *     &lt;enumeration value="NameOnToLine"/&gt;
 *     &lt;enumeration value="NameOnCcLine"/&gt;
 *     &lt;enumeration value="ManagerPosition"/&gt;
 *     &lt;enumeration value="ReplyToAMessageFromMe"/&gt;
 *     &lt;enumeration value="PreviouslyFlagged"/&gt;
 *     &lt;enumeration value="ActionBasedOnRecipients"/&gt;
 *     &lt;enumeration value="ActionBasedOnSubjectWords"/&gt;
 *     &lt;enumeration value="ActionBasedOnBasedOnBodyWords"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredictedActionReasonType")
@XmlEnum
public enum PredictedActionReasonType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ConversationStarterIsYou")
    CONVERSATION_STARTER_IS_YOU("ConversationStarterIsYou"),
    @XmlEnumValue("OnlyRecipient")
    ONLY_RECIPIENT("OnlyRecipient"),
    @XmlEnumValue("ConversationContributions")
    CONVERSATION_CONTRIBUTIONS("ConversationContributions"),
    @XmlEnumValue("MarkedImportantBySender")
    MARKED_IMPORTANT_BY_SENDER("MarkedImportantBySender"),
    @XmlEnumValue("SenderIsManager")
    SENDER_IS_MANAGER("SenderIsManager"),
    @XmlEnumValue("SenderIsInManagementChain")
    SENDER_IS_IN_MANAGEMENT_CHAIN("SenderIsInManagementChain"),
    @XmlEnumValue("SenderIsDirectReport")
    SENDER_IS_DIRECT_REPORT("SenderIsDirectReport"),
    @XmlEnumValue("ActionBasedOnSender")
    ACTION_BASED_ON_SENDER("ActionBasedOnSender"),
    @XmlEnumValue("NameOnToLine")
    NAME_ON_TO_LINE("NameOnToLine"),
    @XmlEnumValue("NameOnCcLine")
    NAME_ON_CC_LINE("NameOnCcLine"),
    @XmlEnumValue("ManagerPosition")
    MANAGER_POSITION("ManagerPosition"),
    @XmlEnumValue("ReplyToAMessageFromMe")
    REPLY_TO_A_MESSAGE_FROM_ME("ReplyToAMessageFromMe"),
    @XmlEnumValue("PreviouslyFlagged")
    PREVIOUSLY_FLAGGED("PreviouslyFlagged"),
    @XmlEnumValue("ActionBasedOnRecipients")
    ACTION_BASED_ON_RECIPIENTS("ActionBasedOnRecipients"),
    @XmlEnumValue("ActionBasedOnSubjectWords")
    ACTION_BASED_ON_SUBJECT_WORDS("ActionBasedOnSubjectWords"),
    @XmlEnumValue("ActionBasedOnBasedOnBodyWords")
    ACTION_BASED_ON_BASED_ON_BODY_WORDS("ActionBasedOnBasedOnBodyWords");
    private final String value;

    PredictedActionReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictedActionReasonType fromValue(String v) {
        for (PredictedActionReasonType c: PredictedActionReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
