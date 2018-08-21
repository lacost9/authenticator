
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuarioConOpcionesXCarpetaSegunRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuarioConOpcionesXCarpetaSegunRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdOpcionPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuarioConOpcionesXCarpetaSegunRol", propOrder = {
    "usuarioNT",
    "idOpcionPadre"
})
public class GetUsuarioConOpcionesXCarpetaSegunRol {

    @XmlElement(name = "UsuarioNT")
    protected String usuarioNT;
    @XmlElement(name = "IdOpcionPadre")
    protected String idOpcionPadre;

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
     * Obtiene el valor de la propiedad idOpcionPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOpcionPadre() {
        return idOpcionPadre;
    }

    /**
     * Define el valor de la propiedad idOpcionPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOpcionPadre(String value) {
        this.idOpcionPadre = value;
    }

}
