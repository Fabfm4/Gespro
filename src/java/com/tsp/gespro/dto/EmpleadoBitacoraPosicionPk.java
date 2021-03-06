/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the empleado_bitacora_posicion table.
 */
public class EmpleadoBitacoraPosicionPk implements Serializable
{
	protected long idBitacoraPosicion;

	/** 
	 * This attribute represents whether the primitive attribute idBitacoraPosicion is null.
	 */
	protected boolean idBitacoraPosicionNull;

	/** 
	 * Sets the value of idBitacoraPosicion
	 */
	public void setIdBitacoraPosicion(long idBitacoraPosicion)
	{
		this.idBitacoraPosicion = idBitacoraPosicion;
	}

	/** 
	 * Gets the value of idBitacoraPosicion
	 */
	public long getIdBitacoraPosicion()
	{
		return idBitacoraPosicion;
	}

	/**
	 * Method 'EmpleadoBitacoraPosicionPk'
	 * 
	 */
	public EmpleadoBitacoraPosicionPk()
	{
	}

	/**
	 * Method 'EmpleadoBitacoraPosicionPk'
	 * 
	 * @param idBitacoraPosicion
	 */
	public EmpleadoBitacoraPosicionPk(final long idBitacoraPosicion)
	{
		this.idBitacoraPosicion = idBitacoraPosicion;
	}

	/** 
	 * Sets the value of idBitacoraPosicionNull
	 */
	public void setIdBitacoraPosicionNull(boolean idBitacoraPosicionNull)
	{
		this.idBitacoraPosicionNull = idBitacoraPosicionNull;
	}

	/** 
	 * Gets the value of idBitacoraPosicionNull
	 */
	public boolean isIdBitacoraPosicionNull()
	{
		return idBitacoraPosicionNull;
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
		
		if (!(_other instanceof EmpleadoBitacoraPosicionPk)) {
			return false;
		}
		
		final EmpleadoBitacoraPosicionPk _cast = (EmpleadoBitacoraPosicionPk) _other;
		if (idBitacoraPosicion != _cast.idBitacoraPosicion) {
			return false;
		}
		
		if (idBitacoraPosicionNull != _cast.idBitacoraPosicionNull) {
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
		_hashCode = 29 * _hashCode + (int) (idBitacoraPosicion ^ (idBitacoraPosicion >>> 32));
		_hashCode = 29 * _hashCode + (idBitacoraPosicionNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.EmpleadoBitacoraPosicionPk: " );
		ret.append( "idBitacoraPosicion=" + idBitacoraPosicion );
		return ret.toString();
	}

}
