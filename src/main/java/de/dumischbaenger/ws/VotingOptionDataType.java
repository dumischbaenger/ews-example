
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VotingOptionDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VotingOptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendPrompt" type="{http://schemas.microsoft.com/exchange/services/2006/types}SendPromptType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingOptionDataType", propOrder = {
    "displayName",
    "sendPrompt"
})
public class VotingOptionDataType {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "SendPrompt")
    @XmlSchemaType(name = "string")
    protected SendPromptType sendPrompt;

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der sendPrompt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendPromptType }
     *     
     */
    public SendPromptType getSendPrompt() {
        return sendPrompt;
    }

    /**
     * Legt den Wert der sendPrompt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendPromptType }
     *     
     */
    public void setSendPrompt(SendPromptType value) {
        this.sendPrompt = value;
    }

}
