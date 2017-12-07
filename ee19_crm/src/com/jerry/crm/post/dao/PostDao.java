package com.jerry.crm.post.dao;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.post.domain.CrmPost;

public interface PostDao {
	
	public List<CrmPost> findAll(CrmDepartment department);
}
