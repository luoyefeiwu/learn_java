package com.jerry.crm.coursetype.dao;

import java.util.List;

import com.jerry.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeDao {

	/**
	 * 查询所有
	 * @return
	 */
	public List<CrmCourseType> findAll();
	
	/**
	 * 条件查询
	 * @param condition ，格式：" and ..? and ..."
	 * @param params
	 * @return
	 */
	public List<CrmCourseType> findAll(String condition, Object[] params);
	
	
	/**
	 * 查询
	 * @param courseTypeId
	 * @return
	 */
	public CrmCourseType findById(String courseTypeId);
	
	/**
	 * 更新或者修改
	 * @param crmCourseType
	 */
	public void saveOrUpdate(CrmCourseType crmCourseType);

	/**条件查询  分页
	 * @param condition
	 * @param params
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List<CrmCourseType> findAll(String condition, Object[] params,int startIndex,int pageSize);
	
	/**
	 * 分页查询总记录数
	 * @param conding
	 * @param params
	 * @return
	 */
	public int getTotalRecord(String conding,Object[] params);
}
