
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailbox statistics search result.
 *       
 * 
 * <p>Java-Klasse für MailboxStatisticsSearchResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxStatisticsSearchResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserMailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserMailboxType"/&gt;
 *         &lt;element name="KeywordStatisticsSearchResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}KeywordStatisticsSearchResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxStatisticsSearchResultType", propOrder = {
    "userMailbox",
    "keywordStatisticsSearchResult"
})
public class MailboxStatisticsSearchResultType {

    @XmlElement(name = "UserMailbox", required = true)
    protected UserMailboxType userMailbox;
    @XmlElement(name = "KeywordStatisticsSearchResult")
    protected KeywordStatisticsSearchResultType keywordStatisticsSearchResult;

    /**
     * Ruft den Wert der userMailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserMailboxType }
     *     
     */
    public UserMailboxType getUserMailbox() {
        return userMailbox;
    }

    /**
     * Legt den Wert der userMailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserMailboxType }
     *     
     */
    public void setUserMailbox(UserMailboxType value) {
        this.userMailbox = value;
    }

    /**
     * Ruft den Wert der keywordStatisticsSearchResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeywordStatisticsSearchResultType }
     *     
     */
    public KeywordStatisticsSearchResultType getKeywordStatisticsSearchResult() {
        return keywordStatisticsSearchResult;
    }

    /**
     * Legt den Wert der keywordStatisticsSearchResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordStatisticsSearchResultType }
     *     
     */
    public void setKeywordStatisticsSearchResult(KeywordStatisticsSearchResultType value) {
        this.keywordStatisticsSearchResult = value;
    }

}
