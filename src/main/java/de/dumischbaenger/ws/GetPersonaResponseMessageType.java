
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetPersonaResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetPersonaResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonaResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "persona"
})
public class GetPersonaResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Persona", required = true)
    protected PersonaType persona;

    /**
     * Ruft den Wert der persona-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonaType }
     *     
     */
    public PersonaType getPersona() {
        return persona;
    }

    /**
     * Legt den Wert der persona-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaType }
     *     
     */
    public void setPersona(PersonaType value) {
        this.persona = value;
    }

}
