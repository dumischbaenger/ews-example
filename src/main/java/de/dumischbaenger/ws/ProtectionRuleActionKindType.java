
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProtectionRuleActionKindType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionRuleActionKindType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RightsProtectMessage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtectionRuleActionKindType")
@XmlEnum
public enum ProtectionRuleActionKindType {

    @XmlEnumValue("RightsProtectMessage")
    RIGHTS_PROTECT_MESSAGE("RightsProtectMessage");
    private final String value;

    ProtectionRuleActionKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionRuleActionKindType fromValue(String v) {
        for (ProtectionRuleActionKindType c: ProtectionRuleActionKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
