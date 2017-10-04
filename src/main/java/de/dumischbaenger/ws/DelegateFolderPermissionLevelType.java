
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DelegateFolderPermissionLevelType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DelegateFolderPermissionLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Editor"/&gt;
 *     &lt;enumeration value="Reviewer"/&gt;
 *     &lt;enumeration value="Author"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelegateFolderPermissionLevelType")
@XmlEnum
public enum DelegateFolderPermissionLevelType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    @XmlEnumValue("Reviewer")
    REVIEWER("Reviewer"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DelegateFolderPermissionLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelegateFolderPermissionLevelType fromValue(String v) {
        for (DelegateFolderPermissionLevelType c: DelegateFolderPermissionLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
