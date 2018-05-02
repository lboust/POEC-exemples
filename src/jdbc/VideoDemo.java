package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoDemo {

	public static Video mapResultSetToVideo(ResultSet rsVideo) throws SQLException  {
		Video video = new Video();
		video.setId(rsVideo.getInt("id"));
		video.setTitle(rsVideo.getString("title"));
		video.setUrl(rsVideo.getString("url"));
		video.setDuration(rsVideo.getInt("duration"));
		video.setPublicationDate(rsVideo.getString("publicationDate"));
		video.setType(rsVideo.getString("type"));
		video.setNumberOfViews(rsVideo.getInt("numberofViews"));
		video.setCapture(rsVideo.getString("capture"));
		video.setDescription(rsVideo.getString("description"));
		video.setUser_id(rsVideo.getInt("user_id"));

		/*User user = new User();
		user.setId(rsUser.getInt("id"));
		user.setUsername(rsUser.getString("username"));
		user.setUseremail(rsUser.getString("email"));
		user.setUserpassword(rsUser.getString("password"));
		
		video.setAuthor(user);
		
		List<Comment> commentList = new ArrayList<>();
		commentList=video.getComments();
		
		Comment comment = new Comment();
		comment.setMessage(rsComment.getString("message"));
		while(rsComment.next()) {			

			commentList.add(comment);
		}
		video.setComments(commentList);*/
		
		return video;
	}
	public static void main(String[] args) {
		VideoRepository videoRepo = new VideoRepository();
		for (int j = 1; j <= 20; j++) {
			Video video = videoRepo.findVideoById(j);
			System.out.println(video);
		}
		
		/*List<Video> videoList = new ArrayList<>();
		videoList = videoRepo.findAllVideos();
		System.out.println(videoList);
		
		List<Video> trendingVideos = new ArrayList<>();
		trendingVideos = videoRepo.findTrending();
		System.out.println(trendingVideos);
		
		List<Video> recommendedVideos = new ArrayList<>();
		recommendedVideos = videoRepo.findRecommended();
		System.out.println(recommendedVideos);*/

	}

}
