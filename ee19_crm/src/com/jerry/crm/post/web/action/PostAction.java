package com.jerry.crm.post.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import com.jerry.crm.post.domain.CrmPost;
import com.jerry.crm.post.service.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {
	private CrmPost post = new CrmPost();

	@Override
	public CrmPost getModel() {
		return post;
	}

	// service
	private PostService postService;

	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	/**
	 * ajax ͨ�����Ų�ѯ����ְ��
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String findAllWithDepartment() throws Exception {
		// 1 ��ѯ
		List<CrmPost> allPost = this.postService.findAll(post.getDepartment());
		//2 ��java����תjson ����
		//2.1�ų�����Ҫ������
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"department","staffSet"});
		//2.2ת��
		String jsonData=JSONArray.fromObject(allPost,jsonConfig).toString();
		
		//3 ��json ���ݷ��͸������
		//3.1 ��Ӧ��������
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		//3.2 ����
		ServletActionContext.getResponse().getWriter().print(jsonData);
		return "none";
	}
}
