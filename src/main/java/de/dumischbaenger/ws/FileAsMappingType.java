
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FileAsMappingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FileAsMappingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LastCommaFirst"/&gt;
 *     &lt;enumeration value="FirstSpaceLast"/&gt;
 *     &lt;enumeration value="Company"/&gt;
 *     &lt;enumeration value="LastCommaFirstCompany"/&gt;
 *     &lt;enumeration value="CompanyLastFirst"/&gt;
 *     &lt;enumeration value="LastFirst"/&gt;
 *     &lt;enumeration value="LastFirstCompany"/&gt;
 *     &lt;enumeration value="CompanyLastCommaFirst"/&gt;
 *     &lt;enumeration value="LastFirstSuffix"/&gt;
 *     &lt;enumeration value="LastSpaceFirstCompany"/&gt;
 *     &lt;enumeration value="CompanyLastSpaceFirst"/&gt;
 *     &lt;enumeration value="LastSpaceFirst"/&gt;
 *     &lt;enumeration value="DisplayName"/&gt;
 *     &lt;enumeration value="FirstName"/&gt;
 *     &lt;enumeration value="LastFirstMiddleSuffix"/&gt;
 *     &lt;enumeration value="LastName"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileAsMappingType")
@XmlEnum
public enum FileAsMappingType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LastCommaFirst")
    LAST_COMMA_FIRST("LastCommaFirst"),
    @XmlEnumValue("FirstSpaceLast")
    FIRST_SPACE_LAST("FirstSpaceLast"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("LastCommaFirstCompany")
    LAST_COMMA_FIRST_COMPANY("LastCommaFirstCompany"),
    @XmlEnumValue("CompanyLastFirst")
    COMPANY_LAST_FIRST("CompanyLastFirst"),
    @XmlEnumValue("LastFirst")
    LAST_FIRST("LastFirst"),
    @XmlEnumValue("LastFirstCompany")
    LAST_FIRST_COMPANY("LastFirstCompany"),
    @XmlEnumValue("CompanyLastCommaFirst")
    COMPANY_LAST_COMMA_FIRST("CompanyLastCommaFirst"),
    @XmlEnumValue("LastFirstSuffix")
    LAST_FIRST_SUFFIX("LastFirstSuffix"),
    @XmlEnumValue("LastSpaceFirstCompany")
    LAST_SPACE_FIRST_COMPANY("LastSpaceFirstCompany"),
    @XmlEnumValue("CompanyLastSpaceFirst")
    COMPANY_LAST_SPACE_FIRST("CompanyLastSpaceFirst"),
    @XmlEnumValue("LastSpaceFirst")
    LAST_SPACE_FIRST("LastSpaceFirst"),
    @XmlEnumValue("DisplayName")
    DISPLAY_NAME("DisplayName"),
    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("LastFirstMiddleSuffix")
    LAST_FIRST_MIDDLE_SUFFIX("LastFirstMiddleSuffix"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("Empty")
    EMPTY("Empty");
    private final String value;

    FileAsMappingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileAsMappingType fromValue(String v) {
        for (FileAsMappingType c: FileAsMappingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
