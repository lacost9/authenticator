
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoOpcion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuario", propOrder = {
    "usuarioNT",
    "tipoOpcion"
})
public class GetUsuario {

    @XmlElement(name = "UsuarioNT")
    protected String usuarioNT;
    @XmlElement(name = "TipoOpcion")
    protected int tipoOpcion;

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

    /**
     * Obtiene el valor de la propiedad tipoOpcion.
     * 
     */
    public int getTipoOpcion() {
        return tipoOpcion;
    }

    /**
     * Define el valor de la propiedad tipoOpcion.
     * 
     */
    public void setTipoOpcion(int value) {
        this.tipoOpcion = value;
    }

}
