package com.jerry.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.jerry.dao.UserDao;
import com.jerry.domain.User;


//�ײ���ҪSessionFactory���Զ�����HibernateTemplateģ��
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

}
