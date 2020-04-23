package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class PrenotaJdbcDao {
	
	@Autowired
    private JdbcTemplate prenotaJdbcTemplate;
	
	
	
	public List<PrenotazioneForm> listaPrenotazioni() {
        return prenotaJdbcTemplate.query(
                "select * from prenota",
                new Object[]{},
                (rs, rowNum) ->
                        new PrenotazioneForm(
                        		rs.getInt("id"),
                        		rs.getDate("data"),
                        		rs.getString("nomecampo"),
                        		rs.getDouble("orainizio"),
                        		rs.getDouble("orafine")
                        		
                        		
                        		
        ));
    }

}
