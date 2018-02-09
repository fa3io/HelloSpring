package br.com.hellospring.jdbc;

import java.util.List;

public interface UsuarioDAO {
	
	Integer createUsuario(Usuario usuario);
	
	void updateUsuario(Usuario usuario);
	
	void deleteUsuario(Integer id);
	
	Usuario findUsuarioById(Integer id);
	
	List<Usuario> findAllUsuarios();
	
	List<Usuario> findUsuariosByName(String nome);

}
