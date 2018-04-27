package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

	private User mapResultSetToUser(ResultSet rs) throws SQLException  {
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setUseremail(rs.getString("useremail"));
		u.setUserpassword(rs.getString("userpassword"));
		return u;
	}
	//code de Thomas
	public List<User> findAllUsers() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/poec?serverTimezone=UTC", "root", "rootroot")) {
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM user");
			
			List<User> users = new ArrayList<>();
			
			while(rs.next()) {			
				User u = mapResultSetToUser(rs);
				users.add(u);
			}
			
			return users;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
