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

import br.com.repassi.entity.Pedido;
import br.com.repassi.service.PedidoService;

@RestController
@RequestMapping(path="/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(path="/todos")
	public List<Pedido> retornarTodosPedidos() {
		
		return pedidoService.retornarTodosPedidos();
	}
	
	@GetMapping(path="/{idPedido}")
	public Optional<Pedido> retornarPedido(@PathVariable("idPedido") int idPedido) {
		
		return pedidoService.retornarPedido(idPedido);
	}
	
	@PostMapping()
	public void incluirPedido (@RequestBody Pedido ped) {
	  Pedido p = new Pedido();
	  p.setData(ped.getData());
	  p.setQuantidade(ped.getQuantidade());
	  pedidoService.salvarPedido(p);
	}
	
	@PutMapping()
	public void alterarPedido (@RequestBody Pedido ped) {
	  Pedido p = new Pedido();
	  p.setId(ped.getId());
	  p.setData(ped.getData());
	  p.setQuantidade(ped.getQuantidade());
	  pedidoService.salvarPedido(p);
	}
	
	@DeleteMapping(path="/{idPedido}")
	public void removerPedido(@PathVariable("idPedido") int idPedido) {
	  pedidoService.removerPedido(idPedido);
	}

}
