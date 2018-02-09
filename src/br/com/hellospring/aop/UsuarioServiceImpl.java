package br.com.hellospring.aop;

import br.com.hellospring.interfaces.UsuarioService;

@AspectAnnotation
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public void crateUsuario() {
		System.out.println("crateUsuario()");
		throw new RuntimeException("Usuario já existe!");
	}

	@Override
	public void updateUsuario() {
		System.out.println("updateUsuario()");
	}

	@Override
	public String crateUsuario(String nome) {
		System.out.println("crateUsuario(String)");
		return "Usuario: " + nome; 
	}

}
