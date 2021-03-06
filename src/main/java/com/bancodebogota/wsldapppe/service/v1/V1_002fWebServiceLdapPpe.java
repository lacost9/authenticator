package com.bancodebogota.wsldapppe.service.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2018-08-21T16:25:03.372-05:00
 * Generated source version: 3.1.0
 * 
 */
@WebService(targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", name = "v1/WebServiceLdapPpe")
@XmlSeeAlso({ObjectFactory.class})
public interface V1_002fWebServiceLdapPpe {

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuariosDeGrupoRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuariosDeGrupoResponse")
    @RequestWrapper(localName = "getUsuariosDeGrupo", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuariosDeGrupo")
    @ResponseWrapper(localName = "getUsuariosDeGrupoResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuariosDeGrupoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaUsuariosDeGrupo getUsuariosDeGrupo(
        @WebParam(name = "NombreGrupo", targetNamespace = "")
        java.lang.String nombreGrupo
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerRolesByGrupoRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerRolesByGrupoResponse")
    @RequestWrapper(localName = "obtenerRolesByGrupo", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerRolesByGrupo")
    @ResponseWrapper(localName = "obtenerRolesByGrupoResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerRolesByGrupoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaRolesLite obtenerRolesByGrupo(
        @WebParam(name = "idGrupo", targetNamespace = "")
        java.lang.String idGrupo
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerGruposPortalRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerGruposPortalResponse")
    @RequestWrapper(localName = "obtenerGruposPortal", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerGruposPortal")
    @ResponseWrapper(localName = "obtenerGruposPortalResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerGruposPortalResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaGruposLite obtenerGruposPortal();

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByIdRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByIdResponse")
    @RequestWrapper(localName = "getAtributosLdapById", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapById")
    @ResponseWrapper(localName = "getAtributosLdapByIdResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaAtributos getAtributosLdapById(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getRolesUsuarioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getRolesUsuarioResponse")
    @RequestWrapper(localName = "getRolesUsuario", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetRolesUsuario")
    @ResponseWrapper(localName = "getRolesUsuarioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetRolesUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaRolesLite getRolesUsuario(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getGruposLdapUsuarioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getGruposLdapUsuarioResponse")
    @RequestWrapper(localName = "getGruposLdapUsuario", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetGruposLdapUsuario")
    @ResponseWrapper(localName = "getGruposLdapUsuarioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetGruposLdapUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaGruposLite getGruposLdapUsuario(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionByCodigoRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionByCodigoResponse")
    @RequestWrapper(localName = "obtenerOpcionByCodigo", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionByCodigo")
    @ResponseWrapper(localName = "obtenerOpcionByCodigoResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionByCodigoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesLite obtenerOpcionByCodigo(
        @WebParam(name = "CodigoOpcion", targetNamespace = "")
        java.lang.String codigoOpcion
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getOpcionesByRolAndTipoRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getOpcionesByRolAndTipoResponse")
    @RequestWrapper(localName = "getOpcionesByRolAndTipo", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetOpcionesByRolAndTipo")
    @ResponseWrapper(localName = "getOpcionesByRolAndTipoResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetOpcionesByRolAndTipoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesByRol getOpcionesByRolAndTipo(
        @WebParam(name = "IdRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "Tipo", targetNamespace = "")
        int tipo
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuarioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuarioResponse")
    @RequestWrapper(localName = "getUsuario", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuario")
    @ResponseWrapper(localName = "getUsuarioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaUsuarioValido getUsuario(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT,
        @WebParam(name = "TipoOpcion", targetNamespace = "")
        int tipoOpcion
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getOpcionesByRolRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getOpcionesByRolResponse")
    @RequestWrapper(localName = "getOpcionesByRol", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetOpcionesByRol")
    @ResponseWrapper(localName = "getOpcionesByRolResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetOpcionesByRolResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesByRol getOpcionesByRol(
        @WebParam(name = "IdRol", targetNamespace = "")
        java.lang.String idRol
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getEmailUsuarioNtRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getEmailUsuarioNtResponse")
    @RequestWrapper(localName = "getEmailUsuarioNt", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetEmailUsuarioNt")
    @ResponseWrapper(localName = "getEmailUsuarioNtResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetEmailUsuarioNtResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaValor getEmailUsuarioNt(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByNtDominioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByNtDominioResponse")
    @RequestWrapper(localName = "getAtributosLdapByNtDominio", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByNtDominio")
    @ResponseWrapper(localName = "getAtributosLdapByNtDominioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByNtDominioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaAtributos getAtributosLdapByNtDominio(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "dominio", targetNamespace = "")
        java.lang.String dominio
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getGruposUsuarioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getGruposUsuarioResponse")
    @RequestWrapper(localName = "getGruposUsuario", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetGruposUsuario")
    @ResponseWrapper(localName = "getGruposUsuarioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetGruposUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaGruposLite getGruposUsuario(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByTipoRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByTipoResponse")
    @RequestWrapper(localName = "obtenerOpcionesByTipo", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByTipo")
    @ResponseWrapper(localName = "obtenerOpcionesByTipoResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByTipoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesLite obtenerOpcionesByTipo(
        @WebParam(name = "TipoOpcion", targetNamespace = "")
        java.lang.String tipoOpcion
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByNtRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByNtResponse")
    @RequestWrapper(localName = "getAtributosLdapByNt", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByNt")
    @ResponseWrapper(localName = "getAtributosLdapByNtResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByNtResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaAtributos getAtributosLdapByNt(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByListaCodigosRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByListaCodigosResponse")
    @RequestWrapper(localName = "obtenerOpcionesByListaCodigos", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByListaCodigos")
    @ResponseWrapper(localName = "obtenerOpcionesByListaCodigosResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByListaCodigosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesLite obtenerOpcionesByListaCodigos(
        @WebParam(name = "CodigosOpcion", targetNamespace = "")
        java.util.List<java.lang.String> codigosOpcion
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuariosDeRolRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuariosDeRolResponse")
    @RequestWrapper(localName = "getUsuariosDeRol", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuariosDeRol")
    @ResponseWrapper(localName = "getUsuariosDeRolResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuariosDeRolResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaUsuariosDeGrupo getUsuariosDeRol(
        @WebParam(name = "NombreRol", targetNamespace = "")
        java.lang.String nombreRol
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerDominiosRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerDominiosResponse")
    @RequestWrapper(localName = "obtenerDominios", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerDominios")
    @ResponseWrapper(localName = "obtenerDominiosResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerDominiosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaDominiosLite obtenerDominios();

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/autenticarUsuarioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/autenticarUsuarioResponse")
    @RequestWrapper(localName = "autenticarUsuario", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.AutenticarUsuario")
    @ResponseWrapper(localName = "autenticarUsuarioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.AutenticarUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaAutenticaUsuario autenticarUsuario(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT,
        @WebParam(name = "Clave", targetNamespace = "")
        java.lang.String clave,
        @WebParam(name = "IdDominio", targetNamespace = "")
        java.lang.String idDominio
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByCodigoCarpetaRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesByCodigoCarpetaResponse")
    @RequestWrapper(localName = "obtenerOpcionesByCodigoCarpeta", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByCodigoCarpeta")
    @ResponseWrapper(localName = "obtenerOpcionesByCodigoCarpetaResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesByCodigoCarpetaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesLite obtenerOpcionesByCodigoCarpeta(
        @WebParam(name = "CodigoOpcion", targetNamespace = "")
        java.lang.String codigoOpcion
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerRolesPortalRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerRolesPortalResponse")
    @RequestWrapper(localName = "obtenerRolesPortal", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerRolesPortal")
    @ResponseWrapper(localName = "obtenerRolesPortalResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerRolesPortalResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaRolesLite obtenerRolesPortal();

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByIdDominioRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getAtributosLdapByIdDominioResponse")
    @RequestWrapper(localName = "getAtributosLdapByIdDominio", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByIdDominio")
    @ResponseWrapper(localName = "getAtributosLdapByIdDominioResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetAtributosLdapByIdDominioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaAtributos getAtributosLdapByIdDominio(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "dominio", targetNamespace = "")
        java.lang.String dominio
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuarioConOpcionesXCarpetaSegunRolRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuarioConOpcionesXCarpetaSegunRolResponse")
    @RequestWrapper(localName = "getUsuarioConOpcionesXCarpetaSegunRol", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuarioConOpcionesXCarpetaSegunRol")
    @ResponseWrapper(localName = "getUsuarioConOpcionesXCarpetaSegunRolResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuarioConOpcionesXCarpetaSegunRolResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaUsuarioValido getUsuarioConOpcionesXCarpetaSegunRol(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT,
        @WebParam(name = "IdOpcionPadre", targetNamespace = "")
        java.lang.String idOpcionPadre
    );

    @WebMethod(operationName = "getUsuario_2")
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuario_2Request", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/getUsuario_2Response")
    @RequestWrapper(localName = "getUsuario_2", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuario2")
    @ResponseWrapper(localName = "getUsuario_2Response", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.GetUsuario2Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaUsuarioValido getUsuario2(
        @WebParam(name = "UsuarioNT", targetNamespace = "")
        java.lang.String usuarioNT
    );

    @WebMethod
    @Action(input = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesPortalRequest", output = "http://bancodebogota.com/WSLdapPPE/service/v1/v1/WebServiceLdapPpe/obtenerOpcionesPortalResponse")
    @RequestWrapper(localName = "obtenerOpcionesPortal", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesPortal")
    @ResponseWrapper(localName = "obtenerOpcionesPortalResponse", targetNamespace = "http://bancodebogota.com/WSLdapPPE/service/v1", className = "com.bancodebogota.wsldapppe.service.v1.ObtenerOpcionesPortalResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.bancodebogota.wsldapppe.service.v1.RespuestaOpcionesLite obtenerOpcionesPortal();
}
