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

public interface ProductosvendidosDao
{
	/** 
	 * Returns all rows from the productosvendidos table that match the criteria ''.
	 */
	public Productosvendidos[] findAll() throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public Productosvendidos[] findWhereIdPedidoEquals(int idPedido) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public Productosvendidos[] findWhereIdConceptoEquals(int idConcepto) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Productosvendidos[] findWhereDescripcionEquals(String descripcion) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'UNIDAD = :unidad'.
	 */
	public Productosvendidos[] findWhereUnidadEquals(String unidad) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'IDENTIFICACION = :identificacion'.
	 */
	public Productosvendidos[] findWhereIdentificacionEquals(String identificacion) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public Productosvendidos[] findWhereCantidadEquals(double cantidad) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'PRECIO_UNITARIO = :precioUnitario'.
	 */
	public Productosvendidos[] findWherePrecioUnitarioEquals(double precioUnitario) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCUENTO_PORCENTAJE = :descuentoPorcentaje'.
	 */
	public Productosvendidos[] findWhereDescuentoPorcentajeEquals(double descuentoPorcentaje) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'DESCUENTO_MONTO = :descuentoMonto'.
	 */
	public Productosvendidos[] findWhereDescuentoMontoEquals(double descuentoMonto) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public Productosvendidos[] findWhereSubtotalEquals(double subtotal) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'COSTO_UNITARIO = :costoUnitario'.
	 */
	public Productosvendidos[] findWhereCostoUnitarioEquals(double costoUnitario) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'PORCENTAJE_COMISION_EMPLEADO = :porcentajeComisionEmpleado'.
	 */
	public Productosvendidos[] findWherePorcentajeComisionEmpleadoEquals(double porcentajeComisionEmpleado) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'CANTIDAD_ENTREGADA = :cantidadEntregada'.
	 */
	public Productosvendidos[] findWhereCantidadEntregadaEquals(double cantidadEntregada) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'FECHA_ENTREGA = :fechaEntrega'.
	 */
	public Productosvendidos[] findWhereFechaEntregaEquals(Date fechaEntrega) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ESTATUS = :estatus'.
	 */
	public Productosvendidos[] findWhereEstatusEquals(short estatus) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'id_Almacen_Origen = :idAlmacenOrigen'.
	 */
	public Productosvendidos[] findWhereIdAlmacenOrigenEquals(int idAlmacenOrigen) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'APTO_PARA_VENTA = :aptoParaVenta'.
	 */
	public Productosvendidos[] findWhereAptoParaVentaEquals(double aptoParaVenta) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'NO_APTO_PARA_VENTA = :noAptoParaVenta'.
	 */
	public Productosvendidos[] findWhereNoAptoParaVentaEquals(double noAptoParaVenta) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'ID_CLASIFICACION = :idClasificacion'.
	 */
	public Productosvendidos[] findWhereIdClasificacionEquals(int idClasificacion) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public Productosvendidos[] findWhereComentariosEquals(String comentarios) throws ProductosvendidosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the productosvendidos table that match the specified arbitrary SQL statement
	 */
	public Productosvendidos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductosvendidosDaoException;

	/** 
	 * Returns all rows from the productosvendidos table that match the specified arbitrary SQL statement
	 */
	public Productosvendidos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductosvendidosDaoException;

}
