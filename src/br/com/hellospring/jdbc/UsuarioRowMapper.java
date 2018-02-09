package br.com.hellospring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsuarioRowMapper implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet resultSet, int index) throws SQLException {
		
		Usuario usuario = new Usuario();
		
		usuario.setId(resultSet.getInt("id"));
		usuario.setNome(resultSet.getString("nome"));
		usuario.setEmail(resultSet.getString("email"));
		
		return usuario;
	}

}
