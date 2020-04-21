package it.itsrizzoli.StoCamp;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class PrenotazioneForm {
	Date data;
	String nomeSquadra;
	String username_utente;
	double orainizio;
	double orafine;
	
	

	public String getNomeSquadra() {
		return nomeSquadra;
	}
	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getUsername_utente() {
		return username_utente;
	}
	public void setUsername_utente(String username_utente) {
		this.username_utente = username_utente;
	}
	public double getOrainizio() {
		return orainizio;
	}
	public void setOrainizio(double orainizio) {
		this.orainizio = orainizio;
	}
	public double getOrafine() {
		return orafine;
	}
	public void setOrafine(double orafine) {
		this.orafine = orafine;
	}
	
	
	
}