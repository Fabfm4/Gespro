/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsp.gespro.ws.request;

import java.util.Date;

/**
 *
 * @author ISCesarMartinez
 * 
 * Clase POJO contenedora de datos básicos del usuario/empleado 
 * en sesión móvil que accede al web service
 */
public class EmpleadoDtoRequest {
    
    private int idEmpleado;
    private String empleadoUsuario;
    private String empleadoPassword;
    
    private String dispositivoIMEI;
    
    private String ubicacionLatitud;
    private String ubicacionLongitud;
    
    private Date fechaHora;
    
    private double porcentajeBateria;
    

    public EmpleadoDtoRequest() {
    }

    public String getEmpleadoPassword() {
        return empleadoPassword;
    }

    public void setEmpleadoPassword(String empleadoPassword) {
        this.empleadoPassword = empleadoPassword;
    }

    public String getEmpleadoUsuario() {
        return empleadoUsuario;
    }

    public void setEmpleadoUsuario(String empleadoUsuario) {
        this.empleadoUsuario = empleadoUsuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDispositivoIMEI() {
        return dispositivoIMEI;
    }

    public void setDispositivoIMEI(String dispositivoIMEI) {
        this.dispositivoIMEI = dispositivoIMEI;
    }

    public String getUbicacionLatitud() {
        return ubicacionLatitud;
    }

    public void setUbicacionLatitud(String ubicacionLatitud) {
        this.ubicacionLatitud = ubicacionLatitud;
    }

    public String getUbicacionLongitud() {
        return ubicacionLongitud;
    }

    public void setUbicacionLongitud(String ubicacionLongitud) {
        this.ubicacionLongitud = ubicacionLongitud;
    }    

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public double getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(double porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }
    
}
