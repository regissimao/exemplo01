package br.com.repassi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repassi.entity.Pedido;
import br.com.repassi.entity.Usuario;
import br.com.repassi.repository.PedidoRepository;
import br.com.repassi.repository.UsuarioRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public PedidoService() {}

	public List<Pedido> retornarTodosPedidos() {
		
		return (List<Pedido>) pedidoRepository.findAll();
	}
	
	public Optional<Pedido> retornarPedido(int idPedido) {
		return pedidoRepository.findById(idPedido);
	}
	
	public void salvarPedido (Pedido ped, int id_usuario) {
	  Usuario usuario = usuarioRepository.findById(id_usuario).get();
	  ped.setUsuario(usuario);
	  pedidoRepository.save(ped);
	}
	
	public void removerPedido(int idPedido) {
		pedidoRepository.deleteById(idPedido);
	}

}
