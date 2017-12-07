import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Statement;

import java.sql.Connection;

public class Demo2 {

	// 链接数据库的Url
	private String url = "jdbc:mysql://localhost:3306/studment";

	private String user = "root";

	private String password = "12345678";

	
	public void test() throws Exception {

		//注冊
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		//3创建Statement 对象
	     Statement stmt=(Statement) con.createStatement();
		String sql="select * from info";
		
		ResultSet  rs=	stmt.executeQuery(sql);
		
		while(rs.next())
		{
			int id= rs.getInt(2);
			String name=rs.getString(1);
			System.out.println("id:"+id+",name:"+name);
		}
		
	}
	
	@Test
	public void Add() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into Info(Name,Id) values('我是测试数据1',4)";
			Statement stmt = (Statement) conn.createStatement();
			
		int count=	stmt.executeUpdate(sql);

		System.out.println(count+"条受影响");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
