
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerOpcionesByTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerOpcionesByTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoOpcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerOpcionesByTipo", propOrder = {
    "tipoOpcion"
})
public class ObtenerOpcionesByTipo {

    @XmlElement(name = "TipoOpcion")
    protected String tipoOpcion;

    /**
     * Obtiene el valor de la propiedad tipoOpcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOpcion() {
        return tipoOpcion;
    }

    /**
     * Define el valor de la propiedad tipoOpcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOpcion(String value) {
        this.tipoOpcion = value;
    }

}
