package br.com.generation.farmacostinha.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacostinha.model.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
		public List<Categoria> findAllByLabContainingIgnoreCase(String lab);
		public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo); 
		public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
