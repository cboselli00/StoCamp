package it.itsrizzoli.StoCamp;

import javax.validation.constraints.Size;

public class ContattaciForm {
	@Size(min=10,max=30)
	String mittente;
	@Size(min=10,max=30)
	String destinatario;
	@Size(min=5,max=50)
	String oggetto;
	@Size(min=1,max=300)
	String messaggio;
	
	
	
	
	public String getMittente() {
		return mittente;
	}
	public void setMittente(String mittente) {
		this.mittente = mittente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getOggetto() {
		return oggetto;
	}
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	
	
	

}
