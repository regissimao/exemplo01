package br.com.repassi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repassi.entity.Pedido;
import br.com.repassi.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public PedidoService() {}

	public List<Pedido> retornarTodosPedidos() {
		
		return (List<Pedido>) pedidoRepository.findAll();
	}
	
	public Optional<Pedido> retornarPedido(int idPedido) {
		return pedidoRepository.findById(idPedido);
	}
	
	public void salvarPedido (Pedido user) {
		pedidoRepository.save(user);
	}
	
	public void removerPedido(int idPedido) {
		pedidoRepository.deleteById(idPedido);
	}

}
