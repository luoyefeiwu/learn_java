package com.jerry.client;

import java.util.Scanner;

import com.jerry.entity.User;
import com.jerry.service.Dologin;

public class Login {

	public static void main(String[] args) {
		Scanner input=new  Scanner(System.in);
		System.out.println("�������Ñ�����");
		String name=input.nextLine();
		System.out.println("���������룺");
		String pwd=input.nextLine();
		Dologin dologin=new  Dologin();
		User user=	dologin.FindUser(name, pwd);
		if(user!=null){
			System.out.println("��ӭ�㣺"+user.getName());
		}else
		{
			System.out.println("�û������������");
		}
	}

}
