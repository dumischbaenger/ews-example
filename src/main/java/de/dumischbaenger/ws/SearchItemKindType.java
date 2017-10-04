
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchItemKindType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchItemKindType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Meetings"/&gt;
 *     &lt;enumeration value="Tasks"/&gt;
 *     &lt;enumeration value="Notes"/&gt;
 *     &lt;enumeration value="Docs"/&gt;
 *     &lt;enumeration value="Journals"/&gt;
 *     &lt;enumeration value="Contacts"/&gt;
 *     &lt;enumeration value="Im"/&gt;
 *     &lt;enumeration value="Voicemail"/&gt;
 *     &lt;enumeration value="Faxes"/&gt;
 *     &lt;enumeration value="Posts"/&gt;
 *     &lt;enumeration value="Rssfeeds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchItemKindType")
@XmlEnum
public enum SearchItemKindType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Meetings")
    MEETINGS("Meetings"),
    @XmlEnumValue("Tasks")
    TASKS("Tasks"),
    @XmlEnumValue("Notes")
    NOTES("Notes"),
    @XmlEnumValue("Docs")
    DOCS("Docs"),
    @XmlEnumValue("Journals")
    JOURNALS("Journals"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("Im")
    IM("Im"),
    @XmlEnumValue("Voicemail")
    VOICEMAIL("Voicemail"),
    @XmlEnumValue("Faxes")
    FAXES("Faxes"),
    @XmlEnumValue("Posts")
    POSTS("Posts"),
    @XmlEnumValue("Rssfeeds")
    RSSFEEDS("Rssfeeds");
    private final String value;

    SearchItemKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchItemKindType fromValue(String v) {
        for (SearchItemKindType c: SearchItemKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
