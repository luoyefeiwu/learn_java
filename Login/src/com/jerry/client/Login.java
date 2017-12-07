package com.jerry.client;

import java.util.Scanner;

import com.jerry.entity.User;
import com.jerry.service.Dologin;

public class Login {

	public static void main(String[] args) {
		Scanner input=new  Scanner(System.in);
		System.out.println("请输入用戶名：");
		String name=input.nextLine();
		System.out.println("请输入密码：");
		String pwd=input.nextLine();
		Dologin dologin=new  Dologin();
		User user=	dologin.FindUser(name, pwd);
		if(user!=null){
			System.out.println("欢迎你："+user.getName());
		}else
		{
			System.out.println("用户名或密码错误");
		}
	}

}
