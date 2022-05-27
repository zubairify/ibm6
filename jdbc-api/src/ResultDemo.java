import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) {
		
		String sql = "select * from person";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
