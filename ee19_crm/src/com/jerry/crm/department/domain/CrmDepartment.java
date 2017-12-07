package com.jerry.crm.department.domain;

import java.util.HashSet;
import java.util.Set;

import com.jerry.crm.post.domain.CrmPost;

public class CrmDepartment {
	// 部门Id
	private String depId;
	// 部门名称
	private String depName;
	// 一对多：一个部门对应多个职务，选择集合Set,不重复，没有顺序
	private Set<CrmPost> postSet = new HashSet<CrmPost>();

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<CrmPost> getPostSet() {
		return postSet;
	}

	public void setPostSet(Set<CrmPost> postSet) {
		this.postSet = postSet;
	}

}
