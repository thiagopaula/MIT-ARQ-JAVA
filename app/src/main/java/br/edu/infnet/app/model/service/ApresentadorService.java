package br.edu.infnet.app.model.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.ApresentadorRepository;

@Service
public class ApresentadorService {
	
	@Autowired
	private ApresentadorRepository apresentadorRepository;

	public Collection<Apresentador> obterLista(Usuario usuario) {
		return (Collection<Apresentador>) apresentadorRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeArtistico"));
	}

	public void create(Apresentador apresentador) {		
		apresentadorRepository.save(apresentador);
	}

	public void delete(Integer id) {
		apresentadorRepository.deleteById(id);
	}

}
