
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Non indexable item detail.
 *       
 * 
 * <p>Java-Klasse für NonIndexableItemDetailType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonIndexableItemDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="ErrorCode" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIndexErrorType"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsPartiallyIndexed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPermanentFailure" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SortValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AttemptCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LastAttemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonIndexableItemDetailType", propOrder = {
    "itemId",
    "errorCode",
    "errorDescription",
    "isPartiallyIndexed",
    "isPermanentFailure",
    "sortValue",
    "attemptCount",
    "lastAttemptTime",
    "additionalInfo"
})
public class NonIndexableItemDetailType {

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "ErrorCode", required = true)
    @XmlSchemaType(name = "string")
    protected ItemIndexErrorType errorCode;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "IsPartiallyIndexed")
    protected boolean isPartiallyIndexed;
    @XmlElement(name = "IsPermanentFailure")
    protected boolean isPermanentFailure;
    @XmlElement(name = "SortValue", required = true)
    protected String sortValue;
    @XmlElement(name = "AttemptCount")
    protected int attemptCount;
    @XmlElement(name = "LastAttemptTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAttemptTime;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIndexErrorType }
     *     
     */
    public ItemIndexErrorType getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIndexErrorType }
     *     
     */
    public void setErrorCode(ItemIndexErrorType value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Legt den Wert der errorDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Ruft den Wert der isPartiallyIndexed-Eigenschaft ab.
     * 
     */
    public boolean isIsPartiallyIndexed() {
        return isPartiallyIndexed;
    }

    /**
     * Legt den Wert der isPartiallyIndexed-Eigenschaft fest.
     * 
     */
    public void setIsPartiallyIndexed(boolean value) {
        this.isPartiallyIndexed = value;
    }

    /**
     * Ruft den Wert der isPermanentFailure-Eigenschaft ab.
     * 
     */
    public boolean isIsPermanentFailure() {
        return isPermanentFailure;
    }

    /**
     * Legt den Wert der isPermanentFailure-Eigenschaft fest.
     * 
     */
    public void setIsPermanentFailure(boolean value) {
        this.isPermanentFailure = value;
    }

    /**
     * Ruft den Wert der sortValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortValue() {
        return sortValue;
    }

    /**
     * Legt den Wert der sortValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortValue(String value) {
        this.sortValue = value;
    }

    /**
     * Ruft den Wert der attemptCount-Eigenschaft ab.
     * 
     */
    public int getAttemptCount() {
        return attemptCount;
    }

    /**
     * Legt den Wert der attemptCount-Eigenschaft fest.
     * 
     */
    public void setAttemptCount(int value) {
        this.attemptCount = value;
    }

    /**
     * Ruft den Wert der lastAttemptTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAttemptTime() {
        return lastAttemptTime;
    }

    /**
     * Legt den Wert der lastAttemptTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAttemptTime(XMLGregorianCalendar value) {
        this.lastAttemptTime = value;
    }

    /**
     * Ruft den Wert der additionalInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Legt den Wert der additionalInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
