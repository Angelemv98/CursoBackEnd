package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.cuenta;
import com.bytebank.modelo.cuentaAhorros;
import com.bytebank.modelo.cuentaCorriente;

public class testOrederLists {
	public static void main(String[] args) {
		cuenta cc1 = new cuentaCorriente(22, 33);
		cc1.deposito(333);

		cuenta cc2 = new cuentaAhorros(22, 44);
		cc1.deposito(444);

		cuenta cc3 = new cuentaCorriente(22, 11);
		cc1.deposito(111);

		cuenta cc4 = new cuentaAhorros(22, 22);
		cc1.deposito(222);

		List<cuenta> lista = new ArrayList<cuenta>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		NumeroDeCuentaComparator comparator = new NumeroDeCuentaComparator();
		lista.sort(comparator);
		
		for (cuenta cuenta : lista) {
		    System.out.println(cuenta);
		}
		System.out.println("---------");

	}

}

class NumeroDeCuentaComparator implements Comparator<cuenta> {

	@Override
	public int compare(cuenta c1, cuenta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}
