package br.edu.infnet.app.model.service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app.model.domain.Diretor;

@Service
public class DiretorService {

	private static Map<Integer, Diretor> mapa = new HashMap<Integer, Diretor>();
	private static Integer key = 1;

	public Collection<Diretor> obterLista() {
		return mapa.values();
	}

	public void create(Diretor diretor) {		
		diretor.setId(key++);
		mapa.put(diretor.getId(), diretor);
	}

	public void delete(Integer id) {
		mapa.remove(id);
	}

	public Diretor obterById(Integer id) {
		return mapa.get(id);
	}

}
