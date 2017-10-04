
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrimaryMailboxSearchScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrimaryMailboxSearchScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchFolderScopeType" minOccurs="0"/&gt;
 *         &lt;element name="IsDeepTraversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryMailboxSearchScopeType", propOrder = {
    "folderScope",
    "isDeepTraversal"
})
public class PrimaryMailboxSearchScopeType {

    @XmlElement(name = "FolderScope")
    protected SearchFolderScopeType folderScope;
    @XmlElement(name = "IsDeepTraversal")
    protected Boolean isDeepTraversal;

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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeepTraversal() {
        return isDeepTraversal;
    }

    /**
     * Legt den Wert der isDeepTraversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeepTraversal(Boolean value) {
        this.isDeepTraversal = value;
    }

}
