package it.itsrizzoli.StoCamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CampoJdbcDao {
	
	@Autowired
    private JdbcTemplate jdbcCampoTemplate;
	
	public List<Campo> listaCampi() {
        return jdbcCampoTemplate.query(
                "select * from campo",
                new Object[]{},
                (rs, rowNum) ->
                        new Campo(
                                rs.getString("nome"),
                                rs.getString("indirizzo") 
        ));
    }

}
