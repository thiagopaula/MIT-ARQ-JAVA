package br.edu.infnet.app.model.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Oportunidade;

@Service
public class OportunidadeService {

	private static Map<Integer, Oportunidade> mapa = new HashMap<Integer, Oportunidade>();
	private static Integer key = 1;

	public Collection<Oportunidade> obterLista() {
		return mapa.values();
	}

	public void create(Oportunidade oportunidade) {		
		oportunidade.setId(key++);
		mapa.put(oportunidade.getId(), oportunidade);
	}

	public void delete(Integer id) {
		mapa.remove(id);
	}

	public Oportunidade obterById(Integer id) {
		return mapa.get(id);
	}

}
