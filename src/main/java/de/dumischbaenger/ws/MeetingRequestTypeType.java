
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetingRequestTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingRequestTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="FullUpdate"/&gt;
 *     &lt;enumeration value="InformationalUpdate"/&gt;
 *     &lt;enumeration value="NewMeetingRequest"/&gt;
 *     &lt;enumeration value="Outdated"/&gt;
 *     &lt;enumeration value="SilentUpdate"/&gt;
 *     &lt;enumeration value="PrincipalWantsCopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingRequestTypeType")
@XmlEnum
public enum MeetingRequestTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("FullUpdate")
    FULL_UPDATE("FullUpdate"),
    @XmlEnumValue("InformationalUpdate")
    INFORMATIONAL_UPDATE("InformationalUpdate"),
    @XmlEnumValue("NewMeetingRequest")
    NEW_MEETING_REQUEST("NewMeetingRequest"),
    @XmlEnumValue("Outdated")
    OUTDATED("Outdated"),
    @XmlEnumValue("SilentUpdate")
    SILENT_UPDATE("SilentUpdate"),
    @XmlEnumValue("PrincipalWantsCopy")
    PRINCIPAL_WANTS_COPY("PrincipalWantsCopy");
    private final String value;

    MeetingRequestTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetingRequestTypeType fromValue(String v) {
        for (MeetingRequestTypeType c: MeetingRequestTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
