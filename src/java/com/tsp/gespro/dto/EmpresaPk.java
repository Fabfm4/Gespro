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
 * This class represents the primary key of the empresa table.
 */
public class EmpresaPk implements Serializable
{
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull;

	/** 
	 * Sets the value of idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
	}

	/** 
	 * Gets the value of idEmpresa
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'EmpresaPk'
	 * 
	 */
	public EmpresaPk()
	{
	}

	/**
	 * Method 'EmpresaPk'
	 * 
	 * @param idEmpresa
	 */
	public EmpresaPk(final int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
	}

	/** 
	 * Sets the value of idEmpresaNull
	 */
	public void setIdEmpresaNull(boolean idEmpresaNull)
	{
		this.idEmpresaNull = idEmpresaNull;
	}

	/** 
	 * Gets the value of idEmpresaNull
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
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
		
		if (!(_other instanceof EmpresaPk)) {
			return false;
		}
		
		final EmpresaPk _cast = (EmpresaPk) _other;
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
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
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
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
		ret.append( "com.tsp.gespro.dto.EmpresaPk: " );
		ret.append( "idEmpresa=" + idEmpresa );
		return ret.toString();
	}

}
