package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SquadraDao extends CrudRepository<CreaSquadraForm,Integer>{	
	List<CreaSquadraForm> findByNome(String nome);
	List<CreaSquadraForm> findByPartecipante1(String partecipante1);
	List<CreaSquadraForm> findByPartecipante2(String partecipante2);
	List<CreaSquadraForm> findByPartecipante3(String partecipante3);
	List<CreaSquadraForm> findByPartecipante4(String partecipante4);

}
