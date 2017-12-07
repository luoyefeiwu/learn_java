package com.jerry.crm.page;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;

public class PageHibernateCallback<T> implements HibernateCallback<List<T>> {

	private String hql;
	private Object[] params;
	private int startIndex;
	private int pageSize;

	public PageHibernateCallback<T> setHql(String hql) {
		this.hql = hql;
		return this;
	}

	public PageHibernateCallback<T> setParams(Object[] params) {
		this.params = params;
		return this;
	}

	public PageHibernateCallback<T> setStartIndex(int startIndex) {
		this.startIndex = startIndex;
		return this;
	}

	public PageHibernateCallback<T> setPageSize(int pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	@Override
	public List<T> doInHibernate(Session session) throws HibernateException {
		// 1.通过hql获得Query对象
		Query queryObject = session.createQuery(hql);
		// 2.设置参数
		for (int i = 0; i < params.length; i++) {
			queryObject.setParameter(i, params[i]);
		}
		// 3.分页
		queryObject.setFirstResult(startIndex);
		queryObject.setMaxResults(pageSize);
		// 4.查询所有
		return queryObject.list();
	}

}
