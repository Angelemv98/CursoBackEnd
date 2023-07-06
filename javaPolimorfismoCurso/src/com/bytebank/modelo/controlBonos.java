package com.bytebank.modelo;


public class controlBonos {
	private double sumaBono;

	public double registroSalario(Funcionario funcionario) {
		this.sumaBono = funcionario.getBono() + this.sumaBono;
		System.out.println("Hasta el momento lleva:  " + this.sumaBono);
		return this.sumaBono;
	}
}

