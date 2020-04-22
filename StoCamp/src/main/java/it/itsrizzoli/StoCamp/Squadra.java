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
public class Squadra {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Size(min=3, max=30, message = "Nome deve esser tra 3 e 30 caratteri")
	@NotNull(message = "Nome deve esser inserito")
	String nome;
	
	@OneToMany(mappedBy = "squadra", cascade = CascadeType.ALL)
	private Set<Partecipazione> partecipa = new HashSet<>();

	public Squadra() {
		super();
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

	public Set<Partecipazione> getPartecipa() {
		return partecipa;
	}

	public void setPartecipa(Set<Partecipazione> partecipa) {
		this.partecipa = partecipa;
	}
	
	
	
	

}
