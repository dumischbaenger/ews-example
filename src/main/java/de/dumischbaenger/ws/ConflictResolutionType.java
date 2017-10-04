
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConflictResolutionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConflictResolutionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NeverOverwrite"/&gt;
 *     &lt;enumeration value="AutoResolve"/&gt;
 *     &lt;enumeration value="AlwaysOverwrite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConflictResolutionType")
@XmlEnum
public enum ConflictResolutionType {

    @XmlEnumValue("NeverOverwrite")
    NEVER_OVERWRITE("NeverOverwrite"),
    @XmlEnumValue("AutoResolve")
    AUTO_RESOLVE("AutoResolve"),
    @XmlEnumValue("AlwaysOverwrite")
    ALWAYS_OVERWRITE("AlwaysOverwrite");
    private final String value;

    ConflictResolutionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConflictResolutionType fromValue(String v) {
        for (ConflictResolutionType c: ConflictResolutionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
