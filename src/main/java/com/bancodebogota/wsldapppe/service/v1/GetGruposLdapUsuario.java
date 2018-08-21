
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGruposLdapUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGruposLdapUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGruposLdapUsuario", propOrder = {
    "usuarioNT"
})
public class GetGruposLdapUsuario {

    @XmlElement(name = "UsuarioNT")
    protected String usuarioNT;

    /**
     * Obtiene el valor de la propiedad usuarioNT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioNT() {
        return usuarioNT;
    }

    /**
     * Define el valor de la propiedad usuarioNT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioNT(String value) {
        this.usuarioNT = value;
    }

}
