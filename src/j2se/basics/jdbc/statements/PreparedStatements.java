package j2se.basics.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatements {

	
		public static void main1(String[] args) throws ClassNotFoundException, SQLException {
			String driver = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/mydb";
			String username = "root";
			String password = "Puja12sah@";
			Class.forName(driver);
			Product p = new Product ("Pan","Patan","aluminium frying pan" ,3450.34f,true);
			Connection con = DriverManager.getConnection(dbUrl,username,password);
			System.out.println("Connected Successfully.");
			String query = "insert into product(name, manufacturer, "+ "description, price, instock) values(?,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, p.name);
			pstm.setString(1, p.manufacturer);
			pstm.setString(1, p.description);
			pstm.setFloat(1, p.price);
			pstm.setBoolean(1, p.inStock);
			pstm.executeUpdate();
			pstm.close();
			pstm.close();

	}

}
