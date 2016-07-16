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
 * This class represents the primary key of the accion_bitacora_tipo table.
 */
public class AccionBitacoraTipoPk implements Serializable
{
	protected int idTipo;

	/** 
	 * This attribute represents whether the primitive attribute idTipo is null.
	 */
	protected boolean idTipoNull;

	/** 
	 * Sets the value of idTipo
	 */
	public void setIdTipo(int idTipo)
	{
		this.idTipo = idTipo;
	}

	/** 
	 * Gets the value of idTipo
	 */
	public int getIdTipo()
	{
		return idTipo;
	}

	/**
	 * Method 'AccionBitacoraTipoPk'
	 * 
	 */
	public AccionBitacoraTipoPk()
	{
	}

	/**
	 * Method 'AccionBitacoraTipoPk'
	 * 
	 * @param idTipo
	 */
	public AccionBitacoraTipoPk(final int idTipo)
	{
		this.idTipo = idTipo;
	}

	/** 
	 * Sets the value of idTipoNull
	 */
	public void setIdTipoNull(boolean idTipoNull)
	{
		this.idTipoNull = idTipoNull;
	}

	/** 
	 * Gets the value of idTipoNull
	 */
	public boolean isIdTipoNull()
	{
		return idTipoNull;
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
		
		if (!(_other instanceof AccionBitacoraTipoPk)) {
			return false;
		}
		
		final AccionBitacoraTipoPk _cast = (AccionBitacoraTipoPk) _other;
		if (idTipo != _cast.idTipo) {
			return false;
		}
		
		if (idTipoNull != _cast.idTipoNull) {
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
		_hashCode = 29 * _hashCode + idTipo;
		_hashCode = 29 * _hashCode + (idTipoNull ? 1 : 0);
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
		ret.append( "com.tsp.gespro.dto.AccionBitacoraTipoPk: " );
		ret.append( "idTipo=" + idTipo );
		return ret.toString();
	}

}
