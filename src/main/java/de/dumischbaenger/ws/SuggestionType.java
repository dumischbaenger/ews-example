
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SuggestionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuggestionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuggestedQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SuggestionType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionKindType"/&gt;
 *         &lt;element name="Trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TDSuggestionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsDeletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionType", propOrder = {
    "suggestedQuery",
    "displayText",
    "suggestionType",
    "trigger",
    "tdSuggestionId",
    "isDeletable"
})
@XmlSeeAlso({
    PeopleSuggestionType.class,
    FileSuggestionType.class
})
public class SuggestionType {

    @XmlElement(name = "SuggestedQuery", required = true)
    protected String suggestedQuery;
    @XmlElement(name = "DisplayText", required = true)
    protected String displayText;
    @XmlList
    @XmlElement(name = "SuggestionType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> suggestionType;
    @XmlElement(name = "Trigger")
    protected String trigger;
    @XmlElement(name = "TDSuggestionId")
    protected int tdSuggestionId;
    @XmlElement(name = "IsDeletable")
    protected boolean isDeletable;

    /**
     * Ruft den Wert der suggestedQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedQuery() {
        return suggestedQuery;
    }

    /**
     * Legt den Wert der suggestedQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedQuery(String value) {
        this.suggestedQuery = value;
    }

    /**
     * Ruft den Wert der displayText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Legt den Wert der displayText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the suggestionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuggestionType() {
        if (suggestionType == null) {
            suggestionType = new ArrayList<String>();
        }
        return this.suggestionType;
    }

    /**
     * Ruft den Wert der trigger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Legt den Wert der trigger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Ruft den Wert der tdSuggestionId-Eigenschaft ab.
     * 
     */
    public int getTDSuggestionId() {
        return tdSuggestionId;
    }

    /**
     * Legt den Wert der tdSuggestionId-Eigenschaft fest.
     * 
     */
    public void setTDSuggestionId(int value) {
        this.tdSuggestionId = value;
    }

    /**
     * Ruft den Wert der isDeletable-Eigenschaft ab.
     * 
     */
    public boolean isIsDeletable() {
        return isDeletable;
    }

    /**
     * Legt den Wert der isDeletable-Eigenschaft fest.
     * 
     */
    public void setIsDeletable(boolean value) {
        this.isDeletable = value;
    }

}
