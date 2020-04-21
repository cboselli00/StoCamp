package it.itsrizzoli.StoCamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Squadra {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Size(min=3, max=30, message = "Nome deve esser tra 5 e 30 caratteri")
	@NotNull(message = "Nome deve esser inserito")
	String nome;
	
	public Squadra() {
		
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
	
	

}
