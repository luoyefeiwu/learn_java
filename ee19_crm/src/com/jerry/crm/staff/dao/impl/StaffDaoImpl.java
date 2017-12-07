package com.jerry.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.jerry.crm.staff.dao.StaffDao;
import com.jerry.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao{

	@Override
	public CrmStaff find(String loginName, String loginPwd) {
		List<CrmStaff> allStaff = (List<CrmStaff>) this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd = ?", loginName,loginPwd);
		if(allStaff.size() == 1){
			return allStaff.get(0);
		} 
		return null;
	}
	@Override
	public List<CrmStaff> findAll() {
		return (List<CrmStaff>) this.getHibernateTemplate().find("from CrmStaff");
	}
	@Override
	public CrmStaff findById(String staffId) {
		return this.getHibernateTemplate().get(CrmStaff.class,staffId);
	}

}
