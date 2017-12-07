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

	// 分装数据
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
	 * 查询所有
	 * 
	 * @return
	 */
	public String findAll() {
		/*
		 * 1简单查询 List<CrmCourseType> allCourseType =
		 * this.courseTypeService.findAll(); // * 查询结果存在值栈 , jsp 通过“#key”获得
		 * ActionContext.getContext().put("allCourseType", allCourseType);
		 */

		/*
		 * 2 条件查询
		 */
		// 1简单查询
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll(courseType);
		// * 查询结果存在值栈 , jsp 通过“#key”获得
		ActionContext.getContext().put("allCourseType", allCourseType);
		return "findAll";
	}
<<<<<<< HEAD
=======

	/**
	 * 显示编辑或者添加 jsp
	 * 
	 * @return
	 */
	public String addOrEditUI() {
		if (StringUtils.isNotBlank(this.courseType.getCourseTypeId())) {
			// 不是空就是编辑，需要查询 并回显
			CrmCourseType findcourseType = courseTypeService.findById(this.courseType.getCourseTypeId());
			ActionContext.getContext().getValueStack().push(findcourseType);
		}
		return "addOrEditUI";
	}

	/**
	 * 添加/编辑功能
	 * @return
	 */
	public String addOrEdit() {
		this.courseTypeService.addOrEdit(this.courseType);
		return "addOrEdit";
	}

>>>>>>> a6bfef3e427e6de9f3f78f034cdc6b10d1048686
}
