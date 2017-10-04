
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StandardGroupByType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardGroupByType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConversationTopic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardGroupByType")
@XmlEnum
public enum StandardGroupByType {

    @XmlEnumValue("ConversationTopic")
    CONVERSATION_TOPIC("ConversationTopic");
    private final String value;

    StandardGroupByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardGroupByType fromValue(String v) {
        for (StandardGroupByType c: StandardGroupByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
