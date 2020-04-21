package it.itsrizzoli.StoCamp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prenota")
public class PrenotazioneForm {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	Date data;
//	String nomeSquadra;
//	String username_utente;
	//Utente utente;
	//Campo campo;
	double orainizio;
	double orafine;
	
	

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	/*public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}*/
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/*public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	*/
	
	
	
}