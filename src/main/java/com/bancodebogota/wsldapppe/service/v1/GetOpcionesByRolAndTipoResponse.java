
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getOpcionesByRolAndTipoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getOpcionesByRolAndTipoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://bancodebogota.com/WSLdapPPE/service/v1}respuestaOpcionesByRol" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOpcionesByRolAndTipoResponse", propOrder = {
    "_return"
})
public class GetOpcionesByRolAndTipoResponse {

    @XmlElement(name = "return")
    protected RespuestaOpcionesByRol _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaOpcionesByRol }
     *     
     */
    public RespuestaOpcionesByRol getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaOpcionesByRol }
     *     
     */
    public void setReturn(RespuestaOpcionesByRol value) {
        this._return = value;
    }

}
