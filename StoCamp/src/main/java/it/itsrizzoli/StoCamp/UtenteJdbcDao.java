package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UtenteJdbcDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public List<Utente> login(String username, String password) {
        return jdbcTemplate.query(
                "select * from utente where username = ? and password = ?",
                new Object[]{username, password},
                (rs, rowNum) ->
                        new Utente(
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getDate("datanascita"),
                                rs.getString("email"),
                                rs.getString("numerotelefono"),
                                rs.getString("nome"),
                                rs.getString("cognome"),
                                rs.getString("cittaresidenza"),
                                rs.getString("indirizzo"),
                                rs.getInt("eta")
                        )
        );
    }
	
	public List<Utente> trovautente(String username) {
        return jdbcTemplate.query(
                "select * from utente where username = ?",
                new Object[]{username},
                (rs, rowNum) ->
                        new Utente(
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getDate("datanascita"),
                                rs.getString("email"),
                                rs.getString("numerotelefono"),
                                rs.getString("nome"),
                                rs.getString("cognome"),
                                rs.getString("cittaresidenza"),
                                rs.getString("indirizzo"),
                                rs.getInt("eta")
                        )
        );
    }
}