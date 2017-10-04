
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}FolderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchParameters" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchParametersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFolderType", propOrder = {
    "searchParameters"
})
public class SearchFolderType
    extends FolderType
{

    @XmlElement(name = "SearchParameters")
    protected SearchParametersType searchParameters;

    /**
     * Ruft den Wert der searchParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchParametersType }
     *     
     */
    public SearchParametersType getSearchParameters() {
        return searchParameters;
    }

    /**
     * Legt den Wert der searchParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParametersType }
     *     
     */
    public void setSearchParameters(SearchParametersType value) {
        this.searchParameters = value;
    }

}
