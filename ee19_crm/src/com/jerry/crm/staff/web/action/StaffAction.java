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

	// ����ע��service

	private StaffService staffService;

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	// ����
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
		// 4 ���ɹ�
		this.addFieldError("", "�û��������벻ƥ��");
		// * ����ת����ʾ
		return "login";
	}

	/**
	 * ��ʾ��ҳ
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public String findAll() {
		// 1��ѯ����
		List<CrmStaff> allStaff = staffService.findAll();
		// 2 �������ŵ�ֵջ������jsp�������
		// * ��ʽ1��context (map)��� put(key ,value) ��jspҳ���� ��#key�� ��
		// ActionContext.getContext().put(key, value)
		// * ��ʽ2��root (ֵջ) ��push(obj) ��һ������ΪJavaBean �� Map ��jspҳ���á��������� ��key��
		// ��
		// ActionContext.getContext().getValueStack().push(o)
		// * ��ʽ3��root (ֵջ) ��set(key ,value) ,һ������ΪList ��jspҳ���á�key��
		// set() �ײ� new Map(key,value) ���� push(map )

		// ʹ�� context�������
		ActionContext.getContext().put("allStaff", allStaff);
		return "findAll";
	}

	public String editUI() {
		// 1.ͨ��Id��ѯԱ��
		CrmStaff findStaff = staffService.findById(staff.getStaffId());
		ActionContext.getContext().getValueStack().push(findStaff);
		//2.��ѯ���в���
		List<CrmDepartment> allDepartment=	departmentService.findAll();
		// * jspҳ��ͨ����key�����
	    ActionContext.getContext().getValueStack().set("allDepartment",allDepartment);
		return "editUI";
	}
	
	public String edit(){
		staffService.updateStaff(staff);
		return "edit";
	}

}
