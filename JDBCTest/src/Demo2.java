import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Statement;

import java.sql.Connection;

public class Demo2 {

	// �������ݿ��Url
	private String url = "jdbc:mysql://localhost:3306/studment";

	private String user = "root";

	private String password = "12345678";

	
	public void test() throws Exception {

		//ע��
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		//3����Statement ����
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

			String sql = "insert into Info(Name,Id) values('���ǲ�������1',4)";
			Statement stmt = (Statement) conn.createStatement();
			
		int count=	stmt.executeUpdate(sql);

		System.out.println(count+"����Ӱ��");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
