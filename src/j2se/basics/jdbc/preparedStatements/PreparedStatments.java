package j2se.basics.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatments {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/mydb";
			String username = "root";
			String password = "Puja12sah@";
			Class.forName(driver);
			Product p = new Product ("Pan","Patan","aluminium frying pan" ,3450.34f,true);
			Connection con = DriverManager.getConnection(dbUrl,username,password);
			System.out.println("Connected Successfully.");
			String query = "insert into product(name, manufacturer,description, price, instock) values(?,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, p.name);
			pstm.setString(2, p.manufacturer);
			pstm.setString(3, p.description);
			pstm.setFloat(4, p.price);
			pstm.setBoolean(5, p.inStock);
			pstm.executeUpdate();
			pstm.close();
			pstm.close();

	}

}
	


