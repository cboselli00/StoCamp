package it.itsrizzoli.StoCamp;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PrenotaDao extends CrudRepository<PrenotazioneForm,Integer>{
//	List<PrenotazioneForm> findByData(Date data);
//	List<PrenotazioneForm> findByUsername_utente(String username_utente);
//	List<PrenotazioneForm> findByOrainizio(double orainizio);
//	List<PrenotazioneForm> findByOrafine(double orafine);
}
