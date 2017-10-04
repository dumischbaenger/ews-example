
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PermissionLevelType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionLevelType"&gt;
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
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PermissionLevelType")
@XmlEnum
public enum PermissionLevelType {

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
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    PermissionLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionLevelType fromValue(String v) {
        for (PermissionLevelType c: PermissionLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
