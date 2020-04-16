package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class SettingsAccountForm {
	
	@Size(min = 4, max = 15)
	String username;
	
	@Min(16)
	@Max(100)
	Integer eta;
	
	@Size(max = 30)
	String citta_residenza;
	
	@Size(max = 30)
	String indirizzo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getCitta_residenza() {
		return citta_residenza;
	}

	public void setCitta_residenza(String citta_residenza) {
		this.citta_residenza = citta_residenza;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}