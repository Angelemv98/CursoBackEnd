package com.bytebank.modelo;


public abstract class Funcionario {

	private String nombre;
	private String documento;
	private int salario;
	private int tipo;

	public Funcionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreString) {
		this.nombre = nombreString;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documentoString) {
		this.documento = documentoString;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public abstract double getBono();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
