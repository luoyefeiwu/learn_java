package com.jerry.crm.staff.dao;

import java.util.List;

import com.jerry.crm.staff.domain.CrmStaff;

public interface StaffDao {
	/*
	 * ͨ���û����������ѯ
	 * @param loginName
	 * @param loginPwd
	 * @return 
	 * */
	public CrmStaff find(String loginName,String loginPwd);
	public List<CrmStaff> findAll();
	public CrmStaff findById(String staffId);
}
