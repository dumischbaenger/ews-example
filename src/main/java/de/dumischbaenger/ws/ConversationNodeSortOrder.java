
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConversationNodeSortOrder.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversationNodeSortOrder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TreeOrderAscending"/&gt;
 *     &lt;enumeration value="TreeOrderDescending"/&gt;
 *     &lt;enumeration value="DateOrderAscending"/&gt;
 *     &lt;enumeration value="DateOrderDescending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConversationNodeSortOrder")
@XmlEnum
public enum ConversationNodeSortOrder {

    @XmlEnumValue("TreeOrderAscending")
    TREE_ORDER_ASCENDING("TreeOrderAscending"),
    @XmlEnumValue("TreeOrderDescending")
    TREE_ORDER_DESCENDING("TreeOrderDescending"),
    @XmlEnumValue("DateOrderAscending")
    DATE_ORDER_ASCENDING("DateOrderAscending"),
    @XmlEnumValue("DateOrderDescending")
    DATE_ORDER_DESCENDING("DateOrderDescending");
    private final String value;

    ConversationNodeSortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversationNodeSortOrder fromValue(String v) {
        for (ConversationNodeSortOrder c: ConversationNodeSortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
