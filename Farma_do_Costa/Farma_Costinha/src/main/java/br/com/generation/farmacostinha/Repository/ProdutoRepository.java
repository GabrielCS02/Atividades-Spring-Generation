package br.com.generation.farmacostinha.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacostinha.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
		public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
		public List<Produto> findAllByDosagemContainingIgnoreCase(String dosagem);
		public List<Produto> findAllByPreco(double preco);
		public List<Produto> findAllByQuantidade (int preco);



}
