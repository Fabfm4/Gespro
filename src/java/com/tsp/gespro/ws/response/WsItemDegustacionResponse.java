/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tsp.gespro.ws.response;

import java.io.Serializable;

/**
 *
 * @author leonardo
 */
public class WsItemDegustacionResponse extends WSResponseInsert  implements Serializable{
    
    
    private int idDetalleDegustacion;    

    public int getIdDetalleDegustacion() {
        return idDetalleDegustacion;
    }

    public void setIdDetalleDegustacion(int idDetalleDegustacion) {
        this.idDetalleDegustacion = idDetalleDegustacion;
    }

    
    
}