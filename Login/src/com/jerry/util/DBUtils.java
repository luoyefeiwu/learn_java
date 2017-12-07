package com.jerry.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBUtils {
	private static String driverClass = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;

	static {
		ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		driverClass = rb.getString("driverClass");

		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 得到连接方法
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	// 关闭资源
	public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = null;
		}
	}
}
