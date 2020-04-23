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
@Table(name = "squadra")
public class CreaSquadraForm {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Size(min=3, max=30, message = "Nome deve esser tra 5 e 30 caratteri")
	@NotNull(message = "Nome deve esser inserito")
	String nome;
	@Size(min=4, max=15, message = "Username partecipante deve esser tra 5 e 15 caratteri")
	String partecipante1;
	@Size(min=4, max=15, message = "Username partecipante deve esser tra 5 e 15 caratteri")
	String partecipante2;
	@Size(min=4, max=15, message = "Username partecipante deve esser tra 5 e 15 caratteri")
	String partecipante3;
	@Size(min=4, max=15, message = "Username partecipante deve esser tra 5 e 15 caratteri")
	String partecipante4;
	
	@OneToMany(mappedBy = "squadra", cascade = CascadeType.ALL)
	private Set<Partecipazione> partecipa = new HashSet<>();


	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Partecipazione> getPartecipa() {
		return partecipa;
	}
	public void setPartecipa(Set<Partecipazione> partecipa) {
		this.partecipa = partecipa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartecipante1() {
		return partecipante1;
	}
	public void setPartecipante1(String partecipante1) {
		this.partecipante1 = partecipante1;
	}
	public String getPartecipante2() {
		return partecipante2;
	}
	public void setPartecipante2(String partecipante2) {
		this.partecipante2 = partecipante2;
	}
	public String getPartecipante3() {
		return partecipante3;
	}
	public void setPartecipante3(String partecipante3) {
		this.partecipante3 = partecipante3;
	}
	public String getPartecipante4() {
		return partecipante4;
	}
	public void setPartecipante4(String partecipante4) {
		this.partecipante4 = partecipante4;
	}
	
	

}
