package com.jerry.crm.coursetype.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jerry.crm.coursetype.domain.CrmCourseType;
import com.jerry.crm.coursetype.service.CourseTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Jerry
 *
 */
public class CourseTypeAction extends ActionSupport implements ModelDriven<CrmCourseType> {

	// ��װ����
	private CrmCourseType courseType = new CrmCourseType();

	@Override
	public CrmCourseType getModel() {
		return courseType;
	}

	// service
	private CourseTypeService courseTypeService;

	public void setCourseTypeService(CourseTypeService courseTypeService) {
		this.courseTypeService = courseTypeService;
	}

	/**
	 * ��ѯ����
	 * 
	 * @return
	 */
	public String findAll() {
		/*
		 * 1�򵥲�ѯ List<CrmCourseType> allCourseType =
		 * this.courseTypeService.findAll(); // * ��ѯ�������ֵջ , jsp ͨ����#key�����
		 * ActionContext.getContext().put("allCourseType", allCourseType);
		 */

		/*
		 * 2 ������ѯ
		 */
		// 1�򵥲�ѯ
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll(courseType);
		// * ��ѯ�������ֵջ , jsp ͨ����#key�����
		ActionContext.getContext().put("allCourseType", allCourseType);
		return "findAll";
	}
<<<<<<< HEAD
=======

	/**
	 * ��ʾ�༭������� jsp
	 * 
	 * @return
	 */
	public String addOrEditUI() {
		if (StringUtils.isNotBlank(this.courseType.getCourseTypeId())) {
			// ���ǿվ��Ǳ༭����Ҫ��ѯ ������
			CrmCourseType findcourseType = courseTypeService.findById(this.courseType.getCourseTypeId());
			ActionContext.getContext().getValueStack().push(findcourseType);
		}
		return "addOrEditUI";
	}

	/**
	 * ���/�༭����
	 * @return
	 */
	public String addOrEdit() {
		this.courseTypeService.addOrEdit(this.courseType);
		return "addOrEdit";
	}

>>>>>>> a6bfef3e427e6de9f3f78f034cdc6b10d1048686
}
