package com.jerry.crm.post.domain;

import java.util.HashSet;
import java.util.Set;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.staff.domain.CrmStaff;

public class CrmPost {
	// ְ��Id
	private String postId;
	// ְ��
	private String postName;
	// ���һ�����ְ�� ���� ��һ�����š�
	private CrmDepartment department;

	// һ�Զࣺ һ��ְ�� ������ �����Ա����
	private Set<CrmStaff> staffSet = new HashSet<CrmStaff>();

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public CrmDepartment getDepartment() {
		return department;
	}

	public void setDepartment(CrmDepartment department) {
		this.department = department;
	}

	public Set<CrmStaff> getStaffSet() {
		return staffSet;
	}

	public void setStaffSet(Set<CrmStaff> staffSet) {
		this.staffSet = staffSet;
	}

}
