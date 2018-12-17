package br.com.prado.iluminacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prado.iluminacao.domain.Categoria;
import br.com.prado.iluminacao.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {

		Optional<Categoria> categoriaRetorno = categoriaRepository.findById(id);

		return categoriaRetorno.orElse(null);

	}

}
