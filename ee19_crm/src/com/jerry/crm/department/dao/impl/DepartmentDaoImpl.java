/**
 * 
 */
/**
 * @author shengyan
 *
 */
package com.jerry.crm.department.dao.impl;

import java.util.List;

import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.jerry.crm.department.dao.DepartmentDao;
import com.jerry.crm.department.domain.CrmDepartment;

public class DepartmentDaoImpl extends HibernateDaoSupport  implements DepartmentDao
{

	@Override
	public List<CrmDepartment> findAll() {
		return (List<CrmDepartment>) this.getHibernateTemplate().find("from CrmDepartment");
	}

	
}