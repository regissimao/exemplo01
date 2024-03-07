package br.com.repassi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repassi.entity.Produto;
import br.com.repassi.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ProdutoService() {}

	public List<Produto> retornarTodosProdutos() {
		
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public Optional<Produto> retornarProduto(int idProduto) {
		return produtoRepository.findById(idProduto);
	}
	
	public void salvarProduto (Produto prod) {
		produtoRepository.save(prod);
	}
	
	public void removerProduto(int idProduto) {
		produtoRepository.deleteById(idProduto);
	}

}
