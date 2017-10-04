
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserPhotoResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserPhotoResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PictureData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserPhotoResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "hasChanged",
    "pictureData"
})
public class GetUserPhotoResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "HasChanged")
    protected boolean hasChanged;
    @XmlElement(name = "PictureData")
    protected byte[] pictureData;

    /**
     * Ruft den Wert der hasChanged-Eigenschaft ab.
     * 
     */
    public boolean isHasChanged() {
        return hasChanged;
    }

    /**
     * Legt den Wert der hasChanged-Eigenschaft fest.
     * 
     */
    public void setHasChanged(boolean value) {
        this.hasChanged = value;
    }

    /**
     * Ruft den Wert der pictureData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPictureData() {
        return pictureData;
    }

    /**
     * Legt den Wert der pictureData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPictureData(byte[] value) {
        this.pictureData = value;
    }

}
