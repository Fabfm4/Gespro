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

public class DatosUsuarioDaoImpl extends AbstractDAO implements DatosUsuarioDao
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
	protected final String SQL_SELECT = "SELECT ID_DATOS_USUARIO, NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DIRECCION, TELEFONO, EXTENSION, CELULAR, CORREO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_DATOS_USUARIO, NOMBRE, APELLIDO_PAT, APELLIDO_MAT, DIRECCION, TELEFONO, EXTENSION, CELULAR, CORREO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_DATOS_USUARIO = ?, NOMBRE = ?, APELLIDO_PAT = ?, APELLIDO_MAT = ?, DIRECCION = ?, TELEFONO = ?, EXTENSION = ?, CELULAR = ?, CORREO = ? WHERE ID_DATOS_USUARIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_DATOS_USUARIO = ?";

	/** 
	 * Index of column ID_DATOS_USUARIO
	 */
	protected static final int COLUMN_ID_DATOS_USUARIO = 1;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column APELLIDO_PAT
	 */
	protected static final int COLUMN_APELLIDO_PAT = 3;

	/** 
	 * Index of column APELLIDO_MAT
	 */
	protected static final int COLUMN_APELLIDO_MAT = 4;

	/** 
	 * Index of column DIRECCION
	 */
	protected static final int COLUMN_DIRECCION = 5;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 6;

	/** 
	 * Index of column EXTENSION
	 */
	protected static final int COLUMN_EXTENSION = 7;

	/** 
	 * Index of column CELULAR
	 */
	protected static final int COLUMN_CELULAR = 8;

	/** 
	 * Index of column CORREO
	 */
	protected static final int COLUMN_CORREO = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_DATOS_USUARIO
	 */
	protected static final int PK_COLUMN_ID_DATOS_USUARIO = 1;

	/** 
	 * Inserts a new row in the datos_usuario table.
	 */
	public DatosUsuarioPk insert(DatosUsuario dto) throws DatosUsuarioDaoException
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
			if (dto.isIdDatosUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DATOS_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isApellidoPatModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_PAT" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isApellidoMatModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_MAT" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDireccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIRECCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTelefonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TELEFONO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtensionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXTENSION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCelularModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CELULAR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCorreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CORREO" );
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
			if (dto.isIdDatosUsuarioModified()) {
				stmt.setInt( index++, dto.getIdDatosUsuario() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPatModified()) {
				stmt.setString( index++, dto.getApellidoPat() );
			}
		
			if (dto.isApellidoMatModified()) {
				stmt.setString( index++, dto.getApellidoMat() );
			}
		
			if (dto.isDireccionModified()) {
				stmt.setString( index++, dto.getDireccion() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isExtensionModified()) {
				stmt.setString( index++, dto.getExtension() );
			}
		
			if (dto.isCelularModified()) {
				stmt.setString( index++, dto.getCelular() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdDatosUsuario( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the datos_usuario table.
	 */
	public void update(DatosUsuarioPk pk, DatosUsuario dto) throws DatosUsuarioDaoException
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
			if (dto.isIdDatosUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DATOS_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isApellidoPatModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_PAT=?" );
				modified=true;
			}
		
			if (dto.isApellidoMatModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_MAT=?" );
				modified=true;
			}
		
			if (dto.isDireccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIRECCION=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isExtensionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXTENSION=?" );
				modified=true;
			}
		
			if (dto.isCelularModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CELULAR=?" );
				modified=true;
			}
		
			if (dto.isCorreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CORREO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_DATOS_USUARIO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDatosUsuarioModified()) {
				stmt.setInt( index++, dto.getIdDatosUsuario() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPatModified()) {
				stmt.setString( index++, dto.getApellidoPat() );
			}
		
			if (dto.isApellidoMatModified()) {
				stmt.setString( index++, dto.getApellidoMat() );
			}
		
			if (dto.isDireccionModified()) {
				stmt.setString( index++, dto.getDireccion() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isExtensionModified()) {
				stmt.setString( index++, dto.getExtension() );
			}
		
			if (dto.isCelularModified()) {
				stmt.setString( index++, dto.getCelular() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			stmt.setInt( index++, pk.getIdDatosUsuario() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the datos_usuario table.
	 */
	public void delete(DatosUsuarioPk pk) throws DatosUsuarioDaoException
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
			stmt.setInt( 1, pk.getIdDatosUsuario() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the datos_usuario table that matches the specified primary-key value.
	 */
	public DatosUsuario findByPrimaryKey(DatosUsuarioPk pk) throws DatosUsuarioDaoException
	{
		return findByPrimaryKey( pk.getIdDatosUsuario() );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'ID_DATOS_USUARIO = :idDatosUsuario'.
	 */
	public DatosUsuario findByPrimaryKey(int idDatosUsuario) throws DatosUsuarioDaoException
	{
		DatosUsuario ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_DATOS_USUARIO = ?", new Object[] {  new Integer(idDatosUsuario) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria ''.
	 */
	public DatosUsuario[] findAll() throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_DATOS_USUARIO", null );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'ID_DATOS_USUARIO = :idDatosUsuario'.
	 */
	public DatosUsuario[] findWhereIdDatosUsuarioEquals(int idDatosUsuario) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DATOS_USUARIO = ? ORDER BY ID_DATOS_USUARIO", new Object[] {  new Integer(idDatosUsuario) } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'NOMBRE = :nombre'.
	 */
	public DatosUsuario[] findWhereNombreEquals(String nombre) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'APELLIDO_PAT = :apellidoPat'.
	 */
	public DatosUsuario[] findWhereApellidoPatEquals(String apellidoPat) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_PAT = ? ORDER BY APELLIDO_PAT", new Object[] { apellidoPat } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'APELLIDO_MAT = :apellidoMat'.
	 */
	public DatosUsuario[] findWhereApellidoMatEquals(String apellidoMat) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_MAT = ? ORDER BY APELLIDO_MAT", new Object[] { apellidoMat } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'DIRECCION = :direccion'.
	 */
	public DatosUsuario[] findWhereDireccionEquals(String direccion) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIRECCION = ? ORDER BY DIRECCION", new Object[] { direccion } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'TELEFONO = :telefono'.
	 */
	public DatosUsuario[] findWhereTelefonoEquals(String telefono) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'EXTENSION = :extension'.
	 */
	public DatosUsuario[] findWhereExtensionEquals(String extension) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXTENSION = ? ORDER BY EXTENSION", new Object[] { extension } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'CELULAR = :celular'.
	 */
	public DatosUsuario[] findWhereCelularEquals(String celular) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CELULAR = ? ORDER BY CELULAR", new Object[] { celular } );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'CORREO = :correo'.
	 */
	public DatosUsuario[] findWhereCorreoEquals(String correo) throws DatosUsuarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREO = ? ORDER BY CORREO", new Object[] { correo } );
	}

	/**
	 * Method 'DatosUsuarioDaoImpl'
	 * 
	 */
	public DatosUsuarioDaoImpl()
	{
	}

	/**
	 * Method 'DatosUsuarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public DatosUsuarioDaoImpl(final java.sql.Connection userConn)
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
		return "datos_usuario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DatosUsuario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DatosUsuario dto = new DatosUsuario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DatosUsuario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DatosUsuario dto = new DatosUsuario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DatosUsuario ret[] = new DatosUsuario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DatosUsuario dto, ResultSet rs) throws SQLException
	{
		dto.setIdDatosUsuario( rs.getInt( COLUMN_ID_DATOS_USUARIO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setApellidoPat( rs.getString( COLUMN_APELLIDO_PAT ) );
		dto.setApellidoMat( rs.getString( COLUMN_APELLIDO_MAT ) );
		dto.setDireccion( rs.getString( COLUMN_DIRECCION ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setExtension( rs.getString( COLUMN_EXTENSION ) );
		dto.setCelular( rs.getString( COLUMN_CELULAR ) );
		dto.setCorreo( rs.getString( COLUMN_CORREO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DatosUsuario dto)
	{
		dto.setIdDatosUsuarioModified( false );
		dto.setNombreModified( false );
		dto.setApellidoPatModified( false );
		dto.setApellidoMatModified( false );
		dto.setDireccionModified( false );
		dto.setTelefonoModified( false );
		dto.setExtensionModified( false );
		dto.setCelularModified( false );
		dto.setCorreoModified( false );
	}

	/** 
	 * Returns all rows from the datos_usuario table that match the specified arbitrary SQL statement
	 */
	public DatosUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatosUsuarioDaoException
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
			throw new DatosUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the datos_usuario table that match the specified arbitrary SQL statement
	 */
	public DatosUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatosUsuarioDaoException
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
			throw new DatosUsuarioDaoException( "Exception: " + _e.getMessage(), _e );
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
