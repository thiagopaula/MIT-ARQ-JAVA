package br.edu.infnet.app.model.repository;


import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Oportunidade;

@Repository
public interface OportunidadeRepository extends CrudRepository<Oportunidade, Integer> {

	@Query("from Oportunidade o where o.usuario.id =:id")
	Collection<Oportunidade> findAll(Integer id, Sort by);
	
	Collection<Oportunidade> findAll(Sort by);
}
