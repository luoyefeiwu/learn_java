package com.jerry.crm.coursetype.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jerry.crm.coursetype.dao.CourseTypeDao;
import com.jerry.crm.coursetype.dao.impl.CourseTypeDaoImpl;
import com.jerry.crm.coursetype.domain.CrmCourseType;
import com.jerry.crm.coursetype.service.CourseTypeService;

public class CourseTypeServiceImpl implements CourseTypeService {

	private CourseTypeDao courseTypeDao;

	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}

	@Override
	public List<CrmCourseType> findAll() {
		return courseTypeDao.findAll();
	}

	@Override
	public List<CrmCourseType> findAll(CrmCourseType crmCourseType) {
		// 1.1ƴ�Ӳ���
		StringBuilder builder = new StringBuilder();
		// 1.2 ƴ��ʵ�ʲ��� , �����ظ���˳�� --> List
		List<Object> paramsList = new ArrayList<Object>();

		// 2 ��������
		if (StringUtils.isNotBlank(crmCourseType.getCourseName())) {
			builder.append(" and courseName like ?");
			paramsList.add("%" + crmCourseType.getCourseName() + "%");
		}
		// 2.2 �γ̼��
		if (StringUtils.isNotBlank(crmCourseType.getRemark())) {
			builder.append(" and remark like ?");
			paramsList.add("%" + crmCourseType.getRemark() + "%");
		}
		// 2.3 ��ѧʱ��
		if (StringUtils.isNotBlank(crmCourseType.getTotalStart())) {
			builder.append(" and total >= ?");
			paramsList.add(Integer.parseInt(crmCourseType.getTotalStart()));
		}
		if (StringUtils.isNotBlank(crmCourseType.getTotalEnd())) {
			builder.append(" and total <= ?");
			paramsList.add(Integer.parseInt(crmCourseType.getTotalEnd()));
		}
		// 2.4�γ̷���
		if (StringUtils.isNotBlank(crmCourseType.getCourseCostStart())) {
			builder.append(" and courseCost >= ?");
			paramsList.add(Double.parseDouble(crmCourseType.getCourseCostStart()));
		}
		if (StringUtils.isNotBlank(crmCourseType.getCourseCostEnd())) {
			builder.append(" and courseCost <= ?");
			paramsList.add(Double.parseDouble(crmCourseType.getCourseCostEnd()));
		}
		// 3 ʹ��
		// ���� ����ʽ ��" and ..? and ..?"
		String condition = builder.toString();
		// ʵ�ʲ���
		Object[] params = paramsList.toArray();
		return courseTypeDao.findAll(condition, params);
	}

	@Override
	public CrmCourseType findById(String crmCourseTypeId) {
		return courseTypeDao.findById(crmCourseTypeId);
	}

	@Override
	public void addOrEdit(CrmCourseType crmCourseType) {
		courseTypeDao.saveOrUpdate(crmCourseType);
	}

}
