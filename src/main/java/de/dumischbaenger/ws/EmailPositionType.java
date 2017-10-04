
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmailPositionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailPositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LatestReply"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Subject"/&gt;
 *     &lt;enumeration value="Signature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailPositionType")
@XmlEnum
public enum EmailPositionType {

    @XmlEnumValue("LatestReply")
    LATEST_REPLY("LatestReply"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Subject")
    SUBJECT("Subject"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature");
    private final String value;

    EmailPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPositionType fromValue(String v) {
        for (EmailPositionType c: EmailPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
