
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchResultsPropertySetNameType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchResultsPropertySetNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Owa16"/&gt;
 *     &lt;enumeration value="Outlook16"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchResultsPropertySetNameType")
@XmlEnum
public enum SearchResultsPropertySetNameType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Owa16")
    OWA_16("Owa16"),
    @XmlEnumValue("Outlook16")
    OUTLOOK_16("Outlook16");
    private final String value;

    SearchResultsPropertySetNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResultsPropertySetNameType fromValue(String v) {
        for (SearchResultsPropertySetNameType c: SearchResultsPropertySetNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
