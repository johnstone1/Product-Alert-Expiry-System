package model;

public class Manager {

	
	private String username,password;
	private int national_id;
	private String email;
	
	

	public Manager() {
		super();
	}



	public Manager(String username, String password, int national_id, String email) {
		super();
		this.username = username;
		this.password = password;
		this.national_id = national_id;
		this.email = email;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getNational_id() {
		return national_id;
	}



	public void setNational_id(int national_id) {
		this.national_id = national_id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Manager [username=" + username + ", password=" + password + ", national_id=" + national_id + ", email="
				+ email + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getNational_id()=" + getNational_id() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
	
	
}
