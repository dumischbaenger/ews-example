
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RetentionActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RetentionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="MoveToDeletedItems"/&gt;
 *     &lt;enumeration value="MoveToFolder"/&gt;
 *     &lt;enumeration value="DeleteAndAllowRecovery"/&gt;
 *     &lt;enumeration value="PermanentlyDelete"/&gt;
 *     &lt;enumeration value="MarkAsPastRetentionLimit"/&gt;
 *     &lt;enumeration value="MoveToArchive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetentionActionType")
@XmlEnum
public enum RetentionActionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MoveToDeletedItems")
    MOVE_TO_DELETED_ITEMS("MoveToDeletedItems"),
    @XmlEnumValue("MoveToFolder")
    MOVE_TO_FOLDER("MoveToFolder"),
    @XmlEnumValue("DeleteAndAllowRecovery")
    DELETE_AND_ALLOW_RECOVERY("DeleteAndAllowRecovery"),
    @XmlEnumValue("PermanentlyDelete")
    PERMANENTLY_DELETE("PermanentlyDelete"),
    @XmlEnumValue("MarkAsPastRetentionLimit")
    MARK_AS_PAST_RETENTION_LIMIT("MarkAsPastRetentionLimit"),
    @XmlEnumValue("MoveToArchive")
    MOVE_TO_ARCHIVE("MoveToArchive");
    private final String value;

    RetentionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetentionActionType fromValue(String v) {
        for (RetentionActionType c: RetentionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
