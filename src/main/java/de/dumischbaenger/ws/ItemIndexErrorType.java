
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ItemIndexErrorType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemIndexErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="GenericError"/&gt;
 *     &lt;enumeration value="Timeout"/&gt;
 *     &lt;enumeration value="StaleEvent"/&gt;
 *     &lt;enumeration value="MailboxOffline"/&gt;
 *     &lt;enumeration value="AttachmentLimitReached"/&gt;
 *     &lt;enumeration value="MarsWriterTruncation"/&gt;
 *     &lt;enumeration value="DocumentParserFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemIndexErrorType")
@XmlEnum
public enum ItemIndexErrorType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("GenericError")
    GENERIC_ERROR("GenericError"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("StaleEvent")
    STALE_EVENT("StaleEvent"),
    @XmlEnumValue("MailboxOffline")
    MAILBOX_OFFLINE("MailboxOffline"),
    @XmlEnumValue("AttachmentLimitReached")
    ATTACHMENT_LIMIT_REACHED("AttachmentLimitReached"),
    @XmlEnumValue("MarsWriterTruncation")
    MARS_WRITER_TRUNCATION("MarsWriterTruncation"),
    @XmlEnumValue("DocumentParserFailure")
    DOCUMENT_PARSER_FAILURE("DocumentParserFailure");
    private final String value;

    ItemIndexErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemIndexErrorType fromValue(String v) {
        for (ItemIndexErrorType c: ItemIndexErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
