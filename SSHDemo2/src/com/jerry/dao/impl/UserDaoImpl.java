package com.jerry.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.jerry.dao.UserDao;
import com.jerry.domain.User;


//底层需要SessionFactory，自动创建HibernateTemplate模板
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

}
