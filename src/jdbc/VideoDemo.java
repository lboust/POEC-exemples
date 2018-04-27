package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoDemo {

	public static Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
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
	public static void main(String[] args) {
		VideoRepository videoRepo = new VideoRepository();
		for (int j = 1; j <= 20; j++) {
			Video video = videoRepo.findVideoById(j);
			System.out.println(video);
		}
		
		List<Video> videoList = new ArrayList<>();
		videoList = videoRepo.findAllVideos();
		System.out.println(videoList);

	}

}
