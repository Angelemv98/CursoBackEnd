package com.bytebank.test;
import com.bytebank.modelo.*;


public class testControlBonos {
public static void main(String[] args) {
	
	Funcionario angelFuncionario = new gerente();
	angelFuncionario.setSalario(2000);
	
	gerente gerente = new gerente();
	gerente.setSalario(10000);
	
	Contador juan = new Contador();
	juan.setSalario(5000);
	
	
	controlBonos controlBonos = new controlBonos();
	controlBonos.registroSalario(angelFuncionario);
	controlBonos.registroSalario(gerente);
	controlBonos.registroSalario(juan);

	
}
}
