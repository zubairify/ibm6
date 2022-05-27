import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/ibm6";
		
		// Registering driver with Driver manger
		DriverManager.registerDriver(new Driver());
		// Requesting connection to Driver manager
		Connection conn = DriverManager.getConnection(url, "zubair", "oracle");
		System.out.println("Connected successfully...");
		
	}
}
