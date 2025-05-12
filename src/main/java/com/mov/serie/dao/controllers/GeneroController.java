package com.mov.serie.dao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mov.serie.dao.IGeneroRepository;
import com.mov.serie.models.Genero;

@RestController
public class GeneroController {
	
	@Autowired
	private IGeneroRepository generoRepository;
	
	public GeneroController (IGeneroRepository generoRepository) {
		this.generoRepository = generoRepository;
	}
	
	// 2 acciones guardar & Buscar por id
	@PostMapping("/parameter")
	public Long guardar(@RequestParam String nombre) {
		Genero genero = new Genero();
		genero.setNombre(nombre);
		generoRepository.save(genero);
		return genero.getId();
	}
	
	@GetMapping("/parameter/{id}")
	public String buscarPorId(@PathVariable Long id) {
		return generoRepository.findById(id).getNombre();
	}
}
