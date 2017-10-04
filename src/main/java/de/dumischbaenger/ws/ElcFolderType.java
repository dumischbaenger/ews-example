
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ElcFolderType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ElcFolderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Calendar"/&gt;
 *     &lt;enumeration value="Contacts"/&gt;
 *     &lt;enumeration value="DeletedItems"/&gt;
 *     &lt;enumeration value="Drafts"/&gt;
 *     &lt;enumeration value="Inbox"/&gt;
 *     &lt;enumeration value="JunkEmail"/&gt;
 *     &lt;enumeration value="Journal"/&gt;
 *     &lt;enumeration value="Notes"/&gt;
 *     &lt;enumeration value="Outbox"/&gt;
 *     &lt;enumeration value="SentItems"/&gt;
 *     &lt;enumeration value="Tasks"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="ManagedCustomFolder"/&gt;
 *     &lt;enumeration value="RssSubscriptions"/&gt;
 *     &lt;enumeration value="SyncIssues"/&gt;
 *     &lt;enumeration value="ConversationHistory"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="RecoverableItems"/&gt;
 *     &lt;enumeration value="NonIpmRoot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElcFolderType")
@XmlEnum
public enum ElcFolderType {

    @XmlEnumValue("Calendar")
    CALENDAR("Calendar"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("DeletedItems")
    DELETED_ITEMS("DeletedItems"),
    @XmlEnumValue("Drafts")
    DRAFTS("Drafts"),
    @XmlEnumValue("Inbox")
    INBOX("Inbox"),
    @XmlEnumValue("JunkEmail")
    JUNK_EMAIL("JunkEmail"),
    @XmlEnumValue("Journal")
    JOURNAL("Journal"),
    @XmlEnumValue("Notes")
    NOTES("Notes"),
    @XmlEnumValue("Outbox")
    OUTBOX("Outbox"),
    @XmlEnumValue("SentItems")
    SENT_ITEMS("SentItems"),
    @XmlEnumValue("Tasks")
    TASKS("Tasks"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("ManagedCustomFolder")
    MANAGED_CUSTOM_FOLDER("ManagedCustomFolder"),
    @XmlEnumValue("RssSubscriptions")
    RSS_SUBSCRIPTIONS("RssSubscriptions"),
    @XmlEnumValue("SyncIssues")
    SYNC_ISSUES("SyncIssues"),
    @XmlEnumValue("ConversationHistory")
    CONVERSATION_HISTORY("ConversationHistory"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("RecoverableItems")
    RECOVERABLE_ITEMS("RecoverableItems"),
    @XmlEnumValue("NonIpmRoot")
    NON_IPM_ROOT("NonIpmRoot");
    private final String value;

    ElcFolderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElcFolderType fromValue(String v) {
        for (ElcFolderType c: ElcFolderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
