
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchResultType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StatisticsOnly"/&gt;
 *     &lt;enumeration value="PreviewOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchResultType")
@XmlEnum
public enum SearchResultType {

    @XmlEnumValue("StatisticsOnly")
    STATISTICS_ONLY("StatisticsOnly"),
    @XmlEnumValue("PreviewOnly")
    PREVIEW_ONLY("PreviewOnly");
    private final String value;

    SearchResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResultType fromValue(String v) {
        for (SearchResultType c: SearchResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
