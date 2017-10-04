
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddNewImContactToGroupResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddNewImContactToGroupResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNewImContactToGroupResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "persona"
})
public class AddNewImContactToGroupResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Persona")
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
