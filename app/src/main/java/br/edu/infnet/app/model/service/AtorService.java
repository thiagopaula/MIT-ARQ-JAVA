package br.edu.infnet.app.model.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Ator;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.AtorRepository;

@Service
public class AtorService {
	
	@Autowired
	private AtorRepository atorRepository;

	
	public Collection<Ator> obterLista(Usuario usuario) {
		return (Collection<Ator>) atorRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeArtistico"));
	}

	public void create(Ator ator) {		
		atorRepository.save(ator);
	}

	public void delete(Integer id) {
		atorRepository.deleteById(id);
	}

}
