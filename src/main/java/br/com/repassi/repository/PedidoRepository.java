package br.com.repassi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.repassi.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}
