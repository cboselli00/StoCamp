package it.itsrizzoli.StoCamp;

import java.util.Date;

import javax.validation.constraints.Size;

public class PrenotazioneForm {
	
	@Size(min=3,max=100)
	String nomeSquadra;
	Date data;
	
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
	
	
	
}