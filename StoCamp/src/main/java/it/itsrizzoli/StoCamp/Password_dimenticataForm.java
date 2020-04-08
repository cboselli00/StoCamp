package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Size;

public class Password_dimenticataForm {
	@Size(min=20, max=50) String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
