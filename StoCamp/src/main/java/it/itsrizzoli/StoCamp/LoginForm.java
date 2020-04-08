package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Size;

public class LoginForm {
	@Size(min=5, max=10) String username;
	@Size(min=5, max=15) String password;
	
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
