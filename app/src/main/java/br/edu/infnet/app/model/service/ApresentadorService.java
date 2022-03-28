package br.edu.infnet.app.model.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Apresentador;

@Service
public class ApresentadorService {

	private static Map<Integer, Apresentador> mapa = new HashMap<Integer, Apresentador>();
	private static Integer key = 1;

	public Collection<Apresentador> obterLista() {
		return mapa.values();
	}

	public void create(Apresentador apresentador) {		
		apresentador.setId(key++);
		mapa.put(apresentador.getId(), apresentador);
	}

	public void delete(Integer id) {
		mapa.remove(id);
	}

	public Apresentador obterById(Integer id) {
		return mapa.get(id);
	}

}
