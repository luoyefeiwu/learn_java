package com.jerry.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBUtils {
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;

	static {
		ResourceBundle res = ResourceBundle.getBundle("dbinfo");
		driverClass = res.getString("driverClass");
		url = res.getString("url");
		username = res.getString("username");
		password = res.getString("password");
		try {
			Class.forName(driverClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 获得链接方法
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	// 关闭资源
	public static void closeAll(ResultSet rs, Statement stmt, Connection con) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			rs = null;
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			con = null;
		}
	}
}
