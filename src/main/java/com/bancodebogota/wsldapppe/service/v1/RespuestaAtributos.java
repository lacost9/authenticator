
package com.bancodebogota.wsldapppe.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaAtributos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaAtributos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://bancodebogota.com/WSLdapPPE/service/v1}respuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atributos" type="{http://bancodebogota.com/WSLdapPPE/service/v1}atributosLdap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaAtributos", propOrder = {
    "atributos"
})
public class RespuestaAtributos
    extends Respuesta
{

    @XmlElement(nillable = true)
    protected List<AtributosLdap> atributos;

    /**
     * Gets the value of the atributos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atributos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtributos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtributosLdap }
     * 
     * 
     */
    public List<AtributosLdap> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<AtributosLdap>();
        }
        return this.atributos;
    }

}
