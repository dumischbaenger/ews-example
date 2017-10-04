
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für NetworkItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DomainTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserTileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoLinkError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoLinkSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientPublishSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientToken2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactSyncError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactSyncSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorOffers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FirstAuthErrorDates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastVersionSaved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastWelcomeContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Offers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PsaLastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RefreshToken2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefreshTokenExpiry2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RejectedOffers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TokenRefreshLastAttempted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TokenRefreshLastCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PsaState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceEntryID" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastSync" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkItemType", propOrder = {
    "domainId",
    "domainTag",
    "userTileUrl",
    "profileUrl",
    "settings",
    "isDefault",
    "autoLinkError",
    "autoLinkSuccess",
    "userEmail",
    "clientPublishSecret",
    "clientToken",
    "clientToken2",
    "contactSyncError",
    "contactSyncSuccess",
    "errorOffers",
    "firstAuthErrorDates",
    "lastVersionSaved",
    "lastWelcomeContact",
    "offers",
    "psaLastChanged",
    "refreshToken2",
    "refreshTokenExpiry2",
    "sessionHandle",
    "rejectedOffers",
    "syncEnabled",
    "tokenRefreshLastAttempted",
    "tokenRefreshLastCompleted",
    "psaState",
    "sourceEntryID",
    "accountName",
    "lastSync"
})
public class NetworkItemType
    extends ItemType
{

    @XmlElement(name = "DomainId")
    protected Integer domainId;
    @XmlElement(name = "DomainTag")
    protected String domainTag;
    @XmlElement(name = "UserTileUrl")
    protected String userTileUrl;
    @XmlElement(name = "ProfileUrl")
    protected String profileUrl;
    @XmlElement(name = "Settings")
    protected Integer settings;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;
    @XmlElement(name = "AutoLinkError")
    protected String autoLinkError;
    @XmlElement(name = "AutoLinkSuccess")
    protected String autoLinkSuccess;
    @XmlElement(name = "UserEmail")
    protected String userEmail;
    @XmlElement(name = "ClientPublishSecret")
    protected String clientPublishSecret;
    @XmlElement(name = "ClientToken")
    protected String clientToken;
    @XmlElement(name = "ClientToken2")
    protected String clientToken2;
    @XmlElement(name = "ContactSyncError")
    protected String contactSyncError;
    @XmlElement(name = "ContactSyncSuccess")
    protected String contactSyncSuccess;
    @XmlElement(name = "ErrorOffers")
    protected Integer errorOffers;
    @XmlElement(name = "FirstAuthErrorDates")
    protected String firstAuthErrorDates;
    @XmlElement(name = "LastVersionSaved")
    protected Integer lastVersionSaved;
    @XmlElement(name = "LastWelcomeContact")
    protected String lastWelcomeContact;
    @XmlElement(name = "Offers")
    protected Integer offers;
    @XmlElement(name = "PsaLastChanged")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar psaLastChanged;
    @XmlElement(name = "RefreshToken2")
    protected String refreshToken2;
    @XmlElement(name = "RefreshTokenExpiry2")
    protected String refreshTokenExpiry2;
    @XmlElement(name = "SessionHandle")
    protected String sessionHandle;
    @XmlElement(name = "RejectedOffers")
    protected Integer rejectedOffers;
    @XmlElement(name = "SyncEnabled")
    protected Boolean syncEnabled;
    @XmlElement(name = "TokenRefreshLastAttempted")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tokenRefreshLastAttempted;
    @XmlElement(name = "TokenRefreshLastCompleted")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tokenRefreshLastCompleted;
    @XmlElement(name = "PsaState")
    protected String psaState;
    @XmlElement(name = "SourceEntryID")
    protected byte[] sourceEntryID;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "LastSync")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSync;

    /**
     * Ruft den Wert der domainId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * Legt den Wert der domainId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDomainId(Integer value) {
        this.domainId = value;
    }

    /**
     * Ruft den Wert der domainTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainTag() {
        return domainTag;
    }

    /**
     * Legt den Wert der domainTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainTag(String value) {
        this.domainTag = value;
    }

    /**
     * Ruft den Wert der userTileUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTileUrl() {
        return userTileUrl;
    }

    /**
     * Legt den Wert der userTileUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTileUrl(String value) {
        this.userTileUrl = value;
    }

    /**
     * Ruft den Wert der profileUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Legt den Wert der profileUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileUrl(String value) {
        this.profileUrl = value;
    }

    /**
     * Ruft den Wert der settings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettings() {
        return settings;
    }

    /**
     * Legt den Wert der settings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettings(Integer value) {
        this.settings = value;
    }

    /**
     * Ruft den Wert der isDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Legt den Wert der isDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Ruft den Wert der autoLinkError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoLinkError() {
        return autoLinkError;
    }

    /**
     * Legt den Wert der autoLinkError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoLinkError(String value) {
        this.autoLinkError = value;
    }

    /**
     * Ruft den Wert der autoLinkSuccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoLinkSuccess() {
        return autoLinkSuccess;
    }

    /**
     * Legt den Wert der autoLinkSuccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoLinkSuccess(String value) {
        this.autoLinkSuccess = value;
    }

    /**
     * Ruft den Wert der userEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Legt den Wert der userEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Ruft den Wert der clientPublishSecret-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPublishSecret() {
        return clientPublishSecret;
    }

    /**
     * Legt den Wert der clientPublishSecret-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPublishSecret(String value) {
        this.clientPublishSecret = value;
    }

    /**
     * Ruft den Wert der clientToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * Legt den Wert der clientToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientToken(String value) {
        this.clientToken = value;
    }

    /**
     * Ruft den Wert der clientToken2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientToken2() {
        return clientToken2;
    }

    /**
     * Legt den Wert der clientToken2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientToken2(String value) {
        this.clientToken2 = value;
    }

    /**
     * Ruft den Wert der contactSyncError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSyncError() {
        return contactSyncError;
    }

    /**
     * Legt den Wert der contactSyncError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSyncError(String value) {
        this.contactSyncError = value;
    }

    /**
     * Ruft den Wert der contactSyncSuccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSyncSuccess() {
        return contactSyncSuccess;
    }

    /**
     * Legt den Wert der contactSyncSuccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSyncSuccess(String value) {
        this.contactSyncSuccess = value;
    }

    /**
     * Ruft den Wert der errorOffers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorOffers() {
        return errorOffers;
    }

    /**
     * Legt den Wert der errorOffers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorOffers(Integer value) {
        this.errorOffers = value;
    }

    /**
     * Ruft den Wert der firstAuthErrorDates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAuthErrorDates() {
        return firstAuthErrorDates;
    }

    /**
     * Legt den Wert der firstAuthErrorDates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAuthErrorDates(String value) {
        this.firstAuthErrorDates = value;
    }

    /**
     * Ruft den Wert der lastVersionSaved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastVersionSaved() {
        return lastVersionSaved;
    }

    /**
     * Legt den Wert der lastVersionSaved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastVersionSaved(Integer value) {
        this.lastVersionSaved = value;
    }

    /**
     * Ruft den Wert der lastWelcomeContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastWelcomeContact() {
        return lastWelcomeContact;
    }

    /**
     * Legt den Wert der lastWelcomeContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastWelcomeContact(String value) {
        this.lastWelcomeContact = value;
    }

    /**
     * Ruft den Wert der offers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffers() {
        return offers;
    }

    /**
     * Legt den Wert der offers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffers(Integer value) {
        this.offers = value;
    }

    /**
     * Ruft den Wert der psaLastChanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPsaLastChanged() {
        return psaLastChanged;
    }

    /**
     * Legt den Wert der psaLastChanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPsaLastChanged(XMLGregorianCalendar value) {
        this.psaLastChanged = value;
    }

    /**
     * Ruft den Wert der refreshToken2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken2() {
        return refreshToken2;
    }

    /**
     * Legt den Wert der refreshToken2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken2(String value) {
        this.refreshToken2 = value;
    }

    /**
     * Ruft den Wert der refreshTokenExpiry2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshTokenExpiry2() {
        return refreshTokenExpiry2;
    }

    /**
     * Legt den Wert der refreshTokenExpiry2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshTokenExpiry2(String value) {
        this.refreshTokenExpiry2 = value;
    }

    /**
     * Ruft den Wert der sessionHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Legt den Wert der sessionHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Ruft den Wert der rejectedOffers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRejectedOffers() {
        return rejectedOffers;
    }

    /**
     * Legt den Wert der rejectedOffers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRejectedOffers(Integer value) {
        this.rejectedOffers = value;
    }

    /**
     * Ruft den Wert der syncEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncEnabled() {
        return syncEnabled;
    }

    /**
     * Legt den Wert der syncEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncEnabled(Boolean value) {
        this.syncEnabled = value;
    }

    /**
     * Ruft den Wert der tokenRefreshLastAttempted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTokenRefreshLastAttempted() {
        return tokenRefreshLastAttempted;
    }

    /**
     * Legt den Wert der tokenRefreshLastAttempted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTokenRefreshLastAttempted(XMLGregorianCalendar value) {
        this.tokenRefreshLastAttempted = value;
    }

    /**
     * Ruft den Wert der tokenRefreshLastCompleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTokenRefreshLastCompleted() {
        return tokenRefreshLastCompleted;
    }

    /**
     * Legt den Wert der tokenRefreshLastCompleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTokenRefreshLastCompleted(XMLGregorianCalendar value) {
        this.tokenRefreshLastCompleted = value;
    }

    /**
     * Ruft den Wert der psaState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsaState() {
        return psaState;
    }

    /**
     * Legt den Wert der psaState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsaState(String value) {
        this.psaState = value;
    }

    /**
     * Ruft den Wert der sourceEntryID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSourceEntryID() {
        return sourceEntryID;
    }

    /**
     * Legt den Wert der sourceEntryID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSourceEntryID(byte[] value) {
        this.sourceEntryID = value;
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
     * Ruft den Wert der lastSync-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSync() {
        return lastSync;
    }

    /**
     * Legt den Wert der lastSync-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSync(XMLGregorianCalendar value) {
        this.lastSync = value;
    }

}
