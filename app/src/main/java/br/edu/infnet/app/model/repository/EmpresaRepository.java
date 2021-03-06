package br.edu.infnet.app.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer> {

	
	@Query("from Empresa e where e.usuario.id =:id")
	List<Empresa> findAll(Integer id, Sort by);
}
