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

public interface EmpresaDao
{
	/** 
	 * Inserts a new row in the empresa table.
	 */
	public EmpresaPk insert(Empresa dto) throws EmpresaDaoException;

	/** 
	 * Updates a single row in the empresa table.
	 */
	public void update(EmpresaPk pk, Empresa dto) throws EmpresaDaoException;

	/** 
	 * Deletes a single row in the empresa table.
	 */
	public void delete(EmpresaPk pk) throws EmpresaDaoException;

	/** 
	 * Returns the rows from the empresa table that matches the specified primary-key value.
	 */
	public Empresa findByPrimaryKey(EmpresaPk pk) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Empresa findByPrimaryKey(int idEmpresa) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria ''.
	 */
	public Empresa[] findAll() throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_EMPRESA_PADRE = :idEmpresaPadre'.
	 */
	public Empresa[] findByEmpresa(int idEmpresaPadre) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_UBICACION_FISCAL = :idUbicacionFiscal'.
	 */
	public Empresa[] findByUbicacion(int idUbicacionFiscal) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_TIPO_EMPRESA = :idTipoEmpresa'.
	 */
	public Empresa[] findByTipoEmpresa(int idTipoEmpresa) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Empresa[] findByEstatus(int idEstatus) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Empresa[] findWhereIdEmpresaEquals(int idEmpresa) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_EMPRESA_PADRE = :idEmpresaPadre'.
	 */
	public Empresa[] findWhereIdEmpresaPadreEquals(int idEmpresaPadre) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_UBICACION_FISCAL = :idUbicacionFiscal'.
	 */
	public Empresa[] findWhereIdUbicacionFiscalEquals(int idUbicacionFiscal) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_TIPO_EMPRESA = :idTipoEmpresa'.
	 */
	public Empresa[] findWhereIdTipoEmpresaEquals(int idTipoEmpresa) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Empresa[] findWhereIdEstatusEquals(int idEstatus) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'RFC = :rfc'.
	 */
	public Empresa[] findWhereRfcEquals(String rfc) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'RAZON_SOCIAL = :razonSocial'.
	 */
	public Empresa[] findWhereRazonSocialEquals(String razonSocial) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'NOMBRE_COMERCIAL = :nombreComercial'.
	 */
	public Empresa[] findWhereNombreComercialEquals(String nombreComercial) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'REGIMEN_FISCAL = :regimenFiscal'.
	 */
	public Empresa[] findWhereRegimenFiscalEquals(String regimenFiscal) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'COMPARTIR_CONCEPTOS_MATRIZ = :compartirConceptosMatriz'.
	 */
	public Empresa[] findWhereCompartirConceptosMatrizEquals(int compartirConceptosMatriz) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'LATITUD = :latitud'.
	 */
	public Empresa[] findWhereLatitudEquals(double latitud) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'LONGITUD = :longitud'.
	 */
	public Empresa[] findWhereLongitudEquals(double longitud) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'FECHA_REGISTRO = :fechaRegistro'.
	 */
	public Empresa[] findWhereFechaRegistroEquals(Date fechaRegistro) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the criteria 'GIRO = :giro'.
	 */
	public Empresa[] findWhereGiroEquals(String giro) throws EmpresaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the empresa table that match the specified arbitrary SQL statement
	 */
	public Empresa[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpresaDaoException;

	/** 
	 * Returns all rows from the empresa table that match the specified arbitrary SQL statement
	 */
	public Empresa[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpresaDaoException;

}
