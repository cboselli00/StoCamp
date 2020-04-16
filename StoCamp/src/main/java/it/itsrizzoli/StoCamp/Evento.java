package it.itsrizzoli.StoCamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Evento {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Size(min=3, max=30, message = "Il nome della squadra deve esser tra 3 e 30 caratteri")
    @NotNull(message = "Il nome della squadra deve esser inserito")
	String nomesquadra1;
	@Size(max=30, message = "Il nome della squadra deve esser tra 3 e 30 caratteri")
	String nomesquadra2;
	
	public Evento(int id,
		@Size(min = 3, max = 30, message = "Il nome della squadra deve esser tra 3 e 30 caratteri") @NotNull(message = "Il nome della squadra deve esser inserito") String nomesquadra1,
		@Size(max = 30, message = "Il nome della squadra deve esser tra 3 e 30 caratteri") String nomesquadra2) {
		this.id = id;
		this.nomesquadra1 = nomesquadra1;
		this.nomesquadra2 = nomesquadra2;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNomesquadra1() {
		return nomesquadra1;
	}
	public void setNomesquadra1(String nomesquadra1) {
		this.nomesquadra1 = nomesquadra1;
	}
	public String getNomesquadra2() {
		return nomesquadra2;
	}
	public void setNomesquadra2(String nomesquadra2) {
		this.nomesquadra2 = nomesquadra2;
	}
	
	

}
