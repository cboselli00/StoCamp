package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Size;

public class Password_dimenticataForm {
	@Size(min=4, max=15) String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
