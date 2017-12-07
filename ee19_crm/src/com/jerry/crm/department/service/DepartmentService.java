/**
 * 
 */
/**
 * @author shengyan
 *
 */
package com.jerry.crm.department.service;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;

public interface DepartmentService {
	/*
	 * 
	 * 查询所有部门
	 * */
	public List<CrmDepartment> findAll();
}