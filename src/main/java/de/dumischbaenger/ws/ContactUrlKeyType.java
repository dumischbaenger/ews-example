
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContactUrlKeyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactUrlKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Attachment"/&gt;
 *     &lt;enumeration value="EbcDisplayDefinition"/&gt;
 *     &lt;enumeration value="EbcFinalImage"/&gt;
 *     &lt;enumeration value="EbcLogo"/&gt;
 *     &lt;enumeration value="Feed"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="InternalMarker"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactUrlKeyType")
@XmlEnum
public enum ContactUrlKeyType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Attachment")
    ATTACHMENT("Attachment"),
    @XmlEnumValue("EbcDisplayDefinition")
    EBC_DISPLAY_DEFINITION("EbcDisplayDefinition"),
    @XmlEnumValue("EbcFinalImage")
    EBC_FINAL_IMAGE("EbcFinalImage"),
    @XmlEnumValue("EbcLogo")
    EBC_LOGO("EbcLogo"),
    @XmlEnumValue("Feed")
    FEED("Feed"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("InternalMarker")
    INTERNAL_MARKER("InternalMarker"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ContactUrlKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactUrlKeyType fromValue(String v) {
        for (ContactUrlKeyType c: ContactUrlKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
