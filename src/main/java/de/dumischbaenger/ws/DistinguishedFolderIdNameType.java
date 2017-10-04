
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DistinguishedFolderIdNameType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinguishedFolderIdNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="calendar"/&gt;
 *     &lt;enumeration value="contacts"/&gt;
 *     &lt;enumeration value="deleteditems"/&gt;
 *     &lt;enumeration value="drafts"/&gt;
 *     &lt;enumeration value="inbox"/&gt;
 *     &lt;enumeration value="journal"/&gt;
 *     &lt;enumeration value="notes"/&gt;
 *     &lt;enumeration value="outbox"/&gt;
 *     &lt;enumeration value="sentitems"/&gt;
 *     &lt;enumeration value="tasks"/&gt;
 *     &lt;enumeration value="msgfolderroot"/&gt;
 *     &lt;enumeration value="publicfoldersroot"/&gt;
 *     &lt;enumeration value="root"/&gt;
 *     &lt;enumeration value="junkemail"/&gt;
 *     &lt;enumeration value="searchfolders"/&gt;
 *     &lt;enumeration value="voicemail"/&gt;
 *     &lt;enumeration value="recoverableitemsroot"/&gt;
 *     &lt;enumeration value="recoverableitemsdeletions"/&gt;
 *     &lt;enumeration value="recoverableitemsversions"/&gt;
 *     &lt;enumeration value="recoverableitemspurges"/&gt;
 *     &lt;enumeration value="recoverableitemsdiscoveryholds"/&gt;
 *     &lt;enumeration value="archiveroot"/&gt;
 *     &lt;enumeration value="archivemsgfolderroot"/&gt;
 *     &lt;enumeration value="archivedeleteditems"/&gt;
 *     &lt;enumeration value="archiveinbox"/&gt;
 *     &lt;enumeration value="archiverecoverableitemsroot"/&gt;
 *     &lt;enumeration value="archiverecoverableitemsdeletions"/&gt;
 *     &lt;enumeration value="archiverecoverableitemsversions"/&gt;
 *     &lt;enumeration value="archiverecoverableitemspurges"/&gt;
 *     &lt;enumeration value="archiverecoverableitemsdiscoveryholds"/&gt;
 *     &lt;enumeration value="syncissues"/&gt;
 *     &lt;enumeration value="conflicts"/&gt;
 *     &lt;enumeration value="localfailures"/&gt;
 *     &lt;enumeration value="serverfailures"/&gt;
 *     &lt;enumeration value="recipientcache"/&gt;
 *     &lt;enumeration value="quickcontacts"/&gt;
 *     &lt;enumeration value="conversationhistory"/&gt;
 *     &lt;enumeration value="adminauditlogs"/&gt;
 *     &lt;enumeration value="todosearch"/&gt;
 *     &lt;enumeration value="mycontacts"/&gt;
 *     &lt;enumeration value="directory"/&gt;
 *     &lt;enumeration value="imcontactlist"/&gt;
 *     &lt;enumeration value="peopleconnect"/&gt;
 *     &lt;enumeration value="favorites"/&gt;
 *     &lt;enumeration value="mecontact"/&gt;
 *     &lt;enumeration value="personmetadata"/&gt;
 *     &lt;enumeration value="teamspaceactivity"/&gt;
 *     &lt;enumeration value="teamspacemessaging"/&gt;
 *     &lt;enumeration value="teamspaceworkitems"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="orionnotes"/&gt;
 *     &lt;enumeration value="tagitems"/&gt;
 *     &lt;enumeration value="alltaggeditems"/&gt;
 *     &lt;enumeration value="externalcontacts"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistinguishedFolderIdNameType")
@XmlEnum
public enum DistinguishedFolderIdNameType {

