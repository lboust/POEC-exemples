package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCDemo {
	// g�n�re un objet � partir d'une base de donn�es
	public static User mapResultSetToUser(ResultSet rs) throws SQLException{
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setUseremail(rs.getString("useremail"));
		u.setUserpassword(rs.getString("userpassword"));
		return u;
	}

	public static void main(String[] args) {

		// obtenir une connexion � une base de donn�es
		// try catch with resource sp�cifique � un closable (simplifie la proc�dure de fermeture de la connection)
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
			
			
			//curseur initialement avant la premi�re ligne de contenu
			while(rs.next()) {					 
			User u1 = mapResultSetToUser(rs);
			System.out.println(u1);
			System.out.println("---------------------------------------------");

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
	}

}
