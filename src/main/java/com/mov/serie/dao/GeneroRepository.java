package com.mov.serie.dao;

import org.springframework.stereotype.Repository;

import com.mov.serie.models.Genero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class GeneroRepository implements IGeneroRepository	{
	
	@PersistenceContext
	public EntityManager entityManager;
	
	@Override
	@Transactional
	public void save(Genero genero) {
		entityManager.persist(genero);
	}
	
	@Override
	@Transactional
	public Genero findById(Long id) {
		return entityManager.find(Genero.class, id);
	}
	

	
}
