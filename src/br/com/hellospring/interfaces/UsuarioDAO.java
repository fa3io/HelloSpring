package br.com.hellospring.interfaces;

public interface UsuarioDAO extends DAO {
	
	void createUsuario(String name, String email);

}
