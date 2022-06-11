package DAO;

public class DBCredenziali {
	private String username;
	private String password;
	//costruttore
	public DBCredenziali(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	//set and get username
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//set and get password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
