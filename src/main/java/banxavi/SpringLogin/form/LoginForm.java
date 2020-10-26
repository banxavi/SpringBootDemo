package banxavi.SpringLogin.form;

public class LoginForm {
	// Create two variables username and password for login
	private String username;
	private String password;
	public LoginForm() {
		super();
	}
	// Getter and setter
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
}
