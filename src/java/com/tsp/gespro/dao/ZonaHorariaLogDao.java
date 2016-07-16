/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dao;

import java.util.Date;
import com.tsp.gespro.dto.*;
import com.tsp.gespro.exceptions.*;

public interface ZonaHorariaLogDao
{
	/** 
	 * Inserts a new row in the zona_horaria_log table.
	 */
	public ZonaHorariaLogPk insert(ZonaHorariaLog dto) throws ZonaHorariaLogDaoException;

	/** 
	 * Updates a single row in the zona_horaria_log table.
	 */
	public void update(ZonaHorariaLogPk pk, ZonaHorariaLog dto) throws ZonaHorariaLogDaoException;

	/** 
	 * Deletes a single row in the zona_horaria_log table.
	 */
	public void delete(ZonaHorariaLogPk pk) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns the rows from the zona_horaria_log table that matches the specified primary-key value.
	 */
	public ZonaHorariaLog findByPrimaryKey(ZonaHorariaLogPk pk) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'ID_ZONA_HORARIA_LOG = :idZonaHorariaLog'.
	 */
	public ZonaHorariaLog findByPrimaryKey(int idZonaHorariaLog) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria ''.
	 */
	public ZonaHorariaLog[] findAll() throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'ID_ZONA_HORARIA_LOG = :idZonaHorariaLog'.
	 */
	public ZonaHorariaLog[] findWhereIdZonaHorariaLogEquals(int idZonaHorariaLog) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ZonaHorariaLog[] findWhereIdEmpresaEquals(int idEmpresa) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'ID_USUARIOS = :idUsuarios'.
	 */
	public ZonaHorariaLog[] findWhereIdUsuariosEquals(int idUsuarios) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public ZonaHorariaLog[] findWhereDescripcionEquals(String descripcion) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the criteria 'FECHA = :fecha'.
	 */
	public ZonaHorariaLog[] findWhereFechaEquals(Date fecha) throws ZonaHorariaLogDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the zona_horaria_log table that match the specified arbitrary SQL statement
	 */
	public ZonaHorariaLog[] findByDynamicSelect(String sql, Object[] sqlParams) throws ZonaHorariaLogDaoException;

	/** 
	 * Returns all rows from the zona_horaria_log table that match the specified arbitrary SQL statement
	 */
	public ZonaHorariaLog[] findByDynamicWhere(String sql, Object[] sqlParams) throws ZonaHorariaLogDaoException;

}
