package br.edu.infnet.app.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario u where u.email =:email and u.senha =:senha")
	Usuario autenticacao(String email, String senha);
	
	Collection<Usuario> findAll(Sort by);

}
