
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContentActivityAcl.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentActivityAcl"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organizer"/&gt;
 *     &lt;enumeration value="Presenter"/&gt;
 *     &lt;enumeration value="Everyone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentActivityAcl")
@XmlEnum
public enum ContentActivityAcl {

    @XmlEnumValue("Organizer")
    ORGANIZER("Organizer"),
    @XmlEnumValue("Presenter")
    PRESENTER("Presenter"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone");
    private final String value;

    ContentActivityAcl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentActivityAcl fromValue(String v) {
        for (ContentActivityAcl c: ContentActivityAcl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
