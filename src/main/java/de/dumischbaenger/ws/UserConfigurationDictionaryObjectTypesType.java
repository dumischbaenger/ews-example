
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserConfigurationDictionaryObjectTypesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UserConfigurationDictionaryObjectTypesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="Byte"/&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Integer32"/&gt;
 *     &lt;enumeration value="UnsignedInteger32"/&gt;
 *     &lt;enumeration value="Integer64"/&gt;
 *     &lt;enumeration value="UnsignedInteger64"/&gt;
 *     &lt;enumeration value="StringArray"/&gt;
 *     &lt;enumeration value="ByteArray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserConfigurationDictionaryObjectTypesType")
@XmlEnum
public enum UserConfigurationDictionaryObjectTypesType {

    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Byte")
    BYTE("Byte"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer32")
    INTEGER_32("Integer32"),
    @XmlEnumValue("UnsignedInteger32")
    UNSIGNED_INTEGER_32("UnsignedInteger32"),
    @XmlEnumValue("Integer64")
    INTEGER_64("Integer64"),
    @XmlEnumValue("UnsignedInteger64")
    UNSIGNED_INTEGER_64("UnsignedInteger64"),
    @XmlEnumValue("StringArray")
    STRING_ARRAY("StringArray"),
    @XmlEnumValue("ByteArray")
    BYTE_ARRAY("ByteArray");
    private final String value;

    UserConfigurationDictionaryObjectTypesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserConfigurationDictionaryObjectTypesType fromValue(String v) {
        for (UserConfigurationDictionaryObjectTypesType c: UserConfigurationDictionaryObjectTypesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
