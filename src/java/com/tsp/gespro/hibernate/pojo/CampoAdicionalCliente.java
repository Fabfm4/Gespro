package com.tsp.gespro.hibernate.pojo;
// Generated 1/08/2016 04:33:46 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CampoAdicionalCliente generated by hbm2java
 */
public class CampoAdicionalCliente  implements java.io.Serializable {


     private int idCampoAdicionalCliente;
     private Integer idUsuario;
     private String etiqueta;
     private Integer tipoDato;
     private Integer obligatorio;
     private Set campoAdicionalClienteValors = new HashSet(0);

    public CampoAdicionalCliente() {
    }

	
    public CampoAdicionalCliente(int idCampoAdicionalCliente) {
        this.idCampoAdicionalCliente = idCampoAdicionalCliente;
    }
    public CampoAdicionalCliente(int idCampoAdicionalCliente, Integer idUsuario, String etiqueta, Integer tipoDato, Integer obligatorio, Set campoAdicionalClienteValors) {
       this.idCampoAdicionalCliente = idCampoAdicionalCliente;
       this.idUsuario = idUsuario;
       this.etiqueta = etiqueta;
       this.tipoDato = tipoDato;
       this.obligatorio = obligatorio;
       this.campoAdicionalClienteValors = campoAdicionalClienteValors;
    }
   
    public int getIdCampoAdicionalCliente() {
        return this.idCampoAdicionalCliente;
    }
    
    public void setIdCampoAdicionalCliente(int idCampoAdicionalCliente) {
        this.idCampoAdicionalCliente = idCampoAdicionalCliente;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getEtiqueta() {
        return this.etiqueta;
    }
    
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public Integer getTipoDato() {
        return this.tipoDato;
    }
    
    public void setTipoDato(Integer tipoDato) {
        this.tipoDato = tipoDato;
    }
    public Integer getObligatorio() {
        return this.obligatorio;
    }
    
    public void setObligatorio(Integer obligatorio) {
        this.obligatorio = obligatorio;
    }
    public Set getCampoAdicionalClienteValors() {
        return this.campoAdicionalClienteValors;
    }
    
    public void setCampoAdicionalClienteValors(Set campoAdicionalClienteValors) {
        this.campoAdicionalClienteValors = campoAdicionalClienteValors;
    }




}

