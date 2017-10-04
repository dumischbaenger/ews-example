
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RefinerTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefinerTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="To"/&gt;
 *     &lt;enumeration value="From"/&gt;
 *     &lt;enumeration value="Folder"/&gt;
 *     &lt;enumeration value="HasAttachment"/&gt;
 *     &lt;enumeration value="MailboxSource"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefinerTypeType")
@XmlEnum
public enum RefinerTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("To")
    TO("To"),
    @XmlEnumValue("From")
    FROM("From"),
    @XmlEnumValue("Folder")
    FOLDER("Folder"),
    @XmlEnumValue("HasAttachment")
    HAS_ATTACHMENT("HasAttachment"),
    @XmlEnumValue("MailboxSource")
    MAILBOX_SOURCE("MailboxSource");
    private final String value;

    RefinerTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefinerTypeType fromValue(String v) {
        for (RefinerTypeType c: RefinerTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
