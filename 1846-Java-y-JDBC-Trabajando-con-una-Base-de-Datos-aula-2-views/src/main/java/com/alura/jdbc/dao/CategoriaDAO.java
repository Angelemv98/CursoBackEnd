package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class CategoriaDAO {

	private Connection con;

	public CategoriaDAO(Connection con) {
		this.con = con;
	}

	public List<Categoria> listar() {
		List<Categoria> resultadoCategorias = new ArrayList<>();
		try {
			final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE FROM CATEGORIA");

			try (statement) {

				final ResultSet resultSet = statement.executeQuery();

				try (resultSet) {
					while (resultSet.next()) {
						var categoria = new Categoria(resultSet.getInt("ID"), resultSet.getString("NOMBRE"));
						resultadoCategorias.add(categoria);
					}

				};
			}

		} catch (SQLException e) {
			throw new RuntimeException();
		}
		return resultadoCategorias;
	}

	public List<Categoria> listarConProductos() {
		List<Categoria> resultadoCategorias = new ArrayList<>();
		try {
			final PreparedStatement statement = con
					.prepareStatement("SELECT C.ID, C.NOMBRE, P.ID, P.NOMBRE, P.CANTIDAD " + "FROM CATEGORIA C "
							+ "INNER JOIN PRODUCTO P ON C.ID = P.CATEGORIA_ID");

			try (statement) {

				final ResultSet resultSet = statement.executeQuery();

				try (resultSet) {
					while (resultSet.next()) {
						int categoriaID = resultSet.getInt("C.ID");
						String categoriaNombre = resultSet.getString("C.NOMBRE");

						var categoria = resultadoCategorias.stream().filter(cat -> cat.getId().equals(categoriaID))
								.findAny().orElseGet(() -> {
									Categoria cat = new Categoria(categoriaID, categoriaNombre);
									resultadoCategorias.add(cat);
									return cat;
								});
						Producto producto = new Producto(resultSet.getInt("P.ID"),
								resultSet.getString("P.NOMBRE"),
								resultSet.getInt("P.CANTIDAD"));
					}
				};
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		return resultadoCategorias;
	}
}
