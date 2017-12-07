package com.jerry.crm.staff.service;

import java.util.List;

import com.jerry.crm.staff.domain.CrmStaff;

public interface StaffService {
	/**
	 * ��¼
	 * @param staff
	 * @return
	 */
	public CrmStaff login(CrmStaff staff);
	/**
	 * ��ѯ����
	 * @param ��List<staff>
	 * @return
	 */
	public List<CrmStaff> findAll();
	
	/**
	 * ͨ��Id ��ѯ
	 * @param staffId
	 * @return
	 */
	public CrmStaff findById(String staffId);
	
	/**
	 * ����Ա��
	 * @param staff
	 */
	public void updateStaff(CrmStaff staff);

}
