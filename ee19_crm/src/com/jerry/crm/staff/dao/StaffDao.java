package com.jerry.crm.staff.dao;

import java.util.List;

import com.jerry.crm.staff.domain.CrmStaff;

public interface StaffDao {
	/*
	 * 通过用户名和密码查询
	 * @param loginName
	 * @param loginPwd
	 * @return 
	 * */
	public CrmStaff find(String loginName,String loginPwd);
	public List<CrmStaff> findAll();
	public CrmStaff findById(String staffId);
}
