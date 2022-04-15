package br.edu.infnet.app.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Ator;

@Repository
public interface AtorRepository extends CrudRepository<Ator, Integer> {

	@Query("from Ator a where a.usuario.id =:id")
	Collection<Ator> findAll(Integer id, Sort by);
}
