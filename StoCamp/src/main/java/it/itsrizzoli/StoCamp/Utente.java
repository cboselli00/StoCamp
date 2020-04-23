package it.itsrizzoli.StoCamp;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "utente")
public class Utente {
	
	@Id
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
	
	@Size(max=30, message = "Cittaresidenza deve esser tra 4 e 30 caratteri")
	private String cittaresidenza;
	
	@Size(max=30, message = "Indirizzo deve esser tra 4 e 30 caratteri")
	private String indirizzo;
	
	@Min(16)
	@Max(100)
	private int eta;
	
	@OneToMany(mappedBy = "partecipante", cascade = CascadeType.ALL)
	private Set<PrenotazioneForm> prenotazione = new HashSet<>();
	

	
	@OneToOne
	private CreaSquadraForm squadra;
	
	
	
	

	public Utente(
			@Size(min = 4, max = 15, message = "Username deve esser tra 5 e 15 caratteri") @NotNull(message = "Username deve esser inserito") String username,
			@Size(min = 5, max = 20, message = "Password deve esser tra 6 e 20 caratteri") @NotNull(message = "Password deve esser inserito") String password,
			@NotNull(message = "Data di nascita deve esser inserita") Date datanascita,
			@Size(min = 10, max = 30, message = "Email deve esser tra 11 e 30 caratteri") @NotNull(message = "Email deve esser inserita") String email,
			@Size(min = 9, max = 10, message = "Nome deve esser 9 o 10 numeri") @NotNull(message = "Numero telefono deve esser inserito") String numerotelefono,
			@Size(min = 3, max = 30, message = "Nome deve esser tra 4 e 30 caratteri") @NotNull(message = "Nome deve esser inserito") String nome,
			@Size(min = 3, max = 30, message = "Cognome deve esser tra 4 e 30 caratteri") @NotNull(message = "Cognome deve esser inserito") String cognome,
			@Size(max = 30, message = "Cittaresidenza deve esser tra 4 e 30 caratteri") String cittaresidenza,
			@Size(max = 30, message = "Indirizzo deve esser tra 4 e 30 caratteri") String indirizzo,
			@Min(16) @Max(100) int eta) {
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
	
	

	public Utente() {
		
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

	public Set<PrenotazioneForm> getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(Set<PrenotazioneForm> prenotazione) {
		this.prenotazione = prenotazione;
	}



	public CreaSquadraForm getSquadra() {
		return squadra;
	}



	public void setSquadra(CreaSquadraForm squadra) {
		this.squadra = squadra;
	}

	
	
	
	
	
	

}
