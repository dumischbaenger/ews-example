
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupMemberIdentifierType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupMemberIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ExternalDirectoryObjectId"/&gt;
 *     &lt;enumeration value="LegacyExchangeDN"/&gt;
 *     &lt;enumeration value="SmtpAddress"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupMemberIdentifierType")
@XmlEnum
public enum GroupMemberIdentifierType {

    @XmlEnumValue("ExternalDirectoryObjectId")
    EXTERNAL_DIRECTORY_OBJECT_ID("ExternalDirectoryObjectId"),
    @XmlEnumValue("LegacyExchangeDN")
    LEGACY_EXCHANGE_DN("LegacyExchangeDN"),
    @XmlEnumValue("SmtpAddress")
    SMTP_ADDRESS("SmtpAddress");
    private final String value;

    GroupMemberIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupMemberIdentifierType fromValue(String v) {
        for (GroupMemberIdentifierType c: GroupMemberIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
