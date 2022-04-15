package br.edu.infnet.app.model.service;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Diretor;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.DiretorRepository;

@Service
public class DiretorService {
	
	@Autowired
	private DiretorRepository diretorRepository;


	public Collection<Diretor> obterLista(Usuario usuario) {
		return (Collection<Diretor>) diretorRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nomeArtistico"));
	}

	public void create(Diretor diretor) {		
		diretorRepository.save(diretor);
	}

	public void delete(Integer id) {
		diretorRepository.deleteById(id);
	}

}
