package j2se.basics.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String pass = "Puja12sah@";
	Connection con;

	@Override
	public void connect() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pass);
		
		
	}
	
	
	@Override
	public void disconnect() throws ClassNotFoundException, SQLException {
		con.close();	
	}

}
