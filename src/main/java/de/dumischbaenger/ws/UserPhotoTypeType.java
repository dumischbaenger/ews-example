
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserPhotoTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UserPhotoTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UserPhoto"/&gt;
 *     &lt;enumeration value="ProfileHeaderPhoto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserPhotoTypeType")
@XmlEnum
public enum UserPhotoTypeType {

    @XmlEnumValue("UserPhoto")
    USER_PHOTO("UserPhoto"),
    @XmlEnumValue("ProfileHeaderPhoto")
    PROFILE_HEADER_PHOTO("ProfileHeaderPhoto");
    private final String value;

    UserPhotoTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserPhotoTypeType fromValue(String v) {
        for (UserPhotoTypeType c: UserPhotoTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
