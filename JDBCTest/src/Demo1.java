import static org.junit.Assert.*;

import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import org.junit.Test;

import com.mysql.jdbc.Statement;


public class Demo1 {
	
	//�������ݿ��Url
	private String url="jdbc:mysql://localhost:3306/studment";
	
	private  String user="root";
	
	private String password="12345678";

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		//1.��������ע��
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.��ȡ���Ӷ���
		Connection conn=DriverManager.getConnection(url, user,password);
		
		//3����Statement ����
		Statement stmt=(Statement) conn.createStatement();
		
		//׼��sql
		String sql="INSERT into info(Id,Name) values(3,'����3')";
		
		int count=	stmt.executeUpdate(sql);
		
		if(count>0)
		{
			System.out.println("�������ݿ�ɹ�");
		}
		
	}

}
