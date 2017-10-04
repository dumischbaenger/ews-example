
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityFeedbackEntityAddSourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityFeedbackEntityAddSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="EntityRelevanceApi"/&gt;
 *     &lt;enumeration value="ActiveDirectory"/&gt;
 *     &lt;enumeration value="ExplicitTyping"/&gt;
 *     &lt;enumeration value="Paste"/&gt;
 *     &lt;enumeration value="RecipientCache"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityFeedbackEntityAddSourceType")
@XmlEnum
public enum EntityFeedbackEntityAddSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("EntityRelevanceApi")
    ENTITY_RELEVANCE_API("EntityRelevanceApi"),
    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("ExplicitTyping")
    EXPLICIT_TYPING("ExplicitTyping"),
    @XmlEnumValue("Paste")
    PASTE("Paste"),
    @XmlEnumValue("RecipientCache")
    RECIPIENT_CACHE("RecipientCache"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EntityFeedbackEntityAddSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityFeedbackEntityAddSourceType fromValue(String v) {
        for (EntityFeedbackEntityAddSourceType c: EntityFeedbackEntityAddSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
