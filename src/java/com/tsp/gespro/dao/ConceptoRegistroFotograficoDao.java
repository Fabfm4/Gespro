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

public interface ConceptoRegistroFotograficoDao
{
	/** 
	 * Inserts a new row in the concepto_registro_fotografico table.
	 */
	public ConceptoRegistroFotograficoPk insert(ConceptoRegistroFotografico dto) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Updates a single row in the concepto_registro_fotografico table.
	 */
	public void update(ConceptoRegistroFotograficoPk pk, ConceptoRegistroFotografico dto) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Deletes a single row in the concepto_registro_fotografico table.
	 */
	public void delete(ConceptoRegistroFotograficoPk pk) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns the rows from the concepto_registro_fotografico table that matches the specified primary-key value.
	 */
	public ConceptoRegistroFotografico findByPrimaryKey(ConceptoRegistroFotograficoPk pk) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_REGISTRO = :idRegistro'.
	 */
	public ConceptoRegistroFotografico findByPrimaryKey(int idRegistro) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria ''.
	 */
	public ConceptoRegistroFotografico[] findAll() throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_REGISTRO = :idRegistro'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdRegistroEquals(int idRegistro) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdEmpresaEquals(int idEmpresa) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdConceptoEquals(int idConcepto) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdClienteEquals(int idCliente) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdUsuarioEquals(int idUsuario) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_TIPO_FOTO = :idTipoFoto'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdTipoFotoEquals(int idTipoFoto) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public ConceptoRegistroFotografico[] findWhereIdEstatusEquals(int idEstatus) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'NOMBRE_FOTO = :nombreFoto'.
	 */
	public ConceptoRegistroFotografico[] findWhereNombreFotoEquals(String nombreFoto) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'COMENTARIO = :comentario'.
	 */
	public ConceptoRegistroFotografico[] findWhereComentarioEquals(String comentario) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the criteria 'FECHA_HORA = :fechaHora'.
	 */
	public ConceptoRegistroFotografico[] findWhereFechaHoraEquals(Date fechaHora) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the specified arbitrary SQL statement
	 */
	public ConceptoRegistroFotografico[] findByDynamicSelect(String sql, Object[] sqlParams) throws ConceptoRegistroFotograficoDaoException;

	/** 
	 * Returns all rows from the concepto_registro_fotografico table that match the specified arbitrary SQL statement
	 */
	public ConceptoRegistroFotografico[] findByDynamicWhere(String sql, Object[] sqlParams) throws ConceptoRegistroFotograficoDaoException;

}
