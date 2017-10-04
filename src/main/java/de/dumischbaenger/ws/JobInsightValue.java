
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für JobInsightValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JobInsightValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}InsightValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyTicker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyWebsiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLinkedInUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EndUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInsightValue", propOrder = {
    "company",
    "companyDescription",
    "companyTicker",
    "companyLogoUrl",
    "companyWebsiteUrl",
    "companyLinkedInUrl",
    "title",
    "startUtcTicks",
    "endUtcTicks"
})
public class JobInsightValue
    extends InsightValue
{

    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "CompanyDescription")
    protected String companyDescription;
    @XmlElement(name = "CompanyTicker")
    protected String companyTicker;
    @XmlElement(name = "CompanyLogoUrl")
    protected String companyLogoUrl;
    @XmlElement(name = "CompanyWebsiteUrl")
    protected String companyWebsiteUrl;
    @XmlElement(name = "CompanyLinkedInUrl")
    protected String companyLinkedInUrl;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "StartUtcTicks")
    protected Long startUtcTicks;
    @XmlElement(name = "EndUtcTicks")
    protected Long endUtcTicks;

    /**
     * Ruft den Wert der company-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Ruft den Wert der companyDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Legt den Wert der companyDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDescription(String value) {
        this.companyDescription = value;
    }

    /**
     * Ruft den Wert der companyTicker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTicker() {
        return companyTicker;
    }

    /**
     * Legt den Wert der companyTicker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTicker(String value) {
        this.companyTicker = value;
    }

    /**
     * Ruft den Wert der companyLogoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLogoUrl() {
        return companyLogoUrl;
    }

    /**
     * Legt den Wert der companyLogoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLogoUrl(String value) {
        this.companyLogoUrl = value;
    }

    /**
     * Ruft den Wert der companyWebsiteUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWebsiteUrl() {
        return companyWebsiteUrl;
    }

    /**
     * Legt den Wert der companyWebsiteUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWebsiteUrl(String value) {
        this.companyWebsiteUrl = value;
    }

    /**
     * Ruft den Wert der companyLinkedInUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLinkedInUrl() {
        return companyLinkedInUrl;
    }

    /**
     * Legt den Wert der companyLinkedInUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLinkedInUrl(String value) {
        this.companyLinkedInUrl = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der startUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartUtcTicks() {
        return startUtcTicks;
    }

    /**
     * Legt den Wert der startUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartUtcTicks(Long value) {
        this.startUtcTicks = value;
    }

    /**
     * Ruft den Wert der endUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndUtcTicks() {
        return endUtcTicks;
    }

    /**
     * Legt den Wert der endUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndUtcTicks(Long value) {
        this.endUtcTicks = value;
    }

}
