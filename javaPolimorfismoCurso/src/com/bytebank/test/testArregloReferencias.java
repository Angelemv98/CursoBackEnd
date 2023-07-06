package com.bytebank.test;

import com.bytebank.modelo.cuenta;
import com.bytebank.modelo.cuentaCorriente;

public class testArregloReferencias {
	public static void main(String[] args) {
		
		cuentaCorriente cc = new cuentaCorriente(23, 44);
		
		cuenta [] cuentas = new cuentaCorriente[5];
		
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);

		
	}
}
