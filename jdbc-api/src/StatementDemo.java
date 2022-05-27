import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		
		String sql = "insert into person values ('Jack', 19, 'Jaipur')";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			// Executing DML operation
			stmt.executeUpdate(sql);
			System.out.println("Record inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
