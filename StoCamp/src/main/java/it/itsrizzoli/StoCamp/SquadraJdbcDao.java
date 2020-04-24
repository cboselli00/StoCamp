package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class SquadraJdbcDao {
	@Autowired
    private JdbcTemplate squadraJdbcTemplate;
	
	
	public List<CreaSquadraForm> listaSquadre() {
        return squadraJdbcTemplate.query(
                "select * from squadra",
                new Object[]{},
                (rs, rowNum) ->
                        new CreaSquadraForm(
                        		rs.getInt("id"),
                        		rs.getString("nome"),
                        		rs.getString("partecipante1"),
                        		rs.getString("partecipante2"),
                        		rs.getString("partecipante3"),
                        		rs.getString("partecipante4")          		
        ));
    }

}
