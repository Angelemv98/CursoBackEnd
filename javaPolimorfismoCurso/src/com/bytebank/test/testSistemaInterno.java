package com.bytebank.test;
import com.bytebank.modelo.*;

public class testSistemaInterno {
public static void main(String[] args) {
	
	SistemaInterno sistema = new SistemaInterno();
	gerente gerente1 = new gerente();
	Administrador administrador = new Administrador();
	
	sistema.auntenticar(gerente1);
	sistema.auntenticar(administrador);
}
}
