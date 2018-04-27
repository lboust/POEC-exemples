package jdbc;

public class User {
	// instance fields
	private Integer id;
	private String username;
	private String useremail;
	private String userpassword;
	
	// getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
/*	// constructor
	public User(Integer id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}*/
	@Override
	public String toString() {
		return "[id: " + id + ", name: " + username + ", email: " + useremail + ", password: " + userpassword + "]";
		
	}


	
}
