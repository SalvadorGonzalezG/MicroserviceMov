package com.mov.serie.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {

	private static final long serialVersionUID = 3053468415785954343L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_estreno")
	private Date fechaEstreno;
	private Genero genero;
	
	@OneToMany
	private List<Actor> protagonista;
	
	
}
