package com.mov.serie.dao;

import java.util.List;

import com.mov.serie.models.Genero;

public interface IGeneroRepository {
	// Generamos 22 metodos
	public void save(Genero genero);
	
	// metodo para buscar por id
	public Genero findById(Long id);
}
