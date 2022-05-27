import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcFactory {

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ibm6";

		// Registering driver with Driver manger
		DriverManager.registerDriver(new Driver());
		// Requesting connection to Driver manager
		Connection conn = DriverManager.getConnection(url, "zubair", "oracle");
		
		return conn;
	}
}
