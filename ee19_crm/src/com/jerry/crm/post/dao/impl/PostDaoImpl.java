package com.jerry.crm.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.post.dao.PostDao;
import com.jerry.crm.post.domain.CrmPost;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return (List<CrmPost>) this.getHibernateTemplate().find("from CrmPost where department = ?", department);
	}

}
