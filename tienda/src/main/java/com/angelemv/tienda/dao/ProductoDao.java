package com.angelemv.tienda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.angelemv.tienda.modelo.Producto;

public class ProductoDao {
	EntityManager em;
	
	 public ProductoDao(EntityManager em) {
	        this.em = em;
	    }

	    public void guardar(Producto producto) {
	        this.em.persist(producto);
	    }

	    public void actualizar(Producto producto) {
	        this.em.merge(producto);
	    }

	    public void remover(Producto producto) {
	        producto=this.em.merge(producto);
	        this.em.remove(producto);
	    }
	    public Producto consultaPorId(Long id) {
	    	return em.find(Producto.class, id);
	    }
	    public List<Producto> consultaTodo(){
	    	String jpql= "Select p from Producto AS p ";
	    	return em.createQuery(jpql, Producto.class).getResultList();
	    }
	    public List<Producto> consultaPorNombre(String nombre){
	    	String jpql= "Select p from Producto AS p where p.nombre =:nombre";
	    	return em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
	    }
	    public List<Producto> consultaPorCategoriaList (String nombre){
	    	String jpql= "Select p from Producto AS p where p.categoria.nombre=:nombre";
	    	return em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
	    }

}
