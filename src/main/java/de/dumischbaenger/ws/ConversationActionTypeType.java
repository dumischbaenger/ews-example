
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConversationActionTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversationActionTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AlwaysCategorize"/&gt;
 *     &lt;enumeration value="AlwaysDelete"/&gt;
 *     &lt;enumeration value="AlwaysMove"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Move"/&gt;
 *     &lt;enumeration value="Copy"/&gt;
 *     &lt;enumeration value="SetReadState"/&gt;
 *     &lt;enumeration value="SetRetentionPolicy"/&gt;
 *     &lt;enumeration value="Flag"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConversationActionTypeType")
@XmlEnum
public enum ConversationActionTypeType {

    @XmlEnumValue("AlwaysCategorize")
    ALWAYS_CATEGORIZE("AlwaysCategorize"),
    @XmlEnumValue("AlwaysDelete")
    ALWAYS_DELETE("AlwaysDelete"),
    @XmlEnumValue("AlwaysMove")
    ALWAYS_MOVE("AlwaysMove"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Move")
    MOVE("Move"),
    @XmlEnumValue("Copy")
    COPY("Copy"),
    @XmlEnumValue("SetReadState")
    SET_READ_STATE("SetReadState"),
    @XmlEnumValue("SetRetentionPolicy")
    SET_RETENTION_POLICY("SetRetentionPolicy"),
    @XmlEnumValue("Flag")
    FLAG("Flag");
    private final String value;

    ConversationActionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversationActionTypeType fromValue(String v) {
        for (ConversationActionTypeType c: ConversationActionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
