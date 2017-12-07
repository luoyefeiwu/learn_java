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
	 * ajax 通过部门查询所有职务
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String findAllWithDepartment() throws Exception {
		// 1 查询
		List<CrmPost> allPost = this.postService.findAll(post.getDepartment());
		//2 将java对象转json 数据
		//2.1排除不需要的数据
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"department","staffSet"});
		//2.2转换
		String jsonData=JSONArray.fromObject(allPost,jsonConfig).toString();
		
		//3 将json 数据发送给浏览器
		//3.1 响应中文乱码
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		//3.2 发送
		ServletActionContext.getResponse().getWriter().print(jsonData);
		return "none";
	}
}
