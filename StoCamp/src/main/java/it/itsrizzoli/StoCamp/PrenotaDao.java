package it.itsrizzoli.StoCamp;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;

public interface PrenotaDao extends CrudRepository<PrenotazioneForm,Integer>{
	List<PrenotazioneForm> findByData(Date data);
	List<PrenotazioneForm> findByPartecipante(Utente partecipante);
	List<PrenotazioneForm> findByCampo(Campo campo);
	List<PrenotazioneForm> findByOrainizio(double orainizio);
	List<PrenotazioneForm> findByOrafine(double orafine);
}
