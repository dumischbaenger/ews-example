
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InferenceClassificationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InferenceClassificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Focused"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InferenceClassificationType")
@XmlEnum
public enum InferenceClassificationType {

    @XmlEnumValue("Focused")
    FOCUSED("Focused"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    InferenceClassificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InferenceClassificationType fromValue(String v) {
        for (InferenceClassificationType c: InferenceClassificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
