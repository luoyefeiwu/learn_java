package com.jerry.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jerry.entity.User;
import com.jerry.util.DBUtils;

public class Dologin {
	public User FindUser(String name, String pwd) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		User u = null;
		try {
			conn = DBUtils.getConnection();
			String sql ="SELECT * FROM users WHERE NAME=? AND PASSWORD=?";
			stmt = conn.prepareStatement(sql);//得到执行sql语句的对象Statement
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setBirthday(rs.getDate(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeAll(rs, stmt, conn);
		}
		return u;
	}
}
