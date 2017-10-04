
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkedInProfileLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Skills" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSkillInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="ProfessionalBiography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementChain" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="DirectReports" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Peers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="TeamSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentJob" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfJobInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hometown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyProfile" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfCompanyInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MutualConnections" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MutualManager" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="Insights" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInsight" minOccurs="0"/&gt;
 *         &lt;element name="UserProfilePicture" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserProfilePicture" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "fullName",
    "givenName",
    "surname",
    "phoneNumber",
    "smsNumber",
    "emailAddress",
    "alias",
    "department",
    "linkedInProfileLink",
    "skills",
    "professionalBiography",
    "managementChain",
    "directReports",
    "peers",
    "teamSize",
    "currentJob",
    "birthday",
    "hometown",
    "currentLocation",
    "companyProfile",
    "office",
    "headline",
    "mutualConnections",
    "title",
    "mutualManager",
    "insights",
    "userProfilePicture"
})
public class PersonType {

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "SMSNumber")
    protected String smsNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "LinkedInProfileLink")
    protected String linkedInProfileLink;
    @XmlElement(name = "Skills")
    protected ArrayOfSkillInsightValue skills;
    @XmlElement(name = "ProfessionalBiography")
    protected String professionalBiography;
    @XmlElement(name = "ManagementChain")
    protected ArrayOfProfileInsightValue managementChain;
    @XmlElement(name = "DirectReports")
    protected ArrayOfProfileInsightValue directReports;
    @XmlElement(name = "Peers")
    protected ArrayOfProfileInsightValue peers;
    @XmlElement(name = "TeamSize")
    protected String teamSize;
    @XmlElement(name = "CurrentJob")
    protected ArrayOfJobInsightValue currentJob;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElement(name = "Hometown")
    protected String hometown;
    @XmlElement(name = "CurrentLocation")
    protected String currentLocation;
    @XmlElement(name = "CompanyProfile")
    protected ArrayOfCompanyInsightValue companyProfile;
    @XmlElement(name = "Office")
    protected String office;
    @XmlElement(name = "Headline")
    protected String headline;
    @XmlElement(name = "MutualConnections")
    protected ArrayOfProfileInsightValue mutualConnections;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "MutualManager")
    protected ProfileInsightValue mutualManager;
    @XmlElement(name = "Insights")
    protected ArrayOfInsight insights;
    @XmlElement(name = "UserProfilePicture")
    protected UserProfilePicture userProfilePicture;

    /**
     * Ruft den Wert der fullName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Legt den Wert der fullName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der smsNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSNumber() {
        return smsNumber;
    }

    /**
     * Legt den Wert der smsNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSNumber(String value) {
        this.smsNumber = value;
    }

    /**
     * Ruft den Wert der emailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Legt den Wert der emailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
     * Ruft den Wert der linkedInProfileLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedInProfileLink() {
        return linkedInProfileLink;
    }

    /**
     * Legt den Wert der linkedInProfileLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedInProfileLink(String value) {
        this.linkedInProfileLink = value;
    }

    /**
     * Ruft den Wert der skills-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSkillInsightValue }
     *     
     */
    public ArrayOfSkillInsightValue getSkills() {
        return skills;
    }

    /**
     * Legt den Wert der skills-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSkillInsightValue }
     *     
     */
    public void setSkills(ArrayOfSkillInsightValue value) {
        this.skills = value;
    }

    /**
     * Ruft den Wert der professionalBiography-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalBiography() {
        return professionalBiography;
    }

    /**
     * Legt den Wert der professionalBiography-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalBiography(String value) {
        this.professionalBiography = value;
    }

    /**
     * Ruft den Wert der managementChain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public ArrayOfProfileInsightValue getManagementChain() {
        return managementChain;
    }

    /**
     * Legt den Wert der managementChain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public void setManagementChain(ArrayOfProfileInsightValue value) {
        this.managementChain = value;
    }

    /**
     * Ruft den Wert der directReports-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public ArrayOfProfileInsightValue getDirectReports() {
        return directReports;
    }

    /**
     * Legt den Wert der directReports-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public void setDirectReports(ArrayOfProfileInsightValue value) {
        this.directReports = value;
    }

    /**
     * Ruft den Wert der peers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public ArrayOfProfileInsightValue getPeers() {
        return peers;
    }

    /**
     * Legt den Wert der peers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public void setPeers(ArrayOfProfileInsightValue value) {
        this.peers = value;
    }

    /**
     * Ruft den Wert der teamSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamSize() {
        return teamSize;
    }

    /**
     * Legt den Wert der teamSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamSize(String value) {
        this.teamSize = value;
    }

    /**
     * Ruft den Wert der currentJob-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobInsightValue }
     *     
     */
    public ArrayOfJobInsightValue getCurrentJob() {
        return currentJob;
    }

    /**
     * Legt den Wert der currentJob-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobInsightValue }
     *     
     */
    public void setCurrentJob(ArrayOfJobInsightValue value) {
        this.currentJob = value;
    }

    /**
     * Ruft den Wert der birthday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Legt den Wert der birthday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Ruft den Wert der hometown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * Legt den Wert der hometown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHometown(String value) {
        this.hometown = value;
    }

    /**
     * Ruft den Wert der currentLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Legt den Wert der currentLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocation(String value) {
        this.currentLocation = value;
    }

    /**
     * Ruft den Wert der companyProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyInsightValue }
     *     
     */
    public ArrayOfCompanyInsightValue getCompanyProfile() {
        return companyProfile;
    }

    /**
     * Legt den Wert der companyProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyInsightValue }
     *     
     */
    public void setCompanyProfile(ArrayOfCompanyInsightValue value) {
        this.companyProfile = value;
    }

    /**
     * Ruft den Wert der office-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Legt den Wert der office-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Ruft den Wert der headline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Legt den Wert der headline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Ruft den Wert der mutualConnections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public ArrayOfProfileInsightValue getMutualConnections() {
        return mutualConnections;
    }

    /**
     * Legt den Wert der mutualConnections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInsightValue }
     *     
     */
    public void setMutualConnections(ArrayOfProfileInsightValue value) {
        this.mutualConnections = value;
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
     * Ruft den Wert der mutualManager-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileInsightValue }
     *     
     */
    public ProfileInsightValue getMutualManager() {
        return mutualManager;
    }

    /**
     * Legt den Wert der mutualManager-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileInsightValue }
     *     
     */
    public void setMutualManager(ProfileInsightValue value) {
        this.mutualManager = value;
    }

    /**
     * Ruft den Wert der insights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsight }
     *     
     */
    public ArrayOfInsight getInsights() {
        return insights;
    }

    /**
     * Legt den Wert der insights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsight }
     *     
     */
    public void setInsights(ArrayOfInsight value) {
        this.insights = value;
    }

    /**
     * Ruft den Wert der userProfilePicture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserProfilePicture }
     *     
     */
    public UserProfilePicture getUserProfilePicture() {
        return userProfilePicture;
    }

    /**
     * Legt den Wert der userProfilePicture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfilePicture }
     *     
     */
    public void setUserProfilePicture(UserProfilePicture value) {
        this.userProfilePicture = value;
    }

}
