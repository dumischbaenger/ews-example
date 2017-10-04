
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContentActivityMediaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentActivityMediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AppSharing"/&gt;
 *     &lt;enumeration value="AudioVideo"/&gt;
 *     &lt;enumeration value="Chat"/&gt;
 *     &lt;enumeration value="DataConf"/&gt;
 *     &lt;enumeration value="Meeting"/&gt;
 *     &lt;enumeration value="MeetingConf"/&gt;
 *     &lt;enumeration value="PhoneConf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentActivityMediaType")
@XmlEnum
public enum ContentActivityMediaType {

    @XmlEnumValue("AppSharing")
    APP_SHARING("AppSharing"),
    @XmlEnumValue("AudioVideo")
    AUDIO_VIDEO("AudioVideo"),
    @XmlEnumValue("Chat")
    CHAT("Chat"),
    @XmlEnumValue("DataConf")
    DATA_CONF("DataConf"),
    @XmlEnumValue("Meeting")
    MEETING("Meeting"),
    @XmlEnumValue("MeetingConf")
    MEETING_CONF("MeetingConf"),
    @XmlEnumValue("PhoneConf")
    PHONE_CONF("PhoneConf");
    private final String value;

    ContentActivityMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentActivityMediaType fromValue(String v) {
        for (ContentActivityMediaType c: ContentActivityMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
