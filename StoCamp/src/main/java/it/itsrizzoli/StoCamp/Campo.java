package it.itsrizzoli.StoCamp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "campo")
public class Campo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	
	@Size(min=4, max=30, message = "Nome deve esser tra 4 e 30 caratteri")
    @NotNull(message = "Nome deve esser inserito")
	String nome;
	
	@Size(min=4, max=30, message = "Indirizzo deve esser tra 4 e 15 caratteri")
    @NotNull(message = "Indirizzo deve esser inserito")
	String indirizzo;
	
	@OneToMany(mappedBy = "campo", cascade = CascadeType.ALL)
	private Set<PrenotazioneForm> prenotazione = new HashSet<>();
	
	
	public Campo(int id,
			@Size(min = 4, max = 30, message = "Nome deve esser tra 4 e 30 caratteri") @NotNull(message = "Nome deve esser inserito") String nome,
			@Size(min = 4, max = 30, message = "Indirizzo deve esser tra 4 e 15 caratteri") @NotNull(message = "Indirizzo deve esser inserito") String indirizzo) {
		Id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	
	


	public Campo() {
		
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public Set<PrenotazioneForm> getPrenotazione() {
		return prenotazione;
	}


	public void setPrenotazione(Set<PrenotazioneForm> prenotazione) {
		this.prenotazione = prenotazione;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}
	
	
	
	
	
	
}
