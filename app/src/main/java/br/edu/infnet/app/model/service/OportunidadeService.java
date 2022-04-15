package br.edu.infnet.app.model.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.OportunidadeRepository;

@Service
public class OportunidadeService {
	
	@Autowired
	private OportunidadeRepository oportunidadeRepository;

	public Collection<Oportunidade> obterLista(Usuario usuario) {
		return (Collection<Oportunidade>) oportunidadeRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricao"));
	}

	public void create(Oportunidade oportunidade) {		
		oportunidadeRepository.save(oportunidade);
	}

	public void delete(Integer id) {
		oportunidadeRepository.deleteById(id);
	}

}
