
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeleteFocusedOtherOverrideResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteFocusedOtherOverrideResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Override" type="{http://schemas.microsoft.com/exchange/services/2006/types}InferenceClassificationOverrideType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteFocusedOtherOverrideResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "override"
})
public class DeleteFocusedOtherOverrideResponseType
    extends BaseResponseMessageType
{

    @XmlElement(name = "Override", required = true)
    protected InferenceClassificationOverrideType override;

    /**
     * Ruft den Wert der override-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InferenceClassificationOverrideType }
     *     
     */
    public InferenceClassificationOverrideType getOverride() {
        return override;
    }

    /**
     * Legt den Wert der override-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InferenceClassificationOverrideType }
     *     
     */
    public void setOverride(InferenceClassificationOverrideType value) {
        this.override = value;
    }

}
