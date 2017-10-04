
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EncryptedSharedFolderDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EncryptedSharedFolderDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Token" type="{http://schemas.microsoft.com/exchange/services/2006/types}EncryptedDataContainerType"/&gt;
 *         &lt;element name="Data" type="{http://schemas.microsoft.com/exchange/services/2006/types}EncryptedDataContainerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedSharedFolderDataType", propOrder = {
    "token",
    "data"
})
public class EncryptedSharedFolderDataType {

    @XmlElement(name = "Token", required = true)
    protected EncryptedDataContainerType token;
    @XmlElement(name = "Data", required = true)
    protected EncryptedDataContainerType data;

    /**
     * Ruft den Wert der token-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataContainerType }
     *     
     */
    public EncryptedDataContainerType getToken() {
        return token;
    }

    /**
     * Legt den Wert der token-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataContainerType }
     *     
     */
    public void setToken(EncryptedDataContainerType value) {
        this.token = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataContainerType }
     *     
     */
    public EncryptedDataContainerType getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataContainerType }
     *     
     */
    public void setData(EncryptedDataContainerType value) {
        this.data = value;
    }

}
