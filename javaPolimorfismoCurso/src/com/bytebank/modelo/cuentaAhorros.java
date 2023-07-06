package com.bytebank.modelo;


public class cuentaAhorros extends cuenta {
	 public cuentaAhorros(int agencia, int numero) {
		super(agencia,numero);
	}

	@Override
	public void deposito(double monto) {
		this.saldo += monto;
	}
}
