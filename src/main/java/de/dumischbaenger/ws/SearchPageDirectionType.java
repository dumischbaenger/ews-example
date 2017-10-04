
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchPageDirectionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchPageDirectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Previous"/&gt;
 *     &lt;enumeration value="Next"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchPageDirectionType")
@XmlEnum
public enum SearchPageDirectionType {

    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),
    @XmlEnumValue("Next")
    NEXT("Next");
    private final String value;

    SearchPageDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchPageDirectionType fromValue(String v) {
        for (SearchPageDirectionType c: SearchPageDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
