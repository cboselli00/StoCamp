package it.itsrizzoli.StoCamp;

import java.sql.Date;

public class Utente {
	
	private String username;
	private String password;
	private Date datanascita;
	private String email;
	private String numerotelefono;
	private String nome;
	private String cognome;
	private String cittaresidenza;
	private String indirizzo;
	private int eta;
	
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
	public Date getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumerotelefono() {
		return numerotelefono;
	}
	public void setNumerotelefono(String numerotelefono) {
		this.numerotelefono = numerotelefono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCittaresidenza() {
		return cittaresidenza;
	}
	public void setCittaresidenza(String cittaresidenza) {
		this.cittaresidenza = cittaresidenza;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	

}
