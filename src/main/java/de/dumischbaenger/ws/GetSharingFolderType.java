
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetSharingFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSharingFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="DataType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SharingDataType" minOccurs="0"/&gt;
 *         &lt;element name="SharedFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharingFolderType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "smtpAddress",
    "dataType",
    "sharedFolderId"
})
public class GetSharingFolderType
    extends BaseRequestType
{

    @XmlElement(name = "SmtpAddress", required = true)
    protected String smtpAddress;
    @XmlElement(name = "DataType")
    @XmlSchemaType(name = "string")
    protected SharingDataType dataType;
    @XmlElement(name = "SharedFolderId")
    protected String sharedFolderId;

    /**
     * Ruft den Wert der smtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Legt den Wert der smtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddress(String value) {
        this.smtpAddress = value;
    }

    /**
     * Ruft den Wert der dataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SharingDataType }
     *     
     */
    public SharingDataType getDataType() {
        return dataType;
    }

    /**
     * Legt den Wert der dataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingDataType }
     *     
     */
    public void setDataType(SharingDataType value) {
        this.dataType = value;
    }

    /**
     * Ruft den Wert der sharedFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedFolderId() {
        return sharedFolderId;
    }

    /**
     * Legt den Wert der sharedFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedFolderId(String value) {
        this.sharedFolderId = value;
    }

}
