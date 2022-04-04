package br.edu.infnet.app.model.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Ator;

@Service
public class AtorService {

	private static Map<Integer, Ator> mapa = new HashMap<Integer, Ator>();
	private static Integer key = 1;

	public Collection<Ator> obterLista() {
		return mapa.values();
	}

	public void create(Ator ator) {		
		ator.setId(key++);
		mapa.put(ator.getId(), ator);
	}

	public void delete(Integer id) {
		mapa.remove(id);
	}

	public Ator obterById(Integer id) {
		return mapa.get(id);
	}

}
