package com.angelemv.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.angelemv.tienda.dao.CategoriaDao;
import com.angelemv.tienda.dao.ProductoDao;
import com.angelemv.tienda.modelo.Categoria;
import com.angelemv.tienda.modelo.Producto;
import com.angelemv.tienda.utils.JPAUtils;

public class RegistroDeProductos {

	public static void main(String[] args) {
		registrarProducto();
		
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		
		Producto producto =  productoDao.consultaPorId(1l);
		
//		System.out.println(producto.getNombre());
		
		List<Producto> productos = productoDao.consultaPorCategoriaList("CELULARES");
		
		productos.forEach(proc -> System.out.println(proc.getDescripcion()));
		
		
		
	}

	private static void registrarProducto() {
		Categoria celulares = new Categoria("CELULARES");

		Producto celular = new Producto("Samsung", "No muy bueno que digamos xDDDD", new BigDecimal("10000"), celulares);

		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();
		productoDao.guardar(celular);
		categoriaDao.guardar(celulares);

		em.getTransaction().commit();

		em.close();
	}

}
