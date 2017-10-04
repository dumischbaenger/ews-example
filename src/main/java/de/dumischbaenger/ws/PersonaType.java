
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für PersonaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonaId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="PersonaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonaObjectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Bodies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfBodyContentAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameFirstLastSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameLastFirstSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyNameSortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomeCitySortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkCitySortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameFirstLastHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameLastFirstHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameFirstLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNameLastFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileAsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Generation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YomiCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YomiFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YomiLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaPhoneNumberType" minOccurs="0"/&gt;
 *         &lt;element name="ImAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelevanceScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RankingWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="Attributions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPersonaAttributionsType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="FileAses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="FileAsIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayNamePrefixes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="GivenNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Surnames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Generations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Nicknames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Initials" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="YomiCompanyNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="YomiFirstNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="YomiLastNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPhoneNumbers2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="HomePhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="HomePhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="AssistantPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="CallbackPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="CarPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="HomeFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationMainPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherTelephones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherPhones2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Pagers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="RadioPhones" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="TelexNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="TTYTDDPhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="WorkFaxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhoneNumberAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Emails1" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Emails2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Emails3" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessHomePages" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="PersonalHomePages" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OfficeLocations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="ImAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="ImAddresses2" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="ImAddresses3" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="HomeAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPostalAddressAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Titles" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Departments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Managers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="AssistantNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Professions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="SpouseNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringArrayAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Schools" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Hobbies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="WeddingAnniversaries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Birthdays" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Locations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="InlineLinks" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="ItemLinkIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringArrayAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="HasActiveDeals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBusinessContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttributedHasActiveDeals" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="AttributedIsBusinessContact" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="SourceMailboxGuids" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringAttributedValuesType" minOccurs="0"/&gt;
 *         &lt;element name="LastContactedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfExtendedPropertyAttributedValueType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalDirectoryObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaType", propOrder = {
    "personaId",
    "personaType",
    "personaObjectStatus",
    "creationTime",
    "bodies",
    "displayNameFirstLastSortKey",
    "displayNameLastFirstSortKey",
    "companyNameSortKey",
    "homeCitySortKey",
    "workCitySortKey",
    "displayNameFirstLastHeader",
    "displayNameLastFirstHeader",
    "displayName",
    "displayNameFirstLast",
    "displayNameLastFirst",
    "fileAs",
    "fileAsId",
    "displayNamePrefix",
    "givenName",
    "middleName",
    "surname",
    "generation",
    "nickname",
    "yomiCompanyName",
    "yomiFirstName",
    "yomiLastName",
    "title",
    "department",
    "companyName",
    "location",
    "emailAddress",
    "emailAddresses",
    "phoneNumber",
    "imAddress",
    "homeCity",
    "workCity",
    "relevanceScore",
    "rankingWeight",
    "folderIds",
    "attributions",
    "displayNames",
    "fileAses",
    "fileAsIds",
    "displayNamePrefixes",
    "givenNames",
    "middleNames",
    "surnames",
    "generations",
    "nicknames",
    "initials",
    "yomiCompanyNames",
    "yomiFirstNames",
    "yomiLastNames",
    "businessPhoneNumbers",
    "businessPhoneNumbers2",
    "homePhones",
    "homePhones2",
    "mobilePhones",
    "mobilePhones2",
    "assistantPhoneNumbers",
    "callbackPhones",
    "carPhones",
    "homeFaxes",
    "organizationMainPhones",
    "otherFaxes",
    "otherTelephones",
    "otherPhones2",
    "pagers",
    "radioPhones",
    "telexNumbers",
    "ttytddPhoneNumbers",
    "workFaxes",
    "emails1",
    "emails2",
    "emails3",
    "businessHomePages",
    "personalHomePages",
    "officeLocations",
    "imAddresses",
    "imAddresses2",
    "imAddresses3",
    "businessAddresses",
    "homeAddresses",
    "otherAddresses",
    "titles",
    "departments",
    "companyNames",
    "managers",
    "assistantNames",
    "professions",
    "spouseNames",
    "children",
    "schools",
    "hobbies",
    "weddingAnniversaries",
    "birthdays",
    "locations",
    "inlineLinks",
    "itemLinkIds",
    "hasActiveDeals",
    "isBusinessContact",
    "attributedHasActiveDeals",
    "attributedIsBusinessContact",
    "sourceMailboxGuids",
    "lastContactedDate",
    "extendedProperties",
    "externalDirectoryObjectId"
})
public class PersonaType {

