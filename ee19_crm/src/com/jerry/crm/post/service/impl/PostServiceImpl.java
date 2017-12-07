package com.jerry.crm.post.service.impl;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.post.dao.PostDao;
import com.jerry.crm.post.domain.CrmPost;
import com.jerry.crm.post.service.PostService;

public class PostServiceImpl implements PostService {

	private PostDao postDao;
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return postDao.findAll(department);
	}
}
