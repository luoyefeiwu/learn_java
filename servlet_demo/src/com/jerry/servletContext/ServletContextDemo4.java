package com.jerry.servletContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String path = this.getServletContext().getRealPath("/WEB-INF/a.properties");
		Properties pro = new Properties();
		pro.load(new FileInputStream(path));
		System.out.println(pro.get("key"));*/
		test3();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	//��ȡ/WEB-INF/classes/b.properties�ļ�
	private void test3() throws IOException, FileNotFoundException {
			String path = this.getServletContext().getRealPath("/WEB-INF/classes/com/itheima/servlet/c.properties");
			Properties pro = new Properties();
			pro.load(new FileInputStream(path));
			
			System.out.println(pro.get("key"));
		}
	//��ȡ/WEB-INF/classes/b.properties�ļ�
	private void test2() throws IOException, FileNotFoundException {
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/b.properties");
		Properties pro = new Properties();
		pro.load(new FileInputStream(path));
		
		System.out.println(pro.get("key"));
	}
	//��ȡWEB-INF�µ�a.properties�ļ�
	private void test1() throws IOException, FileNotFoundException {
		String path = this.getServletContext().getRealPath("/WEB-INF/a.properties");//����һ��Ҫ��/��ͷ
		//����һ��Properties
		Properties pro = new Properties();
		pro.load(new FileInputStream(path));
		System.out.println(pro.getProperty("key"));
	}

}
