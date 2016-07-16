/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.factory;

import java.sql.Connection;
import com.tsp.gespro.dao.*;
import com.tsp.gespro.jdbc.*;

public class RutaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RutaDao
	 */
	public static RutaDao create()
	{
		return new RutaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RutaDao
	 */
	public static RutaDao create(Connection conn)
	{
		return new RutaDaoImpl( conn );
	}

}
