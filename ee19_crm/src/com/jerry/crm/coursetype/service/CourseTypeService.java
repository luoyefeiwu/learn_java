package com.jerry.crm.coursetype.service;

import java.util.List;

import com.jerry.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeService {

	
	/**
	 * ��ѯ����
	 * @return
	 */
	public List<CrmCourseType> findAll();
	
	/**
	 * ����������ѯ����
	 * @param crmCourseType
	 * @return
	 */
	public List<CrmCourseType> findAll(CrmCourseType crmCourseType);
	
	/**
	 * ��������ѯ
	 * @param crmCourseType
	 * @return
	 */
	public CrmCourseType findById(String courseTypeId);
	
	/**
	 * ���»��߱������
	 * @param crmCourseType
	 */
	public void addOrEdit(CrmCourseType crmCourseType);
}
