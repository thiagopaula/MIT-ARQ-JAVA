package br.edu.infnet.app.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Talento;

@Repository
public interface TalentoRepository extends CrudRepository<Talento, Integer> {

	@Query("from Talento t where t.usuario.id =:id")
	Collection<Talento> findAll(Integer id, Sort by);
}