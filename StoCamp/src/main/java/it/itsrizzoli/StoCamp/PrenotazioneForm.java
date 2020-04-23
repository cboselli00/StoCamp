package it.itsrizzoli.StoCamp;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="prenota")
public class PrenotazioneForm {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	Date data;
	
	@ManyToOne
	@JoinColumn
	private Utente partecipante;
	
	/*@ManyToOne
	@JoinColumn
	private Campo campo;*/
	
	String nomecampo;
	
	
	double orainizio;
	double orafine;
	
	public PrenotazioneForm(int id, Date data,String nomecampo, double orainizio,
			double orafine) {
		this.id = id;
		this.data = data;
		this.nomecampo = nomecampo;
		this.orainizio = orainizio;
		this.orafine = orafine;
	}
	
	public PrenotazioneForm() {
		
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Utente getPartecipante() {
		return partecipante;
	}
	public void setPartecipante(Utente partecipante) {
		this.partecipante = partecipante;
	}
	
	/*public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
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


	public String getNomecampo() {
		return nomecampo;
	}


	public void setNomecampo(String nomecampo) {
		this.nomecampo = nomecampo;
	}
	
	
	
	
	
	
	
	
	
	
}