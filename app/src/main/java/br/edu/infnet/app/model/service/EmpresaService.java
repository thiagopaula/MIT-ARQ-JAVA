package br.edu.infnet.app.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Collection<Empresa> obterLista() {
		return (Collection<Empresa>) empresaRepository.findAll();
	}

	public void create(Empresa empresa) {
		empresaRepository.save(empresa);
	}

	public void delete(Integer id) {
		empresaRepository.deleteById(id);
	}

}
