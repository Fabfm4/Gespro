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

public class ProductosvendidosDaoImpl extends AbstractDAO implements ProductosvendidosDao
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
	protected final String SQL_SELECT = "SELECT ID_PEDIDO, ID_CONCEPTO, DESCRIPCION, UNIDAD, IDENTIFICACION, CANTIDAD, PRECIO_UNITARIO, DESCUENTO_PORCENTAJE, DESCUENTO_MONTO, SUBTOTAL, COSTO_UNITARIO, PORCENTAJE_COMISION_EMPLEADO, CANTIDAD_ENTREGADA, FECHA_ENTREGA, ESTATUS, id_Almacen_Origen, APTO_PARA_VENTA, NO_APTO_PARA_VENTA, ID_CLASIFICACION, COMENTARIOS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column ID_PEDIDO
	 */
	protected static final int COLUMN_ID_PEDIDO = 1;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 2;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Index of column UNIDAD
	 */
	protected static final int COLUMN_UNIDAD = 4;

	/** 
	 * Index of column IDENTIFICACION
	 */
	protected static final int COLUMN_IDENTIFICACION = 5;

	/** 
	 * Index of column CANTIDAD
	 */
	protected static final int COLUMN_CANTIDAD = 6;

	/** 
	 * Index of column PRECIO_UNITARIO
	 */
	protected static final int COLUMN_PRECIO_UNITARIO = 7;

	/** 
	 * Index of column DESCUENTO_PORCENTAJE
	 */
	protected static final int COLUMN_DESCUENTO_PORCENTAJE = 8;

	/** 
	 * Index of column DESCUENTO_MONTO
	 */
	protected static final int COLUMN_DESCUENTO_MONTO = 9;

	/** 
	 * Index of column SUBTOTAL
	 */
	protected static final int COLUMN_SUBTOTAL = 10;

	/** 
	 * Index of column COSTO_UNITARIO
	 */
	protected static final int COLUMN_COSTO_UNITARIO = 11;

	/** 
	 * Index of column PORCENTAJE_COMISION_EMPLEADO
	 */
	protected static final int COLUMN_PORCENTAJE_COMISION_EMPLEADO = 12;

	/** 
	 * Index of column CANTIDAD_ENTREGADA
	 */
	protected static final int COLUMN_CANTIDAD_ENTREGADA = 13;

	/** 
	 * Index of column FECHA_ENTREGA
	 */
	protected static final int COLUMN_FECHA_ENTREGA = 14;

	/** 
	 * Index of column ESTATUS
	 */
	protected static final int COLUMN_ESTATUS = 15;

	/** 
	 * Index of column id_Almacen_Origen
	 */
	protected static final int COLUMN_ID_ALMACEN_ORIGEN = 16;

	/** 
	 * Index of column APTO_PARA_VENTA
	 */
	protected static final int COLUMN_APTO_PARA_VENTA = 17;

	/** 
	 * Index of column NO_APTO_PARA_VENTA
	 */
	protected static final int COLUMN_NO_APTO_PARA_VENTA = 18;

	/** 
	 * Index of column ID_CLASIFICACION
	 */
	protected static final int COLUMN_ID_CLASIFICACION = 19;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 20;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 20;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria ''.
	 */
	public Productosvendidos[] findAll() throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public Productosvendidos[] findWhereIdPedidoEquals(int idPedido) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO = ? ORDER BY ID_PEDIDO", new Object[] {  new Integer(idPedido) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public Productosvendidos[] findWhereIdConceptoEquals(int idConcepto) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Productosvendidos[] findWhereDescripcionEquals(String descripcion) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'UNIDAD = :unidad'.
	 */
	public Productosvendidos[] findWhereUnidadEquals(String unidad) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UNIDAD = ? ORDER BY UNIDAD", new Object[] { unidad } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'IDENTIFICACION = :identificacion'.
	 */
	public Productosvendidos[] findWhereIdentificacionEquals(String identificacion) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDENTIFICACION = ? ORDER BY IDENTIFICACION", new Object[] { identificacion } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public Productosvendidos[] findWhereCantidadEquals(double cantidad) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD = ? ORDER BY CANTIDAD", new Object[] {  new Double(cantidad) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'PRECIO_UNITARIO = :precioUnitario'.
	 */
	public Productosvendidos[] findWherePrecioUnitarioEquals(double precioUnitario) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO_UNITARIO = ? ORDER BY PRECIO_UNITARIO", new Object[] {  new Double(precioUnitario) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCUENTO_PORCENTAJE = :descuentoPorcentaje'.
	 */
	public Productosvendidos[] findWhereDescuentoPorcentajeEquals(double descuentoPorcentaje) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCUENTO_PORCENTAJE = ? ORDER BY DESCUENTO_PORCENTAJE", new Object[] {  new Double(descuentoPorcentaje) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCUENTO_MONTO = :descuentoMonto'.
	 */
	public Productosvendidos[] findWhereDescuentoMontoEquals(double descuentoMonto) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCUENTO_MONTO = ? ORDER BY DESCUENTO_MONTO", new Object[] {  new Double(descuentoMonto) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public Productosvendidos[] findWhereSubtotalEquals(double subtotal) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SUBTOTAL = ? ORDER BY SUBTOTAL", new Object[] {  new Double(subtotal) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'COSTO_UNITARIO = :costoUnitario'.
	 */
	public Productosvendidos[] findWhereCostoUnitarioEquals(double costoUnitario) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COSTO_UNITARIO = ? ORDER BY COSTO_UNITARIO", new Object[] {  new Double(costoUnitario) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'PORCENTAJE_COMISION_EMPLEADO = :porcentajeComisionEmpleado'.
	 */
	public Productosvendidos[] findWherePorcentajeComisionEmpleadoEquals(double porcentajeComisionEmpleado) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORCENTAJE_COMISION_EMPLEADO = ? ORDER BY PORCENTAJE_COMISION_EMPLEADO", new Object[] {  new Double(porcentajeComisionEmpleado) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'CANTIDAD_ENTREGADA = :cantidadEntregada'.
	 */
	public Productosvendidos[] findWhereCantidadEntregadaEquals(double cantidadEntregada) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD_ENTREGADA = ? ORDER BY CANTIDAD_ENTREGADA", new Object[] {  new Double(cantidadEntregada) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'FECHA_ENTREGA = :fechaEntrega'.
	 */
	public Productosvendidos[] findWhereFechaEntregaEquals(Date fechaEntrega) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ENTREGA = ? ORDER BY FECHA_ENTREGA", new Object[] { fechaEntrega==null ? null : new java.sql.Timestamp( fechaEntrega.getTime() ) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ESTATUS = :estatus'.
	 */
	public Productosvendidos[] findWhereEstatusEquals(short estatus) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTATUS = ? ORDER BY ESTATUS", new Object[] {  new Short(estatus) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'id_Almacen_Origen = :idAlmacenOrigen'.
	 */
	public Productosvendidos[] findWhereIdAlmacenOrigenEquals(int idAlmacenOrigen) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Almacen_Origen = ? ORDER BY id_Almacen_Origen", new Object[] {  new Integer(idAlmacenOrigen) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'APTO_PARA_VENTA = :aptoParaVenta'.
	 */
	public Productosvendidos[] findWhereAptoParaVentaEquals(double aptoParaVenta) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APTO_PARA_VENTA = ? ORDER BY APTO_PARA_VENTA", new Object[] {  new Double(aptoParaVenta) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'NO_APTO_PARA_VENTA = :noAptoParaVenta'.
	 */
	public Productosvendidos[] findWhereNoAptoParaVentaEquals(double noAptoParaVenta) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NO_APTO_PARA_VENTA = ? ORDER BY NO_APTO_PARA_VENTA", new Object[] {  new Double(noAptoParaVenta) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_CLASIFICACION = :idClasificacion'.
	 */
	public Productosvendidos[] findWhereIdClasificacionEquals(int idClasificacion) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLASIFICACION = ? ORDER BY ID_CLASIFICACION", new Object[] {  new Integer(idClasificacion) } );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public Productosvendidos[] findWhereComentariosEquals(String comentarios) throws ProductosvendidosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/**
	 * Method 'ProductosvendidosDaoImpl'
	 * 
	 */
	public ProductosvendidosDaoImpl()
	{
	}

	/**
	 * Method 'ProductosvendidosDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProductosvendidosDaoImpl(final java.sql.Connection userConn)
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
		return "productosvendidos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Productosvendidos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Productosvendidos dto = new Productosvendidos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Productosvendidos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Productosvendidos dto = new Productosvendidos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Productosvendidos ret[] = new Productosvendidos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Productosvendidos dto, ResultSet rs) throws SQLException
	{
		dto.setIdPedido( rs.getInt( COLUMN_ID_PEDIDO ) );
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setUnidad( rs.getString( COLUMN_UNIDAD ) );
		dto.setIdentificacion( rs.getString( COLUMN_IDENTIFICACION ) );
		dto.setCantidad( rs.getDouble( COLUMN_CANTIDAD ) );
		if (rs.wasNull()) {
			dto.setCantidadNull( true );
		}
		
		dto.setPrecioUnitario( rs.getDouble( COLUMN_PRECIO_UNITARIO ) );
		dto.setDescuentoPorcentaje( rs.getDouble( COLUMN_DESCUENTO_PORCENTAJE ) );
		if (rs.wasNull()) {
			dto.setDescuentoPorcentajeNull( true );
		}
		
		dto.setDescuentoMonto( rs.getDouble( COLUMN_DESCUENTO_MONTO ) );
		if (rs.wasNull()) {
			dto.setDescuentoMontoNull( true );
		}
		
		dto.setSubtotal( rs.getDouble( COLUMN_SUBTOTAL ) );
		if (rs.wasNull()) {
			dto.setSubtotalNull( true );
		}
		
		dto.setCostoUnitario( rs.getDouble( COLUMN_COSTO_UNITARIO ) );
		if (rs.wasNull()) {
			dto.setCostoUnitarioNull( true );
		}
		
		dto.setPorcentajeComisionEmpleado( rs.getDouble( COLUMN_PORCENTAJE_COMISION_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setPorcentajeComisionEmpleadoNull( true );
		}
		
		dto.setCantidadEntregada( rs.getDouble( COLUMN_CANTIDAD_ENTREGADA ) );
		if (rs.wasNull()) {
			dto.setCantidadEntregadaNull( true );
		}
		
		dto.setFechaEntrega( rs.getTimestamp(COLUMN_FECHA_ENTREGA ) );
		dto.setEstatus( rs.getShort( COLUMN_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setEstatusNull( true );
		}
		
		dto.setIdAlmacenOrigen( rs.getInt( COLUMN_ID_ALMACEN_ORIGEN ) );
		if (rs.wasNull()) {
			dto.setIdAlmacenOrigenNull( true );
		}
		
		dto.setAptoParaVenta( rs.getDouble( COLUMN_APTO_PARA_VENTA ) );
		if (rs.wasNull()) {
			dto.setAptoParaVentaNull( true );
		}
		
		dto.setNoAptoParaVenta( rs.getDouble( COLUMN_NO_APTO_PARA_VENTA ) );
		if (rs.wasNull()) {
			dto.setNoAptoParaVentaNull( true );
		}
		
		dto.setIdClasificacion( rs.getInt( COLUMN_ID_CLASIFICACION ) );
		if (rs.wasNull()) {
			dto.setIdClasificacionNull( true );
		}
		
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Productosvendidos dto)
	{
		dto.setIdPedidoModified( false );
		dto.setIdConceptoModified( false );
		dto.setDescripcionModified( false );
		dto.setUnidadModified( false );
		dto.setIdentificacionModified( false );
		dto.setCantidadModified( false );
		dto.setPrecioUnitarioModified( false );
		dto.setDescuentoPorcentajeModified( false );
		dto.setDescuentoMontoModified( false );
		dto.setSubtotalModified( false );
		dto.setCostoUnitarioModified( false );
		dto.setPorcentajeComisionEmpleadoModified( false );
		dto.setCantidadEntregadaModified( false );
		dto.setFechaEntregaModified( false );
		dto.setEstatusModified( false );
		dto.setIdAlmacenOrigenModified( false );
		dto.setAptoParaVentaModified( false );
		dto.setNoAptoParaVentaModified( false );
		dto.setIdClasificacionModified( false );
		dto.setComentariosModified( false );
	}

	/** 
	 * Returns all rows from the productosvendidos table that match the specified arbitrary SQL statement
	 */
	public Productosvendidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductosvendidosDaoException
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
			throw new ProductosvendidosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the productosvendidos table that match the specified arbitrary SQL statement
	 */
	public Productosvendidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductosvendidosDaoException
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
			throw new ProductosvendidosDaoException( "Exception: " + _e.getMessage(), _e );
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
