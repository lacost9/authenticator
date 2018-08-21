
package com.bancodebogota.wsldapppe.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaGruposLite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaGruposLite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://bancodebogota.com/WSLdapPPE/service/v1}respuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grupos" type="{http://bancodebogota.com/WSLdapPPE/service/v1}grupoLite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaGruposLite", propOrder = {
    "grupos"
})
public class RespuestaGruposLite
    extends Respuesta
{

    @XmlElement(nillable = true)
    protected List<GrupoLite> grupos;

    /**
     * Gets the value of the grupos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoLite }
     * 
     * 
     */
    public List<GrupoLite> getGrupos() {
        if (grupos == null) {
            grupos = new ArrayList<GrupoLite>();
        }
        return this.grupos;
    }

}
