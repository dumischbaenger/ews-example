
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResolveNamesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResolveNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentFolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType" minOccurs="0"/&gt;
 *         &lt;element name="UnresolvedEntry" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnFullContactData" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResolveNamesSearchScopeType" default="ActiveDirectoryContacts" /&gt;
 *       &lt;attribute name="ContactDataShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}DefaultShapeNamesType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveNamesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "parentFolderIds",
    "unresolvedEntry"
})
public class ResolveNamesType
    extends BaseRequestType
{

    @XmlElement(name = "ParentFolderIds")
    protected NonEmptyArrayOfBaseFolderIdsType parentFolderIds;
    @XmlElement(name = "UnresolvedEntry", required = true)
    protected String unresolvedEntry;
    @XmlAttribute(name = "ReturnFullContactData", required = true)
    protected boolean returnFullContactData;
    @XmlAttribute(name = "SearchScope")
    protected ResolveNamesSearchScopeType searchScope;
    @XmlAttribute(name = "ContactDataShape")
    protected DefaultShapeNamesType contactDataShape;

    /**
     * Ruft den Wert der parentFolderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getParentFolderIds() {
        return parentFolderIds;
    }

    /**
     * Legt den Wert der parentFolderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setParentFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.parentFolderIds = value;
    }

    /**
     * Ruft den Wert der unresolvedEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnresolvedEntry() {
        return unresolvedEntry;
    }

    /**
     * Legt den Wert der unresolvedEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnresolvedEntry(String value) {
        this.unresolvedEntry = value;
    }

    /**
     * Ruft den Wert der returnFullContactData-Eigenschaft ab.
     * 
     */
    public boolean isReturnFullContactData() {
        return returnFullContactData;
    }

    /**
     * Legt den Wert der returnFullContactData-Eigenschaft fest.
     * 
     */
    public void setReturnFullContactData(boolean value) {
        this.returnFullContactData = value;
    }

    /**
     * Ruft den Wert der searchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResolveNamesSearchScopeType }
     *     
     */
    public ResolveNamesSearchScopeType getSearchScope() {
        if (searchScope == null) {
            return ResolveNamesSearchScopeType.ACTIVE_DIRECTORY_CONTACTS;
        } else {
            return searchScope;
        }
    }

    /**
     * Legt den Wert der searchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolveNamesSearchScopeType }
     *     
     */
    public void setSearchScope(ResolveNamesSearchScopeType value) {
        this.searchScope = value;
    }

    /**
     * Ruft den Wert der contactDataShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public DefaultShapeNamesType getContactDataShape() {
        return contactDataShape;
    }

    /**
     * Legt den Wert der contactDataShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public void setContactDataShape(DefaultShapeNamesType value) {
        this.contactDataShape = value;
    }

}
