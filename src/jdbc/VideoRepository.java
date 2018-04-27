package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class VideoRepository {
	//method mapResultSetToVideo
	// construit l'objet Video à partir des colonnes de la base de donnée
	private Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
		Video video = new Video();
		video.setId(rs.getInt("id"));
		video.setTitle(rs.getString("title"));
		video.setUrl(rs.getString("url"));
		video.setDuration(rs.getInt("duration"));
		video.setPublicationDate(rs.getString("publicationDate"));
		video.setAuthor(rs.getString("author"));
		video.setType(rs.getString("type"));
		video.setNumberOfViews(rs.getInt("numberofViews"));
		video.setCapture(rs.getString("capture"));
		video.setDescription(rs.getString("description"));
		return video;
	}
	
	//method findVideoById
	//trouve dans la base de données la vidéo correspondant à l'id
	public Video findVideoById(int id) {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM video WHERE id = ?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			return mapResultSetToVideo(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * method findAllVideos
	 * @return liste de toutes les videos
	 */
	public List<Video> findAllVideos() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM video");
			
			List<Video> videoList = new ArrayList<>();
			
			while(rs.next()) {			
				Video video = mapResultSetToVideo(rs);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//method findTrending()
	//ajoute la video à la liste de videos tendances
	public ArrayList<Video> findTrending(Video video, ArrayList<Video> videoList) {

		if (video.getId()>0 && video.getId()<6) {
			videoList.add(video);
				
		}
		return videoList;
	}
	//method findRecommended()
	//ajoute la video à la liste de videos recommandées
	public ArrayList<Video> findRecommended(Video video, ArrayList<Video> videoList) {

		if (video.getId()>5){
			videoList.add(video);
				
		}
		return videoList;
	}
	
}
