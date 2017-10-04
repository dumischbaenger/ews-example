
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RuleValidationErrorCodeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleValidationErrorCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADOperationFailure"/&gt;
 *     &lt;enumeration value="ConnectedAccountNotFound"/&gt;
 *     &lt;enumeration value="CreateWithRuleId"/&gt;
 *     &lt;enumeration value="EmptyValueFound"/&gt;
 *     &lt;enumeration value="DuplicatedPriority"/&gt;
 *     &lt;enumeration value="DuplicatedOperationOnTheSameRule"/&gt;
 *     &lt;enumeration value="FolderDoesNotExist"/&gt;
 *     &lt;enumeration value="InvalidAddress"/&gt;
 *     &lt;enumeration value="InvalidDateRange"/&gt;
 *     &lt;enumeration value="InvalidFolderId"/&gt;
 *     &lt;enumeration value="InvalidSizeRange"/&gt;
 *     &lt;enumeration value="InvalidValue"/&gt;
 *     &lt;enumeration value="MessageClassificationNotFound"/&gt;
 *     &lt;enumeration value="MissingAction"/&gt;
 *     &lt;enumeration value="MissingParameter"/&gt;
 *     &lt;enumeration value="MissingRangeValue"/&gt;
 *     &lt;enumeration value="NotSettable"/&gt;
 *     &lt;enumeration value="RecipientDoesNotExist"/&gt;
 *     &lt;enumeration value="RuleNotFound"/&gt;
 *     &lt;enumeration value="SizeLessThanZero"/&gt;
 *     &lt;enumeration value="StringValueTooBig"/&gt;
 *     &lt;enumeration value="UnsupportedAddress"/&gt;
 *     &lt;enumeration value="UnexpectedError"/&gt;
 *     &lt;enumeration value="UnsupportedRule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RuleValidationErrorCodeType")
@XmlEnum
public enum RuleValidationErrorCodeType {

    @XmlEnumValue("ADOperationFailure")
    AD_OPERATION_FAILURE("ADOperationFailure"),
    @XmlEnumValue("ConnectedAccountNotFound")
    CONNECTED_ACCOUNT_NOT_FOUND("ConnectedAccountNotFound"),
    @XmlEnumValue("CreateWithRuleId")
    CREATE_WITH_RULE_ID("CreateWithRuleId"),
    @XmlEnumValue("EmptyValueFound")
    EMPTY_VALUE_FOUND("EmptyValueFound"),
    @XmlEnumValue("DuplicatedPriority")
    DUPLICATED_PRIORITY("DuplicatedPriority"),
    @XmlEnumValue("DuplicatedOperationOnTheSameRule")
    DUPLICATED_OPERATION_ON_THE_SAME_RULE("DuplicatedOperationOnTheSameRule"),
    @XmlEnumValue("FolderDoesNotExist")
    FOLDER_DOES_NOT_EXIST("FolderDoesNotExist"),
    @XmlEnumValue("InvalidAddress")
    INVALID_ADDRESS("InvalidAddress"),
    @XmlEnumValue("InvalidDateRange")
    INVALID_DATE_RANGE("InvalidDateRange"),
    @XmlEnumValue("InvalidFolderId")
    INVALID_FOLDER_ID("InvalidFolderId"),
    @XmlEnumValue("InvalidSizeRange")
    INVALID_SIZE_RANGE("InvalidSizeRange"),
    @XmlEnumValue("InvalidValue")
    INVALID_VALUE("InvalidValue"),
    @XmlEnumValue("MessageClassificationNotFound")
    MESSAGE_CLASSIFICATION_NOT_FOUND("MessageClassificationNotFound"),
    @XmlEnumValue("MissingAction")
    MISSING_ACTION("MissingAction"),
    @XmlEnumValue("MissingParameter")
    MISSING_PARAMETER("MissingParameter"),
    @XmlEnumValue("MissingRangeValue")
    MISSING_RANGE_VALUE("MissingRangeValue"),
    @XmlEnumValue("NotSettable")
    NOT_SETTABLE("NotSettable"),
    @XmlEnumValue("RecipientDoesNotExist")
    RECIPIENT_DOES_NOT_EXIST("RecipientDoesNotExist"),
    @XmlEnumValue("RuleNotFound")
    RULE_NOT_FOUND("RuleNotFound"),
    @XmlEnumValue("SizeLessThanZero")
    SIZE_LESS_THAN_ZERO("SizeLessThanZero"),
    @XmlEnumValue("StringValueTooBig")
    STRING_VALUE_TOO_BIG("StringValueTooBig"),
    @XmlEnumValue("UnsupportedAddress")
    UNSUPPORTED_ADDRESS("UnsupportedAddress"),
    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("UnsupportedRule")
    UNSUPPORTED_RULE("UnsupportedRule");
    private final String value;

    RuleValidationErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleValidationErrorCodeType fromValue(String v) {
        for (RuleValidationErrorCodeType c: RuleValidationErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
