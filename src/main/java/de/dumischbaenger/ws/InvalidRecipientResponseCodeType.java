
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InvalidRecipientResponseCodeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InvalidRecipientResponseCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OtherError"/&gt;
 *     &lt;enumeration value="RecipientOrganizationNotFederated"/&gt;
 *     &lt;enumeration value="CannotObtainTokenFromSTS"/&gt;
 *     &lt;enumeration value="SystemPolicyBlocksSharingWithThisRecipient"/&gt;
 *     &lt;enumeration value="RecipientOrganizationFederatedWithUnknownTokenIssuer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvalidRecipientResponseCodeType")
@XmlEnum
public enum InvalidRecipientResponseCodeType {

    @XmlEnumValue("OtherError")
    OTHER_ERROR("OtherError"),
    @XmlEnumValue("RecipientOrganizationNotFederated")
    RECIPIENT_ORGANIZATION_NOT_FEDERATED("RecipientOrganizationNotFederated"),
    @XmlEnumValue("CannotObtainTokenFromSTS")
    CANNOT_OBTAIN_TOKEN_FROM_STS("CannotObtainTokenFromSTS"),
    @XmlEnumValue("SystemPolicyBlocksSharingWithThisRecipient")
    SYSTEM_POLICY_BLOCKS_SHARING_WITH_THIS_RECIPIENT("SystemPolicyBlocksSharingWithThisRecipient"),
    @XmlEnumValue("RecipientOrganizationFederatedWithUnknownTokenIssuer")
    RECIPIENT_ORGANIZATION_FEDERATED_WITH_UNKNOWN_TOKEN_ISSUER("RecipientOrganizationFederatedWithUnknownTokenIssuer");
    private final String value;

    InvalidRecipientResponseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvalidRecipientResponseCodeType fromValue(String v) {
        for (InvalidRecipientResponseCodeType c: InvalidRecipientResponseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
