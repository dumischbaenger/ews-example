
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetInboxRulesResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetInboxRulesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutlookRuleBlobExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InboxRules" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRulesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInboxRulesResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "outlookRuleBlobExists",
    "inboxRules"
})
public class GetInboxRulesResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "OutlookRuleBlobExists")
    protected Boolean outlookRuleBlobExists;
    @XmlElement(name = "InboxRules")
    protected ArrayOfRulesType inboxRules;

    /**
     * Ruft den Wert der outlookRuleBlobExists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutlookRuleBlobExists() {
        return outlookRuleBlobExists;
    }

    /**
     * Legt den Wert der outlookRuleBlobExists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutlookRuleBlobExists(Boolean value) {
        this.outlookRuleBlobExists = value;
    }

    /**
     * Ruft den Wert der inboxRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRulesType }
     *     
     */
    public ArrayOfRulesType getInboxRules() {
        return inboxRules;
    }

    /**
     * Legt den Wert der inboxRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRulesType }
     *     
     */
    public void setInboxRules(ArrayOfRulesType value) {
        this.inboxRules = value;
    }

}
