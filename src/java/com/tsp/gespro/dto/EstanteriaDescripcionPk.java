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
 * This class represents the primary key of the estanteria_descripcion table.
 */
public class EstanteriaDescripcionPk implements Serializable
{
	protected int idDescripcion;

	/** 
	 * This attribute represents whether the primitive attribute idDescripcion is null.
	 */
	protected boolean idDescripcionNull;

	/** 
	 * Sets the value of idDescripcion
	 */
	public void setIdDescripcion(int idDescripcion)
	{
		this.idDescripcion = idDescripcion;
	}

	/** 
	 * Gets the value of idDescripcion
	 */
	public int getIdDescripcion()
	{
		return idDescripcion;
	}

	/**
	 * Method 'EstanteriaDescripcionPk'
	 * 
	 */
	public EstanteriaDescripcionPk()
	{
	}

	/**
	 * Method 'EstanteriaDescripcionPk'
	 * 
	 * @param idDescripcion
	 */
	public EstanteriaDescripcionPk(final int idDescripcion)
	{
		this.idDescripcion = idDescripcion;
	}

	/** 
	 * Sets the value of idDescripcionNull
	 */
	public void setIdDescripcionNull(boolean idDescripcionNull)
	{
		this.idDescripcionNull = idDescripcionNull;
	}

	/** 
	 * Gets the value of idDescripcionNull
	 */
	public boolean isIdDescripcionNull()
	{
		return idDescripcionNull;
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
		
		if (!(_other instanceof EstanteriaDescripcionPk)) {
			return false;
		}
		
		final EstanteriaDescripcionPk _cast = (EstanteriaDescripcionPk) _other;
		if (idDescripcion != _cast.idDescripcion) {
			return false;
		}
		
		if (idDescripcionNull != _cast.idDescripcionNull) {
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
		_hashCode = 29 * _hashCode + idDescripcion;
		_hashCode = 29 * _hashCode + (idDescripcionNull ? 1 : 0);
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
		ret.append( "com.tsp.gespro.dto.EstanteriaDescripcionPk: " );
		ret.append( "idDescripcion=" + idDescripcion );
		return ret.toString();
	}

}
