package com.jerry.crm.staff.service;

import java.util.List;

import com.jerry.crm.staff.domain.CrmStaff;

public interface StaffService {
	/**
	 * 登录
	 * @param staff
	 * @return
	 */
	public CrmStaff login(CrmStaff staff);
	/**
	 * 查询所有
	 * @param ：List<staff>
	 * @return
	 */
	public List<CrmStaff> findAll();
	
	/**
	 * 通过Id 查询
	 * @param staffId
	 * @return
	 */
	public CrmStaff findById(String staffId);
	
	/**
	 * 更新员工
	 * @param staff
	 */
	public void updateStaff(CrmStaff staff);

}
