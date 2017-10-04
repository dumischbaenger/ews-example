
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarPermissionLevelType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarPermissionLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Owner"/&gt;
 *     &lt;enumeration value="PublishingEditor"/&gt;
 *     &lt;enumeration value="Editor"/&gt;
 *     &lt;enumeration value="PublishingAuthor"/&gt;
 *     &lt;enumeration value="Author"/&gt;
 *     &lt;enumeration value="NoneditingAuthor"/&gt;
 *     &lt;enumeration value="Reviewer"/&gt;
 *     &lt;enumeration value="Contributor"/&gt;
 *     &lt;enumeration value="FreeBusyTimeOnly"/&gt;
 *     &lt;enumeration value="FreeBusyTimeAndSubjectAndLocation"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarPermissionLevelType")
@XmlEnum
public enum CalendarPermissionLevelType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("PublishingEditor")
    PUBLISHING_EDITOR("PublishingEditor"),
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    @XmlEnumValue("PublishingAuthor")
    PUBLISHING_AUTHOR("PublishingAuthor"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("NoneditingAuthor")
    NONEDITING_AUTHOR("NoneditingAuthor"),
    @XmlEnumValue("Reviewer")
    REVIEWER("Reviewer"),
    @XmlEnumValue("Contributor")
    CONTRIBUTOR("Contributor"),
    @XmlEnumValue("FreeBusyTimeOnly")
    FREE_BUSY_TIME_ONLY("FreeBusyTimeOnly"),
    @XmlEnumValue("FreeBusyTimeAndSubjectAndLocation")
    FREE_BUSY_TIME_AND_SUBJECT_AND_LOCATION("FreeBusyTimeAndSubjectAndLocation"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    CalendarPermissionLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarPermissionLevelType fromValue(String v) {
        for (CalendarPermissionLevelType c: CalendarPermissionLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
