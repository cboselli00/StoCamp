package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CampoDao extends CrudRepository<Campo,String> {
	List<Campo> findByNome(String nome);
	List<Campo> findByIndirizzo(String indirizzo);

}
