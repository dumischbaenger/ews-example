
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ContactItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileAsMapping" type="{http://schemas.microsoft.com/exchange/services/2006/types}FileAsMappingType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompleteName" type="{http://schemas.microsoft.com/exchange/services/2006/types}CompleteNameType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="AbchEmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}AbchEmailAddressDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhysicalAddressDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneNumberDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="AssistantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BusinessHomePage" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Companies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="ContactSource" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactSourceType" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Generation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImAddressDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddressIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhysicalAddressIndexType" minOccurs="0"/&gt;
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeddingAnniversary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HasPicture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhoneticFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneticFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneticLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="UserSMIMECertificate" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfBinaryType" minOccurs="0"/&gt;
 *         &lt;element name="MSExchangeCertificate" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfBinaryType" minOccurs="0"/&gt;
 *         &lt;element name="DirectoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagerMailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="DirectReports" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAutoUpdateDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMessengerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactShortId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrustLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urls" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactUrlDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="Cid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SkypeAuthCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SkypeContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SkypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SkypeRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YomiNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XboxLiveTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InviteFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HidePresenceAndProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPendingOutbound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SupportGroupFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserTileHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnifiedInbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mris" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Wlid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AbchContactId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *         &lt;element name="NotInBirthdayCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShellContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImMri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PresenceTrustLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtherMri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileLastChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileIMEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerNetworkProfilePhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerNetworkThumbnailPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConversationGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactItemType", propOrder = {
    "fileAs",
    "fileAsMapping",
    "displayName",
    "givenName",
    "initials",
    "middleName",
    "nickname",
    "completeName",
    "companyName",
    "emailAddresses",
    "abchEmailAddresses",
    "physicalAddresses",
    "phoneNumbers",
    "assistantName",
    "birthday",
    "businessHomePage",
    "children",
    "companies",
    "contactSource",
    "department",
    "generation",
    "imAddresses",
    "jobTitle",
    "manager",
    "mileage",
    "officeLocation",
    "postalAddressIndex",
    "profession",
    "spouseName",
    "surname",
    "weddingAnniversary",
    "hasPicture",
    "phoneticFullName",
    "phoneticFirstName",
    "phoneticLastName",
    "alias",
    "notes",
    "photo",
    "userSMIMECertificate",
    "msExchangeCertificate",
    "directoryId",
    "managerMailbox",
    "directReports",
    "accountName",
    "isAutoUpdateDisabled",
    "isMessengerEnabled",
    "comment",
    "contactShortId",
    "contactType",
    "gender",
    "isHidden",
    "objectId",
    "passportId",
    "isPrivate",
    "sourceId",
    "trustLevel",
    "createdBy",
    "urls",
    "cid",
    "skypeAuthCertificate",
    "skypeContext",
    "skypeId",
    "skypeRelationship",
    "yomiNickname",
    "xboxLiveTag",
    "inviteFree",
    "hidePresenceAndProfile",
    "isPendingOutbound",
    "supportGroupFeeds",
    "userTileHash",
    "unifiedInbox",
    "mris",
    "wlid",
    "abchContactId",
    "notInBirthdayCalendar",
    "shellContactType",
    "imMri",
    "presenceTrustLevel",
    "otherMri",
    "profileLastChanged",
    "mobileIMEnabled",
    "partnerNetworkProfilePhotoUrl",
    "partnerNetworkThumbnailPhotoUrl",
    "personId",
    "conversationGuid"
})
public class ContactItemType
    extends ItemType
{

    @XmlElement(name = "FileAs")
    protected String fileAs;
    @XmlElement(name = "FileAsMapping")
    @XmlSchemaType(name = "string")
    protected FileAsMappingType fileAsMapping;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "CompleteName")
    protected CompleteNameType completeName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "EmailAddresses")
    protected EmailAddressDictionaryType emailAddresses;
    @XmlElement(name = "AbchEmailAddresses")
    protected AbchEmailAddressDictionaryType abchEmailAddresses;
    @XmlElement(name = "PhysicalAddresses")
    protected PhysicalAddressDictionaryType physicalAddresses;
    @XmlElement(name = "PhoneNumbers")
    protected PhoneNumberDictionaryType phoneNumbers;
    @XmlElement(name = "AssistantName")
    protected String assistantName;
    @XmlElement(name = "Birthday")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "BusinessHomePage")
    @XmlSchemaType(name = "anyURI")
    protected String businessHomePage;
    @XmlElement(name = "Children")
    protected ArrayOfStringsType children;
    @XmlElement(name = "Companies")
    protected ArrayOfStringsType companies;
    @XmlElement(name = "ContactSource")
    @XmlSchemaType(name = "string")
    protected ContactSourceType contactSource;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Generation")
    protected String generation;
    @XmlElement(name = "ImAddresses")
    protected ImAddressDictionaryType imAddresses;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "Manager")
    protected String manager;
    @XmlElement(name = "Mileage")
    protected String mileage;
    @XmlElement(name = "OfficeLocation")
    protected String officeLocation;
    @XmlElement(name = "PostalAddressIndex")
    @XmlSchemaType(name = "string")
    protected PhysicalAddressIndexType postalAddressIndex;
    @XmlElement(name = "Profession")
    protected String profession;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "WeddingAnniversary")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weddingAnniversary;
    @XmlElement(name = "HasPicture")
    protected Boolean hasPicture;
    @XmlElement(name = "PhoneticFullName")
    protected String phoneticFullName;
    @XmlElement(name = "PhoneticFirstName")
    protected String phoneticFirstName;
    @XmlElement(name = "PhoneticLastName")
    protected String phoneticLastName;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Photo")
    protected byte[] photo;
    @XmlElement(name = "UserSMIMECertificate")
    protected ArrayOfBinaryType userSMIMECertificate;
    @XmlElement(name = "MSExchangeCertificate")
    protected ArrayOfBinaryType msExchangeCertificate;
    @XmlElement(name = "DirectoryId")
    protected String directoryId;
    @XmlElement(name = "ManagerMailbox")
    protected SingleRecipientType managerMailbox;
    @XmlElement(name = "DirectReports")
    protected ArrayOfRecipientsType directReports;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "IsAutoUpdateDisabled")
    protected Boolean isAutoUpdateDisabled;
    @XmlElement(name = "IsMessengerEnabled")
    protected Boolean isMessengerEnabled;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ContactShortId")
    protected Integer contactShortId;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "ObjectId")
    protected String objectId;
    @XmlElement(name = "PassportId")
    protected Long passportId;
    @XmlElement(name = "IsPrivate")
    protected Boolean isPrivate;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElement(name = "TrustLevel")
    protected Integer trustLevel;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Urls")
    protected ContactUrlDictionaryType urls;
    @XmlElement(name = "Cid")
    protected Long cid;
    @XmlElement(name = "SkypeAuthCertificate")
    protected String skypeAuthCertificate;
    @XmlElement(name = "SkypeContext")
    protected String skypeContext;
    @XmlElement(name = "SkypeId")
    protected String skypeId;
    @XmlElement(name = "SkypeRelationship")
    protected String skypeRelationship;
    @XmlElement(name = "YomiNickname")
    protected String yomiNickname;
    @XmlElement(name = "XboxLiveTag")
    protected String xboxLiveTag;
    @XmlElement(name = "InviteFree")
    protected Boolean inviteFree;
    @XmlElement(name = "HidePresenceAndProfile")
    protected Boolean hidePresenceAndProfile;
    @XmlElement(name = "IsPendingOutbound")
    protected Boolean isPendingOutbound;
    @XmlElement(name = "SupportGroupFeeds")
    protected Boolean supportGroupFeeds;
    @XmlElement(name = "UserTileHash")
    protected String userTileHash;
    @XmlElement(name = "UnifiedInbox")
    protected Boolean unifiedInbox;
    @XmlElement(name = "Mris")
    protected ArrayOfStringsType mris;
    @XmlElement(name = "Wlid")
    protected String wlid;
    @XmlElement(name = "AbchContactId")
    protected String abchContactId;
    @XmlElement(name = "NotInBirthdayCalendar")
    protected Boolean notInBirthdayCalendar;
    @XmlElement(name = "ShellContactType")
    protected String shellContactType;
    @XmlElement(name = "ImMri")
    protected String imMri;
    @XmlElement(name = "PresenceTrustLevel")
    protected Integer presenceTrustLevel;
    @XmlElement(name = "OtherMri")
    protected String otherMri;
    @XmlElement(name = "ProfileLastChanged")
    protected String profileLastChanged;
    @XmlElement(name = "MobileIMEnabled")
    protected Boolean mobileIMEnabled;
    @XmlElement(name = "PartnerNetworkProfilePhotoUrl")
    protected String partnerNetworkProfilePhotoUrl;
    @XmlElement(name = "PartnerNetworkThumbnailPhotoUrl")
    protected String partnerNetworkThumbnailPhotoUrl;
    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "ConversationGuid")
    protected String conversationGuid;

    /**
     * Ruft den Wert der fileAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAs() {
        return fileAs;
    }

    /**
     * Legt den Wert der fileAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAs(String value) {
        this.fileAs = value;
    }

    /**
     * Ruft den Wert der fileAsMapping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileAsMappingType }
     *     
     */
    public FileAsMappingType getFileAsMapping() {
        return fileAsMapping;
    }

    /**
     * Legt den Wert der fileAsMapping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAsMappingType }
     *     
     */
    public void setFileAsMapping(FileAsMappingType value) {
        this.fileAsMapping = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der givenName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Legt den Wert der givenName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Ruft den Wert der initials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Legt den Wert der initials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Ruft den Wert der middleName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Legt den Wert der middleName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Ruft den Wert der nickname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Legt den Wert der nickname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Ruft den Wert der completeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompleteNameType }
     *     
     */
    public CompleteNameType getCompleteName() {
        return completeName;
    }

    /**
     * Legt den Wert der completeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteNameType }
     *     
     */
    public void setCompleteName(CompleteNameType value) {
        this.completeName = value;
    }

    /**
     * Ruft den Wert der companyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Legt den Wert der companyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Ruft den Wert der emailAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressDictionaryType }
     *     
     */
    public EmailAddressDictionaryType getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Legt den Wert der emailAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressDictionaryType }
     *     
     */
    public void setEmailAddresses(EmailAddressDictionaryType value) {
        this.emailAddresses = value;
    }

    /**
     * Ruft den Wert der abchEmailAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbchEmailAddressDictionaryType }
     *     
     */
    public AbchEmailAddressDictionaryType getAbchEmailAddresses() {
        return abchEmailAddresses;
    }

    /**
     * Legt den Wert der abchEmailAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbchEmailAddressDictionaryType }
     *     
     */
    public void setAbchEmailAddresses(AbchEmailAddressDictionaryType value) {
        this.abchEmailAddresses = value;
    }

    /**
     * Ruft den Wert der physicalAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddressDictionaryType }
     *     
     */
    public PhysicalAddressDictionaryType getPhysicalAddresses() {
        return physicalAddresses;
    }

    /**
     * Legt den Wert der physicalAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddressDictionaryType }
     *     
     */
    public void setPhysicalAddresses(PhysicalAddressDictionaryType value) {
        this.physicalAddresses = value;
    }

    /**
     * Ruft den Wert der phoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberDictionaryType }
     *     
     */
    public PhoneNumberDictionaryType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Legt den Wert der phoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberDictionaryType }
     *     
     */
    public void setPhoneNumbers(PhoneNumberDictionaryType value) {
        this.phoneNumbers = value;
    }

    /**
     * Ruft den Wert der assistantName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * Legt den Wert der assistantName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantName(String value) {
        this.assistantName = value;
    }

    /**
     * Ruft den Wert der birthday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Legt den Wert der birthday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Ruft den Wert der businessHomePage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessHomePage() {
        return businessHomePage;
    }

    /**
     * Legt den Wert der businessHomePage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessHomePage(String value) {
        this.businessHomePage = value;
    }

    /**
     * Ruft den Wert der children-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getChildren() {
        return children;
    }

    /**
     * Legt den Wert der children-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setChildren(ArrayOfStringsType value) {
        this.children = value;
    }

    /**
     * Ruft den Wert der companies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getCompanies() {
        return companies;
    }

    /**
     * Legt den Wert der companies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setCompanies(ArrayOfStringsType value) {
        this.companies = value;
    }

    /**
     * Ruft den Wert der contactSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactSourceType }
     *     
     */
    public ContactSourceType getContactSource() {
        return contactSource;
    }

    /**
     * Legt den Wert der contactSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSourceType }
     *     
     */
    public void setContactSource(ContactSourceType value) {
        this.contactSource = value;
    }

    /**
     * Ruft den Wert der department-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Legt den Wert der department-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Ruft den Wert der generation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Legt den Wert der generation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneration(String value) {
        this.generation = value;
    }

    /**
     * Ruft den Wert der imAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImAddressDictionaryType }
     *     
     */
    public ImAddressDictionaryType getImAddresses() {
        return imAddresses;
    }

    /**
     * Legt den Wert der imAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImAddressDictionaryType }
     *     
     */
    public void setImAddresses(ImAddressDictionaryType value) {
        this.imAddresses = value;
    }

    /**
     * Ruft den Wert der jobTitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Legt den Wert der jobTitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Ruft den Wert der manager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Legt den Wert der manager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Ruft den Wert der mileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * Legt den Wert der mileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

    /**
     * Ruft den Wert der officeLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeLocation() {
        return officeLocation;
    }

    /**
     * Legt den Wert der officeLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeLocation(String value) {
        this.officeLocation = value;
    }

    /**
     * Ruft den Wert der postalAddressIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddressIndexType }
     *     
     */
    public PhysicalAddressIndexType getPostalAddressIndex() {
        return postalAddressIndex;
    }

    /**
     * Legt den Wert der postalAddressIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddressIndexType }
     *     
     */
    public void setPostalAddressIndex(PhysicalAddressIndexType value) {
        this.postalAddressIndex = value;
    }

    /**
     * Ruft den Wert der profession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Legt den Wert der profession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Ruft den Wert der spouseName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Legt den Wert der spouseName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Ruft den Wert der surname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Legt den Wert der surname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Ruft den Wert der weddingAnniversary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeddingAnniversary() {
        return weddingAnniversary;
    }

    /**
     * Legt den Wert der weddingAnniversary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeddingAnniversary(XMLGregorianCalendar value) {
        this.weddingAnniversary = value;
    }

    /**
     * Ruft den Wert der hasPicture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPicture() {
        return hasPicture;
    }

    /**
     * Legt den Wert der hasPicture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPicture(Boolean value) {
        this.hasPicture = value;
    }

    /**
     * Ruft den Wert der phoneticFullName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticFullName() {
        return phoneticFullName;
    }

    /**
     * Legt den Wert der phoneticFullName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticFullName(String value) {
        this.phoneticFullName = value;
    }

    /**
     * Ruft den Wert der phoneticFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticFirstName() {
        return phoneticFirstName;
    }

    /**
     * Legt den Wert der phoneticFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticFirstName(String value) {
        this.phoneticFirstName = value;
    }

    /**
     * Ruft den Wert der phoneticLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticLastName() {
        return phoneticLastName;
    }

    /**
     * Legt den Wert der phoneticLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticLastName(String value) {
        this.phoneticLastName = value;
    }

    /**
     * Ruft den Wert der alias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Legt den Wert der alias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Ruft den Wert der photo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Legt den Wert der photo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = value;
    }

    /**
     * Ruft den Wert der userSMIMECertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBinaryType }
     *     
     */
    public ArrayOfBinaryType getUserSMIMECertificate() {
        return userSMIMECertificate;
    }

    /**
     * Legt den Wert der userSMIMECertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBinaryType }
     *     
     */
    public void setUserSMIMECertificate(ArrayOfBinaryType value) {
        this.userSMIMECertificate = value;
    }

    /**
     * Ruft den Wert der msExchangeCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBinaryType }
     *     
     */
    public ArrayOfBinaryType getMSExchangeCertificate() {
        return msExchangeCertificate;
    }

    /**
     * Legt den Wert der msExchangeCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBinaryType }
     *     
     */
    public void setMSExchangeCertificate(ArrayOfBinaryType value) {
        this.msExchangeCertificate = value;
    }

    /**
     * Ruft den Wert der directoryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryId() {
        return directoryId;
    }

    /**
     * Legt den Wert der directoryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryId(String value) {
        this.directoryId = value;
    }

    /**
     * Ruft den Wert der managerMailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleRecipientType }
     *     
     */
    public SingleRecipientType getManagerMailbox() {
        return managerMailbox;
    }

    /**
     * Legt den Wert der managerMailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleRecipientType }
     *     
     */
    public void setManagerMailbox(SingleRecipientType value) {
        this.managerMailbox = value;
    }

    /**
     * Ruft den Wert der directReports-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getDirectReports() {
        return directReports;
    }

    /**
     * Legt den Wert der directReports-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setDirectReports(ArrayOfRecipientsType value) {
        this.directReports = value;
    }

    /**
     * Ruft den Wert der accountName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Legt den Wert der accountName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Ruft den Wert der isAutoUpdateDisabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoUpdateDisabled() {
        return isAutoUpdateDisabled;
    }

    /**
     * Legt den Wert der isAutoUpdateDisabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoUpdateDisabled(Boolean value) {
        this.isAutoUpdateDisabled = value;
    }

    /**
     * Ruft den Wert der isMessengerEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMessengerEnabled() {
        return isMessengerEnabled;
    }

    /**
     * Legt den Wert der isMessengerEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMessengerEnabled(Boolean value) {
        this.isMessengerEnabled = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der contactShortId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactShortId() {
        return contactShortId;
    }

    /**
     * Legt den Wert der contactShortId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactShortId(Integer value) {
        this.contactShortId = value;
    }

    /**
     * Ruft den Wert der contactType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Legt den Wert der contactType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Ruft den Wert der isHidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Legt den Wert der isHidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Ruft den Wert der objectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Legt den Wert der objectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Ruft den Wert der passportId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassportId() {
        return passportId;
    }

    /**
     * Legt den Wert der passportId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassportId(Long value) {
        this.passportId = value;
    }

    /**
     * Ruft den Wert der isPrivate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Legt den Wert der isPrivate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Ruft den Wert der sourceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Legt den Wert der sourceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Ruft den Wert der trustLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrustLevel() {
        return trustLevel;
    }

    /**
     * Legt den Wert der trustLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrustLevel(Integer value) {
        this.trustLevel = value;
    }

    /**
     * Ruft den Wert der createdBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Legt den Wert der createdBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Ruft den Wert der urls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactUrlDictionaryType }
     *     
     */
    public ContactUrlDictionaryType getUrls() {
        return urls;
    }

    /**
     * Legt den Wert der urls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactUrlDictionaryType }
     *     
     */
    public void setUrls(ContactUrlDictionaryType value) {
        this.urls = value;
    }

    /**
     * Ruft den Wert der cid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCid() {
        return cid;
    }

    /**
     * Legt den Wert der cid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCid(Long value) {
        this.cid = value;
    }

    /**
     * Ruft den Wert der skypeAuthCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkypeAuthCertificate() {
        return skypeAuthCertificate;
    }

    /**
     * Legt den Wert der skypeAuthCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkypeAuthCertificate(String value) {
        this.skypeAuthCertificate = value;
    }

    /**
     * Ruft den Wert der skypeContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkypeContext() {
        return skypeContext;
    }

    /**
     * Legt den Wert der skypeContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkypeContext(String value) {
        this.skypeContext = value;
    }

    /**
     * Ruft den Wert der skypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkypeId() {
        return skypeId;
    }

    /**
     * Legt den Wert der skypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkypeId(String value) {
        this.skypeId = value;
    }

    /**
     * Ruft den Wert der skypeRelationship-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkypeRelationship() {
        return skypeRelationship;
    }

    /**
     * Legt den Wert der skypeRelationship-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkypeRelationship(String value) {
        this.skypeRelationship = value;
    }

    /**
     * Ruft den Wert der yomiNickname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiNickname() {
        return yomiNickname;
    }

    /**
     * Legt den Wert der yomiNickname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiNickname(String value) {
        this.yomiNickname = value;
    }

    /**
     * Ruft den Wert der xboxLiveTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXboxLiveTag() {
        return xboxLiveTag;
    }

    /**
     * Legt den Wert der xboxLiveTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXboxLiveTag(String value) {
        this.xboxLiveTag = value;
    }

    /**
     * Ruft den Wert der inviteFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviteFree() {
        return inviteFree;
    }

    /**
     * Legt den Wert der inviteFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviteFree(Boolean value) {
        this.inviteFree = value;
    }

    /**
     * Ruft den Wert der hidePresenceAndProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidePresenceAndProfile() {
        return hidePresenceAndProfile;
    }

    /**
     * Legt den Wert der hidePresenceAndProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidePresenceAndProfile(Boolean value) {
        this.hidePresenceAndProfile = value;
    }

    /**
     * Ruft den Wert der isPendingOutbound-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPendingOutbound() {
        return isPendingOutbound;
    }

    /**
     * Legt den Wert der isPendingOutbound-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPendingOutbound(Boolean value) {
        this.isPendingOutbound = value;
    }

    /**
     * Ruft den Wert der supportGroupFeeds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportGroupFeeds() {
        return supportGroupFeeds;
    }

    /**
     * Legt den Wert der supportGroupFeeds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportGroupFeeds(Boolean value) {
        this.supportGroupFeeds = value;
    }

    /**
     * Ruft den Wert der userTileHash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTileHash() {
        return userTileHash;
    }

    /**
     * Legt den Wert der userTileHash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTileHash(String value) {
        this.userTileHash = value;
    }

    /**
     * Ruft den Wert der unifiedInbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnifiedInbox() {
        return unifiedInbox;
    }

    /**
     * Legt den Wert der unifiedInbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnifiedInbox(Boolean value) {
        this.unifiedInbox = value;
    }

    /**
     * Ruft den Wert der mris-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getMris() {
        return mris;
    }

    /**
     * Legt den Wert der mris-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setMris(ArrayOfStringsType value) {
        this.mris = value;
    }

    /**
     * Ruft den Wert der wlid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlid() {
        return wlid;
    }

    /**
     * Legt den Wert der wlid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlid(String value) {
        this.wlid = value;
    }

    /**
     * Ruft den Wert der abchContactId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbchContactId() {
        return abchContactId;
    }

    /**
     * Legt den Wert der abchContactId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbchContactId(String value) {
        this.abchContactId = value;
    }

    /**
     * Ruft den Wert der notInBirthdayCalendar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotInBirthdayCalendar() {
        return notInBirthdayCalendar;
    }

    /**
     * Legt den Wert der notInBirthdayCalendar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotInBirthdayCalendar(Boolean value) {
        this.notInBirthdayCalendar = value;
    }

    /**
     * Ruft den Wert der shellContactType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShellContactType() {
        return shellContactType;
    }

    /**
     * Legt den Wert der shellContactType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShellContactType(String value) {
        this.shellContactType = value;
    }

    /**
     * Ruft den Wert der imMri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImMri() {
        return imMri;
    }

    /**
     * Legt den Wert der imMri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImMri(String value) {
        this.imMri = value;
    }

    /**
     * Ruft den Wert der presenceTrustLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresenceTrustLevel() {
        return presenceTrustLevel;
    }

    /**
     * Legt den Wert der presenceTrustLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresenceTrustLevel(Integer value) {
        this.presenceTrustLevel = value;
    }

    /**
     * Ruft den Wert der otherMri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherMri() {
        return otherMri;
    }

    /**
     * Legt den Wert der otherMri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherMri(String value) {
        this.otherMri = value;
    }

    /**
     * Ruft den Wert der profileLastChanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileLastChanged() {
        return profileLastChanged;
    }

    /**
     * Legt den Wert der profileLastChanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileLastChanged(String value) {
        this.profileLastChanged = value;
    }

    /**
     * Ruft den Wert der mobileIMEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileIMEnabled() {
        return mobileIMEnabled;
    }

    /**
     * Legt den Wert der mobileIMEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileIMEnabled(Boolean value) {
        this.mobileIMEnabled = value;
    }

    /**
     * Ruft den Wert der partnerNetworkProfilePhotoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNetworkProfilePhotoUrl() {
        return partnerNetworkProfilePhotoUrl;
    }

    /**
     * Legt den Wert der partnerNetworkProfilePhotoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNetworkProfilePhotoUrl(String value) {
        this.partnerNetworkProfilePhotoUrl = value;
    }

    /**
     * Ruft den Wert der partnerNetworkThumbnailPhotoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNetworkThumbnailPhotoUrl() {
        return partnerNetworkThumbnailPhotoUrl;
    }

    /**
     * Legt den Wert der partnerNetworkThumbnailPhotoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNetworkThumbnailPhotoUrl(String value) {
        this.partnerNetworkThumbnailPhotoUrl = value;
    }

    /**
     * Ruft den Wert der personId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Legt den Wert der personId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Ruft den Wert der conversationGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationGuid() {
        return conversationGuid;
    }

    /**
     * Legt den Wert der conversationGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationGuid(String value) {
        this.conversationGuid = value;
    }

}
