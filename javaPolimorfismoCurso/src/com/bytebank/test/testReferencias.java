package com.bytebank.test;
import com.bytebank.modelo.*;

public class testReferencias {
public static void main(String[] args) {
	Funcionario juan = new Contador();
	juan.setNombre("IDK");
	juan.setSalario(2000);
	
	
	gerente gerente = new gerente();
	gerente.setNombre("gabriela");
	gerente.setSalario(10000);
}
}
