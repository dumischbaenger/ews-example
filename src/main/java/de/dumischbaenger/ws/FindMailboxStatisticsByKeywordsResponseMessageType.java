
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the FindMailboxStatisticsByKeywords web method.
 *       
 * 
 * <p>Java-Klasse für FindMailboxStatisticsByKeywordsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMailboxStatisticsByKeywordsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailboxStatisticsSearchResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxStatisticsSearchResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMailboxStatisticsByKeywordsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxStatisticsSearchResult"
})
public class FindMailboxStatisticsByKeywordsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MailboxStatisticsSearchResult", required = true)
    protected MailboxStatisticsSearchResultType mailboxStatisticsSearchResult;

    /**
     * Ruft den Wert der mailboxStatisticsSearchResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxStatisticsSearchResultType }
     *     
     */
    public MailboxStatisticsSearchResultType getMailboxStatisticsSearchResult() {
        return mailboxStatisticsSearchResult;
    }

    /**
     * Legt den Wert der mailboxStatisticsSearchResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxStatisticsSearchResultType }
     *     
     */
    public void setMailboxStatisticsSearchResult(MailboxStatisticsSearchResultType value) {
        this.mailboxStatisticsSearchResult = value;
    }

}
