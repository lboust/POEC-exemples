package jdbc;

import java.util.List;

public class Video {
	//instance fields
	private Integer id; //clé
	private String title; // titre de la vidéo
	private String url; // lien youtube
	private Integer duration; // durée totale de la vidéo en s
	private String publicationDate; //date et heure de publication
	private User author; //nom du membre MyTube qui a publié la vidéo
	private String type; // type de vidéo (recommended ou trending)
	private Integer numberOfViews; //nombre de vues de la vidéo
	private Integer numberOfComments; //nombre de commentaires d'une vidéo
	private String capture; //src de la miniature
	private List<Comment> comments; // liste des commentaires
	private String description; // texte de description
	private Integer user_id; //clé
	//methods
	//lit la vidéo à un certain temps
	public void play(int playingTime) {

	}
	//lit la vidéo suivante dans la playlist
	public void next() {

	}
	
	//règle le son
	public void sound(){
		
	}
	
	//règles les paramètres de lecture
	public void parameters() {
		
	}
	
	//règle le mode de lecture
	public void mode() {
		
	}
	
	//règle l'affichage plein écran
	public void fullScreen() {
		
	}
	
	//like ou don't like la vidéo
	public void likeVideo() {
		
	}
	
	//partage la vidéo
	public void share() {
		
	}
	
	//passe l'annonce de la vidéo
	public void skip() {
		
	}
	
	//ajout de la vidéo à la playlist
	public void addToPlaylist() {
		
	}
	
	//signale la vidéo
	public void report() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumberOfViews() {
		return numberOfViews;
	}
	public void setNumberOfViews(Integer numberOfViews) {
		this.numberOfViews = numberOfViews;
	}
	public int getNumberOfComments() {
		return numberOfComments;
	}
	public void setNumberOfComments(Integer numberOfComments) {
		this.numberOfComments = numberOfComments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCapture() {
		return capture;
	}
	public void setCapture(String capture) {
		this.capture = capture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "[id: " + id + ", title: " + title +"]";
		
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
