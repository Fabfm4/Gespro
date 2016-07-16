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

public class EstanteriaDescripcionDaoImpl extends AbstractDAO implements EstanteriaDescripcionDao
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
	protected final String SQL_SELECT = "SELECT ID_DESCRIPCION, ID_ESTANTERIA, ID_COMPETENCIA, ID_ESTATUS, CANTIDAD, PRECIO, NOMBRE_EMBALAJE, FECHA_CADUCIDAD, ID_RELACION_CONCEPTO_COMPETENCIA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_DESCRIPCION, ID_ESTANTERIA, ID_COMPETENCIA, ID_ESTATUS, CANTIDAD, PRECIO, NOMBRE_EMBALAJE, FECHA_CADUCIDAD, ID_RELACION_CONCEPTO_COMPETENCIA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_DESCRIPCION = ?, ID_ESTANTERIA = ?, ID_COMPETENCIA = ?, ID_ESTATUS = ?, CANTIDAD = ?, PRECIO = ?, NOMBRE_EMBALAJE = ?, FECHA_CADUCIDAD = ?, ID_RELACION_CONCEPTO_COMPETENCIA = ? WHERE ID_DESCRIPCION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_DESCRIPCION = ?";

	/** 
	 * Index of column ID_DESCRIPCION
	 */
	protected static final int COLUMN_ID_DESCRIPCION = 1;

	/** 
	 * Index of column ID_ESTANTERIA
	 */
	protected static final int COLUMN_ID_ESTANTERIA = 2;

	/** 
	 * Index of column ID_COMPETENCIA
	 */
	protected static final int COLUMN_ID_COMPETENCIA = 3;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 4;

	/** 
	 * Index of column CANTIDAD
	 */
	protected static final int COLUMN_CANTIDAD = 5;

	/** 
	 * Index of column PRECIO
	 */
	protected static final int COLUMN_PRECIO = 6;

	/** 
	 * Index of column NOMBRE_EMBALAJE
	 */
	protected static final int COLUMN_NOMBRE_EMBALAJE = 7;

	/** 
	 * Index of column FECHA_CADUCIDAD
	 */
	protected static final int COLUMN_FECHA_CADUCIDAD = 8;

	/** 
	 * Index of column ID_RELACION_CONCEPTO_COMPETENCIA
	 */
	protected static final int COLUMN_ID_RELACION_CONCEPTO_COMPETENCIA = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_DESCRIPCION
	 */
	protected static final int PK_COLUMN_ID_DESCRIPCION = 1;

	/** 
	 * Inserts a new row in the estanteria_descripcion table.
	 */
	public EstanteriaDescripcionPk insert(EstanteriaDescripcion dto) throws EstanteriaDescripcionDaoException
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
			if (dto.isIdDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstanteriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTANTERIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdCompetenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMPETENCIA" );
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
		
			if (dto.isCantidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CANTIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRECIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreEmbalajeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_EMBALAJE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaCaducidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_CADUCIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdRelacionConceptoCompetenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_RELACION_CONCEPTO_COMPETENCIA" );
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
			if (dto.isIdDescripcionModified()) {
				stmt.setInt( index++, dto.getIdDescripcion() );
			}
		
			if (dto.isIdEstanteriaModified()) {
				if (dto.isIdEstanteriaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstanteria() );
				}
		
			}
		
			if (dto.isIdCompetenciaModified()) {
				if (dto.isIdCompetenciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCompetencia() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isCantidadModified()) {
				if (dto.isCantidadNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidad() );
				}
		
			}
		
			if (dto.isPrecioModified()) {
				if (dto.isPrecioNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecio() );
				}
		
			}
		
			if (dto.isNombreEmbalajeModified()) {
				stmt.setString( index++, dto.getNombreEmbalaje() );
			}
		
			if (dto.isFechaCaducidadModified()) {
				stmt.setDate(index++, dto.getFechaCaducidad()==null ? null : new java.sql.Date( dto.getFechaCaducidad().getTime() ) );
			}
		
			if (dto.isIdRelacionConceptoCompetenciaModified()) {
				if (dto.isIdRelacionConceptoCompetenciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdRelacionConceptoCompetencia() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdDescripcion( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EstanteriaDescripcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the estanteria_descripcion table.
	 */
	public void update(EstanteriaDescripcionPk pk, EstanteriaDescripcion dto) throws EstanteriaDescripcionDaoException
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
			if (dto.isIdDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isIdEstanteriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTANTERIA=?" );
				modified=true;
			}
		
			if (dto.isIdCompetenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMPETENCIA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isCantidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CANTIDAD=?" );
				modified=true;
			}
		
			if (dto.isPrecioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRECIO=?" );
				modified=true;
			}
		
			if (dto.isNombreEmbalajeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_EMBALAJE=?" );
				modified=true;
			}
		
			if (dto.isFechaCaducidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_CADUCIDAD=?" );
				modified=true;
			}
		
			if (dto.isIdRelacionConceptoCompetenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_RELACION_CONCEPTO_COMPETENCIA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_DESCRIPCION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDescripcionModified()) {
				stmt.setInt( index++, dto.getIdDescripcion() );
			}
		
			if (dto.isIdEstanteriaModified()) {
				if (dto.isIdEstanteriaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstanteria() );
				}
		
			}
		
			if (dto.isIdCompetenciaModified()) {
				if (dto.isIdCompetenciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCompetencia() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isCantidadModified()) {
				if (dto.isCantidadNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getCantidad() );
				}
		
			}
		
			if (dto.isPrecioModified()) {
				if (dto.isPrecioNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecio() );
				}
		
			}
		
			if (dto.isNombreEmbalajeModified()) {
				stmt.setString( index++, dto.getNombreEmbalaje() );
			}
		
			if (dto.isFechaCaducidadModified()) {
				stmt.setDate(index++, dto.getFechaCaducidad()==null ? null : new java.sql.Date( dto.getFechaCaducidad().getTime() ) );
			}
		
			if (dto.isIdRelacionConceptoCompetenciaModified()) {
				if (dto.isIdRelacionConceptoCompetenciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdRelacionConceptoCompetencia() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdDescripcion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EstanteriaDescripcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the estanteria_descripcion table.
	 */
	public void delete(EstanteriaDescripcionPk pk) throws EstanteriaDescripcionDaoException
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
			stmt.setInt( 1, pk.getIdDescripcion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EstanteriaDescripcionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the estanteria_descripcion table that matches the specified primary-key value.
	 */
	public EstanteriaDescripcion findByPrimaryKey(EstanteriaDescripcionPk pk) throws EstanteriaDescripcionDaoException
	{
		return findByPrimaryKey( pk.getIdDescripcion() );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_DESCRIPCION = :idDescripcion'.
	 */
	public EstanteriaDescripcion findByPrimaryKey(int idDescripcion) throws EstanteriaDescripcionDaoException
	{
		EstanteriaDescripcion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_DESCRIPCION = ?", new Object[] {  new Integer(idDescripcion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria ''.
	 */
	public EstanteriaDescripcion[] findAll() throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_DESCRIPCION", null );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_DESCRIPCION = :idDescripcion'.
	 */
	public EstanteriaDescripcion[] findWhereIdDescripcionEquals(int idDescripcion) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DESCRIPCION = ? ORDER BY ID_DESCRIPCION", new Object[] {  new Integer(idDescripcion) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_ESTANTERIA = :idEstanteria'.
	 */
	public EstanteriaDescripcion[] findWhereIdEstanteriaEquals(int idEstanteria) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTANTERIA = ? ORDER BY ID_ESTANTERIA", new Object[] {  new Integer(idEstanteria) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_COMPETENCIA = :idCompetencia'.
	 */
	public EstanteriaDescripcion[] findWhereIdCompetenciaEquals(int idCompetencia) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPETENCIA = ? ORDER BY ID_COMPETENCIA", new Object[] {  new Integer(idCompetencia) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public EstanteriaDescripcion[] findWhereIdEstatusEquals(int idEstatus) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public EstanteriaDescripcion[] findWhereCantidadEquals(double cantidad) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD = ? ORDER BY CANTIDAD", new Object[] {  new Double(cantidad) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'PRECIO = :precio'.
	 */
	public EstanteriaDescripcion[] findWherePrecioEquals(double precio) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO = ? ORDER BY PRECIO", new Object[] {  new Double(precio) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'NOMBRE_EMBALAJE = :nombreEmbalaje'.
	 */
	public EstanteriaDescripcion[] findWhereNombreEmbalajeEquals(String nombreEmbalaje) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_EMBALAJE = ? ORDER BY NOMBRE_EMBALAJE", new Object[] { nombreEmbalaje } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'FECHA_CADUCIDAD = :fechaCaducidad'.
	 */
	public EstanteriaDescripcion[] findWhereFechaCaducidadEquals(Date fechaCaducidad) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_CADUCIDAD = ? ORDER BY FECHA_CADUCIDAD", new Object[] { fechaCaducidad==null ? null : new java.sql.Date( fechaCaducidad.getTime() ) } );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the criteria 'ID_RELACION_CONCEPTO_COMPETENCIA = :idRelacionConceptoCompetencia'.
	 */
	public EstanteriaDescripcion[] findWhereIdRelacionConceptoCompetenciaEquals(int idRelacionConceptoCompetencia) throws EstanteriaDescripcionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_RELACION_CONCEPTO_COMPETENCIA = ? ORDER BY ID_RELACION_CONCEPTO_COMPETENCIA", new Object[] {  new Integer(idRelacionConceptoCompetencia) } );
	}

	/**
	 * Method 'EstanteriaDescripcionDaoImpl'
	 * 
	 */
	public EstanteriaDescripcionDaoImpl()
	{
	}

	/**
	 * Method 'EstanteriaDescripcionDaoImpl'
	 * 
	 * @param userConn
	 */
	public EstanteriaDescripcionDaoImpl(final java.sql.Connection userConn)
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
		return "estanteria_descripcion";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EstanteriaDescripcion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EstanteriaDescripcion dto = new EstanteriaDescripcion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EstanteriaDescripcion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EstanteriaDescripcion dto = new EstanteriaDescripcion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EstanteriaDescripcion ret[] = new EstanteriaDescripcion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EstanteriaDescripcion dto, ResultSet rs) throws SQLException
	{
		dto.setIdDescripcion( rs.getInt( COLUMN_ID_DESCRIPCION ) );
		dto.setIdEstanteria( rs.getInt( COLUMN_ID_ESTANTERIA ) );
		if (rs.wasNull()) {
			dto.setIdEstanteriaNull( true );
		}
		
		dto.setIdCompetencia( rs.getInt( COLUMN_ID_COMPETENCIA ) );
		if (rs.wasNull()) {
			dto.setIdCompetenciaNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setCantidad( rs.getDouble( COLUMN_CANTIDAD ) );
		if (rs.wasNull()) {
			dto.setCantidadNull( true );
		}
		
		dto.setPrecio( rs.getDouble( COLUMN_PRECIO ) );
		if (rs.wasNull()) {
			dto.setPrecioNull( true );
		}
		
		dto.setNombreEmbalaje( rs.getString( COLUMN_NOMBRE_EMBALAJE ) );
		dto.setFechaCaducidad( rs.getDate(COLUMN_FECHA_CADUCIDAD ) );
		dto.setIdRelacionConceptoCompetencia( rs.getInt( COLUMN_ID_RELACION_CONCEPTO_COMPETENCIA ) );
		if (rs.wasNull()) {
			dto.setIdRelacionConceptoCompetenciaNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EstanteriaDescripcion dto)
	{
		dto.setIdDescripcionModified( false );
		dto.setIdEstanteriaModified( false );
		dto.setIdCompetenciaModified( false );
		dto.setIdEstatusModified( false );
		dto.setCantidadModified( false );
		dto.setPrecioModified( false );
		dto.setNombreEmbalajeModified( false );
		dto.setFechaCaducidadModified( false );
		dto.setIdRelacionConceptoCompetenciaModified( false );
	}

	/** 
	 * Returns all rows from the estanteria_descripcion table that match the specified arbitrary SQL statement
	 */
	public EstanteriaDescripcion[] findByDynamicSelect(String sql, Object[] sqlParams) throws EstanteriaDescripcionDaoException
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
			throw new EstanteriaDescripcionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the estanteria_descripcion table that match the specified arbitrary SQL statement
	 */
	public EstanteriaDescripcion[] findByDynamicWhere(String sql, Object[] sqlParams) throws EstanteriaDescripcionDaoException
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
			throw new EstanteriaDescripcionDaoException( "Exception: " + _e.getMessage(), _e );
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
