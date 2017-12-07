package com.jerry.crm.coursetype.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.jerry.crm.coursetype.dao.CourseTypeDao;
import com.jerry.crm.coursetype.domain.CrmCourseType;
import com.jerry.crm.page.PageHibernateCallback;

public class CourseTypeDaoImpl extends HibernateDaoSupport implements CourseTypeDao {

	@Override
	public List<CrmCourseType> findAll() {
		return (List<CrmCourseType>) this.getHibernateTemplate().find("from CrmCourseType");
	}

	@Override
	public List<CrmCourseType> findAll(String condition, Object[] params) {
		String hql = "from CrmCourseType where 1=1 " + condition;
		return (List<CrmCourseType>) this.getHibernateTemplate().find(hql, params);
	}

	@Override
	public CrmCourseType findById(String courseTypeId) {
		return this.getHibernateTemplate().get(CrmCourseType.class, courseTypeId);
	}

	@Override
	public void saveOrUpdate(CrmCourseType crmCourseType) {
		this.getHibernateTemplate().saveOrUpdate(crmCourseType);
	}

	@Override
	public List<CrmCourseType> findAll(String condition, Object[] params, int startIndex, int pageSize) {
		String hql = "select * from crm_course_type where 1=1" + condition;
		return this.getHibernateTemplate().execute(new PageHibernateCallback<CrmCourseType>().setHql(hql)
				.setStartIndex(startIndex).setPageSize(pageSize).setParams(params));
	}

	@Override
	public int getTotalRecord(String conding, Object[] params) {
		String hql = "select count(c) from crm_course_type c where 1=1 " + conding;
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, params);
		return list.get(0).intValue();
	}
}
