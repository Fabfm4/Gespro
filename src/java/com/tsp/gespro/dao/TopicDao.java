/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dao;

import com.tsp.gespro.dto.*;
import com.tsp.gespro.exceptions.*;

public interface TopicDao
{
	/** 
	 * Inserts a new row in the topic table.
	 */
	public TopicPk insert(Topic dto) throws TopicDaoException;

	/** 
	 * Updates a single row in the topic table.
	 */
	public void update(TopicPk pk, Topic dto) throws TopicDaoException;

	/** 
	 * Deletes a single row in the topic table.
	 */
	public void delete(TopicPk pk) throws TopicDaoException;

	/** 
	 * Returns the rows from the topic table that matches the specified primary-key value.
	 */
	public Topic findByPrimaryKey(TopicPk pk) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'id_topic = :idTopic'.
	 */
	public Topic findByPrimaryKey(long idTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria ''.
	 */
	public Topic[] findAll() throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'id_topic = :idTopic'.
	 */
	public Topic[] findWhereIdTopicEquals(long idTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'title_topic = :titleTopic'.
	 */
	public Topic[] findWhereTitleTopicEquals(String titleTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'description_topic = :descriptionTopic'.
	 */
	public Topic[] findWhereDescriptionTopicEquals(String descriptionTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'order_topic = :orderTopic'.
	 */
	public Topic[] findWhereOrderTopicEquals(String orderTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'url_topic = :urlTopic'.
	 */
	public Topic[] findWhereUrlTopicEquals(String urlTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'is_public_topic = :isPublicTopic'.
	 */
	public Topic[] findWhereIsPublicTopicEquals(short isPublicTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'id_parent_topic = :idParentTopic'.
	 */
	public Topic[] findWhereIdParentTopicEquals(long idParentTopic) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the criteria 'is_active_topic = :isActiveTopic'.
	 */
	public Topic[] findWhereIsActiveTopicEquals(short isActiveTopic) throws TopicDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the topic table that match the specified arbitrary SQL statement
	 */
	public Topic[] findByDynamicSelect(String sql, Object[] sqlParams) throws TopicDaoException;

	/** 
	 * Returns all rows from the topic table that match the specified arbitrary SQL statement
	 */
	public Topic[] findByDynamicWhere(String sql, Object[] sqlParams) throws TopicDaoException;

}
