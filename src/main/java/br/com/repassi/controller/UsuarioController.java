package br.com.repassi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.repassi.entity.Usuario;
import br.com.repassi.service.UsuarioService;

@RestController
@RequestMapping(path="/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(path="/todos")
	public List<Usuario> retornarTodosUsuarios() {
		
		return usuarioService.retornarTodosUsuarios();
	}
	
	@GetMapping(path="/{idProduto}")
	public Optional<Usuario> retornarUsuario(@PathVariable("idProduto") int idUsuario) {
		
		return usuarioService.retornarUsuario(idUsuario);
	}
	
	@PostMapping()
	public void incluirUsuario (@RequestBody Usuario user) {
	  Usuario u = new Usuario();
	  u.setNome(user.getNome());
	  u.setCpf(user.getCpf());
	  usuarioService.salvarUsuario(u);
	}
	
	@PutMapping()
	public void alterarUsuario (@RequestBody Usuario user) {
	  Usuario u = new Usuario();
	  u.setId(user.getId());
	  u.setNome(user.getNome());
	  u.setCpf(user.getCpf());
	  usuarioService.salvarUsuario(u);
	}
	
	@DeleteMapping(path="/{idUsuario}")
	public void removerProduto(@PathVariable("idUsuario") int idUsuario) {
	  usuarioService.removerUsuario(idUsuario);
	}

}
