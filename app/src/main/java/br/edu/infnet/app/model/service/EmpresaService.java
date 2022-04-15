package br.edu.infnet.app.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Collection<Empresa> obterLista(Usuario usuario) {
		return (Collection<Empresa>) empresaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void create(Empresa empresa) {
		empresaRepository.save(empresa);
	}

	public void delete(Integer id) {
		empresaRepository.deleteById(id);
	}	

}
