package com.mov.serie.dao;

import com.mov.serie.models.Genero;

public interface IGeneroRepository {
	// Generamos 22 metodos
	public void save(Genero genero);
	
	public Genero findById(Long id);

}
