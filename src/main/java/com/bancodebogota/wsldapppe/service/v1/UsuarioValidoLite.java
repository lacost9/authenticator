
package com.bancodebogota.wsldapppe.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarioValidoLite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioValidoLite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dominio" type="{http://bancodebogota.com/WSLdapPPE/service/v1}dominioLite" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="estadoPortal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grupos" type="{http://bancodebogota.com/WSLdapPPE/service/v1}grupoLite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opciones" type="{http://bancodebogota.com/WSLdapPPE/service/v1}opcionLite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ppe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roles" type="{http://bancodebogota.com/WSLdapPPE/service/v1}rolLite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioValidoLite", propOrder = {
    "dominio",
    "email",
    "estado",
    "estadoPortal",
    "grupos",
    "id",
    "identificacion",
    "ip",
    "nombre",
    "opciones",
    "ppe",
    "roles",
    "sid"
})
public class UsuarioValidoLite {

    protected DominioLite dominio;
    protected String email;
    protected int estado;
    protected int estadoPortal;
    @XmlElement(nillable = true)
    protected List<GrupoLite> grupos;
    protected String id;
    protected String identificacion;
    protected String ip;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<OpcionLite> opciones;
    protected String ppe;
    @XmlElement(nillable = true)
    protected List<RolLite> roles;
    protected String sid;

    /**
     * Obtiene el valor de la propiedad dominio.
     * 
     * @return
     *     possible object is
     *     {@link DominioLite }
     *     
     */
    public DominioLite getDominio() {
        return dominio;
    }

    /**
     * Define el valor de la propiedad dominio.
     * 
     * @param value
     *     allowed object is
     *     {@link DominioLite }
     *     
     */
    public void setDominio(DominioLite value) {
        this.dominio = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoPortal.
     * 
     */
    public int getEstadoPortal() {
        return estadoPortal;
    }

    /**
     * Define el valor de la propiedad estadoPortal.
     * 
     */
    public void setEstadoPortal(int value) {
        this.estadoPortal = value;
    }

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

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the opciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpcionLite }
     * 
     * 
     */
    public List<OpcionLite> getOpciones() {
        if (opciones == null) {
            opciones = new ArrayList<OpcionLite>();
        }
        return this.opciones;
    }

    /**
     * Obtiene el valor de la propiedad ppe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpe() {
        return ppe;
    }

    /**
     * Define el valor de la propiedad ppe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpe(String value) {
        this.ppe = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolLite }
     * 
     * 
     */
    public List<RolLite> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RolLite>();
        }
        return this.roles;
    }

    /**
     * Obtiene el valor de la propiedad sid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Define el valor de la propiedad sid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

}
