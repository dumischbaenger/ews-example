
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Pair of query and a set of mailbox search scopes.
 *       
 * 
 * <p>Java-Klasse für MailboxQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailboxSearchScopes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxSearchScopesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxQueryType", propOrder = {
    "query",
    "mailboxSearchScopes"
})
public class MailboxQueryType {

    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "MailboxSearchScopes", required = true)
    protected NonEmptyArrayOfMailboxSearchScopesType mailboxSearchScopes;

    /**
     * Ruft den Wert der query-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Legt den Wert der query-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Ruft den Wert der mailboxSearchScopes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfMailboxSearchScopesType }
     *     
     */
    public NonEmptyArrayOfMailboxSearchScopesType getMailboxSearchScopes() {
        return mailboxSearchScopes;
    }

    /**
     * Legt den Wert der mailboxSearchScopes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfMailboxSearchScopesType }
     *     
     */
    public void setMailboxSearchScopes(NonEmptyArrayOfMailboxSearchScopesType value) {
        this.mailboxSearchScopes = value;
    }

}
