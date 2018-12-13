package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria ct1 = new Categoria(1, "Rodrigo");
		Categoria ct2 = new Categoria(2, "Paulo");

		List<Categoria> lista = new ArrayList<>();
		lista.add(ct1);
		lista.add(ct2);

		return lista;
	}

}
