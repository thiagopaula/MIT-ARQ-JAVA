package br.edu.infnet.app.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Apresentador;

@Repository
public interface ApresentadorRepository extends CrudRepository<Apresentador, Integer> {

	@Query("from Apresentador a where a.usuario.id =:id")
	Collection<Apresentador> findAll(Integer id, Sort by);
}
