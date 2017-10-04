
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SendPromptType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SendPromptType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Send"/&gt;
 *     &lt;enumeration value="VotingOption"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendPromptType")
@XmlEnum
public enum SendPromptType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("VotingOption")
    VOTING_OPTION("VotingOption");
    private final String value;

    SendPromptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendPromptType fromValue(String v) {
        for (SendPromptType c: SendPromptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
