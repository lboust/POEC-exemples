package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCDemo {
	// génère un objet à partir d'une base de données
	public static User mapResultSetToUser(ResultSet rs) throws SQLException{
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setUseremail(rs.getString("useremail"));
		u.setUserpassword(rs.getString("userpassword"));
		return u;
	}

	public static void main(String[] args) {

		// obtenir une connexion à une base de données
		// try catch with resource spécifique à un closable (simplifie la procédure de fermeture de la connection)
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?serverTimezone=UTC", "root", "rootroot")) {
			Statement stmt = conn.createStatement();
			//stmt.executeQuery(sql) //SELECT
			//stmt.executeUpdate(sql) // INSERT INTO, DELETE FROM...
						
			ResultSet rs = stmt.executeQuery("SELECT * FROM poec.user");
			
			/*List<User> users = new ArrayList<>();
			while(rs.next()) {					 
				User u = mapResultSetToUser(rs);
				users.add(u);
				}*/
			
			
			//curseur initialement avant la première ligne de contenu
			while(rs.next()) {					 
			User u1 = mapResultSetToUser(rs);
			System.out.println(u1);
			System.out.println("---------------------------------------------");

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		UserRepository userRepo = new UserRepository();
		List<User> users = userRepo.findAllUsers();
		System.out.println(users);
		System.out.println("ici");
		User u = userRepo.findUserById(2);
		
		User u1 = userRepo.findUserById(1);
		System.out.println(u1);
		User u2 = userRepo.findUserById(2);
		System.out.println(u2);
		User u3 = userRepo.findUserById(3);
		System.out.println(u3);
	}

}
