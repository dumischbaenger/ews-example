
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindPeopleResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindPeopleResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="People" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleType" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfPeopleInView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FirstMatchingRowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FirstLoadedRowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPeopleResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "people",
    "totalNumberOfPeopleInView",
    "firstMatchingRowIndex",
    "firstLoadedRowIndex",
    "transactionId"
})
public class FindPeopleResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "People")
    protected ArrayOfPeopleType people;
    @XmlElement(name = "TotalNumberOfPeopleInView")
    protected Integer totalNumberOfPeopleInView;
    @XmlElement(name = "FirstMatchingRowIndex")
    protected Integer firstMatchingRowIndex;
    @XmlElement(name = "FirstLoadedRowIndex")
    protected Integer firstLoadedRowIndex;
    @XmlElement(name = "TransactionId")
    protected String transactionId;

    /**
     * Ruft den Wert der people-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public ArrayOfPeopleType getPeople() {
        return people;
    }

    /**
     * Legt den Wert der people-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeopleType }
     *     
     */
    public void setPeople(ArrayOfPeopleType value) {
        this.people = value;
    }

    /**
     * Ruft den Wert der totalNumberOfPeopleInView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfPeopleInView() {
        return totalNumberOfPeopleInView;
    }

    /**
     * Legt den Wert der totalNumberOfPeopleInView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfPeopleInView(Integer value) {
        this.totalNumberOfPeopleInView = value;
    }

    /**
     * Ruft den Wert der firstMatchingRowIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstMatchingRowIndex() {
        return firstMatchingRowIndex;
    }

    /**
     * Legt den Wert der firstMatchingRowIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstMatchingRowIndex(Integer value) {
        this.firstMatchingRowIndex = value;
    }

    /**
     * Ruft den Wert der firstLoadedRowIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstLoadedRowIndex() {
        return firstLoadedRowIndex;
    }

    /**
     * Legt den Wert der firstLoadedRowIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstLoadedRowIndex(Integer value) {
        this.firstLoadedRowIndex = value;
    }

    /**
     * Ruft den Wert der transactionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Legt den Wert der transactionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
