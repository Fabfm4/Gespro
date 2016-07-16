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
import java.util.Date;
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

public class ClienteDaoImpl extends AbstractDAO implements ClienteDao
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
	protected final String SQL_SELECT = "SELECT ID_CLIENTE, ID_EMPRESA, ID_CATEGORIA, ID_ESTATUS, NOMBRE_COMERCIAL, CONTACTO, TELEFONO, CALLE, NUMERO, NUMERO_INTERIOR, COLONIA, CODIGO_POSTAL, PAIS, ESTADO, MUNICIPIO, CORREO, LATITUD, LONGITUD, FECHA_REGISTRO, ID_USUARIO_ALTA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CLIENTE, ID_EMPRESA, ID_CATEGORIA, ID_ESTATUS, NOMBRE_COMERCIAL, CONTACTO, TELEFONO, CALLE, NUMERO, NUMERO_INTERIOR, COLONIA, CODIGO_POSTAL, PAIS, ESTADO, MUNICIPIO, CORREO, LATITUD, LONGITUD, FECHA_REGISTRO, ID_USUARIO_ALTA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CLIENTE = ?, ID_EMPRESA = ?, ID_CATEGORIA = ?, ID_ESTATUS = ?, NOMBRE_COMERCIAL = ?, CONTACTO = ?, TELEFONO = ?, CALLE = ?, NUMERO = ?, NUMERO_INTERIOR = ?, COLONIA = ?, CODIGO_POSTAL = ?, PAIS = ?, ESTADO = ?, MUNICIPIO = ?, CORREO = ?, LATITUD = ?, LONGITUD = ?, FECHA_REGISTRO = ?, ID_USUARIO_ALTA = ? WHERE ID_CLIENTE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CLIENTE = ?";

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_CATEGORIA
	 */
	protected static final int COLUMN_ID_CATEGORIA = 3;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 4;

	/** 
	 * Index of column NOMBRE_COMERCIAL
	 */
	protected static final int COLUMN_NOMBRE_COMERCIAL = 5;

	/** 
	 * Index of column CONTACTO
	 */
	protected static final int COLUMN_CONTACTO = 6;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 7;

	/** 
	 * Index of column CALLE
	 */
	protected static final int COLUMN_CALLE = 8;

	/** 
	 * Index of column NUMERO
	 */
	protected static final int COLUMN_NUMERO = 9;

	/** 
	 * Index of column NUMERO_INTERIOR
	 */
	protected static final int COLUMN_NUMERO_INTERIOR = 10;

	/** 
	 * Index of column COLONIA
	 */
	protected static final int COLUMN_COLONIA = 11;

	/** 
	 * Index of column CODIGO_POSTAL
	 */
	protected static final int COLUMN_CODIGO_POSTAL = 12;

	/** 
	 * Index of column PAIS
	 */
	protected static final int COLUMN_PAIS = 13;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 14;

	/** 
	 * Index of column MUNICIPIO
	 */
	protected static final int COLUMN_MUNICIPIO = 15;

	/** 
	 * Index of column CORREO
	 */
	protected static final int COLUMN_CORREO = 16;

	/** 
	 * Index of column LATITUD
	 */
	protected static final int COLUMN_LATITUD = 17;

	/** 
	 * Index of column LONGITUD
	 */
	protected static final int COLUMN_LONGITUD = 18;

	/** 
	 * Index of column FECHA_REGISTRO
	 */
	protected static final int COLUMN_FECHA_REGISTRO = 19;

	/** 
	 * Index of column ID_USUARIO_ALTA
	 */
	protected static final int COLUMN_ID_USUARIO_ALTA = 20;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 20;

	/** 
	 * Index of primary-key column ID_CLIENTE
	 */
	protected static final int PK_COLUMN_ID_CLIENTE = 1;

	/** 
	 * Inserts a new row in the cliente table.
	 */
	public ClientePk insert(Cliente dto) throws ClienteDaoException
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
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdCategoriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CATEGORIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreComercialModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_COMERCIAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isContactoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONTACTO" );
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
		
			if (dto.isCalleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CALLE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroInteriorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_INTERIOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isColoniaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COLONIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCodigoPostalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CODIGO_POSTAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPaisModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PAIS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ESTADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMunicipioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MUNICIPIO" );
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
		
			if (dto.isLatitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LATITUD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLongitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LONGITUD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaRegistroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_REGISTRO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioAltaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_ALTA" );
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
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdCategoriaModified()) {
				stmt.setInt( index++, dto.getIdCategoria() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isNombreComercialModified()) {
				stmt.setString( index++, dto.getNombreComercial() );
			}
		
			if (dto.isContactoModified()) {
				stmt.setString( index++, dto.getContacto() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCalleModified()) {
				stmt.setString( index++, dto.getCalle() );
			}
		
			if (dto.isNumeroModified()) {
				stmt.setString( index++, dto.getNumero() );
			}
		
			if (dto.isNumeroInteriorModified()) {
				stmt.setString( index++, dto.getNumeroInterior() );
			}
		
			if (dto.isColoniaModified()) {
				stmt.setString( index++, dto.getColonia() );
			}
		
			if (dto.isCodigoPostalModified()) {
				stmt.setString( index++, dto.getCodigoPostal() );
			}
		
			if (dto.isPaisModified()) {
				stmt.setString( index++, dto.getPais() );
			}
		
			if (dto.isEstadoModified()) {
				stmt.setString( index++, dto.getEstado() );
			}
		
			if (dto.isMunicipioModified()) {
				stmt.setString( index++, dto.getMunicipio() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			if (dto.isLatitudModified()) {
				if (dto.isLatitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLatitud() );
				}
		
			}
		
			if (dto.isLongitudModified()) {
				if (dto.isLongitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLongitud() );
				}
		
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdUsuarioAltaModified()) {
				if (dto.isIdUsuarioAltaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioAlta() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdCliente( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ClienteDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cliente table.
	 */
	public void update(ClientePk pk, Cliente dto) throws ClienteDaoException
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
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdCategoriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CATEGORIA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isNombreComercialModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_COMERCIAL=?" );
				modified=true;
			}
		
			if (dto.isContactoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONTACTO=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isCalleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CALLE=?" );
				modified=true;
			}
		
			if (dto.isNumeroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO=?" );
				modified=true;
			}
		
			if (dto.isNumeroInteriorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_INTERIOR=?" );
				modified=true;
			}
		
			if (dto.isColoniaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COLONIA=?" );
				modified=true;
			}
		
			if (dto.isCodigoPostalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CODIGO_POSTAL=?" );
				modified=true;
			}
		
			if (dto.isPaisModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PAIS=?" );
				modified=true;
			}
		
			if (dto.isEstadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ESTADO=?" );
				modified=true;
			}
		
			if (dto.isMunicipioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MUNICIPIO=?" );
				modified=true;
			}
		
			if (dto.isCorreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CORREO=?" );
				modified=true;
			}
		
			if (dto.isLatitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LATITUD=?" );
				modified=true;
			}
		
			if (dto.isLongitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LONGITUD=?" );
				modified=true;
			}
		
			if (dto.isFechaRegistroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_REGISTRO=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioAltaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_ALTA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CLIENTE=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdCategoriaModified()) {
				stmt.setInt( index++, dto.getIdCategoria() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isNombreComercialModified()) {
				stmt.setString( index++, dto.getNombreComercial() );
			}
		
			if (dto.isContactoModified()) {
				stmt.setString( index++, dto.getContacto() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCalleModified()) {
				stmt.setString( index++, dto.getCalle() );
			}
		
			if (dto.isNumeroModified()) {
				stmt.setString( index++, dto.getNumero() );
			}
		
			if (dto.isNumeroInteriorModified()) {
				stmt.setString( index++, dto.getNumeroInterior() );
			}
		
			if (dto.isColoniaModified()) {
				stmt.setString( index++, dto.getColonia() );
			}
		
			if (dto.isCodigoPostalModified()) {
				stmt.setString( index++, dto.getCodigoPostal() );
			}
		
			if (dto.isPaisModified()) {
				stmt.setString( index++, dto.getPais() );
			}
		
			if (dto.isEstadoModified()) {
				stmt.setString( index++, dto.getEstado() );
			}
		
			if (dto.isMunicipioModified()) {
				stmt.setString( index++, dto.getMunicipio() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			if (dto.isLatitudModified()) {
				if (dto.isLatitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLatitud() );
				}
		
			}
		
			if (dto.isLongitudModified()) {
				if (dto.isLongitudNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getLongitud() );
				}
		
			}
		
			if (dto.isFechaRegistroModified()) {
				stmt.setTimestamp(index++, dto.getFechaRegistro()==null ? null : new java.sql.Timestamp( dto.getFechaRegistro().getTime() ) );
			}
		
			if (dto.isIdUsuarioAltaModified()) {
				if (dto.isIdUsuarioAltaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioAlta() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdCliente() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ClienteDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cliente table.
	 */
	public void delete(ClientePk pk) throws ClienteDaoException
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
			stmt.setInt( 1, pk.getIdCliente() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ClienteDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cliente table that matches the specified primary-key value.
	 */
	public Cliente findByPrimaryKey(ClientePk pk) throws ClienteDaoException
	{
		return findByPrimaryKey( pk.getIdCliente() );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Cliente findByPrimaryKey(int idCliente) throws ClienteDaoException
	{
		Cliente ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ?", new Object[] {  new Integer(idCliente) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria ''.
	 */
	public Cliente[] findAll() throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CLIENTE", null );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Cliente[] findWhereIdClienteEquals(int idCliente) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Cliente[] findWhereIdEmpresaEquals(int idEmpresa) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_CATEGORIA = :idCategoria'.
	 */
	public Cliente[] findWhereIdCategoriaEquals(int idCategoria) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CATEGORIA = ? ORDER BY ID_CATEGORIA", new Object[] {  new Integer(idCategoria) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Cliente[] findWhereIdEstatusEquals(int idEstatus) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'NOMBRE_COMERCIAL = :nombreComercial'.
	 */
	public Cliente[] findWhereNombreComercialEquals(String nombreComercial) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_COMERCIAL = ? ORDER BY NOMBRE_COMERCIAL", new Object[] { nombreComercial } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'CONTACTO = :contacto'.
	 */
	public Cliente[] findWhereContactoEquals(String contacto) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTACTO = ? ORDER BY CONTACTO", new Object[] { contacto } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Cliente[] findWhereTelefonoEquals(String telefono) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'CALLE = :calle'.
	 */
	public Cliente[] findWhereCalleEquals(String calle) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CALLE = ? ORDER BY CALLE", new Object[] { calle } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'NUMERO = :numero'.
	 */
	public Cliente[] findWhereNumeroEquals(String numero) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO = ? ORDER BY NUMERO", new Object[] { numero } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'NUMERO_INTERIOR = :numeroInterior'.
	 */
	public Cliente[] findWhereNumeroInteriorEquals(String numeroInterior) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_INTERIOR = ? ORDER BY NUMERO_INTERIOR", new Object[] { numeroInterior } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'COLONIA = :colonia'.
	 */
	public Cliente[] findWhereColoniaEquals(String colonia) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COLONIA = ? ORDER BY COLONIA", new Object[] { colonia } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'CODIGO_POSTAL = :codigoPostal'.
	 */
	public Cliente[] findWhereCodigoPostalEquals(String codigoPostal) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_POSTAL = ? ORDER BY CODIGO_POSTAL", new Object[] { codigoPostal } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'PAIS = :pais'.
	 */
	public Cliente[] findWherePaisEquals(String pais) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAIS = ? ORDER BY PAIS", new Object[] { pais } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ESTADO = :estado'.
	 */
	public Cliente[] findWhereEstadoEquals(String estado) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] { estado } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'MUNICIPIO = :municipio'.
	 */
	public Cliente[] findWhereMunicipioEquals(String municipio) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO = ? ORDER BY MUNICIPIO", new Object[] { municipio } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'CORREO = :correo'.
	 */
	public Cliente[] findWhereCorreoEquals(String correo) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREO = ? ORDER BY CORREO", new Object[] { correo } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'LATITUD = :latitud'.
	 */
	public Cliente[] findWhereLatitudEquals(double latitud) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LATITUD = ? ORDER BY LATITUD", new Object[] {  new Double(latitud) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'LONGITUD = :longitud'.
	 */
	public Cliente[] findWhereLongitudEquals(double longitud) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LONGITUD = ? ORDER BY LONGITUD", new Object[] {  new Double(longitud) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public Cliente[] findWhereFechaRegistroEquals(Date fechaRegistro) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_REGISTRO = ? ORDER BY FECHA_REGISTRO", new Object[] { fechaRegistro==null ? null : new java.sql.Timestamp( fechaRegistro.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cliente table that match the criteria 'ID_USUARIO_ALTA = :idUsuarioAlta'.
	 */
	public Cliente[] findWhereIdUsuarioAltaEquals(int idUsuarioAlta) throws ClienteDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_ALTA = ? ORDER BY ID_USUARIO_ALTA", new Object[] {  new Integer(idUsuarioAlta) } );
	}

	/**
	 * Method 'ClienteDaoImpl'
	 * 
	 */
	public ClienteDaoImpl()
	{
	}

	/**
	 * Method 'ClienteDaoImpl'
	 * 
	 * @param userConn
	 */
	public ClienteDaoImpl(final java.sql.Connection userConn)
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
		return "cliente";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Cliente fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Cliente dto = new Cliente();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Cliente[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Cliente dto = new Cliente();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Cliente ret[] = new Cliente[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Cliente dto, ResultSet rs) throws SQLException
	{
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdCategoria( rs.getInt( COLUMN_ID_CATEGORIA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setNombreComercial( rs.getString( COLUMN_NOMBRE_COMERCIAL ) );
		dto.setContacto( rs.getString( COLUMN_CONTACTO ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setCalle( rs.getString( COLUMN_CALLE ) );
		dto.setNumero( rs.getString( COLUMN_NUMERO ) );
		dto.setNumeroInterior( rs.getString( COLUMN_NUMERO_INTERIOR ) );
		dto.setColonia( rs.getString( COLUMN_COLONIA ) );
		dto.setCodigoPostal( rs.getString( COLUMN_CODIGO_POSTAL ) );
		dto.setPais( rs.getString( COLUMN_PAIS ) );
		dto.setEstado( rs.getString( COLUMN_ESTADO ) );
		dto.setMunicipio( rs.getString( COLUMN_MUNICIPIO ) );
		dto.setCorreo( rs.getString( COLUMN_CORREO ) );
		dto.setLatitud( rs.getDouble( COLUMN_LATITUD ) );
		if (rs.wasNull()) {
			dto.setLatitudNull( true );
		}
		
		dto.setLongitud( rs.getDouble( COLUMN_LONGITUD ) );
		if (rs.wasNull()) {
			dto.setLongitudNull( true );
		}
		
		dto.setFechaRegistro( rs.getTimestamp(COLUMN_FECHA_REGISTRO ) );
		dto.setIdUsuarioAlta( rs.getInt( COLUMN_ID_USUARIO_ALTA ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioAltaNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Cliente dto)
	{
		dto.setIdClienteModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdCategoriaModified( false );
		dto.setIdEstatusModified( false );
		dto.setNombreComercialModified( false );
		dto.setContactoModified( false );
		dto.setTelefonoModified( false );
		dto.setCalleModified( false );
		dto.setNumeroModified( false );
		dto.setNumeroInteriorModified( false );
		dto.setColoniaModified( false );
		dto.setCodigoPostalModified( false );
		dto.setPaisModified( false );
		dto.setEstadoModified( false );
		dto.setMunicipioModified( false );
		dto.setCorreoModified( false );
		dto.setLatitudModified( false );
		dto.setLongitudModified( false );
		dto.setFechaRegistroModified( false );
		dto.setIdUsuarioAltaModified( false );
	}

	/** 
	 * Returns all rows from the cliente table that match the specified arbitrary SQL statement
	 */
	public Cliente[] findByDynamicSelect(String sql, Object[] sqlParams) throws ClienteDaoException
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
			throw new ClienteDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cliente table that match the specified arbitrary SQL statement
	 */
	public Cliente[] findByDynamicWhere(String sql, Object[] sqlParams) throws ClienteDaoException
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
			throw new ClienteDaoException( "Exception: " + _e.getMessage(), _e );
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
