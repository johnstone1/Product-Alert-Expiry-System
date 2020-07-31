package model;

public class Employee {

	private String username,password,first_name,last_name,phone_no;
	private int national_id;
	private String email;
	private String gender;
	
	public Employee() {
		super();
	}

	public Employee(String username, String password, String first_name, String last_name, String phone_no,
			int national_id, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_no = phone_no;
		this.national_id = national_id;
		this.email = email;
		this.gender=gender;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
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
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", phone_no=" + phone_no + ", national_id=" + national_id + ", email="
				+ email + ", gender=" + gender + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name() + ", getPhone_no()="
				+ getPhone_no() + ", getNational_id()=" + getNational_id() + ", getEmail()=" + getEmail()
				+ ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
