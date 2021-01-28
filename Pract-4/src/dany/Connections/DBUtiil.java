package dany.Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtiil {
	final static String forNameURL="com.mysql.cj.jdbc.Driver";
	final static String dbURL="jdbc:mysql://localhost:3306/aman";
	final static String username="root";
	final static String password="18IAM@k47";
	public static Connection DBConnection() throws SQLException,ClassNotFoundException
	{
		Class.forName(forNameURL);
		Connection con = DriverManager.getConnection(dbURL,username,password);
		return con;
	}


}
