/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.jdbc;

import com.tsp.gespro.dao.*;
import com.tsp.gespro.factory.*;
import com.tsp.gespro.dto.*;
import com.tsp.gespro.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class AccionBitacoraTipoDaoImpl extends AbstractDAO implements AccionBitacoraTipoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id_tipo, nombre_bitacora_accion_tipo FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_tipo, nombre_bitacora_accion_tipo ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_tipo = ?, nombre_bitacora_accion_tipo = ? WHERE id_tipo = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_tipo = ?";

	/** 
	 * Index of column id_tipo
	 */
	protected static final int COLUMN_ID_TIPO = 1;

	/** 
	 * Index of column nombre_bitacora_accion_tipo
	 */
	protected static final int COLUMN_NOMBRE_BITACORA_ACCION_TIPO = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column id_tipo
	 */
	protected static final int PK_COLUMN_ID_TIPO = 1;

	/** 
	 * Inserts a new row in the accion_bitacora_tipo table.
	 */
	public AccionBitacoraTipoPk insert(AccionBitacoraTipo dto) throws AccionBitacoraTipoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_tipo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreBitacoraAccionTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre_bitacora_accion_tipo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdTipoModified()) {
				stmt.setInt( index++, dto.getIdTipo() );
			}
		
			if (dto.isNombreBitacoraAccionTipoModified()) {
				stmt.setString( index++, dto.getNombreBitacoraAccionTipo() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdTipo( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccionBitacoraTipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the accion_bitacora_tipo table.
	 */
	public void update(AccionBitacoraTipoPk pk, AccionBitacoraTipo dto) throws AccionBitacoraTipoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_tipo=?" );
				modified=true;
			}
		
			if (dto.isNombreBitacoraAccionTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre_bitacora_accion_tipo=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_tipo=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdTipoModified()) {
				stmt.setInt( index++, dto.getIdTipo() );
			}
		
			if (dto.isNombreBitacoraAccionTipoModified()) {
				stmt.setString( index++, dto.getNombreBitacoraAccionTipo() );
			}
		
			stmt.setInt( index++, pk.getIdTipo() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccionBitacoraTipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the accion_bitacora_tipo table.
	 */
	public void delete(AccionBitacoraTipoPk pk) throws AccionBitacoraTipoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdTipo() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccionBitacoraTipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the accion_bitacora_tipo table that matches the specified primary-key value.
	 */
	public AccionBitacoraTipo findByPrimaryKey(AccionBitacoraTipoPk pk) throws AccionBitacoraTipoDaoException
	{
		return findByPrimaryKey( pk.getIdTipo() );
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the criteria 'id_tipo = :idTipo'.
	 */
	public AccionBitacoraTipo findByPrimaryKey(int idTipo) throws AccionBitacoraTipoDaoException
	{
		AccionBitacoraTipo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_tipo = ?", new Object[] {  new Integer(idTipo) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the criteria ''.
	 */
	public AccionBitacoraTipo[] findAll() throws AccionBitacoraTipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_tipo", null );
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the criteria 'id_tipo = :idTipo'.
	 */
	public AccionBitacoraTipo[] findWhereIdTipoEquals(int idTipo) throws AccionBitacoraTipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_tipo = ? ORDER BY id_tipo", new Object[] {  new Integer(idTipo) } );
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the criteria 'nombre_bitacora_accion_tipo = :nombreBitacoraAccionTipo'.
	 */
	public AccionBitacoraTipo[] findWhereNombreBitacoraAccionTipoEquals(String nombreBitacoraAccionTipo) throws AccionBitacoraTipoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre_bitacora_accion_tipo = ? ORDER BY nombre_bitacora_accion_tipo", new Object[] { nombreBitacoraAccionTipo } );
	}

	/**
	 * Method 'AccionBitacoraTipoDaoImpl'
	 * 
	 */
	public AccionBitacoraTipoDaoImpl()
	{
	}

	/**
	 * Method 'AccionBitacoraTipoDaoImpl'
	 * 
	 * @param userConn
	 */
	public AccionBitacoraTipoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "accion_bitacora_tipo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected AccionBitacoraTipo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			AccionBitacoraTipo dto = new AccionBitacoraTipo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected AccionBitacoraTipo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			AccionBitacoraTipo dto = new AccionBitacoraTipo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		AccionBitacoraTipo ret[] = new AccionBitacoraTipo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(AccionBitacoraTipo dto, ResultSet rs) throws SQLException
	{
		dto.setIdTipo( rs.getInt( COLUMN_ID_TIPO ) );
		dto.setNombreBitacoraAccionTipo( rs.getString( COLUMN_NOMBRE_BITACORA_ACCION_TIPO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(AccionBitacoraTipo dto)
	{
		dto.setIdTipoModified( false );
		dto.setNombreBitacoraAccionTipoModified( false );
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the specified arbitrary SQL statement
	 */
	public AccionBitacoraTipo[] findByDynamicSelect(String sql, Object[] sqlParams) throws AccionBitacoraTipoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccionBitacoraTipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the accion_bitacora_tipo table that match the specified arbitrary SQL statement
	 */
	public AccionBitacoraTipo[] findByDynamicWhere(String sql, Object[] sqlParams) throws AccionBitacoraTipoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccionBitacoraTipoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
