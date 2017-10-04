
package de.dumischbaenger.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientAccessTokenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClientAccessTokenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TokenType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenTypeType"/&gt;
 *         &lt;element name="TokenValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TTL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientAccessTokenType", propOrder = {
    "id",
    "tokenType",
    "tokenValue",
    "ttl"
})
public class ClientAccessTokenType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TokenType", required = true)
    @XmlSchemaType(name = "string")
    protected ClientAccessTokenTypeType tokenType;
    @XmlElement(name = "TokenValue", required = true)
    protected String tokenValue;
    @XmlElement(name = "TTL", required = true)
    protected BigInteger ttl;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der tokenType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientAccessTokenTypeType }
     *     
     */
    public ClientAccessTokenTypeType getTokenType() {
        return tokenType;
    }

    /**
     * Legt den Wert der tokenType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAccessTokenTypeType }
     *     
     */
    public void setTokenType(ClientAccessTokenTypeType value) {
        this.tokenType = value;
    }

    /**
     * Ruft den Wert der tokenValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenValue() {
        return tokenValue;
    }

    /**
     * Legt den Wert der tokenValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenValue(String value) {
        this.tokenValue = value;
    }

    /**
     * Ruft den Wert der ttl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTTL() {
        return ttl;
    }

    /**
     * Legt den Wert der ttl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTTL(BigInteger value) {
        this.ttl = value;
    }

}
