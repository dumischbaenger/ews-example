
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientIdType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Web"/&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Tablet"/&gt;
 *     &lt;enumeration value="Desktop"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="Outlook"/&gt;
 *     &lt;enumeration value="MacOutlook"/&gt;
 *     &lt;enumeration value="POP3"/&gt;
 *     &lt;enumeration value="IMAP4"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Lync"/&gt;
 *     &lt;enumeration value="OutlookService"/&gt;
 *     &lt;enumeration value="MacMail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientIdType")
@XmlEnum
public enum ClientIdType {

    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet"),
    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Outlook")
    OUTLOOK("Outlook"),
    @XmlEnumValue("MacOutlook")
    MAC_OUTLOOK("MacOutlook"),
    @XmlEnumValue("POP3")
    POP_3("POP3"),
    @XmlEnumValue("IMAP4")
    IMAP_4("IMAP4"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Lync")
    LYNC("Lync"),
    @XmlEnumValue("OutlookService")
    OUTLOOK_SERVICE("OutlookService"),
    @XmlEnumValue("MacMail")
    MAC_MAIL("MacMail");
    private final String value;

    ClientIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientIdType fromValue(String v) {
        for (ClientIdType c: ClientIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
