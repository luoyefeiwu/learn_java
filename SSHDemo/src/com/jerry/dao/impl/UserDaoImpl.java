package com.jerry.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.jerry.dao.UserDao;
import com.jerry.domain.User;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

}
