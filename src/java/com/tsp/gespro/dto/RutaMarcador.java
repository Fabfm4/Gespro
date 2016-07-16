/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dto;

import com.tsp.gespro.dao.*;
import com.tsp.gespro.factory.*;
import com.tsp.gespro.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class RutaMarcador implements Serializable
{
	/** 
	 * This attribute maps to the column ID_RUTA_MARCADOR in the ruta_marcador table.
	 */
	protected int idRutaMarcador;

	/** 
	 * This attribute represents whether the attribute idRutaMarcador has been modified since being read from the database.
	 */
	protected boolean idRutaMarcadorModified = false;

	/** 
	 * This attribute maps to the column ID_RUTA in the ruta_marcador table.
	 */
	protected int idRuta;

	/** 
	 * This attribute represents whether the attribute idRuta has been modified since being read from the database.
	 */
	protected boolean idRutaModified = false;

	/** 
	 * This attribute maps to the column INFORMACION_MARCADOR in the ruta_marcador table.
	 */
	protected String informacionMarcador;

	/** 
	 * This attribute represents whether the attribute informacionMarcador has been modified since being read from the database.
	 */
	protected boolean informacionMarcadorModified = false;

	/** 
	 * This attribute maps to the column LATITUD_MARCADOR in the ruta_marcador table.
	 */
	protected String latitudMarcador;

	/** 
	 * This attribute represents whether the attribute latitudMarcador has been modified since being read from the database.
	 */
	protected boolean latitudMarcadorModified = false;

	/** 
	 * This attribute maps to the column LONGITUD_MARCADOR in the ruta_marcador table.
	 */
	protected String longitudMarcador;

	/** 
	 * This attribute represents whether the attribute longitudMarcador has been modified since being read from the database.
	 */
	protected boolean longitudMarcadorModified = false;

	/** 
	 * This attribute maps to the column ID_PROSPECTO in the ruta_marcador table.
	 */
	protected int idProspecto;

	/** 
	 * This attribute represents whether the primitive attribute idProspecto is null.
	 */
	protected boolean idProspectoNull = true;

	/** 
	 * This attribute represents whether the attribute idProspecto has been modified since being read from the database.
	 */
	protected boolean idProspectoModified = false;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the ruta_marcador table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull = true;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/** 
	 * This attribute maps to the column IS_VISITADO in the ruta_marcador table.
	 */
	protected short isVisitado;

	/** 
	 * This attribute represents whether the attribute isVisitado has been modified since being read from the database.
	 */
	protected boolean isVisitadoModified = false;

	/** 
	 * This attribute maps to the column DISTANCIA_PUNTO in the ruta_marcador table.
	 */
	protected double distanciaPunto;

	/** 
	 * This attribute represents whether the primitive attribute distanciaPunto is null.
	 */
	protected boolean distanciaPuntoNull = true;

	/** 
	 * This attribute represents whether the attribute distanciaPunto has been modified since being read from the database.
	 */
	protected boolean distanciaPuntoModified = false;

	/**
	 * Method 'RutaMarcador'
	 * 
	 */
	public RutaMarcador()
	{
	}

	/**
	 * Method 'getIdRutaMarcador'
	 * 
	 * @return int
	 */
	public int getIdRutaMarcador()
	{
		return idRutaMarcador;
	}

	/**
	 * Method 'setIdRutaMarcador'
	 * 
	 * @param idRutaMarcador
	 */
	public void setIdRutaMarcador(int idRutaMarcador)
	{
		this.idRutaMarcador = idRutaMarcador;
		this.idRutaMarcadorModified = true;
	}

	/** 
	 * Sets the value of idRutaMarcadorModified
	 */
	public void setIdRutaMarcadorModified(boolean idRutaMarcadorModified)
	{
		this.idRutaMarcadorModified = idRutaMarcadorModified;
	}

	/** 
	 * Gets the value of idRutaMarcadorModified
	 */
	public boolean isIdRutaMarcadorModified()
	{
		return idRutaMarcadorModified;
	}

	/**
	 * Method 'getIdRuta'
	 * 
	 * @return int
	 */
	public int getIdRuta()
	{
		return idRuta;
	}

	/**
	 * Method 'setIdRuta'
	 * 
	 * @param idRuta
	 */
	public void setIdRuta(int idRuta)
	{
		this.idRuta = idRuta;
		this.idRutaModified = true;
	}

	/** 
	 * Sets the value of idRutaModified
	 */
	public void setIdRutaModified(boolean idRutaModified)
	{
		this.idRutaModified = idRutaModified;
	}

	/** 
	 * Gets the value of idRutaModified
	 */
	public boolean isIdRutaModified()
	{
		return idRutaModified;
	}

	/**
	 * Method 'getInformacionMarcador'
	 * 
	 * @return String
	 */
	public String getInformacionMarcador()
	{
		return informacionMarcador;
	}

	/**
	 * Method 'setInformacionMarcador'
	 * 
	 * @param informacionMarcador
	 */
	public void setInformacionMarcador(String informacionMarcador)
	{
		this.informacionMarcador = informacionMarcador;
		this.informacionMarcadorModified = true;
	}

	/** 
	 * Sets the value of informacionMarcadorModified
	 */
	public void setInformacionMarcadorModified(boolean informacionMarcadorModified)
	{
		this.informacionMarcadorModified = informacionMarcadorModified;
	}

	/** 
	 * Gets the value of informacionMarcadorModified
	 */
	public boolean isInformacionMarcadorModified()
	{
		return informacionMarcadorModified;
	}

	/**
	 * Method 'getLatitudMarcador'
	 * 
	 * @return String
	 */
	public String getLatitudMarcador()
	{
		return latitudMarcador;
	}

	/**
	 * Method 'setLatitudMarcador'
	 * 
	 * @param latitudMarcador
	 */
	public void setLatitudMarcador(String latitudMarcador)
	{
		this.latitudMarcador = latitudMarcador;
		this.latitudMarcadorModified = true;
	}

	/** 
	 * Sets the value of latitudMarcadorModified
	 */
	public void setLatitudMarcadorModified(boolean latitudMarcadorModified)
	{
		this.latitudMarcadorModified = latitudMarcadorModified;
	}

	/** 
	 * Gets the value of latitudMarcadorModified
	 */
	public boolean isLatitudMarcadorModified()
	{
		return latitudMarcadorModified;
	}

	/**
	 * Method 'getLongitudMarcador'
	 * 
	 * @return String
	 */
	public String getLongitudMarcador()
	{
		return longitudMarcador;
	}

	/**
	 * Method 'setLongitudMarcador'
	 * 
	 * @param longitudMarcador
	 */
	public void setLongitudMarcador(String longitudMarcador)
	{
		this.longitudMarcador = longitudMarcador;
		this.longitudMarcadorModified = true;
	}

	/** 
	 * Sets the value of longitudMarcadorModified
	 */
	public void setLongitudMarcadorModified(boolean longitudMarcadorModified)
	{
		this.longitudMarcadorModified = longitudMarcadorModified;
	}

	/** 
	 * Gets the value of longitudMarcadorModified
	 */
	public boolean isLongitudMarcadorModified()
	{
		return longitudMarcadorModified;
	}

	/**
	 * Method 'getIdProspecto'
	 * 
	 * @return int
	 */
	public int getIdProspecto()
	{
		return idProspecto;
	}

	/**
	 * Method 'setIdProspecto'
	 * 
	 * @param idProspecto
	 */
	public void setIdProspecto(int idProspecto)
	{
		this.idProspecto = idProspecto;
		this.idProspectoNull = false;
		this.idProspectoModified = true;
	}

	/**
	 * Method 'setIdProspectoNull'
	 * 
	 * @param value
	 */
	public void setIdProspectoNull(boolean value)
	{
		this.idProspectoNull = value;
		this.idProspectoModified = true;
	}

	/**
	 * Method 'isIdProspectoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdProspectoNull()
	{
		return idProspectoNull;
	}

	/** 
	 * Sets the value of idProspectoModified
	 */
	public void setIdProspectoModified(boolean idProspectoModified)
	{
		this.idProspectoModified = idProspectoModified;
	}

	/** 
	 * Gets the value of idProspectoModified
	 */
	public boolean isIdProspectoModified()
	{
		return idProspectoModified;
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
		this.idClienteNull = false;
		this.idClienteModified = true;
	}

	/**
	 * Method 'setIdClienteNull'
	 * 
	 * @param value
	 */
	public void setIdClienteNull(boolean value)
	{
		this.idClienteNull = value;
		this.idClienteModified = true;
	}

	/**
	 * Method 'isIdClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
	}

	/** 
	 * Sets the value of idClienteModified
	 */
	public void setIdClienteModified(boolean idClienteModified)
	{
		this.idClienteModified = idClienteModified;
	}

	/** 
	 * Gets the value of idClienteModified
	 */
	public boolean isIdClienteModified()
	{
		return idClienteModified;
	}

	/**
	 * Method 'getIsVisitado'
	 * 
	 * @return short
	 */
	public short getIsVisitado()
	{
		return isVisitado;
	}

	/**
	 * Method 'setIsVisitado'
	 * 
	 * @param isVisitado
	 */
	public void setIsVisitado(short isVisitado)
	{
		this.isVisitado = isVisitado;
		this.isVisitadoModified = true;
	}

	/** 
	 * Sets the value of isVisitadoModified
	 */
	public void setIsVisitadoModified(boolean isVisitadoModified)
	{
		this.isVisitadoModified = isVisitadoModified;
	}

	/** 
	 * Gets the value of isVisitadoModified
	 */
	public boolean isIsVisitadoModified()
	{
		return isVisitadoModified;
	}

	/**
	 * Method 'getDistanciaPunto'
	 * 
	 * @return double
	 */
	public double getDistanciaPunto()
	{
		return distanciaPunto;
	}

	/**
	 * Method 'setDistanciaPunto'
	 * 
	 * @param distanciaPunto
	 */
	public void setDistanciaPunto(double distanciaPunto)
	{
		this.distanciaPunto = distanciaPunto;
		this.distanciaPuntoNull = false;
		this.distanciaPuntoModified = true;
	}

	/**
	 * Method 'setDistanciaPuntoNull'
	 * 
	 * @param value
	 */
	public void setDistanciaPuntoNull(boolean value)
	{
		this.distanciaPuntoNull = value;
		this.distanciaPuntoModified = true;
	}

	/**
	 * Method 'isDistanciaPuntoNull'
	 * 
	 * @return boolean
	 */
	public boolean isDistanciaPuntoNull()
	{
		return distanciaPuntoNull;
	}

	/** 
	 * Sets the value of distanciaPuntoModified
	 */
	public void setDistanciaPuntoModified(boolean distanciaPuntoModified)
	{
		this.distanciaPuntoModified = distanciaPuntoModified;
	}

	/** 
	 * Gets the value of distanciaPuntoModified
	 */
	public boolean isDistanciaPuntoModified()
	{
		return distanciaPuntoModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof RutaMarcador)) {
			return false;
		}
		
		final RutaMarcador _cast = (RutaMarcador) _other;
		if (idRutaMarcador != _cast.idRutaMarcador) {
			return false;
		}
		
		if (idRutaMarcadorModified != _cast.idRutaMarcadorModified) {
			return false;
		}
		
		if (idRuta != _cast.idRuta) {
			return false;
		}
		
		if (idRutaModified != _cast.idRutaModified) {
			return false;
		}
		
		if (informacionMarcador == null ? _cast.informacionMarcador != informacionMarcador : !informacionMarcador.equals( _cast.informacionMarcador )) {
			return false;
		}
		
		if (informacionMarcadorModified != _cast.informacionMarcadorModified) {
			return false;
		}
		
		if (latitudMarcador == null ? _cast.latitudMarcador != latitudMarcador : !latitudMarcador.equals( _cast.latitudMarcador )) {
			return false;
		}
		
		if (latitudMarcadorModified != _cast.latitudMarcadorModified) {
			return false;
		}
		
		if (longitudMarcador == null ? _cast.longitudMarcador != longitudMarcador : !longitudMarcador.equals( _cast.longitudMarcador )) {
			return false;
		}
		
		if (longitudMarcadorModified != _cast.longitudMarcadorModified) {
			return false;
		}
		
		if (idProspecto != _cast.idProspecto) {
			return false;
		}
		
		if (idProspectoNull != _cast.idProspectoNull) {
			return false;
		}
		
		if (idProspectoModified != _cast.idProspectoModified) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
			return false;
		}
		
		if (isVisitado != _cast.isVisitado) {
			return false;
		}
		
		if (isVisitadoModified != _cast.isVisitadoModified) {
			return false;
		}
		
		if (distanciaPunto != _cast.distanciaPunto) {
			return false;
		}
		
		if (distanciaPuntoNull != _cast.distanciaPuntoNull) {
			return false;
		}
		
		if (distanciaPuntoModified != _cast.distanciaPuntoModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idRutaMarcador;
		_hashCode = 29 * _hashCode + (idRutaMarcadorModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idRuta;
		_hashCode = 29 * _hashCode + (idRutaModified ? 1 : 0);
		if (informacionMarcador != null) {
			_hashCode = 29 * _hashCode + informacionMarcador.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (informacionMarcadorModified ? 1 : 0);
		if (latitudMarcador != null) {
			_hashCode = 29 * _hashCode + latitudMarcador.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (latitudMarcadorModified ? 1 : 0);
		if (longitudMarcador != null) {
			_hashCode = 29 * _hashCode + longitudMarcador.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (longitudMarcadorModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idProspecto;
		_hashCode = 29 * _hashCode + (idProspectoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idProspectoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) isVisitado;
		_hashCode = 29 * _hashCode + (isVisitadoModified ? 1 : 0);
		long temp_distanciaPunto = Double.doubleToLongBits(distanciaPunto);
		_hashCode = 29 * _hashCode + (int) (temp_distanciaPunto ^ (temp_distanciaPunto >>> 32));
		_hashCode = 29 * _hashCode + (distanciaPuntoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (distanciaPuntoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RutaMarcadorPk
	 */
	public RutaMarcadorPk createPk()
	{
		return new RutaMarcadorPk(idRutaMarcador);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.RutaMarcador: " );
		ret.append( "idRutaMarcador=" + idRutaMarcador );
		ret.append( ", idRuta=" + idRuta );
		ret.append( ", informacionMarcador=" + informacionMarcador );
		ret.append( ", latitudMarcador=" + latitudMarcador );
		ret.append( ", longitudMarcador=" + longitudMarcador );
		ret.append( ", idProspecto=" + idProspecto );
		ret.append( ", idCliente=" + idCliente );
		ret.append( ", isVisitado=" + isVisitado );
		ret.append( ", distanciaPunto=" + distanciaPunto );
		return ret.toString();
	}

}
