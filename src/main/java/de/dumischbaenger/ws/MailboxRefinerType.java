
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxRefinerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxRefinerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchRefinerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailboxDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxRefinerType", propOrder = {
    "mailboxDisplayName"
})
public class MailboxRefinerType
    extends SearchRefinerType
{

    @XmlElement(name = "MailboxDisplayName")
    protected String mailboxDisplayName;

    /**
     * Ruft den Wert der mailboxDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxDisplayName() {
        return mailboxDisplayName;
    }

    /**
     * Legt den Wert der mailboxDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxDisplayName(String value) {
        this.mailboxDisplayName = value;
    }

}
