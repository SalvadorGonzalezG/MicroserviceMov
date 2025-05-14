package com.mov.serie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mov.serie.dao.IGeneroRepository;
import com.mov.serie.models.Genero;

@Service
public class GeneroService implements IGeneroService{

	//inyeccion de dependecia del repository
	@Autowired
	IGeneroRepository generoRepository;
	
	// implementacion de los metodos de la interfaz IGeneroService
	@Override
	public void save(Genero genero) {
		generoRepository.save(genero);
	}
	
	@Override
	public Genero findById(Long id) {
		//en caso de que no lo encuentre devuelve null
		return generoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void delete(Long id) {
		generoRepository.deleteById(id);
	}
	
	@Override 
	public List<Genero> findAll(){
		return (List<Genero>) generoRepository.findAll();
	}
	
	
}
