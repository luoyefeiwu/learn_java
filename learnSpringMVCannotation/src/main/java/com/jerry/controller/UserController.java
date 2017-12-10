package com.jerry.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jerry.domain.UesrCustomer;
import com.jerry.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/hello.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String myHello() {
		return "hello";
	}

	// 跳转方法
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}

	// 接收方法 int 类型参数
	@RequestMapping("recieveInt")
	public String recieveInt(Integer id) {
		System.out.println(id);
		return "success";
	}

	// 接收方法 String类型参数
	@RequestMapping("recieveString")
	public String recieveString(String username) {
		System.out.println(username);
		return "success";
	}

	// 接收 javaBean对象参数
	@RequestMapping("recieveUser")
	public String recieveUser(User user) {
		System.out.println(user);
		return "success";
	}

	// 接收包装类型对象参数
	@RequestMapping("recieveUserCustom")
	public String recieveUserCustom(UesrCustomer userCustom) {
		System.out.println(userCustom);
		return "success";
	}

	// 接受数组类型参数
	@RequestMapping("recieveArray")
	public String recieveArray(Integer[] ids) {
		System.out.println(ids);
		return "success";
	}

	// 接受集合类型参数
	@RequestMapping("recieveList")
	public String recieveList(UesrCustomer userCustom) {
		System.out.println(userCustom);
		return "success";
	}

	// 接收Map类型的参数
	@RequestMapping("recieveMap")
	public String recieveMap(UesrCustomer userCustom) {
		System.out.println(userCustom);
		return "success";
	}

	// 页面回显
	@RequestMapping("list")
	public String list(Model model) {

		List<User> list = new ArrayList<User>();

		User user1 = new User();
		user1.setAddress("北京1");
		user1.setBirthday(new Date());
		user1.setId(1);
		user1.setSex("男");
		user1.setUsername("测试");

		User user2 = new User();
		user2.setAddress("北京2");
		user2.setBirthday(new Date());
		user2.setId(2);
		user2.setSex("男2");
		user2.setUsername("测试2");

		User user3 = new User();
		user3.setAddress("北京3");
		user3.setBirthday(new Date());
		user3.setId(3);
		user3.setSex("男3");
		user3.setUsername("测试3");

		list.add(user1);
		list.add(user2);
		list.add(user3);

		model.addAttribute("userlist", list);
		return "list";
	}

	// 修改
	@RequestMapping("update/{id}")
	public String update(@PathVariable Integer id) {
		System.out.println(id);
		return "redirect:/user/list.do";
	}

	// 跳转requestJson 页面
	@RequestMapping("toJson")
	public String toJson() {
		return "requestJson";
	}

	// 接收json数据 使用requestBody把json格式数据封装到User对象
	// 返回 User对象 ，使用 requestBody把json对象转json对象
	@RequestMapping("requestJson")
	public @ResponseBody User requestJson(@RequestBody User user) {
		System.out.println(user);
		return user;
	}

}
