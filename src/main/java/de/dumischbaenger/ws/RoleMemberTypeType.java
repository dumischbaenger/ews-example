
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleMemberTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleMemberTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Passport"/&gt;
 *     &lt;enumeration value="Everyone"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="SkypeId"/&gt;
 *     &lt;enumeration value="ExternalId"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Guid"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Circle"/&gt;
 *     &lt;enumeration value="Domain"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleMemberTypeType")
@XmlEnum
public enum RoleMemberTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("SkypeId")
    SKYPE_ID("SkypeId"),
    @XmlEnumValue("ExternalId")
    EXTERNAL_ID("ExternalId"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Guid")
    GUID("Guid"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("Domain")
    DOMAIN("Domain"),
    @XmlEnumValue("Partner")
    PARTNER("Partner");
    private final String value;

    RoleMemberTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleMemberTypeType fromValue(String v) {
        for (RoleMemberTypeType c: RoleMemberTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
