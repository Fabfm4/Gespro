/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dao;

import com.tsp.gespro.dto.*;
import com.tsp.gespro.exceptions.*;

public interface UbicacionDao
{
	/** 
	 * Inserts a new row in the ubicacion table.
	 */
	public UbicacionPk insert(Ubicacion dto) throws UbicacionDaoException;

	/** 
	 * Updates a single row in the ubicacion table.
	 */
	public void update(UbicacionPk pk, Ubicacion dto) throws UbicacionDaoException;

	/** 
	 * Deletes a single row in the ubicacion table.
	 */
	public void delete(UbicacionPk pk) throws UbicacionDaoException;

	/** 
	 * Returns the rows from the ubicacion table that matches the specified primary-key value.
	 */
	public Ubicacion findByPrimaryKey(UbicacionPk pk) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ID_UBICACION = :idUbicacion'.
	 */
	public Ubicacion findByPrimaryKey(int idUbicacion) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria ''.
	 */
	public Ubicacion[] findAll() throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ID_UBICACION = :idUbicacion'.
	 */
	public Ubicacion[] findWhereIdUbicacionEquals(int idUbicacion) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'CALLE = :calle'.
	 */
	public Ubicacion[] findWhereCalleEquals(String calle) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'NUM_INT = :numInt'.
	 */
	public Ubicacion[] findWhereNumIntEquals(String numInt) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'NUM_EXT = :numExt'.
	 */
	public Ubicacion[] findWhereNumExtEquals(String numExt) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'COLONIA = :colonia'.
	 */
	public Ubicacion[] findWhereColoniaEquals(String colonia) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'CODIGO_POSTAL = :codigoPostal'.
	 */
	public Ubicacion[] findWhereCodigoPostalEquals(String codigoPostal) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'PAIS = :pais'.
	 */
	public Ubicacion[] findWherePaisEquals(String pais) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ESTADO = :estado'.
	 */
	public Ubicacion[] findWhereEstadoEquals(String estado) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'MUNICIPIO = :municipio'.
	 */
	public Ubicacion[] findWhereMunicipioEquals(String municipio) throws UbicacionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ubicacion table that match the specified arbitrary SQL statement
	 */
	public Ubicacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws UbicacionDaoException;

	/** 
	 * Returns all rows from the ubicacion table that match the specified arbitrary SQL statement
	 */
	public Ubicacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws UbicacionDaoException;

}
