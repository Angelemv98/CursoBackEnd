package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Statement;
import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();
		PreparedStatement statement = con
				.prepareStatement("UPDATE PRODUCTO SET NOMBRE = ?, DESCRIPCION = ?, CANTIDAD = ? WHERE ID = ?");
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		statement.setInt(4, id);
		statement.execute();
		int act = statement.getUpdateCount();
		con.close();
		return act;

	}

	public int eliminar(Integer id) throws SQLException {
		Connection con = new ConnectionFactory().recuperaConexion();
		PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID= ?");
		statement.setInt(1, id);
		statement.execute();
		return statement.getUpdateCount();

	}

	public List<Map<String, String>> listar() throws SQLException {

		Connection con = new ConnectionFactory().recuperaConexion();

		PreparedStatement statement = con.prepareStatement("select id, nombre, descripcion, cantidad from producto");

		statement.execute();

		statement.getResultSet();

		ResultSet resultSet = statement.getResultSet();

		List<Map<String, String>> resultado = new ArrayList<>();

		while (resultSet.next()) {
			Map<String, String> filaMap = new HashMap<>();
			filaMap.put("ID", String.valueOf(resultSet.getInt("ID")));
			filaMap.put("NOMBRE", resultSet.getString("NOMBRE"));
			filaMap.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
			filaMap.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

			resultado.add(filaMap);

		}
		con.close();

		return resultado;
	}

	public void guardar(Map<String, String> producto) throws SQLException {

		final Connection con = new ConnectionFactory().recuperaConexion();
		String nombre = producto.get("NOMBRE");
		String descripcion = producto.get("DESCRIPCION");
		Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
		Integer maxCantidadInteger = 50;
		try (con) {
			con.setAutoCommit(false);
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO PRODUCTO(NOMBRE, DESCRIPCION, CANTIDAD) " + "VALUES (?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			try (statement) {
				do {
					int cantidadParaGuardar = Math.min(cantidad, maxCantidadInteger);
					ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);
					cantidad -= maxCantidadInteger;
				} while (cantidad > 0);
				con.commit();
			} catch (Exception e) {
				con.rollback();
			}
		}
	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();
		
		final ResultSet resultSet = statement.getGeneratedKeys();
		try (resultSet) {
			while (resultSet.next()) {
				System.out.println(String.format("Fue insertado el producto de ID %d", resultSet.getInt(1)));

			}
		}

	}

}
