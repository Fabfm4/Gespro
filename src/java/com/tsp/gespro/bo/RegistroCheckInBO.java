/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tsp.gespro.bo;

import com.tsp.gespro.dto.RegistroCheckin;
import com.tsp.gespro.jdbc.RegistroCheckinDaoImpl;
import java.sql.Connection;

/**
 *
 * @author zhiky
 */
public class RegistroCheckInBO {
    
    private RegistroCheckin registroCheckin  = null;
    private Connection conn = null;

    public RegistroCheckin getRegistroCheckin() {
        return registroCheckin;
    }

    public void setRegistroCheckin(RegistroCheckin registroCheckin) {
        this.registroCheckin = registroCheckin;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
    public RegistroCheckInBO(Connection conn){
        this.conn = conn;
    }
    
    public RegistroCheckInBO(int idRegistroCehckIn, Connection conn){        
        this.conn = conn;
        try{
            RegistroCheckinDaoImpl RegistroCheckinDaoImpl = new RegistroCheckinDaoImpl(this.conn);
            this.registroCheckin = RegistroCheckinDaoImpl.findByPrimaryKey(idRegistroCehckIn);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public RegistroCheckin findRegistroCheckinbyId(long idRegistroCheckin) throws Exception{
        RegistroCheckin RegistroCheckin = null;
        
        try{
            RegistroCheckinDaoImpl RegistroCheckinDaoImpl = new RegistroCheckinDaoImpl(this.conn);
            RegistroCheckin = RegistroCheckinDaoImpl.findByPrimaryKey(idRegistroCheckin);
            if (RegistroCheckin==null){
                throw new Exception("No se encontro ningun Empleado Bitacora Posicion que corresponda con los parámetros específicados.");
            }
            if (RegistroCheckin.getIdCheck()<=0){
                throw new Exception("No se encontro ningun Empleado BitacoraPosicion que corresponda con los parámetros específicados.");
            }
        }catch(Exception e){
            throw new Exception("Ocurrió un error inesperado mientras se intentaba recuperar la información del RegistroCheckin del usuario. Error: " + e.getMessage());
        }
        
        return RegistroCheckin;
    }
    
        
    /**
     * Realiza una búsqueda por ID RegistroCheckin en busca de
     * coincidencias
     * @param idRegistroCheckin ID Del RegistroCheckin para filtrar, -1 para mostrar todos los registros
     * @param idEmpresa ID de la Empresa a filtrar registroCheckin, -1 para evitar filtro
     *  @param minLimit Limite inferior de la paginación (Desde) 0 en caso de no existir limite inferior
     * @param maxLimit Limite superior de la paginación (Hasta) 0 en caso de no existir limite superior
     * @param filtroBusqueda Cadena con un filtro de búsqueda personalizado
     * @return DTO RegistroCheckin
     */
    public RegistroCheckin[] findRegistroCheckins(long idRegistroCheckin, long idEmpleado, int minLimit,int maxLimit, String filtroBusqueda) {
        RegistroCheckin[] registroCheckinDto = new RegistroCheckin[0];
        RegistroCheckinDaoImpl registroCheckinDao = new RegistroCheckinDaoImpl(this.conn);
        try {
            String sqlFiltro="";
            if (idRegistroCheckin>0){
                sqlFiltro ="ID_CHECK=" + idRegistroCheckin + " ";
            }else{
                sqlFiltro ="ID_CHECK>0 ";
            }
            if (idEmpleado>0){                
                sqlFiltro += " AND ID_USUARIO = " + idEmpleado;
            }else {
                //sqlFiltro =" ID_USUARIO IN (SELECT ID_USUARIOS FROM USUARIOS WHERE ID_EMPRESA IN (SELECT ID_EMPRESA FROM EMPRESA WHERE ID_EMPRESA > 0 ) ) ";
            }
            
            if (!filtroBusqueda.trim().equals("")){
                sqlFiltro += filtroBusqueda;
            }
            
            if (minLimit<0)
                minLimit=0;
            
            String sqlLimit="";
            if ((minLimit>0 && maxLimit>0) || (minLimit==0 && maxLimit>0))
                sqlLimit = " LIMIT " + minLimit + "," + maxLimit;
            
            registroCheckinDto = registroCheckinDao.findByDynamicWhere( 
                    sqlFiltro
                    + " ORDER BY FECHA_HORA DESC"
                    + sqlLimit
                    , new Object[0]);
            
        } catch (Exception ex) {
            System.out.println("Error de consulta a Base de Datos: " + ex.toString());
            ex.printStackTrace();
        }
        
        return registroCheckinDto;
    }
    
    
    
    
}
