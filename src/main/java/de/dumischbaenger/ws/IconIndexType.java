
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IconIndexType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IconIndexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="PostItem"/&gt;
 *     &lt;enumeration value="MailRead"/&gt;
 *     &lt;enumeration value="MailUnread"/&gt;
 *     &lt;enumeration value="MailReplied"/&gt;
 *     &lt;enumeration value="MailForwarded"/&gt;
 *     &lt;enumeration value="MailEncrypted"/&gt;
 *     &lt;enumeration value="MailSmimeSigned"/&gt;
 *     &lt;enumeration value="MailEncryptedReplied"/&gt;
 *     &lt;enumeration value="MailSmimeSignedReplied"/&gt;
 *     &lt;enumeration value="MailEncryptedForwarded"/&gt;
 *     &lt;enumeration value="MailSmimeSignedForwarded"/&gt;
 *     &lt;enumeration value="MailEncryptedRead"/&gt;
 *     &lt;enumeration value="MailSmimeSignedRead"/&gt;
 *     &lt;enumeration value="MailIrm"/&gt;
 *     &lt;enumeration value="MailIrmForwarded"/&gt;
 *     &lt;enumeration value="MailIrmReplied"/&gt;
 *     &lt;enumeration value="SmsSubmitted"/&gt;
 *     &lt;enumeration value="SmsRoutedToDeliveryPoint"/&gt;
 *     &lt;enumeration value="SmsRoutedToExternalMessagingSystem"/&gt;
 *     &lt;enumeration value="SmsDelivered"/&gt;
 *     &lt;enumeration value="OutlookDefaultForContacts"/&gt;
 *     &lt;enumeration value="AppointmentItem"/&gt;
 *     &lt;enumeration value="AppointmentRecur"/&gt;
 *     &lt;enumeration value="AppointmentMeet"/&gt;
 *     &lt;enumeration value="AppointmentMeetRecur"/&gt;
 *     &lt;enumeration value="AppointmentMeetNY"/&gt;
 *     &lt;enumeration value="AppointmentMeetYes"/&gt;
 *     &lt;enumeration value="AppointmentMeetNo"/&gt;
 *     &lt;enumeration value="AppointmentMeetMaybe"/&gt;
 *     &lt;enumeration value="AppointmentMeetCancel"/&gt;
 *     &lt;enumeration value="AppointmentMeetInfo"/&gt;
 *     &lt;enumeration value="TaskItem"/&gt;
 *     &lt;enumeration value="TaskRecur"/&gt;
 *     &lt;enumeration value="TaskOwned"/&gt;
 *     &lt;enumeration value="TaskDelegated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IconIndexType")
@XmlEnum
public enum IconIndexType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("PostItem")
    POST_ITEM("PostItem"),
    @XmlEnumValue("MailRead")
    MAIL_READ("MailRead"),
    @XmlEnumValue("MailUnread")
    MAIL_UNREAD("MailUnread"),
    @XmlEnumValue("MailReplied")
    MAIL_REPLIED("MailReplied"),
    @XmlEnumValue("MailForwarded")
    MAIL_FORWARDED("MailForwarded"),
    @XmlEnumValue("MailEncrypted")
    MAIL_ENCRYPTED("MailEncrypted"),
    @XmlEnumValue("MailSmimeSigned")
    MAIL_SMIME_SIGNED("MailSmimeSigned"),
    @XmlEnumValue("MailEncryptedReplied")
    MAIL_ENCRYPTED_REPLIED("MailEncryptedReplied"),
    @XmlEnumValue("MailSmimeSignedReplied")
    MAIL_SMIME_SIGNED_REPLIED("MailSmimeSignedReplied"),
    @XmlEnumValue("MailEncryptedForwarded")
    MAIL_ENCRYPTED_FORWARDED("MailEncryptedForwarded"),
    @XmlEnumValue("MailSmimeSignedForwarded")
    MAIL_SMIME_SIGNED_FORWARDED("MailSmimeSignedForwarded"),
    @XmlEnumValue("MailEncryptedRead")
    MAIL_ENCRYPTED_READ("MailEncryptedRead"),
    @XmlEnumValue("MailSmimeSignedRead")
    MAIL_SMIME_SIGNED_READ("MailSmimeSignedRead"),
    @XmlEnumValue("MailIrm")
    MAIL_IRM("MailIrm"),
    @XmlEnumValue("MailIrmForwarded")
    MAIL_IRM_FORWARDED("MailIrmForwarded"),
    @XmlEnumValue("MailIrmReplied")
    MAIL_IRM_REPLIED("MailIrmReplied"),
    @XmlEnumValue("SmsSubmitted")
    SMS_SUBMITTED("SmsSubmitted"),
    @XmlEnumValue("SmsRoutedToDeliveryPoint")
    SMS_ROUTED_TO_DELIVERY_POINT("SmsRoutedToDeliveryPoint"),
    @XmlEnumValue("SmsRoutedToExternalMessagingSystem")
    SMS_ROUTED_TO_EXTERNAL_MESSAGING_SYSTEM("SmsRoutedToExternalMessagingSystem"),
    @XmlEnumValue("SmsDelivered")
    SMS_DELIVERED("SmsDelivered"),
    @XmlEnumValue("OutlookDefaultForContacts")
    OUTLOOK_DEFAULT_FOR_CONTACTS("OutlookDefaultForContacts"),
    @XmlEnumValue("AppointmentItem")
    APPOINTMENT_ITEM("AppointmentItem"),
    @XmlEnumValue("AppointmentRecur")
    APPOINTMENT_RECUR("AppointmentRecur"),
    @XmlEnumValue("AppointmentMeet")
    APPOINTMENT_MEET("AppointmentMeet"),
    @XmlEnumValue("AppointmentMeetRecur")
    APPOINTMENT_MEET_RECUR("AppointmentMeetRecur"),
    @XmlEnumValue("AppointmentMeetNY")
    APPOINTMENT_MEET_NY("AppointmentMeetNY"),
    @XmlEnumValue("AppointmentMeetYes")
    APPOINTMENT_MEET_YES("AppointmentMeetYes"),
    @XmlEnumValue("AppointmentMeetNo")
    APPOINTMENT_MEET_NO("AppointmentMeetNo"),
    @XmlEnumValue("AppointmentMeetMaybe")
    APPOINTMENT_MEET_MAYBE("AppointmentMeetMaybe"),
    @XmlEnumValue("AppointmentMeetCancel")
    APPOINTMENT_MEET_CANCEL("AppointmentMeetCancel"),
    @XmlEnumValue("AppointmentMeetInfo")
    APPOINTMENT_MEET_INFO("AppointmentMeetInfo"),
    @XmlEnumValue("TaskItem")
    TASK_ITEM("TaskItem"),
    @XmlEnumValue("TaskRecur")
    TASK_RECUR("TaskRecur"),
    @XmlEnumValue("TaskOwned")
    TASK_OWNED("TaskOwned"),
    @XmlEnumValue("TaskDelegated")
    TASK_DELEGATED("TaskDelegated");
    private final String value;

    IconIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IconIndexType fromValue(String v) {
        for (IconIndexType c: IconIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
