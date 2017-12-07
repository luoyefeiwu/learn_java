package com.jerry.crm.staff.service.impl;

import java.util.List;

import com.jerry.crm.staff.dao.StaffDao;
import com.jerry.crm.staff.domain.CrmStaff;
import com.jerry.crm.staff.service.StaffService;
import com.jerry.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService {
	private StaffDao staffDao;

	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public CrmStaff login(CrmStaff staff) {
		String loginPwd = MyStringUtils.getMD5Value(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(), loginPwd);
	}

	@Override
	public List<CrmStaff> findAll() {
		return staffDao.findAll();
	}

	@Override
	public CrmStaff findById(String staffId) {
		return staffDao.findById(staffId);
	}

	@Override
	public void updateStaff(CrmStaff staff) {
		/*
		 * 1 ����1���ж������Ƿ�32���ȣ� * ����ǣ�����û���޸ģ�֮ǰ�����ܺ�ģ� * ������ǣ������Ѿ��޸��ˣ�֮����Ҫ���ܣ�
		 */

		/*
		 * 2 ��ʽ2������������ * dao.update(staff)��Ĭ�ϸ������е����� * CrmStaff.hbm.xml
		 * �������벻�μӸ��� , <property name="loginPwd" update="false"></property>
		 */

		/*
		 * 3 ����3����ͨ��id��ѯ���Ƚ������Ƿ�һ�� * �����һ�£����������MD5���� * ����OID֮������ݣ�ȫ������ *
		 * ԭ��һ�����汻�޸��ˣ�����ղ�һ�£�Ĭ������£����ύ���Զ�ִ��update��䡣
		 */
		CrmStaff findStaff = staffDao.findById(staff.getStaffId());
		if (!findStaff.getLoginPwd().equals(staff.getLoginPwd())) {
			findStaff.setLoginPwd(MyStringUtils.getMD5Value(staff.getLoginPwd()));
		}
		findStaff.setGender(staff.getGender());
		findStaff.setLoginName(staff.getLoginName());
		findStaff.setOnDutyDate(staff.getOnDutyDate());
		findStaff.setStaffName(staff.getStaffName());
		findStaff.setPost(staff.getPost());
	}
}
