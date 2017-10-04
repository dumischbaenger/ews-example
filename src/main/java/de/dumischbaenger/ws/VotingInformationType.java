
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VotingInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VotingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserOptions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfVotingOptionDataType" minOccurs="0"/&gt;
 *         &lt;element name="VotingResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingInformationType", propOrder = {
    "userOptions",
    "votingResponse"
})
public class VotingInformationType {

    @XmlElement(name = "UserOptions")
    protected ArrayOfVotingOptionDataType userOptions;
    @XmlElement(name = "VotingResponse")
    protected String votingResponse;

    /**
     * Ruft den Wert der userOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVotingOptionDataType }
     *     
     */
    public ArrayOfVotingOptionDataType getUserOptions() {
        return userOptions;
    }

    /**
     * Legt den Wert der userOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVotingOptionDataType }
     *     
     */
    public void setUserOptions(ArrayOfVotingOptionDataType value) {
        this.userOptions = value;
    }

    /**
     * Ruft den Wert der votingResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingResponse() {
        return votingResponse;
    }

    /**
     * Legt den Wert der votingResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotingResponse(String value) {
        this.votingResponse = value;
    }

}
