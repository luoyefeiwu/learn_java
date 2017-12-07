import static org.junit.Assert.*;

import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import org.junit.Test;

import com.mysql.jdbc.Statement;


public class Demo1 {
	
	//链接数据库的Url
	private String url="jdbc:mysql://localhost:3306/studment";
	
	private  String user="root";
	
	private String password="12345678";

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		//1.驱动程序注册
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取链接对象
		Connection conn=DriverManager.getConnection(url, user,password);
		
		//3创建Statement 对象
		Statement stmt=(Statement) conn.createStatement();
		
		//准备sql
		String sql="INSERT into info(Id,Name) values(3,'张三3')";
		
		int count=	stmt.executeUpdate(sql);
		
		if(count>0)
		{
			System.out.println("更新数据库成功");
		}
		
	}

}
