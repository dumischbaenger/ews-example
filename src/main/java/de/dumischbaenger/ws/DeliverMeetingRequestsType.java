
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeliverMeetingRequestsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliverMeetingRequestsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DelegatesOnly"/&gt;
 *     &lt;enumeration value="DelegatesAndMe"/&gt;
 *     &lt;enumeration value="DelegatesAndSendInformationToMe"/&gt;
 *     &lt;enumeration value="NoForward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliverMeetingRequestsType")
@XmlEnum
public enum DeliverMeetingRequestsType {

    @XmlEnumValue("DelegatesOnly")
    DELEGATES_ONLY("DelegatesOnly"),
    @XmlEnumValue("DelegatesAndMe")
    DELEGATES_AND_ME("DelegatesAndMe"),
    @XmlEnumValue("DelegatesAndSendInformationToMe")
    DELEGATES_AND_SEND_INFORMATION_TO_ME("DelegatesAndSendInformationToMe"),
    @XmlEnumValue("NoForward")
    NO_FORWARD("NoForward");
    private final String value;

    DeliverMeetingRequestsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliverMeetingRequestsType fromValue(String v) {
        for (DeliverMeetingRequestsType c: DeliverMeetingRequestsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
