package com.jerry.crm.post.service;

import java.util.List;

import com.jerry.crm.department.domain.CrmDepartment;
import com.jerry.crm.post.domain.CrmPost;

public interface PostService {

	/**
	 * ��ѯָ�����ŵ�����ְ��
	 * @param post
	 * @return
	 */
	public List<CrmPost> findAll(CrmDepartment post);
}
