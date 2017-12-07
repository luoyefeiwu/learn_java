package com.jerry.crm.coursetype.service;

import java.util.List;

import com.jerry.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeService {

	
	/**
	 * 查询所有
	 * @return
	 */
	public List<CrmCourseType> findAll();
	
	/**
	 * 按照条件查询所有
	 * @param crmCourseType
	 * @return
	 */
	public List<CrmCourseType> findAll(CrmCourseType crmCourseType);
	
	/**
	 * 按条件查询
	 * @param crmCourseType
	 * @return
	 */
	public CrmCourseType findById(String courseTypeId);
	
	/**
	 * 更新或者保存操作
	 * @param crmCourseType
	 */
	public void addOrEdit(CrmCourseType crmCourseType);
}
