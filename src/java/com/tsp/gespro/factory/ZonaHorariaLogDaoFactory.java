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

public class ZonaHorariaLogDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ZonaHorariaLogDao
	 */
	public static ZonaHorariaLogDao create()
	{
		return new ZonaHorariaLogDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ZonaHorariaLogDao
	 */
	public static ZonaHorariaLogDao create(Connection conn)
	{
		return new ZonaHorariaLogDaoImpl( conn );
	}

}
