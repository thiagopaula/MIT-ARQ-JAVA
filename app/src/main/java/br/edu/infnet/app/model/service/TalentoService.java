package br.edu.infnet.app.model.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Talento;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.TalentoRepository;

@Service
public class TalentoService {
	
	@Autowired
	private TalentoRepository talentoRepository;

	public Collection<Talento> obterLista(Usuario usuario) {
		return (Collection<Talento>) talentoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeArtistico"));
	}

	public void delete(Integer id) {
		talentoRepository.deleteById(id);
	}

	public Talento obterById(Integer id) {
		return talentoRepository.findById(id).orElse(null);
	}
}
