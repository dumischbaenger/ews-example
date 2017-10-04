
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExecuteSearchSortOrderType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecuteSearchSortOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Relevance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecuteSearchSortOrderType")
@XmlEnum
public enum ExecuteSearchSortOrderType {

    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Relevance")
    RELEVANCE("Relevance");
    private final String value;

    ExecuteSearchSortOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecuteSearchSortOrderType fromValue(String v) {
        for (ExecuteSearchSortOrderType c: ExecuteSearchSortOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
