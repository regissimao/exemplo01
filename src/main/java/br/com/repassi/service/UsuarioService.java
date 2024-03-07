package br.com.repassi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repassi.entity.Usuario;
import br.com.repassi.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioService() {}

	public List<Usuario> retornarTodosUsuarios() {
		
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public Optional<Usuario> retornarUsuario(int idUsuario) {
		return usuarioRepository.findById(idUsuario);
	}
	
	public void salvarUsuario (Usuario user) {
		usuarioRepository.save(user);
	}
	
	public void removerUsuario(int idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
}
