package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Size;

public class CambiaPasswordForm {
	
	@Size(min=5, max=20) String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
