
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlaggedForActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlaggedForActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Call"/&gt;
 *     &lt;enumeration value="DoNotForward"/&gt;
 *     &lt;enumeration value="FollowUp"/&gt;
 *     &lt;enumeration value="FYI"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *     &lt;enumeration value="NoResponseNecessary"/&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Reply"/&gt;
 *     &lt;enumeration value="ReplyToAll"/&gt;
 *     &lt;enumeration value="Review"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlaggedForActionType")
@XmlEnum
public enum FlaggedForActionType {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("DoNotForward")
    DO_NOT_FORWARD("DoNotForward"),
    @XmlEnumValue("FollowUp")
    FOLLOW_UP("FollowUp"),
    FYI("FYI"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("NoResponseNecessary")
    NO_RESPONSE_NECESSARY("NoResponseNecessary"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Reply")
    REPLY("Reply"),
    @XmlEnumValue("ReplyToAll")
    REPLY_TO_ALL("ReplyToAll"),
    @XmlEnumValue("Review")
    REVIEW("Review");
    private final String value;

    FlaggedForActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlaggedForActionType fromValue(String v) {
        for (FlaggedForActionType c: FlaggedForActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
