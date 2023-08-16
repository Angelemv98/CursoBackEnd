package com.angelemv.tienda.dao;

import javax.persistence.EntityManager;

import com.angelemv.tienda.modelo.Categoria;

public class CategoriaDao {
	EntityManager em;

	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar (Categoria categoria) {
		this.em.persist(categoria);
	}
}
