package com.mov.serie.services;

import java.util.List;

import com.mov.serie.models.Genero;

public interface IGeneroService {

	//Metodos
	
	//Guardar
	public void save(Genero genero);
	//buscar por id
	public Genero findById(Long id);
	//eliminar 
	public void delete(Long id);
	//buscar 
	public List<Genero> findAll(); 
}
