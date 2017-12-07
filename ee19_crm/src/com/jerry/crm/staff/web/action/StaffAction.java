package com.jerry.crm.staff.web.action;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.department.service.DepartmentService;
import com.jerry.crm.staff.domain.CrmStaff;
import com.jerry.crm.staff.service.StaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {

	private CrmStaff staff = new CrmStaff();

	@Override
	public CrmStaff getModel() {
		return staff;
	}

	// 依赖注入service

	private StaffService staffService;

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	// 部门
	private DepartmentService departmentService;
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	
	// login
	public String login() {

		CrmStaff findStaff = staffService.login(staff);
		if (findStaff != null) {
			ActionContext.getContext().getSession().put("loginStaff", findStaff);
			return "success";
		}
		// 4 不成功
		this.addFieldError("", "用户名与密码不匹配");
		// * 请求转发显示
		return "login";
	}

	/**
	 * 显示首页
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public String findAll() {
		// 1查询所有
		List<CrmStaff> allStaff = staffService.findAll();
		// 2 将结果存放到值栈，方便jsp获得数据
		// * 方式1：context (map)存放 put(key ,value) ，jsp页面获得 “#key” 。
		// ActionContext.getContext().put(key, value)
		// * 方式2：root (值栈) ，push(obj) ，一般数据为JavaBean 或 Map ，jsp页面获得“属性名” 或“key”
		// 。
		// ActionContext.getContext().getValueStack().push(o)
		// * 方式3：root (值栈) ，set(key ,value) ,一般数据为List ，jsp页面获得“key”
		// set() 底层 new Map(key,value) ，将 push(map )

		// 使用 context存放数据
		ActionContext.getContext().put("allStaff", allStaff);
		return "findAll";
	}

	public String editUI() {
		// 1.通过Id查询员工
		CrmStaff findStaff = staffService.findById(staff.getStaffId());
		ActionContext.getContext().getValueStack().push(findStaff);
		//2.查询所有部门
		List<CrmDepartment> allDepartment=	departmentService.findAll();
		// * jsp页面通过“key”获得
	    ActionContext.getContext().getValueStack().set("allDepartment",allDepartment);
		return "editUI";
	}
	
	public String edit(){
		staffService.updateStaff(staff);
		return "edit";
	}

}