    @XmlEnumValue("calendar")
    CALENDAR("calendar"),
    @XmlEnumValue("contacts")
    CONTACTS("contacts"),
    @XmlEnumValue("deleteditems")
    DELETEDITEMS("deleteditems"),
    @XmlEnumValue("drafts")
    DRAFTS("drafts"),
    @XmlEnumValue("inbox")
    INBOX("inbox"),
    @XmlEnumValue("journal")
    JOURNAL("journal"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("outbox")
    OUTBOX("outbox"),
    @XmlEnumValue("sentitems")
    SENTITEMS("sentitems"),
    @XmlEnumValue("tasks")
    TASKS("tasks"),
    @XmlEnumValue("msgfolderroot")
    MSGFOLDERROOT("msgfolderroot"),
    @XmlEnumValue("publicfoldersroot")
    PUBLICFOLDERSROOT("publicfoldersroot"),
    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("junkemail")
    JUNKEMAIL("junkemail"),
    @XmlEnumValue("searchfolders")
    SEARCHFOLDERS("searchfolders"),
    @XmlEnumValue("voicemail")
    VOICEMAIL("voicemail"),
    @XmlEnumValue("recoverableitemsroot")
    RECOVERABLEITEMSROOT("recoverableitemsroot"),
    @XmlEnumValue("recoverableitemsdeletions")
    RECOVERABLEITEMSDELETIONS("recoverableitemsdeletions"),
    @XmlEnumValue("recoverableitemsversions")
    RECOVERABLEITEMSVERSIONS("recoverableitemsversions"),
    @XmlEnumValue("recoverableitemspurges")
    RECOVERABLEITEMSPURGES("recoverableitemspurges"),
    @XmlEnumValue("recoverableitemsdiscoveryholds")
    RECOVERABLEITEMSDISCOVERYHOLDS("recoverableitemsdiscoveryholds"),
    @XmlEnumValue("archiveroot")
    ARCHIVEROOT("archiveroot"),
    @XmlEnumValue("archivemsgfolderroot")
    ARCHIVEMSGFOLDERROOT("archivemsgfolderroot"),
    @XmlEnumValue("archivedeleteditems")
    ARCHIVEDELETEDITEMS("archivedeleteditems"),
    @XmlEnumValue("archiveinbox")
    ARCHIVEINBOX("archiveinbox"),
    @XmlEnumValue("archiverecoverableitemsroot")
    ARCHIVERECOVERABLEITEMSROOT("archiverecoverableitemsroot"),
    @XmlEnumValue("archiverecoverableitemsdeletions")
    ARCHIVERECOVERABLEITEMSDELETIONS("archiverecoverableitemsdeletions"),
    @XmlEnumValue("archiverecoverableitemsversions")
    ARCHIVERECOVERABLEITEMSVERSIONS("archiverecoverableitemsversions"),
    @XmlEnumValue("archiverecoverableitemspurges")
    ARCHIVERECOVERABLEITEMSPURGES("archiverecoverableitemspurges"),
    @XmlEnumValue("archiverecoverableitemsdiscoveryholds")
    ARCHIVERECOVERABLEITEMSDISCOVERYHOLDS("archiverecoverableitemsdiscoveryholds"),
    @XmlEnumValue("syncissues")
    SYNCISSUES("syncissues"),
    @XmlEnumValue("conflicts")
    CONFLICTS("conflicts"),
    @XmlEnumValue("localfailures")
    LOCALFAILURES("localfailures"),
    @XmlEnumValue("serverfailures")
    SERVERFAILURES("serverfailures"),
    @XmlEnumValue("recipientcache")
    RECIPIENTCACHE("recipientcache"),
    @XmlEnumValue("quickcontacts")
    QUICKCONTACTS("quickcontacts"),
    @XmlEnumValue("conversationhistory")
    CONVERSATIONHISTORY("conversationhistory"),
    @XmlEnumValue("adminauditlogs")
    ADMINAUDITLOGS("adminauditlogs"),
    @XmlEnumValue("todosearch")
    TODOSEARCH("todosearch"),
    @XmlEnumValue("mycontacts")
    MYCONTACTS("mycontacts"),
    @XmlEnumValue("directory")
    DIRECTORY("directory"),
    @XmlEnumValue("imcontactlist")
    IMCONTACTLIST("imcontactlist"),
    @XmlEnumValue("peopleconnect")
    PEOPLECONNECT("peopleconnect"),
    @XmlEnumValue("favorites")
    FAVORITES("favorites"),
    @XmlEnumValue("mecontact")
    MECONTACT("mecontact"),
    @XmlEnumValue("personmetadata")
    PERSONMETADATA("personmetadata"),
    @XmlEnumValue("teamspaceactivity")
    TEAMSPACEACTIVITY("teamspaceactivity"),
    @XmlEnumValue("teamspacemessaging")
    TEAMSPACEMESSAGING("teamspacemessaging"),
    @XmlEnumValue("teamspaceworkitems")
    TEAMSPACEWORKITEMS("teamspaceworkitems"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("orionnotes")
    ORIONNOTES("orionnotes"),
    @XmlEnumValue("tagitems")
    TAGITEMS("tagitems"),
    @XmlEnumValue("alltaggeditems")
    ALLTAGGEDITEMS("alltaggeditems"),
    @XmlEnumValue("externalcontacts")
    EXTERNALCONTACTS("externalcontacts");
    private final String value;

    DistinguishedFolderIdNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinguishedFolderIdNameType fromValue(String v) {
        for (DistinguishedFolderIdNameType c: DistinguishedFolderIdNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
