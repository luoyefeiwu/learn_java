package com.jerry.crm.coursetype.dao;

import java.util.List;

import com.jerry.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeDao {

	/**
	 * ��ѯ����
	 * @return
	 */
	public List<CrmCourseType> findAll();
	
	/**
	 * ������ѯ
	 * @param condition ����ʽ��" and ..? and ..."
	 * @param params
	 * @return
	 */
	public List<CrmCourseType> findAll(String condition, Object[] params);
	
	
	/**
	 * ��ѯ
	 * @param courseTypeId
	 * @return
	 */
	public CrmCourseType findById(String courseTypeId);
	
	/**
	 * ���»����޸�
	 * @param crmCourseType
	 */
	public void saveOrUpdate(CrmCourseType crmCourseType);

	/**������ѯ  ��ҳ
	 * @param condition
	 * @param params
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List<CrmCourseType> findAll(String condition, Object[] params,int startIndex,int pageSize);
	
	/**
	 * ��ҳ��ѯ�ܼ�¼��
	 * @param conding
	 * @param params
	 * @return
	 */
	public int getTotalRecord(String conding,Object[] params);
}
