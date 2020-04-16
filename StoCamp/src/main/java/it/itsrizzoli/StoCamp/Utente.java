package it.itsrizzoli.StoCamp;

import java.sql.Date;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "Utenti")
public class Utente {
	
	@Size(min=4, max=15, message = "Username deve esser tra 5 e 15 caratteri")
    @NotNull(message = "Username deve esser inserito")
	private String username;
	
	@Size(min=5, max=20, message = "Password deve esser tra 6 e 20 caratteri")
    @NotNull(message = "Password deve esser inserito")
	private String password;
	
    @NotNull(message = "Data di nascita deve esser inserita")
	private Date datanascita;
	
	@Size(min=10, max=30, message = "Email deve esser tra 11 e 30 caratteri")
    @NotNull(message = "Email deve esser inserita")
	private String email;
	
	@Size(min=9, max=10, message = "Nome deve esser 9 o 10 numeri")
    @NotNull(message = "Numero telefono deve esser inserito")
	private String numerotelefono;
	
	@Size(min=3, max=30, message = "Nome deve esser tra 4 e 30 caratteri")
    @NotNull(message = "Nome deve esser inserito")
	private String nome;
	
	@Size(min=3, max=30, message = "Cognome deve esser tra 4 e 30 caratteri")
    @NotNull(message = "Cognome deve esser inserito")
	private String cognome;
	private String cittaresidenza;
	private String indirizzo;
	private int eta;
	
	public Utente(
			@Size(min = 4, max = 15, message = "Username deve esser tra 5 e 15 caratteri") @NotNull(message = "Username deve esser inserito") String username,
			@Size(min = 5, max = 20, message = "Password deve esser tra 6 e 20 caratteri") @NotNull(message = "Password deve esser inserito") String password,
			@NotNull(message = "Data di nascita deve esser inserita") Date datanascita,
			@Size(min = 10, max = 30, message = "Email deve esser tra 11 e 30 caratteri") @NotNull(message = "Email deve esser inserita") String email,
			@Size(min = 9, max = 10, message = "Nome deve esser 9 o 10 numeri") @NotNull(message = "Numero telefono deve esser inserito") String numerotelefono,
			@Size(min = 3, max = 30, message = "Nome deve esser tra 4 e 30 caratteri") @NotNull(message = "Nome deve esser inserito") String nome,
			@Size(min = 3, max = 30, message = "Cognome deve esser tra 4 e 30 caratteri") @NotNull(message = "Cognome deve esser inserito") String cognome,
			String cittaresidenza, String indirizzo, int eta) {
		super();
		this.username = username;
		this.password = password;
		this.datanascita = datanascita;
		this.email = email;
		this.numerotelefono = numerotelefono;
		this.nome = nome;
		this.cognome = cognome;
		this.cittaresidenza = cittaresidenza;
		this.indirizzo = indirizzo;
		this.eta = eta;
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
