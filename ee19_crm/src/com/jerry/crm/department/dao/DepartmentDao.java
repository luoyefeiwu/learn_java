/**
 * 
 */
/**
 * @author shengyan
 *
 */
package com.jerry.crm.department.dao;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;

public interface DepartmentDao {
	/*
	 * 
	 * ��ѯ����
	 */
	public List<CrmDepartment> findAll();
}