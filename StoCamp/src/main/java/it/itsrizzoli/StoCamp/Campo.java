package it.itsrizzoli.StoCamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Campo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Size(min=4, max=30, message = "Nome deve esser tra 4 e 30 caratteri")
    @NotNull(message = "Nome deve esser inserito")
	String nome;
	
	@Size(min=4, max=30, message = "Indirizzo deve esser tra 4 e 15 caratteri")
    @NotNull(message = "Indirizzo deve esser inserito")
	String indirizzo;
	
	
	public Campo(int id,
			@Size(min = 4, max = 30, message = "Nome deve esser tra 4 e 30 caratteri") @NotNull(message = "Nome deve esser inserito") String nome,
			@Size(min = 4, max = 30, message = "Indirizzo deve esser tra 4 e 15 caratteri") @NotNull(message = "Indirizzo deve esser inserito") String indirizzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

}
