
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MessageDispositionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageDispositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SaveOnly"/&gt;
 *     &lt;enumeration value="SendOnly"/&gt;
 *     &lt;enumeration value="SendAndSaveCopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageDispositionType")
@XmlEnum
public enum MessageDispositionType {

    @XmlEnumValue("SaveOnly")
    SAVE_ONLY("SaveOnly"),
    @XmlEnumValue("SendOnly")
    SEND_ONLY("SendOnly"),
    @XmlEnumValue("SendAndSaveCopy")
    SEND_AND_SAVE_COPY("SendAndSaveCopy");
    private final String value;

    MessageDispositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageDispositionType fromValue(String v) {
        for (MessageDispositionType c: MessageDispositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
