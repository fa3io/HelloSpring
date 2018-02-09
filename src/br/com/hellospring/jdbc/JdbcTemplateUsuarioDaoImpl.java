package br.com.hellospring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;

public class JdbcTemplateUsuarioDaoImpl extends JdbcDaoSupport implements UsuarioDAO {

	@Override
	public Integer createUsuario(Usuario usuario) {
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

		getJdbcTemplate().update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				String sql = "INSERT INTO usuarios(nome, email) VALUES(?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql,
						PreparedStatement.RETURN_GENERATED_KEYS);
				preparedStatement.setString(1, usuario.getNome());
				preparedStatement.setString(2, usuario.getEmail());
				return preparedStatement;
			}
		}, keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		getJdbcTemplate().update("UPDATE usuarios SET nome=?, email=? WHERE ID = ?",
				 usuario.getNome(), usuario.getEmail(), usuario.getId());
	}

	@Override
	public void deleteUsuario(Integer id) {
		getJdbcTemplate().update("DELETE FROM usuarios WHERE ID = ?", id);
	}

	@Override
	public Usuario findUsuarioById(Integer id) {
		String sql = "SELECT id, nome, email FROM usuarios WHERE id =?";
		return getJdbcTemplate().queryForObject(sql, new UsuarioRowMapper(), id);
	}

	@Override
	public List<Usuario> findAllUsuarios() {
		return getJdbcTemplate().query("SELECT id, nome, email FROM usuarios", new UsuarioRowMapper());
	}

	@Override
	public List<Usuario> findUsuariosByName(String nome) {
		String sql = "SELECT id, nome, email FROM usuarios WHERE nome LIKE ?";
		return getJdbcTemplate().query(sql, new UsuarioRowMapper(), nome);
	}

}
