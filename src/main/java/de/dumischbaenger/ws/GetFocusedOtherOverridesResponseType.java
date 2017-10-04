
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetFocusedOtherOverridesResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetFocusedOtherOverridesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Overrides" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInferenceClassificationOverridesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFocusedOtherOverridesResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "overrides"
})
public class GetFocusedOtherOverridesResponseType
    extends BaseResponseMessageType
{

    @XmlElement(name = "Overrides", required = true)
    protected ArrayOfInferenceClassificationOverridesType overrides;

    /**
     * Ruft den Wert der overrides-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInferenceClassificationOverridesType }
     *     
     */
    public ArrayOfInferenceClassificationOverridesType getOverrides() {
        return overrides;
    }

    /**
     * Legt den Wert der overrides-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInferenceClassificationOverridesType }
     *     
     */
    public void setOverrides(ArrayOfInferenceClassificationOverridesType value) {
        this.overrides = value;
    }

}
