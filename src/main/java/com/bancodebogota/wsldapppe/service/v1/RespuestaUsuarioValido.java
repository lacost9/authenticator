
package com.bancodebogota.wsldapppe.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaUsuarioValido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaUsuarioValido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://bancodebogota.com/WSLdapPPE/service/v1}respuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://bancodebogota.com/WSLdapPPE/service/v1}usuarioValidoLite" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaUsuarioValido", propOrder = {
    "usuario"
})
public class RespuestaUsuarioValido
    extends Respuesta
{

    protected UsuarioValidoLite usuario;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioValidoLite }
     *     
     */
    public UsuarioValidoLite getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioValidoLite }
     *     
     */
    public void setUsuario(UsuarioValidoLite value) {
        this.usuario = value;
    }

}
