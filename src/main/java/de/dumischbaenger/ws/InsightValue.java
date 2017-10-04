
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InsightValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InsightValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsightSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsightValue", propOrder = {
    "insightSource",
    "updatedUtcTicks"
})
@XmlSeeAlso({
    StringInsightValue.class,
    DelveDocument.class,
    ProfileInsightValue.class,
    OutOfOfficeInsightValue.class,
    JobInsightValue.class,
    CompanyInsightValue.class,
    UserProfilePicture.class,
    EducationInsightValue.class,
    SkillInsightValue.class,
    MeetingInsightValue.class,
    EmailInsightValue.class,
    ComputedInsightValue.class
})
public class InsightValue {

    @XmlElement(name = "InsightSource")
    protected String insightSource;
    @XmlElement(name = "UpdatedUtcTicks")
    protected Long updatedUtcTicks;

    /**
     * Ruft den Wert der insightSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsightSource() {
        return insightSource;
    }

    /**
     * Legt den Wert der insightSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsightSource(String value) {
        this.insightSource = value;
    }

    /**
     * Ruft den Wert der updatedUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdatedUtcTicks() {
        return updatedUtcTicks;
    }

    /**
     * Legt den Wert der updatedUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdatedUtcTicks(Long value) {
        this.updatedUtcTicks = value;
    }

}
