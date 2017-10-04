
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MailboxTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="OneOff"/&gt;
 *     &lt;enumeration value="Mailbox"/&gt;
 *     &lt;enumeration value="PublicDL"/&gt;
 *     &lt;enumeration value="PrivateDL"/&gt;
 *     &lt;enumeration value="Contact"/&gt;
 *     &lt;enumeration value="PublicFolder"/&gt;
 *     &lt;enumeration value="GroupMailbox"/&gt;
 *     &lt;enumeration value="ImplicitContact"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MailboxTypeType")
@XmlEnum
public enum MailboxTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OneOff")
    ONE_OFF("OneOff"),
    @XmlEnumValue("Mailbox")
    MAILBOX("Mailbox"),
    @XmlEnumValue("PublicDL")
    PUBLIC_DL("PublicDL"),
    @XmlEnumValue("PrivateDL")
    PRIVATE_DL("PrivateDL"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("PublicFolder")
    PUBLIC_FOLDER("PublicFolder"),
    @XmlEnumValue("GroupMailbox")
    GROUP_MAILBOX("GroupMailbox"),
    @XmlEnumValue("ImplicitContact")
    IMPLICIT_CONTACT("ImplicitContact");
    private final String value;

    MailboxTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailboxTypeType fromValue(String v) {
        for (MailboxTypeType c: MailboxTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
