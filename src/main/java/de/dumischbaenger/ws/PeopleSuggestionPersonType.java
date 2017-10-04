
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeopleSuggestionPersonType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PeopleSuggestionPersonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Person"/&gt;
 *     &lt;enumeration value="DistributionList"/&gt;
 *     &lt;enumeration value="Room"/&gt;
 *     &lt;enumeration value="Place"/&gt;
 *     &lt;enumeration value="ModernGroup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeopleSuggestionPersonType")
@XmlEnum
public enum PeopleSuggestionPersonType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("DistributionList")
    DISTRIBUTION_LIST("DistributionList"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Place")
    PLACE("Place"),
    @XmlEnumValue("ModernGroup")
    MODERN_GROUP("ModernGroup");
    private final String value;

    PeopleSuggestionPersonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeopleSuggestionPersonType fromValue(String v) {
        for (PeopleSuggestionPersonType c: PeopleSuggestionPersonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
