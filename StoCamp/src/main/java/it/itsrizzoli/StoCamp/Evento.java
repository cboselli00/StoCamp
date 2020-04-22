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
@Table(name = "evento")
public class Evento {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@OneToMany(mappedBy ="evento", cascade = CascadeType.ALL)
	private Set<Partecipazione> partecipa = new HashSet<>();

	
	
	public Evento() {
		
	}

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
	
	
	
	
	

	
	
	

}
