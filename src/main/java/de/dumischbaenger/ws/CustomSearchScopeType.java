
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r CustomSearchScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomSearchScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="FolderScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchFolderScopeType"/&gt;
 *         &lt;element name="IsDeepTraversal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSearchScopeType", propOrder = {
    "mailboxGuid",
    "folderScope",
    "isDeepTraversal"
})
public class CustomSearchScopeType {

    @XmlElement(name = "MailboxGuid", required = true)
    protected String mailboxGuid;
    @XmlElement(name = "FolderScope", required = true)
    protected SearchFolderScopeType folderScope;
    @XmlElement(name = "IsDeepTraversal")
    protected boolean isDeepTraversal;

    /**
     * Ruft den Wert der mailboxGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxGuid() {
        return mailboxGuid;
    }

    /**
     * Legt den Wert der mailboxGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxGuid(String value) {
        this.mailboxGuid = value;
    }

    /**
     * Ruft den Wert der folderScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchFolderScopeType }
     *     
     */
    public SearchFolderScopeType getFolderScope() {
        return folderScope;
    }

    /**
     * Legt den Wert der folderScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFolderScopeType }
     *     
     */
    public void setFolderScope(SearchFolderScopeType value) {
        this.folderScope = value;
    }

    /**
     * Ruft den Wert der isDeepTraversal-Eigenschaft ab.
     * 
     */
    public boolean isIsDeepTraversal() {
        return isDeepTraversal;
    }

    /**
     * Legt den Wert der isDeepTraversal-Eigenschaft fest.
     * 
     */
    public void setIsDeepTraversal(boolean value) {
        this.isDeepTraversal = value;
    }

}
