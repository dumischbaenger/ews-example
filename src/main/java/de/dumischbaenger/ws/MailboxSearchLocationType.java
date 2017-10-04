
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxSearchLocationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MailboxSearchLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PrimaryOnly"/&gt;
 *     &lt;enumeration value="ArchiveOnly"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MailboxSearchLocationType")
@XmlEnum
public enum MailboxSearchLocationType {

    @XmlEnumValue("PrimaryOnly")
    PRIMARY_ONLY("PrimaryOnly"),
    @XmlEnumValue("ArchiveOnly")
    ARCHIVE_ONLY("ArchiveOnly"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    MailboxSearchLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailboxSearchLocationType fromValue(String v) {
        for (MailboxSearchLocationType c: MailboxSearchLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
