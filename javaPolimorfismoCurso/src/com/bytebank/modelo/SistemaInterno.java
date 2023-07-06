package com.bytebank.modelo;


public class SistemaInterno {
	
	private String clave = "AluraCursos";
	public boolean auntenticar(Autenticable gerente) {
		boolean puedeiniciarSesion = gerente.iniciarSesion(clave);
		if (puedeiniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}
		else {
			System.out.println("Error inicio sesion");
			return false;
		}
	}
	
}