    @XmlElement(name = "PersonaId", required = true)
    protected ItemIdType personaId;
    @XmlElement(name = "PersonaType")
    protected String personaType;
    @XmlElement(name = "PersonaObjectStatus")
    protected String personaObjectStatus;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "Bodies")
    protected ArrayOfBodyContentAttributedValuesType bodies;
    @XmlElement(name = "DisplayNameFirstLastSortKey")
    protected String displayNameFirstLastSortKey;
    @XmlElement(name = "DisplayNameLastFirstSortKey")
    protected String displayNameLastFirstSortKey;
    @XmlElement(name = "CompanyNameSortKey")
    protected String companyNameSortKey;
    @XmlElement(name = "HomeCitySortKey")
    protected String homeCitySortKey;
    @XmlElement(name = "WorkCitySortKey")
    protected String workCitySortKey;
    @XmlElement(name = "DisplayNameFirstLastHeader")
    protected String displayNameFirstLastHeader;
    @XmlElement(name = "DisplayNameLastFirstHeader")
    protected String displayNameLastFirstHeader;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "DisplayNameFirstLast")
    protected String displayNameFirstLast;
    @XmlElement(name = "DisplayNameLastFirst")
    protected String displayNameLastFirst;
    @XmlElement(name = "FileAs")
    protected String fileAs;
    @XmlElement(name = "FileAsId")
    protected String fileAsId;
    @XmlElement(name = "DisplayNamePrefix")
    protected String displayNamePrefix;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Generation")
    protected String generation;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "YomiCompanyName")
    protected String yomiCompanyName;
    @XmlElement(name = "YomiFirstName")
    protected String yomiFirstName;
    @XmlElement(name = "YomiLastName")
    protected String yomiLastName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "EmailAddress")
    protected EmailAddressType emailAddress;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfEmailAddressesType emailAddresses;
    @XmlElement(name = "PhoneNumber")
    protected PersonaPhoneNumberType phoneNumber;
    @XmlElement(name = "ImAddress")
    protected String imAddress;
    @XmlElement(name = "HomeCity")
    protected String homeCity;
    @XmlElement(name = "WorkCity")
    protected String workCity;
    @XmlElement(name = "RelevanceScore")
    protected Integer relevanceScore;
    @XmlElement(name = "RankingWeight")
    protected Double rankingWeight;
    @XmlElement(name = "FolderIds")
    protected ArrayOfFolderIdType folderIds;
    @XmlElement(name = "Attributions")
    protected ArrayOfPersonaAttributionsType attributions;
    @XmlElement(name = "DisplayNames")
    protected ArrayOfStringAttributedValuesType displayNames;
    @XmlElement(name = "FileAses")
    protected ArrayOfStringAttributedValuesType fileAses;
    @XmlElement(name = "FileAsIds")
    protected ArrayOfStringAttributedValuesType fileAsIds;
    @XmlElement(name = "DisplayNamePrefixes")
    protected ArrayOfStringAttributedValuesType displayNamePrefixes;
    @XmlElement(name = "GivenNames")
    protected ArrayOfStringAttributedValuesType givenNames;
    @XmlElement(name = "MiddleNames")
    protected ArrayOfStringAttributedValuesType middleNames;
    @XmlElement(name = "Surnames")
    protected ArrayOfStringAttributedValuesType surnames;
    @XmlElement(name = "Generations")
    protected ArrayOfStringAttributedValuesType generations;
    @XmlElement(name = "Nicknames")
    protected ArrayOfStringAttributedValuesType nicknames;
    @XmlElement(name = "Initials")
    protected ArrayOfStringAttributedValuesType initials;
    @XmlElement(name = "YomiCompanyNames")
    protected ArrayOfStringAttributedValuesType yomiCompanyNames;
    @XmlElement(name = "YomiFirstNames")
    protected ArrayOfStringAttributedValuesType yomiFirstNames;
    @XmlElement(name = "YomiLastNames")
    protected ArrayOfStringAttributedValuesType yomiLastNames;
    @XmlElement(name = "BusinessPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType businessPhoneNumbers;
    @XmlElement(name = "BusinessPhoneNumbers2")
    protected ArrayOfPhoneNumberAttributedValuesType businessPhoneNumbers2;
    @XmlElement(name = "HomePhones")
    protected ArrayOfPhoneNumberAttributedValuesType homePhones;
    @XmlElement(name = "HomePhones2")
    protected ArrayOfPhoneNumberAttributedValuesType homePhones2;
    @XmlElement(name = "MobilePhones")
    protected ArrayOfPhoneNumberAttributedValuesType mobilePhones;
    @XmlElement(name = "MobilePhones2")
    protected ArrayOfPhoneNumberAttributedValuesType mobilePhones2;
    @XmlElement(name = "AssistantPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType assistantPhoneNumbers;
    @XmlElement(name = "CallbackPhones")
    protected ArrayOfPhoneNumberAttributedValuesType callbackPhones;
    @XmlElement(name = "CarPhones")
    protected ArrayOfPhoneNumberAttributedValuesType carPhones;
    @XmlElement(name = "HomeFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType homeFaxes;
    @XmlElement(name = "OrganizationMainPhones")
    protected ArrayOfPhoneNumberAttributedValuesType organizationMainPhones;
    @XmlElement(name = "OtherFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType otherFaxes;
    @XmlElement(name = "OtherTelephones")
    protected ArrayOfPhoneNumberAttributedValuesType otherTelephones;
    @XmlElement(name = "OtherPhones2")
    protected ArrayOfPhoneNumberAttributedValuesType otherPhones2;
    @XmlElement(name = "Pagers")
    protected ArrayOfPhoneNumberAttributedValuesType pagers;
    @XmlElement(name = "RadioPhones")
    protected ArrayOfPhoneNumberAttributedValuesType radioPhones;
    @XmlElement(name = "TelexNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType telexNumbers;
    @XmlElement(name = "TTYTDDPhoneNumbers")
    protected ArrayOfPhoneNumberAttributedValuesType ttytddPhoneNumbers;
    @XmlElement(name = "WorkFaxes")
    protected ArrayOfPhoneNumberAttributedValuesType workFaxes;
    @XmlElement(name = "Emails1")
    protected ArrayOfEmailAddressAttributedValuesType emails1;
    @XmlElement(name = "Emails2")
    protected ArrayOfEmailAddressAttributedValuesType emails2;
    @XmlElement(name = "Emails3")
    protected ArrayOfEmailAddressAttributedValuesType emails3;
    @XmlElement(name = "BusinessHomePages")
    protected ArrayOfStringAttributedValuesType businessHomePages;
    @XmlElement(name = "PersonalHomePages")
    protected ArrayOfStringAttributedValuesType personalHomePages;
    @XmlElement(name = "OfficeLocations")
    protected ArrayOfStringAttributedValuesType officeLocations;
    @XmlElement(name = "ImAddresses")
    protected ArrayOfStringAttributedValuesType imAddresses;
    @XmlElement(name = "ImAddresses2")
    protected ArrayOfStringAttributedValuesType imAddresses2;
    @XmlElement(name = "ImAddresses3")
    protected ArrayOfStringAttributedValuesType imAddresses3;
    @XmlElement(name = "BusinessAddresses")
    protected ArrayOfPostalAddressAttributedValuesType businessAddresses;
    @XmlElement(name = "HomeAddresses")
    protected ArrayOfPostalAddressAttributedValuesType homeAddresses;
    @XmlElement(name = "OtherAddresses")
    protected ArrayOfPostalAddressAttributedValuesType otherAddresses;
    @XmlElement(name = "Titles")
    protected ArrayOfStringAttributedValuesType titles;
    @XmlElement(name = "Departments")
    protected ArrayOfStringAttributedValuesType departments;
    @XmlElement(name = "CompanyNames")
    protected ArrayOfStringAttributedValuesType companyNames;
    @XmlElement(name = "Managers")
    protected ArrayOfStringAttributedValuesType managers;
    @XmlElement(name = "AssistantNames")
    protected ArrayOfStringAttributedValuesType assistantNames;
    @XmlElement(name = "Professions")
    protected ArrayOfStringAttributedValuesType professions;
    @XmlElement(name = "SpouseNames")
    protected ArrayOfStringAttributedValuesType spouseNames;
    @XmlElement(name = "Children")
    protected ArrayOfStringArrayAttributedValuesType children;
    @XmlElement(name = "Schools")
    protected ArrayOfStringAttributedValuesType schools;
    @XmlElement(name = "Hobbies")
    protected ArrayOfStringAttributedValuesType hobbies;
    @XmlElement(name = "WeddingAnniversaries")
    protected ArrayOfStringAttributedValuesType weddingAnniversaries;
    @XmlElement(name = "Birthdays")
    protected ArrayOfStringAttributedValuesType birthdays;
    @XmlElement(name = "Locations")
    protected ArrayOfStringAttributedValuesType locations;
    @XmlElement(name = "InlineLinks")
    protected ArrayOfStringAttributedValuesType inlineLinks;
    @XmlElement(name = "ItemLinkIds")
    protected ArrayOfStringArrayAttributedValuesType itemLinkIds;
    @XmlElement(name = "HasActiveDeals")
    protected String hasActiveDeals;
    @XmlElement(name = "IsBusinessContact")
    protected String isBusinessContact;
    @XmlElement(name = "AttributedHasActiveDeals")
    protected ArrayOfStringAttributedValuesType attributedHasActiveDeals;
    @XmlElement(name = "AttributedIsBusinessContact")
    protected ArrayOfStringAttributedValuesType attributedIsBusinessContact;
    @XmlElement(name = "SourceMailboxGuids")
    protected ArrayOfStringAttributedValuesType sourceMailboxGuids;
    @XmlElement(name = "LastContactedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastContactedDate;
    @XmlElement(name = "ExtendedProperties")
    protected ArrayOfExtendedPropertyAttributedValueType extendedProperties;
    @XmlElement(name = "ExternalDirectoryObjectId")
    protected String externalDirectoryObjectId;

    /**
     * Ruft den Wert der personaId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getPersonaId() {
        return personaId;
    }

    /**
     * Legt den Wert der personaId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setPersonaId(ItemIdType value) {
        this.personaId = value;
    }

    /**
     * Ruft den Wert der personaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaType() {
        return personaType;
    }

    /**
     * Legt den Wert der personaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaType(String value) {
        this.personaType = value;
    }

    /**
     * Ruft den Wert der personaObjectStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaObjectStatus() {
        return personaObjectStatus;
    }

    /**
     * Legt den Wert der personaObjectStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaObjectStatus(String value) {
        this.personaObjectStatus = value;
    }

    /**
     * Ruft den Wert der creationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Legt den Wert der creationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Ruft den Wert der bodies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBodyContentAttributedValuesType }
     *     
     */
    public ArrayOfBodyContentAttributedValuesType getBodies() {
        return bodies;
    }

    /**
     * Legt den Wert der bodies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBodyContentAttributedValuesType }
     *     
     */
    public void setBodies(ArrayOfBodyContentAttributedValuesType value) {
        this.bodies = value;
    }

    /**
     * Ruft den Wert der displayNameFirstLastSortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLastSortKey() {
        return displayNameFirstLastSortKey;
    }

    /**
     * Legt den Wert der displayNameFirstLastSortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLastSortKey(String value) {
        this.displayNameFirstLastSortKey = value;
    }

    /**
     * Ruft den Wert der displayNameLastFirstSortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirstSortKey() {
        return displayNameLastFirstSortKey;
    }

    /**
     * Legt den Wert der displayNameLastFirstSortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirstSortKey(String value) {
        this.displayNameLastFirstSortKey = value;
    }

    /**
     * Ruft den Wert der companyNameSortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameSortKey() {
        return companyNameSortKey;
    }

    /**
     * Legt den Wert der companyNameSortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameSortKey(String value) {
        this.companyNameSortKey = value;
    }

    /**
     * Ruft den Wert der homeCitySortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCitySortKey() {
        return homeCitySortKey;
    }

    /**
     * Legt den Wert der homeCitySortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCitySortKey(String value) {
        this.homeCitySortKey = value;
    }

    /**
     * Ruft den Wert der workCitySortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCitySortKey() {
        return workCitySortKey;
    }

    /**
     * Legt den Wert der workCitySortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCitySortKey(String value) {
        this.workCitySortKey = value;
    }

    /**
     * Ruft den Wert der displayNameFirstLastHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLastHeader() {
        return displayNameFirstLastHeader;
    }

    /**
     * Legt den Wert der displayNameFirstLastHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLastHeader(String value) {
        this.displayNameFirstLastHeader = value;
    }

    /**
     * Ruft den Wert der displayNameLastFirstHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirstHeader() {
        return displayNameLastFirstHeader;
    }

    /**
     * Legt den Wert der displayNameLastFirstHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirstHeader(String value) {
        this.displayNameLastFirstHeader = value;
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
     * Ruft den Wert der displayNameFirstLast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameFirstLast() {
        return displayNameFirstLast;
    }

    /**
     * Legt den Wert der displayNameFirstLast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameFirstLast(String value) {
        this.displayNameFirstLast = value;
    }

    /**
     * Ruft den Wert der displayNameLastFirst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLastFirst() {
        return displayNameLastFirst;
    }

    /**
     * Legt den Wert der displayNameLastFirst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLastFirst(String value) {
        this.displayNameLastFirst = value;
    }

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
     * Ruft den Wert der fileAsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAsId() {
        return fileAsId;
    }

    /**
     * Legt den Wert der fileAsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAsId(String value) {
        this.fileAsId = value;
    }

    /**
     * Ruft den Wert der displayNamePrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNamePrefix() {
        return displayNamePrefix;
    }

    /**
     * Legt den Wert der displayNamePrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNamePrefix(String value) {
        this.displayNamePrefix = value;
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
     * Ruft den Wert der yomiCompanyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiCompanyName() {
        return yomiCompanyName;
    }

    /**
     * Legt den Wert der yomiCompanyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiCompanyName(String value) {
        this.yomiCompanyName = value;
    }

    /**
     * Ruft den Wert der yomiFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiFirstName() {
        return yomiFirstName;
    }

    /**
     * Legt den Wert der yomiFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiFirstName(String value) {
        this.yomiFirstName = value;
    }

    /**
     * Ruft den Wert der yomiLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomiLastName() {
        return yomiLastName;
    }

    /**
     * Legt den Wert der yomiLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomiLastName(String value) {
        this.yomiLastName = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der emailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Legt den Wert der emailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }

    /**
     * Ruft den Wert der emailAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Legt den Wert der emailAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setEmailAddresses(ArrayOfEmailAddressesType value) {
        this.emailAddresses = value;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonaPhoneNumberType }
     *     
     */
    public PersonaPhoneNumberType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaPhoneNumberType }
     *     
     */
    public void setPhoneNumber(PersonaPhoneNumberType value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der imAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAddress() {
        return imAddress;
    }

    /**
     * Legt den Wert der imAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAddress(String value) {
        this.imAddress = value;
    }

    /**
     * Ruft den Wert der homeCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * Legt den Wert der homeCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCity(String value) {
        this.homeCity = value;
    }

    /**
     * Ruft den Wert der workCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCity() {
        return workCity;
    }

    /**
     * Legt den Wert der workCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCity(String value) {
        this.workCity = value;
    }

    /**
     * Ruft den Wert der relevanceScore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelevanceScore() {
        return relevanceScore;
    }

    /**
     * Legt den Wert der relevanceScore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelevanceScore(Integer value) {
        this.relevanceScore = value;
    }

    /**
     * Ruft den Wert der rankingWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRankingWeight() {
        return rankingWeight;
    }

    /**
     * Legt den Wert der rankingWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRankingWeight(Double value) {
        this.rankingWeight = value;
    }

    /**
     * Ruft den Wert der folderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public ArrayOfFolderIdType getFolderIds() {
        return folderIds;
    }

    /**
     * Legt den Wert der folderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public void setFolderIds(ArrayOfFolderIdType value) {
        this.folderIds = value;
    }

    /**
     * Ruft den Wert der attributions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonaAttributionsType }
     *     
     */
    public ArrayOfPersonaAttributionsType getAttributions() {
        return attributions;
    }

    /**
     * Legt den Wert der attributions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonaAttributionsType }
     *     
     */
    public void setAttributions(ArrayOfPersonaAttributionsType value) {
        this.attributions = value;
    }

    /**
     * Ruft den Wert der displayNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDisplayNames() {
        return displayNames;
    }

    /**
     * Legt den Wert der displayNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDisplayNames(ArrayOfStringAttributedValuesType value) {
        this.displayNames = value;
    }

    /**
     * Ruft den Wert der fileAses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getFileAses() {
        return fileAses;
    }

    /**
     * Legt den Wert der fileAses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setFileAses(ArrayOfStringAttributedValuesType value) {
        this.fileAses = value;
    }

    /**
     * Ruft den Wert der fileAsIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getFileAsIds() {
        return fileAsIds;
    }

    /**
     * Legt den Wert der fileAsIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setFileAsIds(ArrayOfStringAttributedValuesType value) {
        this.fileAsIds = value;
    }

    /**
     * Ruft den Wert der displayNamePrefixes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDisplayNamePrefixes() {
        return displayNamePrefixes;
    }

    /**
     * Legt den Wert der displayNamePrefixes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDisplayNamePrefixes(ArrayOfStringAttributedValuesType value) {
        this.displayNamePrefixes = value;
    }

    /**
     * Ruft den Wert der givenNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getGivenNames() {
        return givenNames;
    }

    /**
     * Legt den Wert der givenNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setGivenNames(ArrayOfStringAttributedValuesType value) {
        this.givenNames = value;
    }

    /**
     * Ruft den Wert der middleNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getMiddleNames() {
        return middleNames;
    }

    /**
     * Legt den Wert der middleNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setMiddleNames(ArrayOfStringAttributedValuesType value) {
        this.middleNames = value;
    }

    /**
     * Ruft den Wert der surnames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSurnames() {
        return surnames;
    }

    /**
     * Legt den Wert der surnames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSurnames(ArrayOfStringAttributedValuesType value) {
        this.surnames = value;
    }

    /**
     * Ruft den Wert der generations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getGenerations() {
        return generations;
    }

    /**
     * Legt den Wert der generations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setGenerations(ArrayOfStringAttributedValuesType value) {
        this.generations = value;
    }

    /**
     * Ruft den Wert der nicknames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getNicknames() {
        return nicknames;
    }

    /**
     * Legt den Wert der nicknames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setNicknames(ArrayOfStringAttributedValuesType value) {
        this.nicknames = value;
    }

    /**
     * Ruft den Wert der initials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getInitials() {
        return initials;
    }

    /**
     * Legt den Wert der initials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setInitials(ArrayOfStringAttributedValuesType value) {
        this.initials = value;
    }

    /**
     * Ruft den Wert der yomiCompanyNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiCompanyNames() {
        return yomiCompanyNames;
    }

    /**
     * Legt den Wert der yomiCompanyNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiCompanyNames(ArrayOfStringAttributedValuesType value) {
        this.yomiCompanyNames = value;
    }

    /**
     * Ruft den Wert der yomiFirstNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiFirstNames() {
        return yomiFirstNames;
    }

    /**
     * Legt den Wert der yomiFirstNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiFirstNames(ArrayOfStringAttributedValuesType value) {
        this.yomiFirstNames = value;
    }

    /**
     * Ruft den Wert der yomiLastNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getYomiLastNames() {
        return yomiLastNames;
    }

    /**
     * Legt den Wert der yomiLastNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setYomiLastNames(ArrayOfStringAttributedValuesType value) {
        this.yomiLastNames = value;
    }

    /**
     * Ruft den Wert der businessPhoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getBusinessPhoneNumbers() {
        return businessPhoneNumbers;
    }

    /**
     * Legt den Wert der businessPhoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setBusinessPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.businessPhoneNumbers = value;
    }

    /**
     * Ruft den Wert der businessPhoneNumbers2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getBusinessPhoneNumbers2() {
        return businessPhoneNumbers2;
    }

    /**
     * Legt den Wert der businessPhoneNumbers2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setBusinessPhoneNumbers2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.businessPhoneNumbers2 = value;
    }

    /**
     * Ruft den Wert der homePhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomePhones() {
        return homePhones;
    }

    /**
     * Legt den Wert der homePhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomePhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homePhones = value;
    }

    /**
     * Ruft den Wert der homePhones2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomePhones2() {
        return homePhones2;
    }

    /**
     * Legt den Wert der homePhones2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomePhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homePhones2 = value;
    }

    /**
     * Ruft den Wert der mobilePhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getMobilePhones() {
        return mobilePhones;
    }

    /**
     * Legt den Wert der mobilePhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setMobilePhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.mobilePhones = value;
    }

    /**
     * Ruft den Wert der mobilePhones2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getMobilePhones2() {
        return mobilePhones2;
    }

    /**
     * Legt den Wert der mobilePhones2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setMobilePhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.mobilePhones2 = value;
    }

    /**
     * Ruft den Wert der assistantPhoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getAssistantPhoneNumbers() {
        return assistantPhoneNumbers;
    }

    /**
     * Legt den Wert der assistantPhoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setAssistantPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.assistantPhoneNumbers = value;
    }

    /**
     * Ruft den Wert der callbackPhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getCallbackPhones() {
        return callbackPhones;
    }

    /**
     * Legt den Wert der callbackPhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setCallbackPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.callbackPhones = value;
    }

    /**
     * Ruft den Wert der carPhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getCarPhones() {
        return carPhones;
    }

    /**
     * Legt den Wert der carPhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setCarPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.carPhones = value;
    }

    /**
     * Ruft den Wert der homeFaxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getHomeFaxes() {
        return homeFaxes;
    }

    /**
     * Legt den Wert der homeFaxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setHomeFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.homeFaxes = value;
    }

    /**
     * Ruft den Wert der organizationMainPhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOrganizationMainPhones() {
        return organizationMainPhones;
    }

    /**
     * Legt den Wert der organizationMainPhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOrganizationMainPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.organizationMainPhones = value;
    }

    /**
     * Ruft den Wert der otherFaxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherFaxes() {
        return otherFaxes;
    }

    /**
     * Legt den Wert der otherFaxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherFaxes = value;
    }

    /**
     * Ruft den Wert der otherTelephones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherTelephones() {
        return otherTelephones;
    }

    /**
     * Legt den Wert der otherTelephones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherTelephones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherTelephones = value;
    }

    /**
     * Ruft den Wert der otherPhones2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getOtherPhones2() {
        return otherPhones2;
    }

    /**
     * Legt den Wert der otherPhones2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setOtherPhones2(ArrayOfPhoneNumberAttributedValuesType value) {
        this.otherPhones2 = value;
    }

    /**
     * Ruft den Wert der pagers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getPagers() {
        return pagers;
    }

    /**
     * Legt den Wert der pagers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setPagers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.pagers = value;
    }

    /**
     * Ruft den Wert der radioPhones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getRadioPhones() {
        return radioPhones;
    }

    /**
     * Legt den Wert der radioPhones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setRadioPhones(ArrayOfPhoneNumberAttributedValuesType value) {
        this.radioPhones = value;
    }

    /**
     * Ruft den Wert der telexNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getTelexNumbers() {
        return telexNumbers;
    }

    /**
     * Legt den Wert der telexNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setTelexNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.telexNumbers = value;
    }

    /**
     * Ruft den Wert der ttytddPhoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getTTYTDDPhoneNumbers() {
        return ttytddPhoneNumbers;
    }

    /**
     * Legt den Wert der ttytddPhoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setTTYTDDPhoneNumbers(ArrayOfPhoneNumberAttributedValuesType value) {
        this.ttytddPhoneNumbers = value;
    }

    /**
     * Ruft den Wert der workFaxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public ArrayOfPhoneNumberAttributedValuesType getWorkFaxes() {
        return workFaxes;
    }

    /**
     * Legt den Wert der workFaxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumberAttributedValuesType }
     *     
     */
    public void setWorkFaxes(ArrayOfPhoneNumberAttributedValuesType value) {
        this.workFaxes = value;
    }

    /**
     * Ruft den Wert der emails1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails1() {
        return emails1;
    }

    /**
     * Legt den Wert der emails1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails1(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails1 = value;
    }

    /**
     * Ruft den Wert der emails2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails2() {
        return emails2;
    }

    /**
     * Legt den Wert der emails2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails2(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails2 = value;
    }

    /**
     * Ruft den Wert der emails3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public ArrayOfEmailAddressAttributedValuesType getEmails3() {
        return emails3;
    }

    /**
     * Legt den Wert der emails3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressAttributedValuesType }
     *     
     */
    public void setEmails3(ArrayOfEmailAddressAttributedValuesType value) {
        this.emails3 = value;
    }

    /**
     * Ruft den Wert der businessHomePages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getBusinessHomePages() {
        return businessHomePages;
    }

    /**
     * Legt den Wert der businessHomePages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setBusinessHomePages(ArrayOfStringAttributedValuesType value) {
        this.businessHomePages = value;
    }

    /**
     * Ruft den Wert der personalHomePages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getPersonalHomePages() {
        return personalHomePages;
    }

    /**
     * Legt den Wert der personalHomePages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setPersonalHomePages(ArrayOfStringAttributedValuesType value) {
        this.personalHomePages = value;
    }

    /**
     * Ruft den Wert der officeLocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getOfficeLocations() {
        return officeLocations;
    }

    /**
     * Legt den Wert der officeLocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setOfficeLocations(ArrayOfStringAttributedValuesType value) {
        this.officeLocations = value;
    }

    /**
     * Ruft den Wert der imAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses() {
        return imAddresses;
    }

    /**
     * Legt den Wert der imAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses(ArrayOfStringAttributedValuesType value) {
        this.imAddresses = value;
    }

    /**
     * Ruft den Wert der imAddresses2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses2() {
        return imAddresses2;
    }

    /**
     * Legt den Wert der imAddresses2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses2(ArrayOfStringAttributedValuesType value) {
        this.imAddresses2 = value;
    }

    /**
     * Ruft den Wert der imAddresses3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getImAddresses3() {
        return imAddresses3;
    }

    /**
     * Legt den Wert der imAddresses3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setImAddresses3(ArrayOfStringAttributedValuesType value) {
        this.imAddresses3 = value;
    }

    /**
     * Ruft den Wert der businessAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getBusinessAddresses() {
        return businessAddresses;
    }

    /**
     * Legt den Wert der businessAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setBusinessAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.businessAddresses = value;
    }

    /**
     * Ruft den Wert der homeAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getHomeAddresses() {
        return homeAddresses;
    }

    /**
     * Legt den Wert der homeAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setHomeAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.homeAddresses = value;
    }

    /**
     * Ruft den Wert der otherAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public ArrayOfPostalAddressAttributedValuesType getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Legt den Wert der otherAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostalAddressAttributedValuesType }
     *     
     */
    public void setOtherAddresses(ArrayOfPostalAddressAttributedValuesType value) {
        this.otherAddresses = value;
    }

    /**
     * Ruft den Wert der titles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getTitles() {
        return titles;
    }

    /**
     * Legt den Wert der titles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setTitles(ArrayOfStringAttributedValuesType value) {
        this.titles = value;
    }

    /**
     * Ruft den Wert der departments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getDepartments() {
        return departments;
    }

    /**
     * Legt den Wert der departments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setDepartments(ArrayOfStringAttributedValuesType value) {
        this.departments = value;
    }

    /**
     * Ruft den Wert der companyNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getCompanyNames() {
        return companyNames;
    }

    /**
     * Legt den Wert der companyNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setCompanyNames(ArrayOfStringAttributedValuesType value) {
        this.companyNames = value;
    }

    /**
     * Ruft den Wert der managers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getManagers() {
        return managers;
    }

    /**
     * Legt den Wert der managers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setManagers(ArrayOfStringAttributedValuesType value) {
        this.managers = value;
    }

    /**
     * Ruft den Wert der assistantNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getAssistantNames() {
        return assistantNames;
    }

    /**
     * Legt den Wert der assistantNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setAssistantNames(ArrayOfStringAttributedValuesType value) {
        this.assistantNames = value;
    }

    /**
     * Ruft den Wert der professions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getProfessions() {
        return professions;
    }

    /**
     * Legt den Wert der professions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setProfessions(ArrayOfStringAttributedValuesType value) {
        this.professions = value;
    }

    /**
     * Ruft den Wert der spouseNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSpouseNames() {
        return spouseNames;
    }

    /**
     * Legt den Wert der spouseNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSpouseNames(ArrayOfStringAttributedValuesType value) {
        this.spouseNames = value;
    }

    /**
     * Ruft den Wert der children-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public ArrayOfStringArrayAttributedValuesType getChildren() {
        return children;
    }

    /**
     * Legt den Wert der children-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public void setChildren(ArrayOfStringArrayAttributedValuesType value) {
        this.children = value;
    }

    /**
     * Ruft den Wert der schools-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSchools() {
        return schools;
    }

    /**
     * Legt den Wert der schools-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSchools(ArrayOfStringAttributedValuesType value) {
        this.schools = value;
    }

    /**
     * Ruft den Wert der hobbies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getHobbies() {
        return hobbies;
    }

    /**
     * Legt den Wert der hobbies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setHobbies(ArrayOfStringAttributedValuesType value) {
        this.hobbies = value;
    }

    /**
     * Ruft den Wert der weddingAnniversaries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getWeddingAnniversaries() {
        return weddingAnniversaries;
    }

    /**
     * Legt den Wert der weddingAnniversaries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setWeddingAnniversaries(ArrayOfStringAttributedValuesType value) {
        this.weddingAnniversaries = value;
    }

    /**
     * Ruft den Wert der birthdays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getBirthdays() {
        return birthdays;
    }

    /**
     * Legt den Wert der birthdays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setBirthdays(ArrayOfStringAttributedValuesType value) {
        this.birthdays = value;
    }

    /**
     * Ruft den Wert der locations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getLocations() {
        return locations;
    }

    /**
     * Legt den Wert der locations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setLocations(ArrayOfStringAttributedValuesType value) {
        this.locations = value;
    }

    /**
     * Ruft den Wert der inlineLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getInlineLinks() {
        return inlineLinks;
    }

    /**
     * Legt den Wert der inlineLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setInlineLinks(ArrayOfStringAttributedValuesType value) {
        this.inlineLinks = value;
    }

    /**
     * Ruft den Wert der itemLinkIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public ArrayOfStringArrayAttributedValuesType getItemLinkIds() {
        return itemLinkIds;
    }

    /**
     * Legt den Wert der itemLinkIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringArrayAttributedValuesType }
     *     
     */
    public void setItemLinkIds(ArrayOfStringArrayAttributedValuesType value) {
        this.itemLinkIds = value;
    }

    /**
     * Ruft den Wert der hasActiveDeals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasActiveDeals() {
        return hasActiveDeals;
    }

    /**
     * Legt den Wert der hasActiveDeals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasActiveDeals(String value) {
        this.hasActiveDeals = value;
    }

    /**
     * Ruft den Wert der isBusinessContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBusinessContact() {
        return isBusinessContact;
    }

    /**
     * Legt den Wert der isBusinessContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBusinessContact(String value) {
        this.isBusinessContact = value;
    }

    /**
     * Ruft den Wert der attributedHasActiveDeals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getAttributedHasActiveDeals() {
        return attributedHasActiveDeals;
    }

    /**
     * Legt den Wert der attributedHasActiveDeals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setAttributedHasActiveDeals(ArrayOfStringAttributedValuesType value) {
        this.attributedHasActiveDeals = value;
    }

    /**
     * Ruft den Wert der attributedIsBusinessContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getAttributedIsBusinessContact() {
        return attributedIsBusinessContact;
    }

    /**
     * Legt den Wert der attributedIsBusinessContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setAttributedIsBusinessContact(ArrayOfStringAttributedValuesType value) {
        this.attributedIsBusinessContact = value;
    }

    /**
     * Ruft den Wert der sourceMailboxGuids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public ArrayOfStringAttributedValuesType getSourceMailboxGuids() {
        return sourceMailboxGuids;
    }

    /**
     * Legt den Wert der sourceMailboxGuids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringAttributedValuesType }
     *     
     */
    public void setSourceMailboxGuids(ArrayOfStringAttributedValuesType value) {
        this.sourceMailboxGuids = value;
    }

    /**
     * Ruft den Wert der lastContactedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastContactedDate() {
        return lastContactedDate;
    }

    /**
     * Legt den Wert der lastContactedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastContactedDate(XMLGregorianCalendar value) {
        this.lastContactedDate = value;
    }

    /**
     * Ruft den Wert der extendedProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedPropertyAttributedValueType }
     *     
     */
    public ArrayOfExtendedPropertyAttributedValueType getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Legt den Wert der extendedProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedPropertyAttributedValueType }
     *     
     */
    public void setExtendedProperties(ArrayOfExtendedPropertyAttributedValueType value) {
        this.extendedProperties = value;
    }

    /**
     * Ruft den Wert der externalDirectoryObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDirectoryObjectId() {
        return externalDirectoryObjectId;
    }

    /**
     * Legt den Wert der externalDirectoryObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDirectoryObjectId(String value) {
        this.externalDirectoryObjectId = value;
    }

}
