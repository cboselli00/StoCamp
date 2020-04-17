package it.itsrizzoli.StoCamp;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface UtenteDao extends CrudRepository<Utente,String> {
	List<Utente> findByUsername(String username);
    List<Utente> findByPassword(String password);
    List<Utente> findByDatanascita(Date datanascita);
    List<Utente> findByEmail(String email);
    List<Utente> findByNumerotelefono(String numerotelefono);
    List<Utente> findByNome(String nome);
    List<Utente> findByCognome(String cognome);
    /*List<Utente> findByCittaresidenza(String cittaresidenza);
    List<Utente> findByIndirizzo(String indirizzo);
    List<Utente> findByEta(int eta);*/
}
